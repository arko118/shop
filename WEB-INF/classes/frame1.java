import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class frame1 extends HttpServlet{


public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html>");


out.println("<frameset rows=30%,*, border=0,scrolling=no>");

out.println("<frame src=/shopping/servlet/manu name=/shopping/servlet/manu scrolling=no>");

out.println("<frame src=/shopping/servlet/frame2 name=/shopping/servlet/frame2 scrolling=no>");



					



out.println("</frameset>");

out.println(" </html>");
		}


		}


			

