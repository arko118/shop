
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class drop extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();
//res.setHeader("Refresh","5");



try{


HttpSession seion=req.getSession(true);
if(seion !=null){
Vector Dbasket=(Vector)seion.getValue("cusid");
if(Dbasket !=null){
int its=Dbasket.size();
for(int ii=0; ii<its;ii++)
{
Shoppingbean m=(Shoppingbean)Dbasket.elementAt(ii);
String table=m.getUserName();


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();

stmt.executeUpdate(" drop table "+table+" ");

}



}
}
}




catch(ClassNotFoundException e){
out.println("could not load Database Driver" +e.getMessage());
		}
catch(SQLException e){
out.println("tplease try again");
		}
finally{
	try{
		if(con !=null)
		con.close();
	   }
catch(SQLException ignored)
	{}


	}




res.sendRedirect("/shopping/servlet/login");
	

}
}
