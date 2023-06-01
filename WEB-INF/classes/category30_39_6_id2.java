
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class category30_39_6_id2 extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();

	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();

out.println("<html><body><font color=blue><b><h4><i></i></h4></b></font></body></html>");

out.println("<html><body><table ><tr><td></td><td></td><td><font color=red><b><h5><i>Table:Category2</i></h5></b></font></td></tr>");
out.println("<tr><td><font color=blue><b>d2</b></font></td><td><font color=blue><b>Update id2</b></font></td><td><font color=blue><b>Product Name</b></font></td></tr>");
Shoppingbean b=new Shoppingbean();

res.setHeader("Refresh","5");


String d=req.getParameter("id");
int i=new Integer(d).intValue();

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from category2 where id="+i+" ");
while(rs.next()){

		String i2=new Integer(rs.getInt("d2")).toString();
		int d2=new Integer(i2).intValue();

		String id=new Integer(rs.getInt("id2")).toString();
		int pd=new Integer(id).intValue();

		String d1=new Integer(rs.getInt("id")).toString();
		int id1=new Integer(d1).intValue();

		String m=new Integer(rs.getInt("id")).toString();
		int ms=new Integer(m).intValue();

		String name=rs.getString("name").toString();

	
		
		
	if(ms==1 || ms==11 || ms==12 || ms==13 || ms==14 || ms==15 || ms==16 || ms==17 || ms==18 || ms==19){
	out.println("<tr bgcolor=lightgray><td ><a href=/shopping/servlet/category30_39_table6?id="+d2+" target=/shopping/servlet/id3window>"+d2+"</a></td> <td><a href=/shopping/shop/jpfile/categoryid_1_19.jsp?id1="+id1+"&proname="+name+"&id2="+pd+"&d2="+d2+">"+pd+"</a></td></td><td><a href=/shopping/shop/jpfile/FileUploadServlet_from_1_19.jsp?id1="+id1+"&id2="+d2+"><img src=/shopping/shop/IMAGE/"+id1+"/"+d2+"/"+d2+".jpg width=75 height=50></a><br><a href=/shopping/shop/jpfile/cat2nameupdate.jsp?id1="+id1+"&proname="+name+"&id2="+d2+"&d2="+d2+">."+name+"</a></td></tr>");
	}

	if(ms==20 || ms==21 || ms==22 || ms==23 || ms==24 || ms==25 || ms==26 || ms==27 || ms==28 || ms==29 || ms==30 || ms==31 || ms==32 || ms==33 || ms==34 || ms==35 || ms==36 || ms==37 || ms==38 || ms==39 || ms==40 || ms==41 || ms==42 || ms==43 || ms==44 || ms==45){
	out.println("<tr bgcolor=lightgray><td ><a href=/shopping/servlet/category30_39_table6?id="+d2+" target=/shopping/servlet/id3window>"+d2+"</a></td> <td><a href=/shopping/shop/jpfile/categoryid20.jsp?id1="+id1+"&proname="+name+"&id2="+pd+"&d2="+d2+">"+pd+"</a></td></td><td><a href=/shopping/shop/jpfile/FileUploadServlet_id2_from20.jsp?id1="+id1+"&id2="+d2+"><img src=/shopping/shop/IMAGE/"+id1+"/"+d2+"/"+d2+".jpg width=75 height=50></a><br><a href=/shopping/shop/jpfile/cat2nameupdate.jsp?id1="+id1+"&proname="+name+"&id2="+d2+"&d2="+d2+">."+name+"</a></td></tr>");
	}
	

	if(ms==46 || ms==47 || ms==48 || ms==49 || ms==50 || ms==51 || ms==52 || ms==53 || ms==54 || ms==55 || ms==56 || ms==57 || ms==58 || ms==59 || ms==60 || ms==61 || ms==62 || ms==63 || ms==64 || ms==65 || ms==66 || ms==67 || ms==68 || ms==69 || ms==70 || ms==71){
	out.println("<tr bgcolor=lightgray><td ><a href=/shopping/servlet/category30_39_table6?id="+d2+" target=/shopping/servlet/id3window>"+d2+"</a></td> <td><a href=/shopping/shop/jpfile/categoryid20.jsp?id1="+id1+"&proname="+name+"&id2="+pd+"&d2="+d2+">"+pd+"</a></td></td><td><a href=/shopping/shop/jpfile/FileUploadServlet_id2_from46.jsp?id1="+id1+"&id2="+d2+"><img src=/shopping/shop/IMAGE/"+id1+"/"+d2+"/"+d2+".jpg width=75 height=50></a><br><a href=/shopping/shop/jpfile/cat2nameupdate.jsp?id1="+id1+"&proname="+name+"&id2="+d2+"&d2="+d2+">."+name+"</a></td></tr>");
	}


	if(ms==72 || ms==73 || ms==74 || ms==75 || ms==76 || ms==77 || ms==78 || ms==79 || ms==80 || ms==81 || ms==82 || ms==83 || ms==84 || ms==85 || ms==86 || ms==87 || ms==88 || ms==89 || ms==90){
	out.println("<tr bgcolor=lightgray><td ><a href=/shopping/servlet/category30_39_table6?id="+d2+" target=/shopping/servlet/id3window>"+d2+"</a></td> <td><a href=/shopping/shop/jpfile/categoryid20.jsp?id1="+id1+"&proname="+name+"&id2="+pd+"&d2="+d2+">"+pd+"</a></td></td><td><a href=/shopping/shop/jpfile/FileUploadServlet_id2_from72.jsp?id1="+id1+"&id2="+d2+"><img src=/shopping/shop/IMAGE/"+id1+"/"+d2+"/"+d2+".jpg width=75 height=50></a><br><a href=/shopping/shop/jpfile/cat2nameupdate.jsp?id1="+id1+"&proname="+name+"&id2="+d2+"&d2="+d2+">."+name+"</a></td></tr>");
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