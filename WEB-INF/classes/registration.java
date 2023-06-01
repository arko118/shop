
import java.util.*;
import java.util.Date;
import java.io.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class registration  extends HttpServlet{

public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	        

    }
//..............................................




//................................................
private void addToBasket(Shoppingbean bean, HttpServletRequest req){
HttpSession session=req.getSession(true);
if(session !=null){
Vector cusid=(Vector)session.getValue("cusid");
if(cusid ==null){
cusid=new Vector();
session.putValue("cusid",cusid);
}
cusid.addElement(bean);
	}
}


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();


String name=req.getParameter("username");


if(name.equals("") || name.equals("0")){


out.println("<html><body><center><a href=/shopping/servlet/login><br><br><br><br><br><h4><fontcolor=red>please try again and login only mobile number</font></h4></a></center></body></html>");


}


else{

	Date date=new Date();
	DateFormat df=DateFormat.getInstance();
	String tt=df.format(date);

DateFormat d=new SimpleDateFormat("s");
String p=d.format(new Date());
int s=new Integer(p).intValue();
Shoppingbean movie=new Shoppingbean();


movie.setUserName(name);
movie.setTime(s);
movie.setDat(tt);
addToBasket(movie,req);

res.sendRedirect("/shopping/servlet/conformregistration?username="+name+" ");
}



}

}


