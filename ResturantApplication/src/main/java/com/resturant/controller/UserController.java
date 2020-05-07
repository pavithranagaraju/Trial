package com.resturant.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.resturant.UserDao.UserDao;
import com.resturant.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDao userdao;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String LoginUser(){
		return "LoginUser";
		
	}
	
	@RequestMapping(value="/Register",method=RequestMethod.GET)
	public String RegisterUser(){
		return "Register";
		
	}
	@RequestMapping(value = "/RegisterUser", method = RequestMethod.POST)
	public String AddUser(@Validated User user, Model model) throws SQLException {
		model.addAttribute("user", user);
		if(userdao.RegisterUser(user))
			return "LoginUser";
		else {
			model.addAttribute("Error", "Invalid Credentials");
			return "Register";
			
		}
					
		}
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String userValidate(@Validated User user, Model model) throws SQLException {
		
		model.addAttribute("user", user);
		System.out.println(user);
		if(userdao.ValidateUser(user))
			return "user";
		else {
			model.addAttribute("Error", "Invalid Credentials");
			return "LoginUser";
			
		}
}
}
