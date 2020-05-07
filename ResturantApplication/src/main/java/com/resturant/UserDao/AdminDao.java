package com.resturant.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.resturant.DbConnection.DbConfig;
import com.resturant.model.Admin;
import com.resturant.model.User;

@Service
public class AdminDao {
	DbConfig dbconfig=new DbConfig();
	public boolean ValidateAdmin(Admin a) throws SQLException{
		Connection con= dbconfig.dbConn();
		System.out.println(a);
		
		PreparedStatement statement = con.prepareStatement("SELECT * from admin WHERE  emailid=? && psw=?");
		statement.setString(1, a.getEmailid());
		statement.setString(2,a.getPwd());
	    ResultSet rs = statement.executeQuery();
	    
	    if(rs.next()!=false)
	    { con.close();
	    	return true;
	    }
	    con.close();
		return false;
	}
	public boolean RegisterAdmin(Admin a) throws SQLException
	{
		Connection con= dbconfig.dbConn();
		String sql = "insert into admin(name,psw,phno,emailid,gender,address) values(?,?,?,?,?,?)";
	Admin ad=new Admin(1001,"Anu","anu123",8976453210l,"anu@gmail.com","female","Mysore");
	a=ad;
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1,a.getName());
	pstmt.setString(2,a.getPwd());
	pstmt.setLong(3,a.getPhno());
	pstmt.setString(4,a.getEmailid());
	pstmt.setString(5, a.getGender());
	pstmt.setString(6, a.getAddress());
	
	int rowAffected = pstmt.executeUpdate();
	if(rowAffected == 1)
	{
	   con.close();
	   return true;
	}

		con.close();
		return false;
	}
	}