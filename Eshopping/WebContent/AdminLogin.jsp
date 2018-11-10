<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>

</head>
<body>
<div class="login-box">
<form action="AdminServlet" method="post">

<h1>Login</h1>
<div class="textbox">

<input type="text" placeholder="Username" name="user">
</div>

<div class="textbox">
<input type="password" placeholder="Password" name="pass">
</div>

<input  class="btn" type="submit" value="Login">
</form>
</div>
</body>
</html>