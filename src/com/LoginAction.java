package com;

import com.opensymphony.xwork2.ActionSupport;

import com.service.ActionManager;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected ActionManager mgr;  //�ö������ Spring����ע��
	
	private String email;
	private String password;

	public String execute() throws Exception{
		System.out.println("�����¼ִ�и÷���");
		if(email.equals("") || email == null){
			return "FAILURE";
		}
		
		Integer userId =mgr.validLogin(email, password);
		if(userId != null){
			System.out.println("�Ϸ��û�");
			return "SUCCESS";
		} else {
			addActionError("����/���벻ƥ��");
			System.out.println("�Ƿ��û�");
			return "FAILURE";
		}
		
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setPassword(String password){
		this.password = password;		
	}
	
	public void setEmail(String username){
		this.email = username;
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
