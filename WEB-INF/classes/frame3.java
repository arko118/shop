import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class frame3 extends HttpServlet{


public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String id=req.getParameter("id");


out.println("<frameset cols=0%,*,0%, border=0,scrolling=no>");

out.println("<frame src=/shopping/servlet/category1 name=/shopping/servlet/category1 scrolling=no>");
out.println("<frame src=/shopping/servlet/navigation?id="+id+" name=/shopping/servlet/navigation scrolling=no>");
out.println("<frame src=/shopping/servlet/window name=/shopping/servlet/window scrolling=no>");

out.println("</frameset>");



		


	
}
}
			

