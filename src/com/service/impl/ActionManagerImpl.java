package com.service.impl;

import com.service.ActionManager;
import com.dao.UserDAO;
import com.bean.User;

public class ActionManagerImpl implements ActionManager {
	private UserDAO userDAO;
	
	public UserDAO getUserDAO(){
		return this.userDAO;
	}
	public void setUserDAO(UserDAO userDAO){
		this.userDAO = userDAO;
	}
	
	public Integer validLogin(String username, String password){
		try{
			User user = userDAO.findUserByNameAndPass(username, password);
			if (user != null)
			{
				return user.getId();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}

}
