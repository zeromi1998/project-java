<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<style>
body {
    font-family: Arial, Helvetica, sans-serif;
   
 background: none;
    background-image: none;
}

* {
    box-sizing: border-box;
}

/* Add padding to containers */
.container {
    padding: 16px;
    background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}

/* Add a blue text color to links */
a {
    color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
    background-color: #f1f1f1;
    text-align: center;
}
</style>
</head>
<body>

<form action="RegistreServlet" method="post">
<div class="container">
 <h1>Register</h1>
 <p>Please fill in this form to create an account.</p>

<!-- Enter Name: <input type="text" name="name"><br><br>
Enter emailId:<input type="email" name="email"><br><br>
Enter password:<input type="password" name="pass"><br><br>
Enter address:<textarea name="add"></textarea><br><br>
Enter phone:<input type="text" name="pho"> <br><br>
<input type="submit" value="Register">
 -->
 <hr>
 <label for="email"><b>Name</b></label>
    <input type="text" placeholder="Enter name" name="name" required>

    <label for="psw"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw-repeat"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pass" required>
    
    <label for="psw"><b> Address</b></label><br><br>
    <textarea type="text" placeholder="Enter Address" name="add" required></textarea><br><br>
    
    <label for="psw"><b>Phone No.</b></label><br><br>
    <input type="text" placeholder="Enter Phone" name="pho" required>
    
    <hr>
    <button type="submit" class="registerbtn">Register</button>
 
</div>

 <div class="container signin">
    <p>Already have an account? <a href="UserLogin.jsp">Log in</a>.</p>
  </div>
</form>

</body>
</html>