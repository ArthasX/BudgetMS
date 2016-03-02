package com.budgetms.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.budgetms.util.FileUtil;
import com.budgetms.util.Msg;

@Controller
@RequestMapping("/upload")
public class UploadController extends BaseController {
	static Logger logger= Logger.getLogger(UploadController.class);
	@Resource
	
	@RequestMapping("/upload.do")
	@ResponseBody
	public Object upload(HttpServletRequest request, HttpServletResponse response) {
		String recordId=request.getParameter("recordId");
		FileUtil fu = new FileUtil(request, response);
		try {
			fu.upload2();
			
		} catch (IOException e) {
			logger.error(e.getStackTrace());
			return new Msg(false,"失败",e.getCause().toString()).toJSON();
		}
		return SUCCESS;
	}
}
