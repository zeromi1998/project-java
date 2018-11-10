<%@page import="com.pojo.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.model.ViewManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
    <%@include file="header.jsp" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
ViewManager vm=new ViewManager();
List<Product> plist=vm.ShowProductDetails();
HttpSession hs=request.getSession();
hs.setAttribute("list",plist );
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
<style>
body {

	background: none;
}

</style>

</head>
<body>
<div  style="text-align: right;"> 
Welcome ,<c:out value="${em.name }"></c:out>
</div>
<table border="1" width="100%"> 
<tr>
<th>Id</th>
<th>producti</th>
<th>productname</th>
<th>expiredate</th>
<th>manufactureddate</th>
<th>price</th>
</tr>

<c:forEach items="${list}" var="p">
<tr>
<td><c:out value="${p.pid}"></c:out></td>
<td><c:out value="${p.productId}"></c:out>
<td><c:out value="${p.proname}"></c:out></td>
<td><c:out value="${p.expireDate }"></c:out></td>
<td><c:out value="${p.manufacturedDate}"></c:out></td>
<td><c:out value="${p.price}"></c:out></td>
<td><a href="BuyProductServlet?pid=${p.pid}"><button  style="color: black; height: auto;width: 60px">Buy</button></a></td>


</c:forEach>
</tr>
</table>


</body>
</html>