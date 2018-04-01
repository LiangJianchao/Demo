package com.liang.ssh.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.liang.ssh.entity.User;
import com.liang.ssh.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	@Resource
	private UserService userService;
	
	Map<String, String> errors = new HashMap();
	
	private User user = new User();

	public User getUser() {
		return user;
	}
	
	public Map getErrors() {
		return errors;
	}
	
	
	
	@Action(value = "LoginAction",results = {@Result(name = SUCCESS , location = "welcome.jsp"),@Result(name = INPUT , location = "/index.jsp")})
	public String Login() {
		System.out.println("LoginAction");
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get(ServletActionContext.HTTP_REQUEST);
		String username = user.getUsername();
		String password = user.getPassword();
		
		User user2 = userService.getUser(username);
		System.out.println(user2.getUsername());
		if(user2 == null) {
			errors.put("user_name_error", "用户名不存在");
		}else if(password != user2.getPassword()){
			errors.put("user_password_error", "密码不正确");
		}
		
		if(errors.isEmpty()) {
			return SUCCESS;
		}
		
		return INPUT;
	}
	
	
	@Action(value = "RegisterAction")
	public String Register() {
		System.out.println("RegisterAction");
		return null;
	}
}
