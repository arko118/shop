import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class id3window extends HttpServlet{


public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();


	out.println("<html><body><center><table ><tr>");

	out.println("<td><table ><tr><td></td></tr>");
	
	



	
	out.println("</table></td>");

	out.println("</tr></table></center></body></html>");

		}


		}


			

