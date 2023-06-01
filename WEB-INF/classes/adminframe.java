import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class adminframe extends HttpServlet{


public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String d=req.getParameter("id");
int i=new Integer(d).intValue();



out.println("<frameset cols=30%,15%,*, border=0,menubar=no,scrolling=No>");
out.println("<frame src=/shopping/servlet/category30_39?id="+i+" name=/shopping/servlet/category30_39?id="+i+" border=0,menubar=no,scrolling=No>");
out.println("<frame src=/shopping/servlet/window   name=/shopping/servlet/window   border=0,menubar=no,scrolling=No>");
out.println("<frame src=/shopping/servlet/id3window   name=/shopping/servlet/id3window   border=0,menubar=no,scrolling=No>");
out.println("</frameset>");





		}


		}


			

