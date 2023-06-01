import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import java. text.DecimalFormat;
import javax.servlet.*;
import javax.servlet.http.*;


public class customerinput extends HttpServlet{

Connection con;
	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();

Shoppingbean x=new Shoppingbean();





out.println("<html><a href=/shopping/servlet/cccat3><img src=/shopping/shop/doc/arrow.gif width=75 height=50></a><body><table><center><tr><td><font color=blue><h2>Customer's Address</h2></font></td></tr></center><tr>");
out.println("<td><form action=/shopping/servlet/customer target=/shopping/servlet/navigation method=get>");

	
//out.println("</table></tr></table></center></body></html>");




//out.println("<html><body bgcolor=lightyellow><table>");

	
double totalprice=0.0;
double pp=0.0;
try{
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
	
ResultSet rs=stmt.executeQuery("select * from "+table+" where cus_id="+m.getTime()+" and cus_name=\'"+table+"\' ");

	

out.println("<tr><td align left></td><td align right><input type=hidden name=nick size=15 value="+table+"></td></tr>");
out.println("<tr><td align left>User Name</td><td align right><input type=text name=fullname size=20></td></tr>");

out.println("<tr><td align left>Country</td><td align right>");
out.println("<select name=country size=1 value=Bangladesh><option value=Bangladesh>Bangladesh...............</option></select>");
out.println("</td></tr>");

out.println("<tr><td align left>District</td><td align right><input type=text name=district size=20></td></tr>");
out.println("<tr><td align left>Thana</td><td align right><input type=text name=thana size=20></td></tr>");
out.println("<tr><td align left>Post Office</td><td align right><input type=text name=po size=20></td></tr>");

//out.println("<tr><td align left>Area which your localy name</td><td align right><input type=text name=area size=20></td></tr>");**

out.println("<tr><td align left>Area which your localy name</td><td align right>");
out.println("<select name=area size=1 ><option value=></option><option value=Jahangirnagar>Jahangirnagar University</option></select>");

out.println("</td></tr>");


out.println("<tr><td align left>Road and Holding</td><td align right><input type=text name=holding size=20></td></tr>");
out.println("<tr><td align left>Floor and Room</td><td align right><input type=text name=floor size=20></td></tr>");
out.println("<tr><td align left>Customer Mobail</td><td align right><input type=text name=mobail size=20></td></tr>");
out.println("<tr><td align left>Email</td><td align right><input type=text name=email size=20></td></tr>");

out.println("<tr><td><table>");
out.println("<center><tr><td><font color=magenta><h2>Order Items</h2></font></td></tr></center><tr>");
out.println("<table><tr><td><font color=blue>ProductName</font></td><td><font color=blue>Quantity</font></td> <td></td> <td><font color=blue>UnitPrice</font></td><td><font color=blue>Price</font></td></tr>");




while(rs.next()){
	String cid=new Integer(rs.getInt("cus_id")).toString();
	int cusid=new Integer(cid).intValue();
	String cus_name=rs.getString("cus_name").toString();
	String idd=new Integer(rs.getInt("id3")).toString();
	int id3=new Integer(idd).intValue();
	String pid=new Integer(rs.getInt("id2")).toString();
	int id2=new Integer(pid).intValue();
	String id=new Integer(rs.getInt("id1")).toString();
	int id1=new Integer(id).intValue();
	String name=rs.getString("name").toString();
        String qun=new Integer(rs.getInt("quantity")).toString();
	int qu=new Integer(qun).intValue();
	double uprice=new Double(rs.getDouble("unitprice")).doubleValue();
	double p=new Double(rs.getDouble("price")).doubleValue();

	x.setPid(id2);
	x.setName(name);
	x.setQuantity(qu);
	x.setEachprice(uprice);
	x.setTotal(p);
	x.setPrice(p);

	
out.println("<tr>");

out.println("<td align=left><iframe src=/shopping/shop/IMAGE/"+id1+"/"+id2+"/"+id3+".jpg width=100 height=100 frameborder=no></iframe></td>");
	
	//*************************************************************************	




out.println("<td><font color=green><i6>"+x.getQuantity()+"</i6></font></td> <td></td> <td>"+x.getEachprice()+"</td> <td>"+x.getPrice()+"</td> </tr>");


	
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

finally{
	try{if(con !=null)con.close();
	   }
catch(SQLException ignored)
	{}

   }

//*******************************************************************************************************************





DecimalFormat form=new DecimalFormat("##0.00");
out.println("<tr><td></td><td></td><td></td><td></td><td><font color=blue>========</font></td></tr>");
out.println("<tr><td></td><td></td><td></td><td><font color=blue>Total Price is :</font></td><td><font color=red>"+x.getTotal()+"</font></td></tr></table></td>");
	





out.println("<tr><td align left></td><td align right><input type=hidden name=price value="+x.getTotal()+"></td></tr>");
out.println("<tr><td align left></td><td align right><font color=red><b><input type=submit value=submit></b></font></td></tr>");


out.println("</table></tr></form></table></body></html>");


//*******************************************************************************************************









}
	


} 