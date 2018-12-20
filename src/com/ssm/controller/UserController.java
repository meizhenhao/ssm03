package com.ssm.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.User;

@Controller
public class UserController {
	
	private final static Log logger = LogFactory.getLog(UserController.class);
	
	@RequestMapping("/user/toRegister")
	public String toRegister(Model model){
		//向model中传入一个user对象，便于通view中的表单绑定数据
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	//@Valid是用于验证view层传递过来的javaBean对象是否正确
	@RequestMapping("/user/addUser")
	public String addUser(@Valid @ModelAttribute User user, Errors errors ){
		
		if(errors.hasErrors()){
			logger.info("注册失败！");
			return "register";
		}
		
		logger.info("注册成功！");
		return "success";
	}
	
}
