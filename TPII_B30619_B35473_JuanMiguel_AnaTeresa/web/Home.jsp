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
        <link rel='stylesheet' type="text/css" href='css/estiloGeneral.css'>
        <title>Home page</title>
        <%@include file="html/header.html" %>
        <%@include file="html/menu.html" %>
    </head>
    <body>
        <img id="imagen" src="img/fondo.jpg"  alt="background" /> 
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
        <%
            String ruta = getServletContext().getRealPath("/xmlFiles/historietas.xml");
            ManejadorXMLHistorietas manager = new ManejadorXMLHistorietas();

            manager.setRuta(ruta);
            Lista_Historietas lista = manager.ListaHistorietas();
        %>
        <section id='section-historietas'>

            <ul>
                <%
                    for (int i = 0;
                            i < lista.size();
                            i++) {
                        Historieta h = lista.getHistorietas(i);
                        String nombre = h.getNombre();
                        String resumen = h.getResumen();
                %>
                <li>
                    <form method="get" action="VerHistorieta.jsp">
                        <strong>Nombre:</strong> <input name="nombre" type='submit' value='<%=nombre%>'><br>
                        <strong>Resumen:</strong> <p><%=resumen%></p>
                        <br>
                        <br>
                    </form>
                </li>
                <%
                    }
                %>
            </ul>

        </section>
    </body>
    <%@include file="html/footer.html" %>
</html>
