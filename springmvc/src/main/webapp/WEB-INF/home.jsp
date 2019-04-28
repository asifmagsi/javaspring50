<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring :: Home </title>
    </head>
    <body>
        <h1> -- Welcome Home Page---</h1>
        
        <!-- Message --> 
        <c:if test="${not empty map.fail}">
        <font color="RED">${map.fail}</font>
        </c:if>
        <c:if test="${not empty map.pass}">
        <font color="GREEN">${map.pass}</font>
        </c:if>
        
        <!-- Main Table Area -->
        <table border="1" >
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Email</td>
                <td>Phone</td>
                <td>Username</td>
                <td>Password</td>
                <td>Active</td>
                <td>Actions</td>
            </tr>
            <c:if test="${not empty map.all}">
                <c:forEach items="${map.all}" var="user" >
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.email}</td>
                        <td>${user.phone}</td>
                        <td>${user.username}</td>
                        <td>${user.userpass}</td>
                        <td>${user.active}</td>
                        <td>
                            <!-- Delete -->
                            <form action="userdel.htm" method="post">
                                <input type="hidden" name="id" value="${user.id}" />
                                <input type="submit" value="Delete" />
                            </form>
                            <!-- Update -->
                            <form action="userupd.htm" method="get">
                                <input type="hidden" name="id" value="${user.id}" />
                                <input type="submit" value="Update" />
                            </form>
                        </td>                        
                    </tr>
                </c:forEach>
            </c:if>
        </table>
        <!-- Footer -->
        <a href="useradd.htm">
            <input type="button" value="Add User" />
        </a> 
        <a href="logout.htm">
            <input type="button" value="Logout" />
        </a> 
    </body>
</html>
