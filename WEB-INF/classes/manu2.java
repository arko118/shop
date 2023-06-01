
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class manu2 extends HttpServlet{

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

//out.println("<td></td><td></td> <td><a href=/shopping/shop/jpfile/cccat3id.jsp target=/shopping/servlet/navigation><img class=manu src=/shopping/shop/doc/basket.JPG width=50 height=40><br>Check</a></td><td></td><td></td>");




try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();


ResultSet rs=stmt.executeQuery("select * from category1");
while(rs.next()){
	
	String i1=new Integer(rs.getInt("id")).toString();
	int i=new Integer(i1).intValue();
	String name=rs.getString("name");
		
	
	if(i==29){	
	out.println("<td><a  href=/shopping/servlet/manu1><img src=/shopping/shop/doc/arrow.gif width=45 height=10></a></td>");		
	}
if(i==30){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==31){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==32){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==33){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==34){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==35){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==36){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==37){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}

if(i==38){	
	out.println("<td><a class=style1 target=/shopping/servlet/frame3?id=1 href=/shopping/servlet/frame6?id="+i+"><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=100 height=100><br>"+name+"</a></td>");		
	}



	if(i==39){	
	out.println("<td><a href=/shopping/servlet/manu3><img src=/shopping/shop/doc/arrowright.gif width=45 height=10></a></td>");		
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