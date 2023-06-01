
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class category30_39_table6 extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();

	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body><font color=blue><b><h4><i></i></h4></b></font></body></html>");

out.println("<html><body><table border=0><tr><td></td><td><font color=red><b><h5><i>Table:Category6</i></h5></b></font></td></tr>");
out.println("<tr><td><font color=blue><b>Id3</b></font></td><td><font color=blue><b>Product Name</b></font></td><td><font color=blue><b>Quantity</b></font></td><td><font color=blue><b>Price</b></font></td> <td><font color=blue><b>pro_country </b></font></td><td><font color=blue><b>pro_region</b></font></td> <td><font color=blue><b>product_type</b></font></td>  <td><font color=blue><b>day_before</b></font></td>  </tr>");
Shoppingbean b=new Shoppingbean();
res.setHeader("Refresh","3");

String d=req.getParameter("id");
int i1=new Integer(d).intValue();



try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from category6 where id2="+i1+" ");
while(rs.next()){

		String id=new Integer(rs.getInt("id3")).toString();
		int pd=new Integer(id).intValue();

		String d1=new Integer(rs.getInt("id2")).toString();
		int id2=new Integer(d1).intValue();
		
		String id1=new Integer(rs.getInt("id")).toString();
		int i=new Integer(id1).intValue();

		String m=new Integer(rs.getInt("id")).toString();
		int ms=new Integer(m).intValue();

		String name=rs.getString("name").toString();
		String quantity=new Integer(rs.getInt("quantity")).toString();
		String price=new Integer(rs.getInt("price")).toString();
		
		String procountry=rs.getString("procountry").toString();
		String proregion=rs.getString("proregion").toString();
		String producttype=rs.getString("producttype").toString();
		String daysbefore=rs.getString("daysbefore").toString();

	
	
if(ms==1 || ms==11 || ms==12 || ms==13 || ms==14 || ms==15 || ms==16 || ms==17 || ms==18 || ms==19){
	
 	out.println("<tr bgcolor=lightgray><td><font color=red><b>"+pd+"</b></font></td><td><a href=/shopping/shop/jpfile/FileUploadServlet_from_1_19.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">.<img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+pd+".jpg width=75 height=50></a> <br><a href=/shopping/shop/jpfile/FileUploadServlet_from_1_19_1.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._1</a><a href=/shopping/shop/jpfile/FileUploadServlet_from_1_19_2.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._2</a> <a href=/shopping/shop/jpfile/FileUploadServlet_from_1_19_3.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._3</a><a href=/shopping/shop/jpfile/FileUploadServlet_from_1_19_4.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._4</a><br><a href=/shopping/shop/jpfile/categoryid6.jsp?id2="+id2+"&id3="+pd+"&proname="+name+">."+name+"</a> </td>    <td><a href=/shopping/shop/jpfile/categoryid6quantity.jsp?id3="+pd+"&id2="+id2+"&quantity="+quantity+">."+quantity+"</a></td>     <td><a href=/shopping/shop/jpfile/categoryid6price.jsp?id3="+pd+"&id2="+id2+"&price="+price+">."+price+"</a></td>      <td><a href=/shopping/shop/jpfile/procountry.jsp?id3="+pd+"&id2="+id2+"&procountry="+procountry+">."+procountry+"</a></td>    <td><a href=/shopping/shop/jpfile/proregion.jsp?id3="+pd+"&id2="+id2+"&proregion="+proregion+">."+proregion+"</a></td>   <td><a href=/shopping/shop/jpfile/producttype_cat6.jsp?id3="+pd+"&id2="+id2+"&producttype="+producttype+">."+producttype+"</a></td>   <td><a href=/shopping/shop/jpfile/daysbefore.jsp?id3="+pd+"&id2="+id2+"&daysbefore="+daysbefore+">."+daysbefore+"</a></td>  <td><a href=/shopping/shop/jpfile/insert.jsp?id3="+pd+"&id2="+id2+"&id="+i+">.Insert</a></td> </tr>");
			





	}



	if(ms==20 || ms==21 || ms==22 || ms==23 || ms==24 || ms==25 || ms==26 || ms==27 || ms==28 || ms==29 || ms==30 || ms==31 || ms==32 || ms==33 || ms==34 || ms==35 || ms==36 || ms==37 || ms==38 || ms==39 || ms==40 || ms==41 || ms==42 || ms==43 || ms==44 || ms==45){
	
	out.println("<tr bgcolor=lightgray><td><font color=red><b>"+pd+"</b></font></td><td><a href=/shopping/shop/jpfile/uploadfrom20.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">.<img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+pd+".jpg width=75 height=50></a><br><a href=/shopping/shop/jpfile/upload_1_from20.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._1</a><a href=/shopping/shop/jpfile/upload_2_from20.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._2</a> <a href=/shopping/shop/jpfile/upload_3_from20.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._3</a><a href=/shopping/shop/jpfile/upload_4_from20.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._4</a><br><a href=/shopping/shop/jpfile/categoryid6.jsp?id2="+id2+"&id3="+pd+"&proname="+name+">."+name+"</a> </td>    <td><a href=/shopping/shop/jpfile/categoryid6quantity.jsp?id3="+pd+"&id2="+id2+"&quantity="+quantity+">."+quantity+"</a></td>     <td><a href=/shopping/shop/jpfile/categoryid6price.jsp?id3="+pd+"&id2="+id2+"&price="+price+">."+price+"</a></td>      <td><a href=/shopping/shop/jpfile/procountry.jsp?id3="+pd+"&id2="+id2+"&procountry="+procountry+">."+procountry+"</a></td>    <td><a href=/shopping/shop/jpfile/proregion.jsp?id3="+pd+"&id2="+id2+"&proregion="+proregion+">."+proregion+"</a></td>   <td><a href=/shopping/shop/jpfile/producttype_cat6.jsp?id3="+pd+"&id2="+id2+"&producttype="+producttype+">."+producttype+"</a></td>   <td><a href=/shopping/shop/jpfile/daysbefore.jsp?id3="+pd+"&id2="+id2+"&daysbefore="+daysbefore+">."+daysbefore+"</a></td>  <td><a href=/shopping/shop/jpfile/insert.jsp?id3="+pd+"&id2="+id2+"&id="+i+">.Insert</a></td> </tr>");
			
}
	


	if(ms==46 || ms==47 || ms==48 || ms==49 || ms==50 || ms==51 || ms==52 || ms==53 || ms==54 || ms==55 || ms==56 || ms==57 || ms==58 || ms==59 || ms==60 || ms==61 || ms==62 || ms==63 || ms==64 || ms==65 || ms==66 || ms==67 || ms==68 || ms==69 || ms==70 || ms==71){
	
	out.println("<tr bgcolor=lightgray><td><font color=red><b>"+pd+"</b></font></td><td><a href=/shopping/shop/jpfile/uploadfrom46_71.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">.<img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+pd+".jpg width=75 height=50></a><br><a href=/shopping/shop/jpfile/FileUploadServletfrom46_71_1.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._1</a><a href=/shopping/shop/jpfile/FileUploadServletfrom46_71_2.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._2</a> <a href=/shopping/shop/jpfile/FileUploadServletfrom46_71_3.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._3</a><a href=/shopping/shop/jpfile/FileUploadServletfrom46_71_4.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._4</a><br><a href=/shopping/shop/jpfile/categoryid6.jsp?id2="+id2+"&id3="+pd+"&proname="+name+">."+name+"</a> </td>    <td><a href=/shopping/shop/jpfile/categoryid6quantity.jsp?id3="+pd+"&id2="+id2+"&quantity="+quantity+">."+quantity+"</a></td>     <td><a href=/shopping/shop/jpfile/categoryid6price.jsp?id3="+pd+"&id2="+id2+"&price="+price+">."+price+"</a></td>      <td><a href=/shopping/shop/jpfile/procountry.jsp?id3="+pd+"&id2="+id2+"&procountry="+procountry+">."+procountry+"</a></td>    <td><a href=/shopping/shop/jpfile/proregion.jsp?id3="+pd+"&id2="+id2+"&proregion="+proregion+">."+proregion+"</a></td>   <td><a href=/shopping/shop/jpfile/producttype_cat6.jsp?id3="+pd+"&id2="+id2+"&producttype="+producttype+">."+producttype+"</a></td>   <td><a href=/shopping/shop/jpfile/daysbefore.jsp?id3="+pd+"&id2="+id2+"&daysbefore="+daysbefore+">."+daysbefore+"</a></td>  <td><a href=/shopping/shop/jpfile/insert.jsp?id3="+pd+"&id2="+id2+"&id="+i+">.Insert</a></td> </tr>");
			
}





	if(ms==72 || ms==73 || ms==74 || ms==75 || ms==76 || ms==77 || ms==78 || ms==79 || ms==80 || ms==81 || ms==82 || ms==83 || ms==84 || ms==85 || ms==86 || ms==87 || ms==88 || ms==89 || ms==90){
	
	out.println("<tr bgcolor=lightgray><td><font color=red><b>"+pd+"</b></font></td><td><a href=/shopping/shop/jpfile/uploadfrom72_90.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">.<img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+pd+".jpg width=75 height=50></a><br><a href=/shopping/shop/jpfile/FileUploadServletfrom72_90_1.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._1</a><a href=/shopping/shop/jpfile/FileUploadServletfrom72_90_2.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._2</a> <a href=/shopping/shop/jpfile/FileUploadServletfrom72_90_3.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._3</a><a href=/shopping/shop/jpfile/FileUploadServletfrom72_90_4.jsp?id1="+i+"&id2="+id2+"&id3="+pd+">._4</a><br><a href=/shopping/shop/jpfile/categoryid6.jsp?id2="+id2+"&id3="+pd+"&proname="+name+">."+name+"</a> </td>    <td><a href=/shopping/shop/jpfile/categoryid6quantity.jsp?id3="+pd+"&id2="+id2+"&quantity="+quantity+">."+quantity+"</a></td>     <td><a href=/shopping/shop/jpfile/categoryid6price.jsp?id3="+pd+"&id2="+id2+"&price="+price+">."+price+"</a></td>      <td><a href=/shopping/shop/jpfile/procountry.jsp?id3="+pd+"&id2="+id2+"&procountry="+procountry+">."+procountry+"</a></td>    <td><a href=/shopping/shop/jpfile/proregion.jsp?id3="+pd+"&id2="+id2+"&proregion="+proregion+">."+proregion+"</a></td>   <td><a href=/shopping/shop/jpfile/producttype_cat6.jsp?id3="+pd+"&id2="+id2+"&producttype="+producttype+">."+producttype+"</a></td>   <td><a href=/shopping/shop/jpfile/daysbefore.jsp?id3="+pd+"&id2="+id2+"&daysbefore="+daysbefore+">."+daysbefore+"</a></td>  <td><a href=/shopping/shop/jpfile/insert.jsp?id3="+pd+"&id2="+id2+"&id="+i+">.Insert</a></td> </tr>");
			
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