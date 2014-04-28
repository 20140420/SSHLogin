package com;

import com.opensymphony.xwork2.ActionSupport;

import com.service.ActionManager;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected ActionManager mgr;  //�ö������ Spring����ע��
	
	private String username;
	private String password;

	public String execute() throws Exception{
		System.out.println("�����¼ִ�и÷���");
		if(username.equals("") || username == null){
			return "FAILURE";
		}
		
		Integer userId =mgr.validLogin(username, password);
		if(userId != null){
			System.out.println("�Ϸ��û�");
			return "SUCCESS";
		} else {
			addActionError("�û���/���벻ƥ��");
			System.out.println("�Ƿ��û�");
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
