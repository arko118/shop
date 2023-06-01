
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class manu5 extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();

//res.setHeader("Refresh","20");

out.println(" <style type=text/css>");

out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow; font-size: 17px;color: rgb(0,0,0); border: #feaaee solid 0px; } ");

out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; font-size: 20px;color: rgb(0,0,0); border: blue solid 2px; } ");
out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");



out.println("<html><body><center><table> <tr><td><table class=bimage1  class=style1><tr>");



try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();


ResultSet rs=stmt.executeQuery("select * from category1");
while(rs.next()){
	
	String i1=new Integer(rs.getInt("id")).toString();
	int i=new Integer(i1).intValue();
	String name=rs.getString("name");
		
	
	if(i==58){	
	out.println("<td><a  href=/shopping/servlet/manu4><img src=/shopping/shop/doc/arrow.gif width=45 height=10></a></td>");		
	}
	

if(i==59){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}


if(i==60){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==61){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==62){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==63){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==64){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}


if(i==65){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}
if(i==66){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}



	if(i==67){	
	out.println("<td><a href=/shopping/servlet/manu6><img src=/shopping/shop/doc/arrowright.gif width=45 height=10></a></td>");		
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

out.println("</tr> </table></td></tr></table></center></body> ");

out.println("<center><iframe src=/shopping/servlet/totalprice  width=400 height=50 frameborder=0 scrolling=no bgcolor=red class=style1></iframe></center></html>");





}
} 