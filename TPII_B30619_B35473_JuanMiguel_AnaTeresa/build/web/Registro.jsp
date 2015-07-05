<%-- 
    Document   : Registro
    Created on : 04-jul-2015, 11:27:07
    Author     : Juan
--%>

<%@page import="com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException"%>
<%@page import="BaseDatos.Registrar"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.User" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Registro</title>
        <link rel="stylesheet" type="text/css" href="css/estiloRegistro.css">
    </head>
    <body>
    <Center id="ResultadoRegistro">
        <h1>Bienvenido a nuestra Web!</h1>
        <jsp:useBean id='user' scope="session" class="beans.User"/>

        <jsp:setProperty name='user' property="nick" param="nick"/>
        <jsp:setProperty name='user' property="email" param="email"/>
        <jsp:setProperty name='user' property="password" param="password"/>

        <jsp:useBean id="registro" scope="session" class="BaseDatos.Registrar"/>
        <jsp:useBean id="JOP" scope="session" class="beans.JOP"/>

        <%
            try {
                JOP.setMsj("");
                registro.registrar(user);
                response.sendRedirect("Home.jsp");
            } catch (Exception e) {
                JOP.setMsj("Datos ya registrados");
                response.sendRedirect("FormularioRegistro.jsp");
            }
        %>

        <a href="LogIn.jsp">Log In</a>
    </Center>
</body>
</html>
