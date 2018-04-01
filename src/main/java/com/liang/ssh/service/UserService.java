package com.liang.ssh.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.liang.ssh.dao.UserDAO;
import com.liang.ssh.entity.User;

@Service
@Transactional
public class UserService {
	@Resource
	private UserDAO userDAO;
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public User getUser(String username) {
		return (User) userDAO.getUser(username);
	}
}
