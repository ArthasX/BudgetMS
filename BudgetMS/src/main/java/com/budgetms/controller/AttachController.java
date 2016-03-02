package com.budgetms.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Attachment;
import com.budgetms.pojo.Contract;
import com.budgetms.service.IAttachService;
import com.budgetms.service.IContService;
import com.budgetms.util.FileUtil;
import com.budgetms.util.Msg;

@Controller
@RequestMapping("/attach")
public class AttachController extends BaseController {
	static Logger logger = Logger.getLogger(AttachController.class);
	@Resource
	private IAttachService attachService;

	@RequestMapping("/getAttachByIdType.do")
	@ResponseBody
	public Object findInstByProperty(HttpServletRequest request) {
		String json = request.getParameter("obj");
		Attachment attach = JSON.toJavaObject(JSON.parseObject(json),
				Attachment.class);
		return attachService.getAttachByProperty(attach);
	}

	@RequestMapping("/upload.do")
	@ResponseBody
	/**
	 * 前台通过form 传  recordId,atchType,fileName...
	 * @param request
	 * @param response
	 * @return
	 */
	public Object upload(HttpServletRequest request,
			HttpServletResponse response) {
		String recordId = request.getParameter("recordId");
		String atchType = request.getParameter("atchType");
		String[] fileNames;
		FileUtil fu = new FileUtil(request, response);
		try {
			fileNames = fu.upload2();
			logger.info("上传文件数量："+fileNames.length);
			for (String fileName : fileNames) {
				attachService.insertAttach(recordId, fileName, atchType);
				logger.info("文件名："+fileName+"记录编号:"+recordId+"类型:"+atchType);
			}
		} catch (IOException e) {
			logger.error(e.getStackTrace());
			return new Msg(false, "失败", e.getCause().toString()).toJSON();
		}
		return SUCCESS;
	}

	@RequestMapping("/download.do")
	@ResponseBody
	public Object download(HttpServletRequest request,
			HttpServletResponse response) {
		String fileName = request.getParameter("fileName");
		FileUtil fu = new FileUtil(request, response);
		try {
			fu.down(fileName);
		} catch (IOException e) {
			logger.error(e.getStackTrace());
			return new Msg(false, "失败", e.getCause().toString()).toJSON();
		}
		return SUCCESS;
	}
}
