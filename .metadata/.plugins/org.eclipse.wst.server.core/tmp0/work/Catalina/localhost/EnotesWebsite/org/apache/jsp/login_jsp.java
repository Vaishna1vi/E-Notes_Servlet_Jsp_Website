/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-12-31 18:43:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/allComponents/navbar.jsp", Long.valueOf(1703247783757L));
    _jspx_dependants.put("/allComponents/cdnFile.jsp", Long.valueOf(1703161738956L));
    _jspx_dependants.put("/allComponents/footer.jsp", Long.valueOf(1703171364300L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".main .row .reg .card .cd {\r\n");
      out.write("	background-color: #f25c54;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row {\r\n");
      out.write("	background-image: linear-gradient(to left bottom, #94d2bd, #98c89e, #a6bb7e, #b9ab64,\r\n");
      out.write("		#cc9857, #cc9857, #cc9857, #cc9857, #b9ab64, #a6bb7e, #98c89e, #94d2bd\r\n");
      out.write("		);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Login Page</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/348dc633e3.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("<nav class=\"navbar navbar-expand-lg border-bottom border-2 border-dark bg-custom navbar-custom\">\r\n");
      out.write("	<div class=\"container-fluid \">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\"><i\r\n");
      out.write("			class=\"fa-solid fa-book-open-reader\"></i>E-Notes</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0 mx-5\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\"><i\r\n");
      out.write("						class=\"fa-solid fa-house-user\"></i>Home</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><i\r\n");
      out.write("						class=\"fa-solid fa-file-circle-plus\"></i>Add Notes</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><i\r\n");
      out.write("						class=\"fa-solid fa-eye\"></i>View Notes</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("			<a href=\"login.jsp\" class=\"btn mx-3\" type=\"submit\"><i\r\n");
      out.write("				class=\"fa-solid fa-user-check\"></i>Login</a>\r\n");
      out.write("				 <a href=\"register.jsp\" class=\"btn mx-3\" type=\"submit\"><i class=\"fa-solid fa-user-plus\"></i>Register</a>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid main\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-4 offset-md-4 reg\">\r\n");
      out.write("				<div class=\"card my-5 border-black\">\r\n");
      out.write("					<div class=\"card-header text-center border-black cd\">\r\n");
      out.write("						<i class=\"fa-solid fa-house-user fa-3x\"></i>\r\n");
      out.write("						<h4>Login</h4>\r\n");
      out.write("					</div>\r\n");
      out.write("					");

					String logMsg = (String) session.getAttribute("failed");
					if (logMsg != null) {
					
      out.write("\r\n");
      out.write("					<div class=\"alert alert-danger\" role=\"alert\">");
      out.print(logMsg);
      out.write("\r\n");
      out.write("						Register first <a href=\"register.jsp\"> Click-here</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					");

					session.removeAttribute("failed");
					}
					
      out.write("\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<form class=\"item-center\" action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\" class=\"form-label\">Email\r\n");
      out.write("									Address</label> <input type=\"email\" placeholder=\"Enter Email-Id\"\r\n");
      out.write("									class=\"form-control border-secondary\" id=\"exampleInputEmail1\"\r\n");
      out.write("									aria-describedby=\"emailHelp\" name=\"logname\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("								<input type=\"password\" class=\"form-control border-secondary\"\r\n");
      out.write("									placeholder=\"Enter Password\" id=\"exampleInputPassword1\"\r\n");
      out.write("									name=\"logpwd\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-success px-5 rounded-pill\">Login</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<div class=\"container-fluid py-3 text-center text-white bg-dark footer\">\r\n");
      out.write("	<p>\r\n");
      out.write("		Note: Please contact at <a\r\n");
      out.write("			href=\"mailto:vaishnavinagvanshi68675@gmail.com\">gmail.com</a>, if any\r\n");
      out.write("		errors occur. Designed <i class=\"fa-solid fa-wand-magic-sparkles\"></i>\r\n");
      out.write("		and developed by <span id=\"owner\">Vaishnavi Nagvanshi</span>\r\n");
      out.write("	</p>\r\n");
      out.write("\r\n");
      out.write("	<p>All right reserved @CodeWithVaishnavi-2023-24</p>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
