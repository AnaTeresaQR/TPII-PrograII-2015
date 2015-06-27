<%-- 
    Document   : Registro
    Created on : 27-jun-2015, 0:39:20
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Registro</title>
    </head>
    <body>
        <h1>Bienvenido a nuestra Web!</h1>
        <jsp:useBean id='user' scope="session" class="beans.User"/>
        <jsp:setProperty name='user' property="nick" param="nick"/>
        <jsp:setProperty name='user' property="nombre" param="name"/>
        <jsp:setProperty name='user' property="email" param="email"/>
        <jsp:setProperty name='user' property="password" param="password"/>

        <p>Nick: <jsp:getProperty name='user' property="nick"/></p>
        <p>Nombre: <jsp:getProperty name='user' property="nombre"/></p>
        <p>Email: <jsp:getProperty name='user' property="email"/></p>
        <p>Password: <jsp:getProperty name='user' property="password"/></p>
    </body>
</html>
