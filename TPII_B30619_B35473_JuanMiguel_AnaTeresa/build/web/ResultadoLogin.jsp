<%-- 
    Document   : ResultadoLogin
    Created on : 04-jul-2015, 13:44:04
    Author     : Juan
--%>
<%@page import="beans.User"%>
<%@page import="BaseDatos.LogIn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="user" scope="session" class="beans.User"/>
        <%
            String id = request.getParameter("identificador");
            String pass = request.getParameter("password");
            LogIn login = new LogIn();

            String nick = "";
            String email = "";
            int unique = 0;
            // esto nos devuelve null si no encontro al usuario en la base de datos
            User temp = login.login(id, pass);
            if (temp == null) {
                // nos redirecciona a la el LogIn porque no se encontro el usuario 
                // en la base de datos
                response.sendRedirect("LogIn.jsp");

            } else {
                // si encontro al usuario entonces inicializamos las variables
                // para luego inicializar nuestro usuario
                nick = temp.getNick();
                email = temp.getEmail();
                unique = temp.getUnique();
                pass = temp.getPassword();
            }
        %>
        <jsp:setProperty name="user" property="nick" value="<%=nick%>"/>
        <jsp:setProperty name="user" property="email" value="<%=email%>"/>
        <jsp:setProperty name="user" property="unique" value="<%=unique%>"/>
        <jsp:setProperty name="user" property="password" value="<%=pass%>"/>


        <%
            // nos manda al home con el usuario ya logueado
            response.sendRedirect("Home.jsp");
        %>



    </body>
</html>
