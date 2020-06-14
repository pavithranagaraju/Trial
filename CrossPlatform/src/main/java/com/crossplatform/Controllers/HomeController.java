package com.crossplatform.Controllers;


import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crossplatform.Model.User;
import com.crossplatform.Services.HdfsData;
import com.crossplatform.Services.UserService;


@Controller
public class HomeController {
	public static String p1=null;
	public static User u=null;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "Login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "Login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		

		return "Register";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userValidate(@Validated User user, Model model) throws SQLException {
		//System.out.println(user);
		UserService s=new UserService();
		
		 u=s.LoginUser(user);
		if(u==null){
			model.addAttribute("Error", "Invalid Credentials");
			return "Login";
			
		}
		else{
			model.addAttribute("user", u);
			HdfsData d=new HdfsData();
			List l=d.retriveData();
			model.addAttribute("data",l);
		//	System.out.println("moving on to index");
			return "index";
		}
	}
	
	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	public String userRegister(@Validated User user, Locale locale,Model model) throws SQLException {
		//System.out.println(user);
		UserService s=new UserService();
		s.register(user);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		
			return "Login";
		
	}
	
		@RequestMapping(value = "/index", method = RequestMethod.GET)
		public String index(Locale locale, Model model) {
			
			model.addAttribute("user", u);
			HdfsData d=new HdfsData();
			List l=d.retriveData();
			model.addAttribute("data",l);
			
			return"index";
		}
		
		@RequestMapping(value = "/home", method = RequestMethod.GET)
		public String homeCat(@RequestParam("p1") String p2, Model model) {
			p1=p2;
		//	System.out.println(p2);
			model.addAttribute("user", u);
			HdfsData d=new HdfsData();
			long start = System.currentTimeMillis(); 
			List l=d.retriveData();
			long end = System.currentTimeMillis(); 
			 System.out.println("Time required to fetch data " + 
                    (end - start) + "ms"); 
			model.addAttribute("p1", p1);
			model.addAttribute("data",l);
			//model
			return "index";
		}
		
		@RequestMapping(value = "/feedbackUser", method = RequestMethod.POST)
		public String feedback(@RequestParam("feed") String feedback, Model model) {
			UserService us=new UserService();
			us.storeFeedback(feedback);
			model.addAttribute("user", u);
			HdfsData d=new HdfsData();
			List l=d.retriveData();
			model.addAttribute("p1", p1);
			model.addAttribute("data",l);
			//model
			return "index";
		}
		
		
		@RequestMapping(value = "/cat", method = RequestMethod.GET)
		public String cat(Locale locale, Model model) {
			
			model.addAttribute("user", u);
			HdfsData d=new HdfsData();
			long start = System.currentTimeMillis(); 
			List l=d.retriveData();
			 long end = System.currentTimeMillis(); 
			 System.out.println("Time required to fetch data " + 
                     (end - start) + "ms"); 
			model.addAttribute("data",l);
			
			return "Category";
		}
		
		@RequestMapping(value = "/admin", method = RequestMethod.GET)
		public String admin(Locale locale, Model model) {
			UserService s=new UserService();
			List l=s.viewAdmin();
			model.addAttribute("feedback",l);
			
			
			
			return "Admin";
		}
		
		@RequestMapping(value = "/feedback", method = RequestMethod.GET)
		public String feedback( Model model) {
			
			model.addAttribute("user", u);
			
			
			return "Feedback";
		}
		
	
}
