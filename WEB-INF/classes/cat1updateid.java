
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cat1updateid extends HttpServlet{

Connection con;


	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();


String id=req.getParameter("d");



String i=req.getParameter("name");

String user=req.getParameter("user");


try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();



stmt.executeUpdate("UPDATE category1 SET id=\'"+user+"\' where i=\'"+i+"\' "); 

res.sendRedirect("/shopping/servlet/category30_39?id="+id+" ");





}

catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
out.println("SQLException cought"+aa.getMessage());
		}
finally{
	try{if(con !=null)con.close();
	   }
catch(SQLException ignored)
	{}

   }




}
} 