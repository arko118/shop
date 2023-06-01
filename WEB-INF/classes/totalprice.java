import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import java. text.DecimalFormat;
import javax.servlet.*;
import javax.servlet.http.*;


public class totalprice extends HttpServlet{

Connection con;
	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();

res.setIntHeader("Refresh", 5);

Shoppingbean x=new Shoppingbean();
double totalprice=0.0;
double pp=0.0;

DecimalFormat form=new DecimalFormat("##0.00");




out.println("<html><body><center><table><tr><td></td></tr><tr><td>");




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
x.setName(m.getUserName());
	
ResultSet rs=stmt.executeQuery("select * from "+table+" where cus_id="+m.getTime()+" and cus_name=\'"+table+"\' ");

	

while(rs.next()){
	String cid=new Integer(rs.getInt("cus_id")).toString();
	int cusid=new Integer(cid).intValue();
	String cus_name=rs.getString("cus_name").toString();
	String idd=new Integer(rs.getInt("id3")).toString();
	int id3=new Integer(idd).intValue();
	String pid=new Integer(rs.getInt("id2")).toString();
	int pd=new Integer(pid).intValue();
	//String name=rs.getString("name").toString();
        String qun=new Integer(rs.getInt("quantity")).toString();
	int qu=new Integer(qun).intValue();
	double uprice=new Double(rs.getDouble("unitprice")).doubleValue();
	double p=new Double(rs.getDouble("price")).doubleValue();
		
	out.println("<tr><td><table>");



	//out.println("</table></td>");

	
	x.setPid(pd);
	
	x.setQuantity(qu);
	x.setEachprice(uprice);
	x.setTotal(p);
	x.setPrice(p);
	
	}

	
}	

	}


	
}	
	

catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
out.println("<html><body><table width=200 height=20><tr><td><b></td></tr></table></body></html></b>");
		}

finally{
	try{if(con !=null)con.close();
	   }
catch(SQLException ignored)
	{}

   }


//res.setHeader("Refresh","10");

	
out.println("<font color=blue>Login:</font><font color=blue><b>"+x.getName()+"</b></font>,<font color=blue>Total Price :</font><font color=red><b>"+x.getTotal()+"</b></font>");


out.println("</td></tr></table></center></body></html>");


}
	


} 