package com;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	public String execute() throws Exception{
		System.out.println("点击登录执行该方法");
		return "SUCCESS";
	}
}
