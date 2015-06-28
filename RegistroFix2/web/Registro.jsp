<%-- 
    Document   : Registro
    Created on : 27-jun-2015, 0:39:20
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.User" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Registro</title>
        <link rel="stylesheet" type="text/css" href="estiloRegistro">
    </head>
    <body>
        <div id="ResultadoRegistro">
            <h1>Bienvenido a nuestra Web!</h1>
            <jsp:useBean id='user' scope="session" class="beans.User"/>

            <jsp:setProperty name='user' property="nick" param="nick"/>
            <jsp:setProperty name='user' property="email" param="email"/>
            <jsp:setProperty name='user' property="password" param="password"/>

            <p>Nick: <jsp:getProperty name='user' property="nick"/></p>
            <p>Email: <jsp:getProperty name='user' property="email"/></p>
            <p>Password: <jsp:getProperty name='user' property="password"/></p>
        </div>
    </body>
</html>
