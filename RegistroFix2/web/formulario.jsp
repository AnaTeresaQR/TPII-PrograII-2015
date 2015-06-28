<%-- 
    Document   : formulario
    Created on : 27/06/2015, 03:50:48 PM
    Author     : Ana Teresa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registro Comics</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel='stylesheet' type="text/css" href='estiloRegistro.css'>
    </head>
    <body>
        <div id="registro">

            <p>Para registrarse es necesario llenar el siguiente formulario</p>

            <form id="form-registro" method="get" action="Registro.jsp">
                <p>Complete los siguientes espacios</p>

                <label>Nick: </label><br>
                <input type="text" name="nick">
                <br><br>

                <label>Nombre: </label><br>
                <input type="text" name="nombre">
                <br><br>

                <label>Email: </label><br>
                <input type="text" name="email">
                <br><br>

                <label>Password: </label><br>
                <input type="text" name="password">
                <br><br>

                <input type='submit' value='Registrar'>
                <input type='reset' value="Limpiar registro">
            </form>
        </div>
    </body>
</html>
