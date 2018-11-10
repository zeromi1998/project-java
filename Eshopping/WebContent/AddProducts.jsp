<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AddProductServlet" method="post">
Enter Prodcut Id:<input type="text" name="id"><br><br>
Enter Product name:<input type="text" name="name"><br><br>
Enter Product manufactured date:<input type="text" name="manu"><br><br>
Enter Product Expire date :<input type="text" name="exp"> <br><br>
Enter Product Proce:<input type="text" name="p"><br><br>
<input type="submit" value="Add" >
</form>
</body>
</html>