package com.dao.impl;

import com.dao.UserDAO;
import com.bean.User;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 * 用户接口实现类
 * @author JiangQuan
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	public void delete(Integer id){
		//TOOD Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(User.class, id));
	}
	
	public void delete(User user){
		getHibernateTemplate().delete(user);
	}
	
	public List<User> findAll(){
		return getHibernateTemplate().find("from test");
	}
	
	public User findUserByNameAndPass(String username,String password){
		System.out.println("验证用");
		//delete(2)；
		//String() args=(username,password);
		System.out.println("成功删除");
		List ul =getHibernateTemplate().find("from com.bean.User au where au.username = '"+username+"'and au.password = '"+password+"'");
		
		if(ul.size()==1)
		{
			System.out.println("OK 123abc");
			return (User)ul.get(0);
		}
		return null;
	}
	
	public User get(Integer id){
		return (User)getHibernateTemplate().get(User.class, id);
	}
	
	public void save(User user){
		getHibernateTemplate().save(user);
	
	}
	public void update(User user){
		getHibernateTemplate().saveOrUpdate(user);
	}

}
