/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-03-28 20:04:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ch.dnisler.hiddendictator.Vote;
import java.util.logging.Logger;
import ch.dnisler.hiddendictator.Util;
import ch.dnisler.hiddendictator.Constants;
import ch.dnisler.hiddendictator.User;
import ch.dnisler.hiddendictator.Server;
import ch.dnisler.hiddendictator.Lobby;

public final class lobby_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("ch.dnisler.hiddendictator.User");
    _jspx_imports_classes.add("ch.dnisler.hiddendictator.Vote");
    _jspx_imports_classes.add("ch.dnisler.hiddendictator.Util");
    _jspx_imports_classes.add("ch.dnisler.hiddendictator.Server");
    _jspx_imports_classes.add("java.util.logging.Logger");
    _jspx_imports_classes.add("ch.dnisler.hiddendictator.Constants");
    _jspx_imports_classes.add("ch.dnisler.hiddendictator.Lobby");
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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\"WebContent/includes/lobby.jsp\"\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>\r\n");
      out.write("\t");

		out.print("Welcome to " + (String) session.getAttribute("lobby") + ", "
				+ session.getAttribute("user").toString());
	
      out.write("\r\n");
      out.write("</h1>\r\n");

	Lobby lobby = Server.getLobbyMap().get((String) session.getAttribute("lobby"));
	if (lobby.isIngame()) {
		User myuser = Server.getUser(session.getAttribute("user").toString());
		out.print("<img src='" + request.getContextPath() + "/img/" + myuser.getFaction()
				+ ".jpg' height='150px'>");
		out.print("<p><b>You are a " + myuser.getFaction() + "</b></p>");
	}

      out.write("\r\n");
      out.write("<div class=\"table-responsive\">\r\n");
      out.write("\t<table class=\"table\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t<th>Ready</th>\r\n");
      out.write("\t\t\t<th>Faction</th>\r\n");
      out.write("\t\t\t<th>Role</th>\r\n");
      out.write("\t\t\t<th>Last Vote</th>\r\n");
      out.write("\t\t\t<th>Action</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			for (User u : lobby.getUserList()) {
				out.print("<tr><td>");
		
      out.write("<form method=\"get\" action=\"includes/action.jsp\">\r\n");
      out.write("\t\t\t");

				if (u.isAdm()) {

						out.print("*ADMIN* ");
					}
					out.print(u.getName() + "</td>");
					out.print("<td>");
					if (u.isReady()) {
						out.print("Ready");
					} else {
						out.print("Not Ready");
					}
					out.print("</td>");
					if (lobby.isIngame()) {
						out.print("<td>");
						out.print(u.getFactionSecure(session.getAttribute("user").toString()));
						out.print("</td>");
						out.print("<td>");
						out.print(u.getRole());
						out.print("</td>");
						out.print("<td>");
						out.print(u.getLastVote());
						out.print("</td>");
						
						//Actions
						User myuser = Server.getUser(session.getAttribute("user").toString());
						if (!lobby.isInvote()) {
							if (myuser.getRole().equals(Constants.ROLE_PRESIDENT) && !myuser.equals(u)
									&& Util.validChancellor(u) && !lobby.isGovactive()) {
								out.print("<td><input type='hidden', name='nomuser', value='" + u.getName() + "'>");
								out.print("<input type='submit' class='form-control' name='nominate' value='Nominate "
										+ u.getName() + "'></td>");
							}
						} else {
							if (u.getRole().equals(Constants.ROLE_CANDIDATE)
									&& !lobby.getCurrVote().hasVoted(myuser.getName())) {
								out.print(
										"<td><input type='submit' class='form-control' name='vote' value='YES'><input type='submit' class='form-control' name='vote' value='NO'></td>");
							}
						}
					}
					out.print("</tr>");
				}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<form method=\"get\" action=\"includes/action.jsp\">\r\n");
      out.write("\t");

		if (lobby.isInvote()) {
			Vote currvote = lobby.getCurrVote();
			int nofvotes = currvote.getYes() + currvote.getNo();
			out.print("<h2>CURRENT NUMBER OF VOTES: " + nofvotes);
			if (nofvotes == lobby.getUserList().size()) {
				out.print("<input type='submit' class='form-control' name='closevote' value='Close Vote'></input>");

			}
		}
	
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<form method=\"get\" action=\"includes/util.jsp\">\r\n");
      out.write("\t<input type=\"submit\" class=\"form-control\" name=\"setready\"\r\n");
      out.write("\t\tvalue=\"READY / NOT READY\"></input>\r\n");
      out.write("</form>\r\n");
      out.write("<form method=\"get\" action=\"includes/util.jsp\">\r\n");
      out.write("\t");

		if (Server.getUser(session.getAttribute("user").toString()).isAdm() && !lobby.isIngame()
				&& lobby.getUserList().size() > 4) {
			out.print("<input type='submit' class='form-control' name='startgame' value='Start Game'></input>");
		} else if (Server.getUser(session.getAttribute("user").toString()).isAdm() && lobby.isIngame()) {
			out.print("<input type='submit' class='form-control' name='nextturn' value='Next Turn'></input>");
		}
	
      out.write("\r\n");
      out.write("</form>");
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
