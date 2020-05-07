package com.resturant.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.resturant.UserDao.AdminDao;
import com.resturant.UserDao.UserDao;
import com.resturant.model.Admin;
import com.resturant.model.User;
@Controller
public class AdminController {
	@Autowired
	AdminDao admindao;
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String LoginAdmin(){
		return "admin";
		
	}
	
	@RequestMapping(value="/adminRegister",method=RequestMethod.GET)
	public String RegisterAdmin(){
		return "RegisterAdmin";
		
	}
	@RequestMapping(value = "/RegisterAdmin", method = RequestMethod.POST)
	public String AddAdmin(@Validated Admin admin, Model model) throws SQLException {
		model.addAttribute("admin", admin);
		if(admindao.RegisterAdmin(admin))
			return "admin";
		else {
			model.addAttribute("Error", "Invalid Credentials");
			return "RegisterAdmin";
			
		}
					
		}
	@RequestMapping(value = "/adminlog", method = RequestMethod.POST)
	public String AdminValidate(@Validated Admin admin, Model model) throws SQLException {
		
		model.addAttribute("admin", admin);
		
		if(admindao.ValidateAdmin(admin))
			return "adminHome";
		else {
			model.addAttribute("Error", "Invalid Credentials");
			return "admin";
			
		}
}
}
