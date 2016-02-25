package com.budgetms.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.DiskFileUpload;

public class uploadController extends BaseController {
	public Object upload(HttpServletRequest request) {
		String savePath = "d:/";// 保存路径
		String uploadPath = "d:/"; // 上传路径

		DiskFileUpload fu = new DiskFileUpload();
		fu.setFileSizeMax(4096000);
		return SUCCESS;
	}
}
