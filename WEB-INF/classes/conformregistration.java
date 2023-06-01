
import java.util.*;
import java.util.Date;
import java.io.*;
import java.sql.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class conformregistration  extends HttpServlet{
Connection con;
public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	        

    }



public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String pws=null;

String pasward=req.getParameter("username");

pws="id"+pasward;

int items=0;
HttpSession session=req.getSession(true);

Vector price=(Vector)session.getValue("cusid");
if(price !=null){
items=price.size();
for(int x=0; x<items; x++){
Shoppingbean m=(Shoppingbean)price.elementAt(x);
String cus_id=new Integer(m.getTime()).toString();


String name=m.getUserName();
String email=m.getUserEmail();
String dat=m.getDat();

int i=0;

if(name.equals(pws) || name.equals(i)){



try{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");

	Statement st=con.createStatement();
	Statement stt=con.createStatement();
	
	stt.executeUpdate("CREATE TABLE "+name+"(cus_id integer,cus_name varchar(100),id3 integer,id2 integer,id1 integer,name varchar(50),quantity integer,unitprice integer,price integer )");
	
	res.sendRedirect("/shopping/servlet/frame1");
	
		
	
	
}
	catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
//out.println("SQLException cought"+aa.getMessage());
out.println( "<html><body><table><tr><td>");
out.println("<center><br><br><br><br><br><a href=/shopping/servlet/drop><img src=/shopping/image/example.JPG></a></center>");
out.println("</td></tr></table></body></html>" );

		}
finally{
	try{if(con !=null)con.close();
	   }
catch(SQLException ignored)
	{}

   }


}
else{

out.println("<center><br><br><br><br><br><a href=/shopping/servlet/conformregistration>please try again and put mobile number</a></center>");

}


}

}


}


}

