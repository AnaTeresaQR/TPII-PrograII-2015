<%-- 
    Document   : Registro
    Created on : 04-jul-2015, 10:48:40
    Author     : Juan
--%>

<%@page import="beans.JOP"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registro Comics</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel='stylesheet' type="text/css" href='css/estiloGeneral.css'>
        <script type="text/javascript" src="js/validaciones.js"></script> 
    </head>
    <body>
        <img id="imagen" src="img/fondo.jpg"  alt="background" /> 
        <div id="registro">

            <jsp:useBean id="JOP" scope="session" class="beans.JOP"/>
            <p>Para registrarse es necesario llenar el siguiente formulario</p>
            <h2><jsp:getProperty name="JOP" property="msj"/></h2>

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
        </div>
    </body>
</html>
