<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><p><%
if(request.getAttribute("errorMessage")!=null)
		out.println(request.getAttribute("errorMessage")); %>
<form action="home" method="post">
Enter Email Id<input type="text" name="emailid"/>
Enter Password<input type="password" name="Password"/>
<input type="submit" value="Login"/>
<a href='Register'>Register</a>
                                
</form>
</body>
</html>