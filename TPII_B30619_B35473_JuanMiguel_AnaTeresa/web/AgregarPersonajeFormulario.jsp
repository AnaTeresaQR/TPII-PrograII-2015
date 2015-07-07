<%-- 
    Document   : AgregarPersonajeFormulario
    Created on : 06-jul-2015, 18:58:43
    Author     : Juan
--%>

<%@page import="xmlLogic.Lista_Personajes"%>
<%@page import="xmlLogic.ManejadorXMLPersonajes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type="text/css" href='css/estiloGeneral.css'>
        <script type="text/javascript" src="js/validaciones.js"></script> 
        <title>Crea tu personaje</title>
        <%@include file="html/header.html"%>
    </head>
    <body>

        <%@include file="html/menu.html" %>
        <img id="imagen" src="img/fondo.jpg"  alt="background" /> 

        <section id="section-crearPersonaje">
            <form id="form"  onsubmit="return noVacios(this)" method="get" action="ResultadoAgregarPersonaje.jsp">
                <p>Complete los siguientes espacios</p>

                <label>Nombre </label><br>
                <input type="text" name="nombre">
                <br><br>

                <label>Descripcion </label><br>
                <input type="text" name="descripcion">
                <br><br>

                <label>Personalidad </label><br>
                <input type="text" name="personalidad">
                <br><br>

                <label>Encuentra tu foto por id <a href="ListaPersonajes.jsp">aqui!</a></label><br>
                <input type="text" name="img">
                <br><br>

                <input type='submit' value='Agregar personaje'>
                <input type='reset' value="Limpiar">
                <br><br>

            </form>
        </section>


    </body>
    <%@include file="html/footer.html" %>
</html>
