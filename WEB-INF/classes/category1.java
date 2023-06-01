
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class category1 extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();

	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body><font color=blue><b><h4><i>Category List</i></h4></b></font></body></html>");
out.println("<html><body><table><tr><td></td></tr>");

Shoppingbean b=new Shoppingbean();



try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from category3");
while(rs.next()){
		String id=new Integer(rs.getInt("id")).toString();
		int pd=new Integer(id).intValue();
		
		String id_2=new Integer(rs.getInt("id2")).toString();
		int id2=new Integer(id_2).intValue();

	String id_3=new Integer(rs.getInt("id3")).toString();
		int id3=new Integer(id_3).intValue();

	

	
	if(id2==100){		
	if(id2==100&&pd==0 || pd==100 || id2==101&&pd==0 || pd==101 ||id2==102&&pd==0 || pd==102 ||id2==103&&pd==0 || pd==103 || ){
		out.println("<tr><td><a target=/shopping/servlet/window href=/shopping/servlet/itemlist?id="+pd+"><img src=/shopping/shop/IMAGE/"+pd+"/"+id2+"/"+id3+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}

}
	



	
	
}
}
catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
out.println("SQLException cought"+aa.getMessage());
		}
finally{try{if(con !=null)con.close();}
	   catch(SQLException ignored)
	{}
	}









}
} 