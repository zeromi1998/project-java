<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
<link rel="stylesheet" type="text/css" href="log.css">
</head>
<body>
<div  class="login-box">
<img src="img/user.png" class="avatar">
<form action="LoginServlet" method="post">
 <p>Username</p>
            <input type="text" name="email" placeholder="Enter Username">
            <p>Password</p>
            <input type="password" name="pass" placeholder="Enter Password">
            <input type="submit" name="submit" value="Login">
            <a href="#">Forget Password</a>  
</form>
</div>
</body>
</html>