<%-- 
    Document   : Home
    Created on : 04-jul-2015, 13:18:51
    Author     : Juan
--%>


<%@page import="xmlLogic.Historieta"%>
<%@page import="xmlLogic.Lista_Historietas"%>
<%@page import="xmlLogic.ManejadorXMLHistorietas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
        <%@include file="html/header.html" %>
    </head>
    <body>
        <jsp:useBean id="user" scope="session" class="beans.User"/>
        <%
            if (user.getNick().equalsIgnoreCase("guest")) {
        %>
        <h1>Hola invitado!</h1>
        <%
        } else {
        %>

        <h1>Hola <a href="Profile.jsp"><%=user.getNick()%></a>!</h1>
        <%
            }
        %>

        <%@include file="html/menu.html"%>
        <%
            String ruta = getServletContext().getRealPath("xml/historietas.xml");
            ManejadorXMLHistorietas manager = new ManejadorXMLHistorietas(ruta);
            Lista_Historietas lista = manager.ListaHistorietas();
        %>
        <section id='section-historietas'>

            <ul>
                <%
                    for (int i = 0; i < lista.size(); i++) {
                        Historieta h = lista.getHistorietas(i);
                        String nombre = h.getNombre();
                        String resumen = h.getResumen();
                %>
                <li>
                    <p>Nombre: <a><%=nombre%></a></p>
                    <p>Resumen: <%=resumen%></p>
                </li>
                <%
                    }
                %>
            </ul>

        </section>

        <%@include file="html/footer.html" %>


    </body>
</html>
