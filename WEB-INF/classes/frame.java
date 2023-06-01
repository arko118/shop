import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class frame extends HttpServlet{


public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

out.println("<frameset rows=100%, border=0,menubar=no,scrolling=No>");

out.println("<frame src=/shopping/servlet/updatewindow name=/shopping/servlet/updatewindow border=0,menubar=no,scrolling=no>");

out.println("</frameset>");






		}


		}


			

