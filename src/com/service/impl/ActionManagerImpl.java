package com.service.impl;

import com.service.ActionManager;
import com.dao.UserDAO;
import com.bean.User;
/**
 * 管理Action接口实现类
 * @author JiangQuan
 */
public class ActionManagerImpl implements ActionManager {
	private UserDAO userDAO;
	
	public UserDAO getUserDAO(){
		return this.userDAO;
	}
	public void setUserDAO(UserDAO userDAO){
		this.userDAO = userDAO;
	}
	
	public Integer validLogin(String email, String password){
		try{
			User user = userDAO.findUserByEmailAndPass(email, password);
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
