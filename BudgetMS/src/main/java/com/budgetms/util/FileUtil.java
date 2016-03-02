package com.budgetms.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

public class FileUtil {
	static final String CONTENT_TYPE = "UTF-8";
	static final String UPLOADDIR = "/upload";
	private HttpServletRequest request;
	private HttpServletResponse response;

	public FileUtil(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		// System.out.println(this.getClass().getClassLoader().getResource("/").getPath());
		// System.out.print(getPath());
	}

	public void upload() throws IOException {

		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();

		if (!ServletFileUpload.isMultipartContent(request)) {
			out.println(Msg.UPLOAD_FAIL);
		}

		String name = null;
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(4096);
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setSizeMax(10 * 1024 * 1024);
			Iterator<?> iter = upload.parseRequest(request).iterator();
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();
				if (item.isFormField()) {
					name = item.getFieldName();
					out.println(Msg.UPLOAD_FAIL);
				} else {
					name = item.getName();
					String path = getPath();
					if (path == null || path == "") {
						out.println(Msg.UPLOAD_FAIL);
					} else {
						item.write(new File(path
								+ name.substring(
										name.lastIndexOf(File.separator) + 1,
										name.length()))); // 保存上传文件
						out.println(Msg.SUCCESS);
					}
				}
			}
			out.close();
		} catch (Exception e) {
			out.println(Msg.UPLOAD_FAIL);
			out.close();
		}
	}

	public void down(String fileName) throws IOException {
		response.setContentType(CONTENT_TYPE);
		fileName = URLDecoder.decode(fileName, "utf-8");
		String path = getPath() + fileName;
		path = path.replace("%20", " ");
		File file = new File(path);

		// 清空response
		response.reset();

		// 设置response的Header
		response.addHeader("Content-Disposition", "attachment;filename="
				+ new String(fileName.getBytes("gbk"), "iso8859-1"));
		response.addHeader("Content-Length", "" + file.length());

		try {
			// 以流的形式下载文件
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();

			OutputStream toClient = new BufferedOutputStream(
					response.getOutputStream());
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return 文件名数组 方便扩展 后续多文件上传
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	// HttpServletRequest request,HttpServletResponse response
	public String[] upload2() throws IllegalStateException, IOException {
		StringBuffer fileNames=new StringBuffer();
		// 创建一个通用的多部分解析器
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 判断 request 是否有文件上传,即多部分请求
		if (multipartResolver.isMultipart(request)) {
			// 转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 取得request中的所有文件名
			Iterator<String> iter = multiRequest.getFileNames();		
			while (iter.hasNext()) {
				// 记录上传过程起始时的时间，用来计算上传时间
				int pre = (int) System.currentTimeMillis();
				// 取得上传文件
				MultipartFile file = multiRequest.getFile(iter.next());
				if (file != null) {
					// 取得当前上传文件的文件名称
					String myFileName = file.getOriginalFilename();
					// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
					if (myFileName.trim() != "") {
						System.out.println(myFileName);
						// 重命名上传后的文件名
						String fileName = file.getOriginalFilename();
						// 定义上传路径
						String path = getPath() + fileName;
						File localFile = new File(path);
						file.transferTo(localFile);
						fileNames.append(fileName+"|");
					}
				}
				// 记录上传该文件后的时间
				int finaltime = (int) System.currentTimeMillis();
				System.out.println(finaltime - pre);
			}

		}
		return fileNames.substring(0, fileNames.lastIndexOf("|")).split("|");
	}
	public void write(MultipartFile file) throws IllegalStateException, IOException{
		if (file != null) {
			// 取得当前上传文件的文件名称
			String myFileName = file.getOriginalFilename();
			// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
			if (myFileName.trim() != "") {
				System.out.println(myFileName);
				// 重命名上传后的文件名
				String fileName = file.getOriginalFilename();
				// 定义上传路径
				String path = getPath() + fileName;
				File localFile = new File(path);
				file.transferTo(localFile);
			}
		}
	}

	String getPath() {
		return request.getSession().getServletContext().getRealPath("/upload");
		// return request.getRealPath("123");

	}
}
