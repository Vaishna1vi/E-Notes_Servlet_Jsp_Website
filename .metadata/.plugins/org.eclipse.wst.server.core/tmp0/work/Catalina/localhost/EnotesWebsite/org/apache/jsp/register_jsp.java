/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2024-04-14 22:36:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.http.HttpRequest;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/allComponents/navbar.jsp", Long.valueOf(1712653135970L));
    _jspx_dependants.put("/allComponents/cdnFile.jsp", Long.valueOf(1703161738956L));
    _jspx_dependants.put("/allComponents/footer.jsp", Long.valueOf(1712742121254L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.http.HttpRequest");
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
      out.write("<title>Registration Page</title>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav\r\n");
      out.write("	class=\"navbar navbar-expand-lg border-bottom border-2 border-dark bg-custom navbar-custom\">\r\n");
      out.write("	<div class=\"container-fluid \">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\" type=\"button\" data-bs-toggle=\"modal\"\r\n");
      out.write("			data-bs-target=\"#staticBackdropLogo\"> <img id=\"logo\"\r\n");
      out.write("			style=\" gap: 10px; border-radius: 100px;\" alt=\"\"\r\n");
      out.write("			src=\"https://th.bing.com/th/id/OIG4.H4.vGzSTck6UQ6qG8KtQ?w=50&h=50&rs=1&pid=ImgDetMain\">\r\n");
      out.write("			Study-Scribe\r\n");
      out.write("		</a>\r\n");
      out.write("		<!-- Modal -->\r\n");
      out.write("		<div class=\"modal fade\" id=\"staticBackdropLogo\" data-bs-backdrop=\"static\"\r\n");
      out.write("			data-bs-keyboard=\"false\" tabindex=\"-1\"\r\n");
      out.write("			aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("			<div class=\"modal-dialog\">\r\n");
      out.write("				<div class=\"modal-content bg-transparent border-0\">\r\n");
      out.write("					<div class=\"modal-header text-white border-0\">\r\n");
      out.write("						<button type=\"button\" class=\"btn-close bg-white\"\r\n");
      out.write("							data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"modal-body bg-transparent text-white\">\r\n");
      out.write("						<img id=\"logo\" style=\"border-radius: 300px;\" alt=\"\"\r\n");
      out.write("							src=\"https://th.bing.com/th/id/OIG4.H4.vGzSTck6UQ6qG8KtQ?w=450&h=450&rs=1&pid=ImgDetMain\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0 mx-5\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\"><i\r\n");
      out.write("						class=\"fa-solid fa-house-user\"></i>Home</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\" type=\"button\"\r\n");
      out.write("					data-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\"><i\r\n");
      out.write("						class=\"fa-solid fa-file-circle-plus\"></i>Add Notes</a> <!-- Modal -->\r\n");
      out.write("					<div class=\"modal fade\" id=\"staticBackdrop\"\r\n");
      out.write("						data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\"\r\n");
      out.write("						aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("						<div class=\"modal-dialog\">\r\n");
      out.write("							<div class=\"modal-content\">\r\n");
      out.write("								<div class=\"modal-header\">\r\n");
      out.write("									<h1 class=\"modal-title fs-5\" id=\"staticBackdropLabel\">Alert</h1>\r\n");
      out.write("									<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\r\n");
      out.write("										aria-label=\"Close\"></button>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"modal-body\">Please register or login first\r\n");
      out.write("									before adding notes...</div>\r\n");
      out.write("								<div class=\"modal-footer\">\r\n");
      out.write("									<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("										data-bs-dismiss=\"modal\">Understood</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\" type=\"button\"\r\n");
      out.write("					data-bs-toggle=\"modal\" data-bs-target=\"#Backdrop\"><i\r\n");
      out.write("						class=\"fa-solid fa-eye\"></i>View Notes</a> <!-- Modal -->\r\n");
      out.write("					<div class=\"modal fade\" id=\"Backdrop\" data-bs-backdrop=\"static\"\r\n");
      out.write("						data-bs-keyboard=\"false\" tabindex=\"-1\"\r\n");
      out.write("						aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("						<div class=\"modal-dialog\">\r\n");
      out.write("							<div class=\"modal-content\">\r\n");
      out.write("								<div class=\"modal-header\">\r\n");
      out.write("									<h1 class=\"modal-title fs-5\" id=\"staticBackdropLabel\">Alert</h1>\r\n");
      out.write("									<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\r\n");
      out.write("										aria-label=\"Close\"></button>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"modal-body\">Please login first to view your\r\n");
      out.write("									notes...</div>\r\n");
      out.write("								<div class=\"modal-footer\">\r\n");
      out.write("									<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("										data-bs-dismiss=\"modal\">Understood</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("			<a href=\"login.jsp\" class=\"btn mx-3\" type=\"submit\"><i\r\n");
      out.write("				class=\"fa-solid fa-user-check\"></i>Login</a> <a href=\"register.jsp\"\r\n");
      out.write("				class=\"btn mx-3\" type=\"submit\"><i class=\"fa-solid fa-user-plus\"></i>Register</a>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid main\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-4 offset-md-4 reg\">\r\n");
      out.write("				<div class=\"card my-5 border-black text-center\">\r\n");
      out.write("					<div class=\"card-header border-black cd\">\r\n");
      out.write("						<i class=\"fa-solid fa-user-pen fa-3x\"></i>\r\n");
      out.write("						<h4>User Registration</h4>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					");

					String regMsg = (String) session.getAttribute("reg-success");
					if (regMsg != null) {
					
      out.write("\r\n");
      out.write("					<div class=\"alert alert-success\" role=\"alert\">");
      out.print(regMsg);
      out.write("\r\n");
      out.write("						Login <a href=\"login.jsp\"> Click-here</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					");

					session.removeAttribute("reg-success");
					}

					String failedMsg = (String) session.getAttribute("failed");
					if (failedMsg != null) {
					
      out.write("\r\n");
      out.write("					<div class=\"alert alert-danger\" role=\"alert\">");
      out.print(failedMsg);
      out.write("</div>\r\n");
      out.write("					");

					session.removeAttribute("failed");
					}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<form class=\"item-center\" action=\"UserServlet\" method=\"post\">\r\n");
      out.write("							<div class=\"mb-3 text-start\">\r\n");
      out.write("								<label for=\"exampleInputText1\" class=\"form-label\">User-Name</label>\r\n");
      out.write("								<input type=\"text\" class=\"form-control border-secondary\"\r\n");
      out.write("									placeholder=\"Enter User-Name\" onkeydown=\"return /[a-z]/i.test(event.key)\"\r\n");
      out.write("									id=\"exampleInputText1\" aria-describedby=\"emailHelp\"\r\n");
      out.write("									name=\"uname\" required=\"required\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3 text-start\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\" class=\"form-label\">Email\r\n");
      out.write("									Address</label> <input type=\"email\" placeholder=\"Enter Email-Id\"\r\n");
      out.write("									class=\"form-control border-secondary\" id=\"exampleInputEmail1\"\r\n");
      out.write("									aria-describedby=\"emailHelp\" name=\"uemail\" required=\"required\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3 text-start\">\r\n");
      out.write("								<label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("								<input type=\"password\" class=\"form-control border-secondary\"\r\n");
      out.write("									placeholder=\"Enter Password\" id=\"exampleInputPassword1\"\r\n");
      out.write("									name=\"upwd\" required=\"required\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<button type=\"submit\"\r\n");
      out.write("								class=\"btn btn-success px-5 mx-auto col-6 rounded-pill\">Register</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<footer class=\"bg-dark\">\r\n");
      out.write("	<div class=\"container-fluid py-3 text-center text-white footer\">\r\n");
      out.write("		<p>\r\n");
      out.write("			Note: Please contact at <a\r\n");
      out.write("				href=\"mailto:vaishnavinagvanshi68675@gmail.com\">gmail.com</a>, if\r\n");
      out.write("			any errors occur. Designed <i class=\"fa-solid fa-wand-magic-sparkles\"></i>\r\n");
      out.write("			and developed by <span id=\"owner\">Vaishnavi Nagvanshi</span>\r\n");
      out.write("		</p>\r\n");
      out.write("\r\n");
      out.write("		<p>All right reserved @CodeWithVaishnavi-2023-24</p>\r\n");
      out.write("	</div>\r\n");
      out.write("</footer>");
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
