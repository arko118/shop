
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class categoryid6changeprice extends HttpServlet{

Connection con;


	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();


String id2=req.getParameter("id2");

String id3=req.getParameter("id3");



String user=req.getParameter("user");


try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();




stmt.executeUpdate("UPDATE category6 SET price=\'"+user+"\' where id3=\'"+id3+"\' "); 


res.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");





}

catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
out.println("please give some Number");
		}
finally{
	try{if(con !=null)con.close();
	   }
catch(SQLException ignored)
	{}

   }




}
} 