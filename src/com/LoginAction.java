package com;

import com.opensymphony.xwork2.ActionSupport;

import com.service.ActionManager;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected ActionManager mgr;  //该对象采用 Spring依赖注入
	
	private String username;
	private String password;

	public String execute() throws Exception{
		System.out.println("点击登录执行该方法");
		if(username.equals("") || username == null){
			return "FAILURE";
		}
		
		Integer userId =mgr.validLogin(username, password);
		if(userId != null){
			System.out.println("合法用户");
			return "SUCCESS";
		} else {
			addActionError("用户名/密码不匹配");
			System.out.println("非法用户");
			return "FAILURE";
		}
		
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setPassword(String password){
		this.password = password;		
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setMgr(ActionManager mgr)
	{
		this.mgr = mgr;
	}
	
	public ActionManager getMgr()
	{
		return mgr;
	}
}
