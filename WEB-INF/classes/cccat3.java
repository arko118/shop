import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import java. text.DecimalFormat;
import javax.servlet.*;
import javax.servlet.http.*;


public class cccat3 extends HttpServlet{

Connection con;
	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();


//************************************************************************************************************************

Shoppingbean x=new Shoppingbean();
double totalprice=0.0;
double pp=0.0;
try{

out.println("<html><body bgcolor=lightyellow><table>");
	out.println("<center><tr><td><font color=magenta><h2>Order Items</h2></font></td></tr></center><tr>");
	out.println("<table><tr><td><font color=blue><b>Product</font></b></td><td><font color=blue><b>Quantity</b></font></td> <td></td> <td><font color=blue><b>UnitPrice</b></font></td><td><font color=blue><b>Price</b></font></td></tr>");




Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();

int items=0;
HttpSession session=req.getSession(true);

Vector px=(Vector)session.getValue("cusid");
if(px !=null){
items=px.size();
for(int xx=0; xx<items; xx++){
Shoppingbean m=(Shoppingbean)px.elementAt(xx);

String table=m.getUserName();

//Shoppingbean mx=(Shoppingbean)px.elementAt(xx);




	
ResultSet rs=stmt.executeQuery("select * from "+table+" where cus_id="+m.getTime()+" and cus_name=\'"+table+"\' ");

	

while(rs.next()){
	String cid=new Integer(rs.getInt("cus_id")).toString();
	int cusid=new Integer(cid).intValue();
	String cus_name=rs.getString("cus_name").toString();
	String idd=new Integer(rs.getInt("id3")).toString();
	int id3=new Integer(idd).intValue();
	String pid=new Integer(rs.getInt("id2")).toString();
	int id2=new Integer(pid).intValue();
	String idl=new Integer(rs.getInt("id1")).toString();
	int id1=new Integer(idl).intValue();
	String name=rs.getString("name").toString();
        String qun=new Integer(rs.getInt("quantity")).toString();
	int qu=new Integer(qun).intValue();
	double uprice=new Double(rs.getDouble("unitprice")).doubleValue();
	double p=new Double(rs.getDouble("price")).doubleValue();
		
	out.println("<tr>");
//*************************************************************************

out.println("<td align=left><iframe src=/shopping/shop/IMAGE/"+id1+"/"+id2+"/"+id3+".jpg width=50 height=50 frameborder=no scrolling=no></iframe><div align=left valign=top>"+name+"</div></td>");


out.println("<td><font color=green><i6>"+qu+"</i6></font></td> <td></td> <td>"+uprice+"</td> <td>"+p+"</td> <td><a href=/shopping/servlet/canclepid?id="+id3+"><font color=red><h6><i>Delet</i></h6></font></a></td> ");
	
//out.println("<td></td> <td></td> <td></td> <td></td> <td></td>  </tr>");
	
out.println("<td></td> <td></td> <td></td> <td></td> <td></td> <td><form action=/shopping/servlet/changeproduct method=get><input type=hidden name=di value="+id3+"> <input type=text name=user size=2><input type=submit value=Change></form> </td></tr>");



//**********************************************************************************************************

	x.setPid(id2);
	x.setName(name);
	x.setQuantity(qu);
	x.setEachprice(uprice);
	x.setTotal(p);
	x.setPrice(p);


	
	}

	
}	

	}

//**********************************************

DecimalFormat form=new DecimalFormat("##0.00");
out.println("<tr><td></td><td></td><td></td><td></td><td><font color=blue>========</font></td></tr>");
out.println("<tr><td></td><td></td><td></td><td><font color=blue>Sum of Total Price is :</font></td><td><font color=red>"+x.getTotal()+"</font></td></tr>");
	

out.println("<tr><td></td><td></td><td></td><td><a href=/shopping/servlet/cancle><font color=red>Order Cancle</font></a></td><td></td><td><a href=/shopping/servlet/compear target=/shopping/servlet/navigation><font color=Blue>Submit</font></a></td><td></td></tr>");


out.println("</table></tr></table></body></html>");





//***********************************************

	
}	
	

catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
//out.println("SQLException cought"+aa.getMessage());
out.println("<font color=red><h3><b>Please Login only nick name</b></h3></font>");
		}

finally{
	try{if(con !=null)con.close();
	   }
catch(SQLException ignored)
	{}

   }







}
	


} 