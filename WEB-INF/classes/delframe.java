import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class delframe extends HttpServlet{


public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }


public void doPost(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();


String s=req.getParameter("psw");
String pw="admin2014";

if(s.equals(0) || s.equals("") || !s.equals(pw)){

out.println("<br><br><br><br><center> <a href=/shopping/servlet/delframe>Sorry</a></center>");


}

if(s.equals(pw)){

out.println("<frameset rows=100%, border=0,menubar=no,scrolling=No>");

out.println("<frame src=/shopping/servlet/adminframe?id=1 name=/shopping/servlet/adminframe?id=1 border=0,menubar=no,scrolling=No>");

out.println("</frameset>");


}
		}

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();



out.println("<html><body><br><br><br><br><center><table><tr><td align=center><table bgcolor=blue>");
out.println("<form action=/shopping/servlet/delframe method=post>");
out.println("<tr><td><font color=white><b>Password:</b></font><input type=password name=psw size=10 ></td></tr>");
out.println("<tr><td><font color=blue><b></b></font></td></tr>");
out.println("<tr><td><input type=submit value=submit><input type=reset value=reset></td></tr>");
out.println("</form>");
out.println("</table></td> </tr></table></center></body></html>");




}



		}


			

