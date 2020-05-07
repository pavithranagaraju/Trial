package com.resturant.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import com.resturant.DbConnection.DbConfig;
import com.resturant.model.User;

@Service
public class UserDao {
	DbConfig dbconfig=new DbConfig();
public boolean ValidateUser(User u) throws SQLException{
	Connection con= dbconfig.dbConn();
	System.out.println(u.getPsw());
	PreparedStatement statement = con.prepareStatement("SELECT * from users WHERE  emailid=? && psw=?");
	statement.setString(1, u.getEmailid());
	statement.setString(2,u.getPsw());
    ResultSet rs = statement.executeQuery();
    
    if(rs.next()!=false)
    { con.close();
    	return true;
    }
    con.close();
	return false;
}
public boolean RegisterUser(User u) throws SQLException
{
	Connection con= dbconfig.dbConn();
	String sql = "insert into users(uname,psw,phno,emailid,gender,address,subscription) values(?,?,?,?,?,?,?)";
User us=new User(1001,"Anu","anu123","anu@gmail.com","female","Mysore","0",8976453210l);
u=us;
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, u.getUname());
pstmt.setString(2, u.getPsw());
pstmt.setLong(3,u.getPhno());
pstmt.setString(4, u.getEmailid());
pstmt.setString(5, u.getGender());
pstmt.setString(6, u.getAddress());
pstmt.setString(7, u.getSubscription());
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
