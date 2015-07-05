<%-- 
    Document   : Profile
    Created on : 04-jul-2015, 14:52:15
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit profile</title>
        <link rel="stylesheet" type="text/css" href="css/estiloProfile.css">
        <%@include file="html/header.html"%>
    </head>
    <body>
        <jsp:useBean id="user" scope="session" class="beans.User"/>
        <table>
            <tr>
                <th> - Unique ID - </th>
                <th> - Nick - </th>
                <th> - Email - </th>
                <th> - Password - </th>
            </tr>

            <tr>
                <td><jsp:getProperty name="user" property="unique"/></td>
                <td><jsp:getProperty name="user" property="nick"/></td>
                <td><jsp:getProperty name="user" property="email"/></td>
                <td><jsp:getProperty name="user" property="password"/></td>
            </tr>
        </table>
            <br>
        <a href="Home.jsp">Home</a>
        <%@include file="html/footer.html"%>
    </body>
</html>
