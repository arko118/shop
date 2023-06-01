import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class paymentmode extends HttpServlet{
Connection con;
public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);        

    }



public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();



int items=0;
HttpSession session=req.getSession(true);

Vector customer=(Vector)session.getValue("customer");
if(customer !=null){
items=customer.size();
for(int x=0; x<items; x++){
Shoppingbean cus=(Shoppingbean)customer.elementAt(x);

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");



Statement std=con.createStatement();


	String nick=cus.getUserName();
	String fullname=cus.getName();
	String country=cus.getCountry();
	String district=cus.getDistrict();
	String thana=cus.getThana();
	String po=cus.getPostoffice();
	String area=cus.getArea();
	String holding=cus.getHolding();
	String floor=cus.getFloor();
	String mobail=cus.getMobail();
	String email=cus.getEmail();


String idd=new Integer(cus.getAid()).toString();
String pid=new Integer(cus.getBid()).toString();
String pid1=new Integer(cus.getCid()).toString();
String pname=cus.getProname();
String qun=new Integer(cus.getQuantity()).toString();

String uprice=new Double(cus.getEachprice()).toString();
String p=new Double(cus.getTotal()).toString();
String pr=new Double(cus.getTotal()).toString();
String dat=cus.getDat();
	
int depst=0;
int quanty1=0;


	std.executeUpdate("insert into soldproduct(cusid,nickname,fullname,country,district,thana,po,area,holding,floor,cusmobile,email,id3,id2,id1,pname,quantity,unitprice,price,totalprice,time)values(\'"+cus.getTime()+"\',\'"+nick+"\',\'"+fullname+"\',\'"+country+"\',\'"+district+"\',\'"+thana+"\',\'"+po+"\',\'"+area+"\',\'"+holding+"\',\'"+floor+"\',\'"+mobail+"\',\'"+email+"\',\'"+idd+"\',\'"+pid+"\',\'"+pid1+"\',\'"+pname+"\',\'"+qun+"\',\'"+uprice+"\',\'"+p+"\',\'"+pr+"\',\'"+dat+"\')");
	std.executeUpdate("insert into stockproduct(cusid,nickname,fullname,country,district,thana,po,area,holding,floor,cusmobile,email,id3,id2,id1,pname,quantity,unitprice,price,totalprice,time)values(\'"+cus.getTime()+"\',\'"+nick+"\',\'"+fullname+"\',\'"+country+"\',\'"+district+"\',\'"+thana+"\',\'"+po+"\',\'"+area+"\',\'"+holding+"\',\'"+floor+"\',\'"+mobail+"\',\'"+email+"\',\'"+idd+"\',\'"+pid+"\',\'"+pid1+"\',\'"+pname+"\',\'"+qun+"\',\'"+uprice+"\',\'"+p+"\',\'"+pr+"\',\'"+dat+"\')");

	//std.executeUpdate("UPDATE category6 SET quantity=\'"+depst+"\' WHERE id3="+id+" "); //stop detacdtion

ResultSet rs=std.executeQuery("select id3,id2,id,name,quantity,price from category6 where id3=\'"+idd+"\' ");
	while(rs.next()){
				String qun1=new Integer(rs.getInt("quantity")).toString();
				quanty1=new Integer(qun1).intValue();
				depst=quanty1-qun;
				std.executeUpdate("UPDATE category6 SET quantity=\'"+depst+"\' WHERE id3="+idd+" ");
			}

	
}


catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
out.println("SQLException cought"+aa.getMessage());
		}
finally{
	try{if(con !=null)
	
	con.close();
	   }
catch(SQLException ignored)
	{}
  }

//...........................................

}
}



out.println("<center><br><br><a href=/shopping/servlet/downloadprogram1>You must download Your Receipt (Evideance)</a><br>");



}

}
