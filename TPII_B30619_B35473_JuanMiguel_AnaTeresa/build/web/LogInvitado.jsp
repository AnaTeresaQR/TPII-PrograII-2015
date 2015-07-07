<%-- 
    Document   : LogInvitado
    Created on : 04-jul-2015, 14:30:26
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type="text/css" href='css/estiloGeneral.css'>
        <title>JSP Page</title>
    </head>
    <body>
        <img id="imagen" src="img/fondo.jpg"  alt="background" /> 
        <jsp:useBean id="user" scope="session" class="beans.User"/>
        <jsp:setProperty name="user" property="nick" value="guest"/>
        <jsp:setProperty name="user" property="email" value="guest@gmail.com"/>
        <jsp:setProperty name="user" property="unique" value="-1"/>
        <jsp:setProperty name="user" property="password" value="xxxxx"/>

        <%
            response.sendRedirect("Home.jsp");
        %>
    </body>
</html>
