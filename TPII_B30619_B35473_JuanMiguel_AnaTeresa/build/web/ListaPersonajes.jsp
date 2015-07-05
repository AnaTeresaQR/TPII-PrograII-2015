<%-- 
    Document   : ListaPersonajes
    Created on : 04/07/2015, 08:24:24 PM
    Author     : Ana Teresa
--%>
<%@page import="xmlLogic.Personaje"%>
<%@page import="xmlLogic.Lista_Personajes"%>
<%@page import="xmlLogic.ManejadorXMLPersonajes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/stilos.css">
        <title>Lista de personajes disponibles</title>
        <%@include file="html/header.html" %>
    </head>
    <body>
        <%
            String ruta = getServletContext().getRealPath("xml/personajes.xml");
            ManejadorXMLPersonajes manejador = new ManejadorXMLPersonajes(ruta);
            Lista_Personajes listaP = manejador.listaPersonajes();
        %>
        <nav id="lista-personajes">
            <p>Lista Personajes</p>
            <ul>
                <%
                    for (int i = 0; i < listaP.size(); i++) {
                        Personaje temp = listaP.getPersonajes(i);
                        int id = temp.getId();
                        String nombre = temp.getNombre();
                        String descripcion = temp.getDescripcion();
                        String personalidad = temp.getPersonalidad();
                        String foto = temp.getFoto();
                %>
                <li>
                    <p>id: <%=id%></p>
                    <p>Nombre: <%=nombre%></p>
                    <p>Descripcion: <%=descripcion%></p>
                    <p>Personalidad: <%=personalidad%></p>
                    <img src="<%=foto%>">
                </li>
                <%
                    }
                %>
            </ul>
        </nav>
        <%@include file="html/footer.html" %>
    </body>
</html>
