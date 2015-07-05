<%-- 
    Document   : LogIn
    Created on : 04-jul-2015, 10:48:30
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type="text/css" href='css/estiloRegistro.css'>
        <script type="text/javascript" src="js/validaciones.js"></script> 
        <title>Comics ATJM</title>
    </head>
    <body>
        <%@include file="html/header.html"%>
        <h1>Bienvenido</h1>
        <section>           
            <form  id="login"  onsubmit="return logIn(this)" method="get" action="ResultadoLogin.jsp">
                <p>Complete los siguientes espacios</p>

                <label>Identificador: </label><br>
                <input type="text" name="identificador">
                <br><br>

                <label>Password: </label><br>
                <input type="password" name="password">
                <br><br>

                <input type='submit' value='LogIn!'>
                <a href="FormularioRegistro.jsp">Registrarme</a>
            </form>
        </section>
        <%@include file="html/footer.html" %>
    </body>
</html>

