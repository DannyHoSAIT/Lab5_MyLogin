<%-- 
    Document   : home
    Created on : Jun 20, 2021, 10:59:58 PM
    Author     : danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body>
        <form method="get" action="login"> 
            
            <h1>Home Page</h1>
            
            <h3>Hello ${username}</h3>
            
            <a href="home?logout">Logout</a>
        </form>
        
    </body>
</html>
