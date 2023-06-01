  
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class category30_39 extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();

	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();
res.setHeader("Refresh","5");
out.println("<html><body><font color=blue><b><h4><i></i></h4></b></font></body></html>");

out.println("<html><body><table border=0><tr><td></td><td><font color=red><b><h5><i>Table:Category1</i></h5></b></font></td></tr>");

out.println("<tr><td><font color=blue><b>i</b></font><font color=white>......</font></td><td><font color=blue><b>id</b></font></td><td><font color=blue><b>Id_update</b></font></td><td><font color=blue><b>NAME</b></font></td> <td><font color=blue><b>Image</b></font></td></tr>");


Shoppingbean b=new Shoppingbean();


String d1=req.getParameter("id");
int i=new Integer(d1).intValue();

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from category1");
while(rs.next()){
		
		String xi=new Integer(rs.getInt("i")).toString();
		int i1=new Integer(xi).intValue();

		String ii=new Integer(rs.getInt("id")).toString();
		int pd=new Integer(ii).intValue();

		String id=new Integer(rs.getInt("id")).toString();
		int d=new Integer(id).intValue();

		String name=rs.getString("name").toString();
		
if(i1==1){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td> <td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td> <td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/1.jpg width=50 height=50></a></td></tr>");
}
if(i1==11){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==12){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==13){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==14){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==15){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==16){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==17){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+pd+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==18){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==19){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}

//******************************************************************** Manu Image




if(i1==20){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==21){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==22){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==23){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==24){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==25){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==26){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==27){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==28){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==29){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu1_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}

//********************************************************************Manu_1






if(i1==30){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}

if(i1==31){

out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==32){

out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}

if(i1==33){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}

if(i1==34){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==35){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==36){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==37){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==38){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu2_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
//********************************************************************Manu_2



if(i1==39){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==40){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==41){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==42){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==43){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==44){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==45){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==46){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==47){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu3_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}

//********************************************************************Manu_3


if(i1==48){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==49){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==50){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==51){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==52){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==53){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==54){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==55){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==56){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}  
if(i1==57){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu4_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
//********************************************************************Manu_4



if(i1==58){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==59){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==60){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==61){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==62){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==63){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==64){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==65){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==66){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==67){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu5_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
//********************************************************************Manu_5



if(i1==68){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}  
if(i1==69){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==70){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==71){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==72){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==73){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==74){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==75){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==76){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu6_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
//********************************************************************Manu_6



if(i1==77){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==78){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}  
if(i1==79){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==80){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==81){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==82){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==83){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==84){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==85){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu7_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
//********************************************************************Manu_7



if(i1==86){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==87){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}if(i1==88){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}  
if(i1==89){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==90){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==91){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==92){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==93){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}
if(i1==94){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu8_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}

//********************************************************************Manu_8
if(i1==95){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu9_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}	
if(i1==96){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu9_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}	
if(i1==97){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu9_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}	
if(i1==98){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu9_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}	
if(i1==99){
out.println("<tr bgcolor=lightgray><td><font color=red><b><a href=/shopping/servlet/category30_39_6_id2?id="+i1+" target=/shopping/servlet/window>"+i1+"</a></b></font></td><td><a href=/shopping/servlet/category30_39_6_id2?id="+pd+" target=/shopping/servlet/window>"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1idpdate.jsp?id="+pd+"&name="+i1+">"+d+"</a></td><td><a href=/shopping/shop/jpfile/cat1nameupdate.jsp?id="+i1+"&name="+name+">."+name+"</a></td><td><a href=/shopping/shop/jpfile/uploadladies.jsp?id="+i1+">.<img src=/shopping/shop/manuimage/manu9_image/"+i1+".jpg width=50 height=50></a></td></tr>");
}	

//********************************************************************Manu_9
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