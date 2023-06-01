import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class front_product extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("image/jpeg");

res.setContentType("text/html");
PrintWriter out=res.getWriter();

res.setHeader("Refresh","20");

out.println(" <style type=text/css>");

out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow; font-size: 12px;color: rgb(0,0,0);  } ");

out.println(".border{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow; font-size: 12px;color: rgb(0,0,0);  border: blue solid 1px; } ");
out.println(".b-right{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow; font-size: 12px;color: rgb(0,0,0); border-right: lightblue solid 1px; } ");

out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; font-size: 20px;color: rgb(0,0,0); border: blue solid 2px; } ");

out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");

out.println(".manu{background-image: url(''); border: 2px ridge light;font-size: 12px;padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; bold:bold; font-size: 12px;color:red; border: red solid 5px;} ");

out.println(".with{background-image: url(''); border: 2px ridge light;font-size: 12px;padding:0px; padding-top: 0px; padding-bottom: 0px; width:500px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; bold:bold; font-size: 12px;color:red; border: red solid 1px;} ");

out.println(" ");
out.println(" ");
out.println("</style> ");

out.println("<html><body><center><table border=1><tr><td> ");

out.println("");


try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from category1");
while(rs.next()){
	
	String i1=new Integer(rs.getInt("id")).toString();
	int i=new Integer(i1).intValue();
	String name=rs.getString("name");

		if( i != 0){

if(i>=1 && i<=19){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu_image/"+i+".jpg width=200 height=200 ></a> ");
		}

 if(i>=20 && i<=29){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu1_image/"+i+".jpg width=200 height=200></a>");
		}


if(i>=30 && i<=38){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu2_image/"+i+".jpg width=200 height=200></a>");
		}


if(i>=39 && i<=47){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu3_image/"+i+".jpg width=200 height=200></a>");
		}

if(i>=48 && i<=57){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu4_image/"+i+".jpg width=200 height=200></a>");
		}


if(i>=58 && i<=67){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu5_image/"+i+".jpg width=200 height=200></a>");
		}
if(i>=68 && i<=76){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu6_image/"+i+".jpg width=200 height=200></a>");
		}
if(i>=77 && i<=85){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu7_image/"+i+".jpg width=200 height=200></a>");
		}

if(i>=86 && i<=94){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu8_image/"+i+".jpg width=200 height=200></a>");
		}
if(i>=95 && i<=99){
out.println("<a  class=style1 href=/shopping/shop/frontpage/logopen.jsp><img src=/shopping/shop/manuimage/manu9_image/"+i+".jpg width=200 height=200></a>");
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
out.println("</td></tr></table>");
out.println("<table class=border><tr><td>");
out.println("<iframe id=iframe2 src=iframe.html frameborder=0 style=text-align:center; margin:0; width:100%; height:150px; border:none; overflow:hidden; scrolling=no ></iframe>");

out.println("</td></tr></table></body></html>");






}
} 