package com.service;
import com.dao.UserDAO;
/**
 * ����Action�ӿ�
 * @author JiangQuan
 */
public interface ActionManager {
	Integer validLogin(String email, String password);
	public UserDAO getUserDAO();
	public void setUserDAO(UserDAO userDAO);

}
