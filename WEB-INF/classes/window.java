
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class window extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();
//out.println("<html><body><font color=blue><b><h4><i>Item List</i></h4></b></font></body></html>");
out.println("<html><body><table><tr><td></td></tr>");

Shoppingbean b=new Shoppingbean();


//String d=req.getParameter("id");
//int i=new Integer(d).intValue();


try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();


ResultSet rs=stmt.executeQuery("select * from category2 where id=1 ");
while(rs.next()){
	String d2=new Integer(rs.getInt("id2")).toString();
	int id2=new Integer(d2).intValue();
	String id1=new Integer(rs.getInt("id")).toString();
	int id=new Integer(id1).intValue();
	String name=rs.getString("name");
		
	
	
	if(id==1){
	if(id2==100 || id2==101 || id2==102 || id2==103 || id2==104 || id2==105 || id2==106 || id2==107 || id2==108 || id2==109){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	if(id==2){
	if(id2==200 || id2==201 || id2==202 || id2==203 || id2==204 || id2==205 || id2==206 || id2==207 || id2==208 || id2==209){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	
	if(id==3){
	if(id2==300 || id2==301 || id2==302 || id2==303 || id2==304 || id2==305 || id2==306 || id2==307 || id2==308 || id2==309){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	if(id==4){
	if(id2==400 || id2==401 || id2==402 || id2==403 || id2==404 || id2==405 || id2==406 || id2==407 || id2==408 || id2==409){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/ladiesImage/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	if(id==5){
	if(id2==500 || id2==501 || id2==502 || id2==503 || id2==504 || id2==505 || id2==506 || id2==507 || id2==508 || id2==509){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/ladiesImage/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	if(id==6){
	if(id2==600 || id2==601 || id2==602 || id2==603 || id2==604 || id2==605 || id2==606 || id2==607 || id2==608 || id2==609){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/ladiesImage/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	if(id==7){
	if(id2==700 || id2==701 || id2==702 || id2==703 || id2==704 || id2==705 || id2==706 || id2==707 || id2==708 || id2==709){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/ladiesImage/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	if(id==8){
	if(id2==800 || id2==801 || id2==802 || id2==803 || id2==804 || id2==805 || id2==806 || id2==807 || id2==808 || id2==809){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/ladiesImage/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	if(id==9){
	if(id2==900 || id2==901 || id2==902 || id2==903 || id2==904 || id2==905 || id2==906 || id2==907 || id2==908 || id2==909){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category2?id=" +id2+ "><img src=/shopping/shop/IMAGE/ladiesImage/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
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



out.println("</table><body><html>");





}
} 