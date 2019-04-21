<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring :: MVC :: Login </title>
    </head>
    <body>
        <h1> -- Login Page ---</h1>
        
        <!-- Login Form -->
        <form action="login.htm" method="post">
            Login: <input type="text" name="login" /> <br />
            Pass: <input type="password" name="pass" /> <br />
            <input type="submit" value="Login" /> 
            <input type="reset" value="Cancel" />
        </form>
    </body>
</html>
