package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/html/header.html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit profile</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloProfile.css\">\n");
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
      out.write("        ");
      beans.User user = null;
      synchronized (session) {
        user = (beans.User) _jspx_page_context.getAttribute("user", PageContext.SESSION_SCOPE);
        if (user == null){
          user = new beans.User();
          _jspx_page_context.setAttribute("user", user, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th> - Unique ID - </th>\n");
      out.write("                <th> - Nick - </th>\n");
      out.write("                <th> - Email - </th>\n");
      out.write("                <th> - Password - </th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((beans.User)_jspx_page_context.findAttribute("user")).getUnique())));
      out.write("</td>\n");
      out.write("                <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((beans.User)_jspx_page_context.findAttribute("user")).getNick())));
      out.write("</td>\n");
      out.write("                <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((beans.User)_jspx_page_context.findAttribute("user")).getEmail())));
      out.write("</td>\n");
      out.write("                <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((beans.User)_jspx_page_context.findAttribute("user")).getPassword())));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <br>\n");
      out.write("        <a href=\"Home.jsp\">Home</a>\n");
      out.write("        ");
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
