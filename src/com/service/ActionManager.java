package com.service;
import com.dao.UserDAO;
/**
 * 管理Action接口
 * @author JiangQuan
 */
public interface ActionManager {
	Integer validLogin(String email, String password);
	public UserDAO getUserDAO();
	public void setUserDAO(UserDAO userDAO);

}
