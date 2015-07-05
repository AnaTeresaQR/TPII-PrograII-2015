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
        <link rel='stylesheet' type="text/css" href='css/estiloRegistro.css'>
        <link rel="stylesheet" type="text/css" href="css/estiloProfile.css">
        <script type="text/javascript" src="js/validaciones.js"></script> 
        <%@include file="html/header.html"%>
    </head>
    <body>
        <img id="imagen" src="img/fondo.jpg"  alt="background" /> 
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
        <form id="form"  onsubmit="return formulario(this)" method="get" action="Registro.jsp">
            <p>Complete los siguientes espacios</p>

            <label>Nick: </label><br>
            <input type="text" name="nick">
            <br><br>

            <label>Email: </label><br>
            <input type="text" name="email">
            <br><br>

            <label>Password: </label><br>
            <input type="password" name="password">
            <br><br>

            <input type='submit' value='Registrarme'>
            <input type='reset' value="Limpiar">
            <br><br>
            <a href='LogIn.jsp'>Log In</a>

        </form>
        <br>
        <a href="Home.jsp">Home</a>
        <%@include file="html/footer.html"%>
    </body>
</html>
