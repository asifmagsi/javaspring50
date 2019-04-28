<%-- 
    Document   : userupd
    Created on : Apr 28, 2019, 11:18:01 AM
    Author     : shahzad
--%>
<!-- Class 10 -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring :: User Update</title>
    </head>
    <body>
        <!-- Message --> 
        <c:if test="${not empty map.fail}">
        <font color="RED">${map.fail}</font>
        </c:if>
        <c:if test="${not empty map.pass}">
        <font color="GREEN">${map.pass}</font>
        </c:if>

        <!-- Main Area -->
        <form action="userupd.htm" method="post" >
            <input type="hidden" name="id" 
                   value="${map.user.id}" />
            <table border="0">
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="${map.user.name}" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="${map.user.email}" /></td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td><input type="text" name="phone" value="${map.user.phone}"/></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" value="${map.user.username}" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="userpass" value="${map.user.userpass}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Update User" />
                        <input type="reset" value="Cancel" />
                    </td>
                </tr>
            </table>
        </form>
        <!-- Footer -->
        <a href="home.htm">
            <input type="button" value="Home" />
        </a> 
        <a href="logout.htm">
            <input type="button" value="Logout" />
        </a>
    </body>
</html>
