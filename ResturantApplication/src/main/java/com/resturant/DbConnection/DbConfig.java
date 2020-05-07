package com.resturant.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConfig {
public static Connection dbConn() {
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/resturant","root","NTTDATA");  
		//here resturant is database name, root is username and password  is NTTDATA 
		
		return con;
		}catch(Exception e){ System.out.println(e);}  
	return null;
		}  

}
