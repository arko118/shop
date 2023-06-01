import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class frame6 extends HttpServlet{


public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();


String id=req.getParameter("id");



out.println("<frameset cols=15%,*, border=0,menubar=no,scrolling=No>");

out.println("<frame src=/shopping/servlet/itemlist?id="+id+" name=/shopping/servlet/itemlist scrolling=No>");
out.println("<frame src=/shopping/servlet/navigation?id="+id+" name=/shopping/servlet/navigation scrolling=No>");


out.println("</frameset>");


		}


		}


			

