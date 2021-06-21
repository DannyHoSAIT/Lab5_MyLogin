<%-- 
    Document   : login
    Created on : Jun 20, 2021, 10:59:13 PM
    Author     : danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form method="post" action="login"> 
            <label>Username:</label>
            <input type="text" name="usernameInput" value="${username}">
            <br>
            <label>Password:</label>
            <input type="text" name="passwordInput" value="${password}">
            <br>
            <input type="submit" value="Login">
        </form>
        
        <p>${message}</p>
    </body>
</html>
