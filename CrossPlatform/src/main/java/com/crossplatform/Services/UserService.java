package com.crossplatform.Services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.crossplatform.Model.User;

public class UserService {
public User LoginUser(User u){
	
	String filename="C:/Users/USER/newworkspace/CrossPlatform/src/main/java/com/crossplatform/Services/userData.csv";
	String line = "";  
	String splitBy = ",";  
	User u1=new User();
	//System.out.println(u);
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader(filename));  
	while ((line = br.readLine()) != null)   //returns a Boolean value  
	{  
	
	String[] user = line.split(splitBy); 
	u1.setName(user[0]);
	u1.setEmail(user[1]);
	u1.setPsw(user[2]);
	u1.setFirstpref(user[3]);
	u1.setSecondpref(user[4]);
	u1.setThirdpref(user[4]);
	//System.out.println(u1.toString());
	//System.out.println(u1.getEmail());
	//System.out.println(u1.getPsw());
	if(u.getEmail().equals(u1.getEmail())&&u.getPsw().equals(u1.getPsw())){
		
		//System.out.println("success");
		return u1;
	}
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	//System.out.println("fail");
	
	return null;
}
public void register(User u){
	String filePath = "C:/Users/USER/newworkspace/CrossPlatform/src/main/java/com/crossplatform/Services/userData.csv";

	String appendText = "\n";
	appendText+=" "+
	u.getName();
	appendText+=",";
	appendText+=u.getEmail();
	appendText+=",";
	appendText+=u.getPsw();
	appendText+=",";
	appendText+=u.getFirstpref();
	appendText+=",";
	appendText+=u.getSecondpref();
	appendText+=",";
	appendText+=u.getThirdpref();

	File file = new File(filePath);
	FileWriter fr = null;
	try {
		// Below constructor argument decides whether to append or override
		fr = new FileWriter(file, true);
		fr.write(appendText);
//System.out.print("appened");
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

}

}
public void storeFeedback(String sf){
	String filePath = "C:/Users/USER/newworkspace/CrossPlatform/src/main/java/com/crossplatform/Services/feedback.txt";

	String appendText = "\n";
	appendText+=sf;

	File file = new File(filePath);
	FileWriter fr = null;
	try {
		// Below constructor argument decides whether to append or override
		fr = new FileWriter(file, true);
		fr.write(appendText);
//System.out.print("appened");
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

}

}
public List viewAdmin(){
	List l=new ArrayList();
	 File file = new File("C:/Users/USER/newworkspace/CrossPlatform/src/main/java/com/crossplatform/Services/feedback.txt"); 
	 try{
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	 
	  while ((st = br.readLine()) != null) 
	    l.add(st);
	  }
	  catch(Exception e){
		  
	  }
	return l;
}
}