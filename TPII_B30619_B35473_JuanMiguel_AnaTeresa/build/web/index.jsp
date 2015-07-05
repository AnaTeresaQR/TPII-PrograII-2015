<%-- 
    Document   : index
    Created on : 04-jul-2015, 8:54:15
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Comics ATJM</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel='stylesheet' type="text/css" href='css/estiloRegistro.css'>
        <%@include file="html/header.html"%>
    </head>
    <body>
        <img id="imagen" src="img/fondo.jpg"  alt="background" /> 
        <jsp:useBean id="user" scope="session" class="beans.User"/>

    <center>
        <h1>Comics ATJM</h1>
        <h4>Caracteristicas:</h4>
        <p>1. Para usar este sitio se necesita registrarse o puedes entrar como invitado</p>
        <p>2. Puedes crear personajes para toda la comunidad</p>
        <p>3. Puedes crear historietas con dos o un personaje por cuadro</p>
        <p>4. Puedes continuar otras historietas</p>

        <br>

        <h4>Instrucciones:</h4>
        <p>1. </p>
        <p>2. </p>
        <p>3. </p>
        <p>4. </p>
        <p>5. </p>

        <br>

        <a href="FormularioRegistro.jsp">Registrar</a><br>
        <a href="LogInvitado.jsp">Entrar como invitado</a><br>
        <a href="LogIn.jsp">Log In</a><br>

    </center>
    <%@include file="html/footer.html"%>
</body>
</html>
