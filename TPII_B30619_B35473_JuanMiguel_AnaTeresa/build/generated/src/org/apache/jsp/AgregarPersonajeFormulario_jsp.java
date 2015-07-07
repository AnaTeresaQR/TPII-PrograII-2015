package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import xmlLogic.Lista_Personajes;
import xmlLogic.ManejadorXMLPersonajes;

public final class AgregarPersonajeFormulario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/html/header.html");
    _jspx_dependants.add("/html/menu.html");
    _jspx_dependants.add("/html/footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel='stylesheet' type=\"text/css\" href='css/estiloGeneral.css'>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/validaciones.js\"></script> \n");
      out.write("        <title>Crea tu personaje</title>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<header>\r\n");
      out.write("    <h4>Comics ATJM</h4>\r\n");
      out.write("    <img src=\"img/logo.png\" alt=\"logo\">\r\n");
      out.write("    \r\n");
      out.write("</header>\r\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<nav id=\"menu\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"index.jsp\">Pagina principal</a></li>\r\n");
      out.write("        <li><a href=\"ListaPersonajes.jsp\">Lista personajes</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\n");
      out.write("        <img id=\"imagen\" src=\"img/fondo.jpg\"  alt=\"background\" /> \n");
      out.write("\n");
      out.write("        ");

            // Obtengo la info del personaje
            String ruta = getServletContext().getRealPath("/xmlFiles/personajes.xml");
            ManejadorXMLPersonajes manejador = new ManejadorXMLPersonajes(ruta);
            Lista_Personajes listaP = manejador.listaPersonajes();
        
      out.write("\n");
      out.write("\n");
      out.write("        <section id=\"section-crearPersonaje\">\n");
      out.write("            <form id=\"form\"  onsubmit=\"return noVacios(this)\" method=\"get\" action=\"Registro.jsp\">\n");
      out.write("                <p>Complete los siguientes espacios</p>\n");
      out.write("\n");
      out.write("                <label>Nombre </label><br>\n");
      out.write("                <input type=\"text\" name=\"nombre\">\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <label>Descripcion </label><br>\n");
      out.write("                <input type=\"text\" name=\"descripcion\">\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <label>Personalidad </label><br>\n");
      out.write("                <input type=\"text\" name=\"personalidad\">\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <label>Encuentra tu foto</label><br>\n");
      out.write("                <input type=\"file\" name=\"img\" accept=\"image/*\">\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <input type='submit' value='Agregar personaje'>\n");
      out.write("                <input type='reset' value=\"Limpiar\">\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<footer>\r\n");
      out.write("    <p>TPII-Comics ATJM</p>\r\n");
      out.write("</footer>\r\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
