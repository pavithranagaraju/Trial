<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@page import="java.util.ArrayList" %>
   <%@page import="java.util.List" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>View FeedBack</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
       <div class="container">
  <h2>FeedBack List</h2>
    
  <table class="table table-striped">
    <thead>
      <tr>
        <th>FeedBack List</th>
      </tr>
    </thead>
    <tbody>
  <%
  List l=new ArrayList();
  l=(List)request.getAttribute("feedback");
  for(Object s:l){
	  out.println("<tr><td>"+s+"</td></tr>");
  }
  %>
    </tbody>
  </table>
</div>
</body>
</html>