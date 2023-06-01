import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class manu extends HttpServlet{


public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html>");


out.println("<frameset cols=65,*, border=0,scrolling=No>");

out.println("<frame src=/shopping/servlet/checkout name=/shopping/servlet/checkout scrolling=No>");
out.println("<frame src=/shopping/servlet/extent_manu name=/shopping/servlet/extent_manu scrolling=No>");


out.println("</frameset>");

out.println(" </html>");
		}


		}


			

