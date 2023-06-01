import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class helloservlet extends HttpServlet{


Shoppingbean b=new Shoppingbean();


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();
//out.println("<html><body><font color=blue><b><h4><i>Item List</i></h4></b></font></body></html>");
out.println("<html><body><table><tr><td></td></tr>");

out.println("Hello Servlet X");

out.println("</table><body><html>");





}
} 
