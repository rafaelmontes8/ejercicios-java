package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ex20rme1A_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Numeros Primos</th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");
 boolean primo=true;
                    int n1 = Integer.parseInt(request.getParameter("numero"));
                
                    for (int i = 1; i <= n1; i++) {
                    
                    for (int j = 0; j <= 5; j++) {
                        for (int h=2;h<n1;h++) {
                            if (n1 % h==0) {
                                primo=false;
                            }  
                        }
                        if (primo==true) {
                            
      out.write("<td style=\"color:yellow\">");
out.print(i);
      out.write("</td>");

                        } else {
                            
      out.write("<td style=\"color: grey\">");
out.print(i);
      out.write("</td>");

                        }
                    }
                
      out.write("</tr>");

                }
                        
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <footer>\n");
      out.write("            <p>Página creada por: Rafael Montes Expósito - IES.Campanillas</p>\n");
      out.write("        </footer>\n");
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
