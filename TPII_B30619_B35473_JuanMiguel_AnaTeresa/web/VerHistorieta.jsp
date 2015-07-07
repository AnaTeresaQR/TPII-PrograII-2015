<%-- 
    Document   : VerHistorieta
    Created on : 05-jul-2015, 16:42:54
    Author     : Juan
--%>

<%@page import="xmlLogic.Personaje"%>
<%@page import="xmlLogic.Lista_Personajes"%>
<%@page import="xmlLogic.ManejadorXMLPersonajes"%>
<%@page import="xmlLogic.Cuadro"%>
<%@page import="xmlLogic.Historieta"%>
<%@page import="xmlLogic.Lista_Historietas"%>
<%@page import="xmlLogic.ManejadorXMLHistorietas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" type="text/css" href="css/estiloGeneral.css">

        <%
            // Obtengo el nombre de la historieta que se quiere ver
            String nombre = request.getParameter("nombre");
        %>
        <title>Historieta: <%=nombre%></title>
    </head>

    <%@include file="html/header.html" %>
    <body>
        <%@include file="html/menu.html" %>
        <img id="imagen" src="img/fondo.jpg"  alt="background" /> 
        <%
            // Cargo las historietas
            String ruta = getServletContext().getRealPath("/xmlFiles/historietas.xml");
            ManejadorXMLHistorietas manager = new ManejadorXMLHistorietas();
            manager.setRuta(ruta);
            // Obtengo las historietas actualizadas
            Lista_Historietas lista = manager.ListaHistorietas();
            // Busco la historieta
            Historieta historietaActual = lista.buscarPorNombre(nombre);
            // Dato de prueba para poder visualizar aunque se el primer cuadro
            Cuadro c = historietaActual.obtenerCuadro(0);

            // Obtengo la info del personaje
            ruta = getServletContext().getRealPath("/xmlFiles/personajes.xml");
            ManejadorXMLPersonajes manejador = new ManejadorXMLPersonajes(ruta);
            Lista_Personajes listaP = manejador.listaPersonajes();
        %>

        <section id="section-proyector">

            <table>

                <tr id="tr-dialogos">

                    <%                    String[] dialogos = c.obtenerDialogos();
                        for (int i = 0; i < dialogos.length; i++) {
                    %>

                    <td><%=dialogos[i]%></td>

                    <%
                        }
                    %>
                </tr>

                <tr id="tr-personajes">

                    <%
                        int[] idsPersonajes = c.obtenerPersonaje();
                        for (int i = 0; i < dialogos.length; i++) {
                            Personaje personajeTemp = listaP.getPersonajeByid(idsPersonajes[i]);
                            String path = personajeTemp.getFoto();
                            String nombrePersonaje = personajeTemp.getNombre();
                    %>

                    <td><img src="<%=path%>" alt="<%=nombrePersonaje%>"></td>

                    <%
                        }
                    %>
                </tr>
            </table>
            <button>Siguiente</button>
            <button>Anterior</button>

        </section>
        <%@include file="html/footer.html" %>
    </body>
</html>
