package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registro Comics</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel='stylesheet' type=\"text/css\" href='estiloRegistro.css'>\n");
      out.write("        <script>\n");
      out.write("            function formulario(formulario) {\n");
      out.write("                if (formulario.nombre.value == \"\") {\n");
      out.write("                    alert('El nombre esta vacío');\n");
      out.write("                    formulario.nombre.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (formulario.email.value == \"\") {\n");
      out.write("                    alert('El email no puede estar vacío');\n");
      out.write("                    formulario.email.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"registro\">\n");
      out.write("\n");
      out.write("            <p>Para registrarse es necesario llenar el siguiente formulario</p>\n");
      out.write("            <form id=\"form-registro\" method=\"get\" action=\"Registro.jsp\">\n");
      out.write("                <p>Complete los siguientes espacios</p>\n");
      out.write("                <form name=\"formulario\" onsubmit=\"return formulario(this)\"> \n");
      out.write("                    <label>Nick: </label><br>\n");
      out.write("                    <input type=\"text\" name=\"nick\">\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Nombre: </label><br>\n");
      out.write("                    <input type=\"text\" name=\"nombre\">\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Email: </label><br>\n");
      out.write("                    <input type=\"text\" name=\"email\">\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Password: </label><br>\n");
      out.write("                    <input type=\"password\" name=\"password\">\n");
      out.write("                    <br><br>\n");
      out.write("                    <input type='submit' value='Registrar'>\n");
      out.write("                    <input type='reset' value=\"Limpiar registro\">\n");
      out.write("                </form>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
