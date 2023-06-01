import java.sql.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet{

public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	                }
//........................................
private void EmptyCusId(HttpServletRequest req){
HttpSession session=req.getSession(true);
if(session !=null){
Vector basket=(Vector)session.getValue("cusid");
if(basket !=null){
//*******************************************************

//*******************************************************

basket.removeAllElements();
	}
}


}
//..............................


//........................................
private void EmptyCustomer(HttpServletRequest req){
HttpSession session=req.getSession(true);
if(session !=null){
Vector basket=(Vector)session.getValue("customer");
if(basket !=null){

basket.removeAllElements();
	}
}


}
//..............................



public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();



EmptyCusId(req);
EmptyCustomer(req);



out.println("<html>");
out.println("<body>");


out.println("<table width=100%  height=100%>");
out.println("<tr >");

out.println("<td><iframe src=/shopping/servlet/front_product width=100%  height=100% scrolling=yes frameborder=0 ></iframe></td>");


out.println("</tr>");
out.println("</table>");


out.println("</div>");
out.println("</body>");

out.println("</html>");





}






public String getServletInfo(){
return "remove Information";                     

	}
}
