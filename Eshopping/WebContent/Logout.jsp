<%@page import="com.model.ViewManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@include file="header.jsp" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Profile</title>
</head>
<body>

<div  style="text-align: right;"> 
Welcome ,<c:out value="${em.name }"></c:out>
</div>


<a href="Logout?"><hi  style="color: blue ; height: auto;width: 60px ; text-align:right; margin-left: 1288px; margin-top: -90px">Logout</hi> </a>


</body>
</html>