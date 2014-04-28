package com.service;
import com.dao.UserDAO;

public interface ActionManager {
	Integer validLogin(String username, String password);
	public UserDAO getUserDAO();
	public void setUserDAO(UserDAO userDAO);

}
