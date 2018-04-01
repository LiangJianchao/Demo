package com.liang.ssh.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.liang.ssh.entity.User;



@Repository
@Transactional
public class UserDAO {
	@Resource
	private HibernateTemplate hibernateTemplate;
	
	public Object getUser(final String username) {
		List<User> userlist = (List<User>) hibernateTemplate.find("from User where username=?", username);
		if(userlist != null) {
			return userlist.get(0);
		}
		return null;
	}
	
	public boolean insertUser(User user) {
		
		return false;
	}
}
