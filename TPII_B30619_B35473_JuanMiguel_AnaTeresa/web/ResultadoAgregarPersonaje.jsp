<%-- 
    Document   : ResultadoAgregarPersonaje
    Created on : 06-jul-2015, 20:02:07
    Author     : Juan
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="xmlLogic.Personaje"%>
<%@page import="xmlLogic.Lista_Personajes"%>
<%@page import="xmlLogic.ManejadorXMLPersonajes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type="text/css" href='css/estiloGeneral.css'>
        <title>JSP Page</title>
        <%@include file="html/header.html"%>
    </head>
    <body>
        <%@include file="html/menu.html" %>
        <img id="imagen" src="img/fondo.jpg"  alt="background" /> 
        <%
            // Obtengo la info del personaje
            String ruta = getServletContext().getRealPath("/xmlFiles/personajes.xml");
            ManejadorXMLPersonajes manejador = new ManejadorXMLPersonajes(ruta);
            Lista_Personajes listaP = manejador.getListaPersonajes();

            if (listaP != null) {

                String nombre = request.getParameter("nombre");
                String descripcion = request.getParameter("descripcion");
                String personalidad = request.getParameter("personalidad");
                int id = Integer.parseInt(request.getParameter("img"));
                Personaje ptemp = listaP.getPersonajes(id - 1);
                String pathFoto = ptemp.getFoto();

                manejador.agregarPersonaje(new Personaje(nombre, descripcion, personalidad, pathFoto), ruta);
                response.sendRedirect("ListaPersonajes.jsp");
            }
        %>

    </body>
    <%@include file="html/footer.html" %>
</html>
