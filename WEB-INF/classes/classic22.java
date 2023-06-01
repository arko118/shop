
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class classic22 extends HttpServlet{
Connection con=null;




public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();



out.println(" <style type=text/css>");

out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow;   font-size: 11px;  color: rgb(0,0,0);  } ");
out.println(".border{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow; font-size: 12px;color: rgb(0,0,0);  border: blue solid 1px; } ");
out.println(".b-right{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow; font-size: 12px;color: rgb(0,0,0); border-right: lightblue solid 1px; } ");

out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; font-size: 20px;color: rgb(0,0,0); border: blue solid 2px; } ");
out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");


	

//String iid=req.getParameter("id");

try{


HttpSession seion=req.getSession(true);
if(seion !=null){
Vector Dbasket=(Vector)seion.getValue("id");
if(Dbasket !=null){
int its=Dbasket.size();
for(int ii=0; ii<its;ii++)
{
Shoppingbean m=(Shoppingbean)Dbasket.elementAt(ii);



Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from category6 where id2="+m.getPid()+" ");

while(rs.next()){

	String id4=new Integer(rs.getInt("id3")).toString();
	int id3=new Integer(id4).intValue();

	String id1=new Integer(rs.getInt("id2")).toString();
	int pd=new Integer(id1).intValue();

	String d2=new Integer(rs.getInt("id2")).toString();
	int id2=new Integer(d2).intValue();
	
	String d=new Integer(rs.getInt("id")).toString();
	int id=new Integer(d).intValue();

	String name=rs.getString("name");
        String quantity=new Integer(rs.getInt("quantity")).toString();
	int quan=new Integer(quantity).intValue();
	String price=new Integer(rs.getInt("price")).toString();

	if(quan==0){
	out.println("<br><br><center></center>");
	}
else{
	


	
	
	

switch(pd){


	
case 22001:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td></tr></table></td></tr></table></td></tr></table></body></html>");
        break;

case 22002:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td> </tr></table></td></tr></table></td></tr></table></body></html>");
               break;

case 22003:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td> </tr></table></td></tr></table></td></tr></table></body></html>");
        break;

case 22004:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td> </tr></table></td></tr></table></td></tr></table></body></html>");
               break;

case 22005:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td> </tr></table></td></tr></table></td></tr></table></body></html>");
          break;

case 22006:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td> </tr></table></td></tr></table></td></tr></table></body></html>");
         break;

case 22007:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td> </tr></table></td></tr></table></td></tr></table></body></html>");
         break;

case 22008:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td> </tr></table></td></tr></table></td></tr></table></body></html>");
        break;

case 22009:
	out.println("<html><body ><table  scrolling=No ><tr><td bgcolor=lightgray>   <table  scrolling=No ><tr><td bgcolor=white><table class=style1><tr><td align=left bgcolor=grayellow><b>Name:<font color=blue>"+name+"</font> </b></td><th></th><th></th><td align=left bgcolor=grayellow><b>Quantity:<font color=red>"+quantity+"</font></b></td><td></td><td align=right bgcolor=grayellow><b>Price:<font color=red>"+price+"</b></font</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td align=left bgcolor=red><form action=/shopping/servlet/category6add method=get><input type=hidden name=id size=5 value="+id3+"><input type=hidden name=back size=5 value="+pd+"><input type=submit value=Order><input type=text name=qunt size=3 value=0></form></td> </tr></table>");
	out.println("<table><tr><td><iframe src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jsp?id3="+id3+"&id2="+id2+"&id="+id+" width=700 height=400 frameborder=no></iframe></td> </tr></table></td></tr></table></td></tr></table></body></html>");
        break;


	

	
     
}//switch


}//else



}//while
		}
	}
	}
}



catch(ClassNotFoundException e){
out.println("could not load Database Driver" +e.getMessage());
		}
catch(SQLException e){
out.println("tplease try again");
		}
finally{
	try{
		if(con !=null)
		con.close();
	   }
catch(SQLException ignored)
	{}


	}




	

}
}
