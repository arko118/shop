import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class category2add extends HttpServlet{
Connection con;
public void init(ServletConfig config)
              throws ServletException{
                   super.init(config);
	        

    }

Shoppingbean b=new Shoppingbean();

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String di=req.getParameter("id");
int id=new Integer(di).intValue();

String qu=req.getParameter("qunt");
int q=new Integer(qu).intValue();


String d=req.getParameter("back");
int i=new Integer(d).intValue();


if(q==0 || qu==""){
//****************************************************************

out.println("<html><center><body><br><br><br><br><br<br><br><br><br><br><br><br><br<br><br><br><table width=100 height=500><tr><td>Please try again and give quantity</td></tr></table></body></center></html>");

//out.println("ok");

res.setHeader("Refresh","5");

//****************************************************************


}


else{
//Shoppingbean b=new Shoppingbean();

double price=0.0;

String name=null;
double unitprice=0.0;
int depst=0;
int quanty=0;


try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");

Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select id3,id2,id,name,quantity,price from category3 where id3="+id+" ");
while(rs.next()){
	String idx=new Integer(rs.getInt("id3")).toString();
	int id3=new Integer(idx).intValue();

	String bed=new Integer(rs.getInt("id2")).toString();
	int id2=new Integer(bed).intValue();

	String idl=new Integer(rs.getInt("id")).toString();
	int id1=new Integer(idl).intValue();
	

	b.setPid(id2);
	


	String nam=new String(rs.getString("name")).toString();
	String qun=new Integer(rs.getInt("quantity")).toString();
	quanty=new Integer(qun).intValue();

	unitprice=new Double(rs.getDouble("price")).doubleValue();
	if(id==id3){

		if(quanty>=q){

	



	depst=quanty-q;   	
	price=unitprice*q;
        Statement smt=con.createStatement();
	//smt.executeUpdate("UPDATE category3 SET quantity=\'"+depst+"\' WHERE id3="+id+" ");
	
	try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stt=con.createStatement();
int items=0;
HttpSession session=req.getSession(true);

Vector p=(Vector)session.getValue("cusid");
if(p !=null){
items=p.size();
for(int x=0; x<items; x++){
Shoppingbean m=(Shoppingbean)p.elementAt(x);

String table=m.getUserName();

stt.executeUpdate("insert into "+table+"(cus_id,cus_name,id3,id2,id1,name,quantity,unitprice,price)values("+m.getTime()+",\'"+m.getUserName()+"\',"+id3+","+b.getPid()+","+id1+",\'"+nam+"\',"+q+","+unitprice+","+price+")");
		}
	}


}//try end

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

}//endif

}//end if (quanty=>q)

//else{



//}

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




}

//*******************************************************************


switch(b.getPid()){
case 100:res.sendRedirect("/shopping/servlet/classic1");break;case 101:res.sendRedirect("/shopping/servlet/classic1");break;
case 102:res.sendRedirect("/shopping/servlet/classic1");break;case 103:res.sendRedirect("/shopping/servlet/classic1");break;
case 104:res.sendRedirect("/shopping/servlet/classic1");break;case 105:res.sendRedirect("/shopping/servlet/classic1");break;
case 106:res.sendRedirect("/shopping/servlet/classic1");break;case 107:res.sendRedirect("/shopping/servlet/classic1");break;
case 108:res.sendRedirect("/shopping/servlet/classic1");break;case 109:res.sendRedirect("/shopping/servlet/classic1");break;


case 1101:res.sendRedirect("/shopping/servlet/classic11");break;
case 1102:res.sendRedirect("/shopping/servlet/classic11");break;case 1103:res.sendRedirect("/shopping/servlet/classic11");break;
case 1104:res.sendRedirect("/shopping/servlet/classic11");break;case 1105:res.sendRedirect("/shopping/servlet/classic11");break;
case 1106:res.sendRedirect("/shopping/servlet/classic11");break;case 1107:res.sendRedirect("/shopping/servlet/classic11");break;
case 1108:res.sendRedirect("/shopping/servlet/classic11");break;case 1109:res.sendRedirect("/shopping/servlet/classic11");break;
case 1110:res.sendRedirect("/shopping/servlet/classic11");break;

case 1201:res.sendRedirect("/shopping/servlet/classic12");break;
case 1202:res.sendRedirect("/shopping/servlet/classic12");break;case 1203:res.sendRedirect("/shopping/servlet/classic12");break;
case 1204:res.sendRedirect("/shopping/servlet/classic12");break;case 1205:res.sendRedirect("/shopping/servlet/classic12");break;
case 1206:res.sendRedirect("/shopping/servlet/classic12");break;case 1207:res.sendRedirect("/shopping/servlet/classic12");break;
case 1208:res.sendRedirect("/shopping/servlet/classic12");break;case 1209:res.sendRedirect("/shopping/servlet/classic12");break;
case 1210:res.sendRedirect("/shopping/servlet/classic12");break;

case 1301:res.sendRedirect("/shopping/servlet/classic13");break;
case 1302:res.sendRedirect("/shopping/servlet/classic13");break;case 1303:res.sendRedirect("/shopping/servlet/classic13");break;
case 1304:res.sendRedirect("/shopping/servlet/classic13");break;case 1305:res.sendRedirect("/shopping/servlet/classic13");break;
case 1306:res.sendRedirect("/shopping/servlet/classic13");break;case 1307:res.sendRedirect("/shopping/servlet/classic13");break;
case 1308:res.sendRedirect("/shopping/servlet/classic13");break;case 1309:res.sendRedirect("/shopping/servlet/classic13");break;
case 1310:res.sendRedirect("/shopping/servlet/classic13");break;

case 1401:res.sendRedirect("/shopping/servlet/classic14");break;
case 1402:res.sendRedirect("/shopping/servlet/classic14");break;case 1403:res.sendRedirect("/shopping/servlet/classic14");break;
case 1404:res.sendRedirect("/shopping/servlet/classic14");break;case 1405:res.sendRedirect("/shopping/servlet/classic14");break;
case 1406:res.sendRedirect("/shopping/servlet/classic14");break;case 1407:res.sendRedirect("/shopping/servlet/classic14");break;
case 1408:res.sendRedirect("/shopping/servlet/classic14");break;case 1409:res.sendRedirect("/shopping/servlet/classic14");break;
case 1410:res.sendRedirect("/shopping/servlet/classic14");break;

case 1501:res.sendRedirect("/shopping/servlet/classic15");break;
case 1502:res.sendRedirect("/shopping/servlet/classic15");break;case 1503:res.sendRedirect("/shopping/servlet/classic15");break;
case 1504:res.sendRedirect("/shopping/servlet/classic15");break;case 1505:res.sendRedirect("/shopping/servlet/classic15");break;
case 1506:res.sendRedirect("/shopping/servlet/classic15");break;case 1507:res.sendRedirect("/shopping/servlet/classic15");break;
case 1508:res.sendRedirect("/shopping/servlet/classic15");break;case 1509:res.sendRedirect("/shopping/servlet/classic15");break;
case 1510:res.sendRedirect("/shopping/servlet/classic15");break;

case 1601:res.sendRedirect("/shopping/servlet/classic16");break;
case 1602:res.sendRedirect("/shopping/servlet/classic16");break;case 1603:res.sendRedirect("/shopping/servlet/classic16");break;
case 1604:res.sendRedirect("/shopping/servlet/classic16");break;case 1605:res.sendRedirect("/shopping/servlet/classic16");break;
case 1606:res.sendRedirect("/shopping/servlet/classic16");break;case 1607:res.sendRedirect("/shopping/servlet/classic16");break;
case 1608:res.sendRedirect("/shopping/servlet/classic16");break;case 1609:res.sendRedirect("/shopping/servlet/classic16");break;
case 1610:res.sendRedirect("/shopping/servlet/classic16");break;

case 1701:res.sendRedirect("/shopping/servlet/classic17");break;
case 1702:res.sendRedirect("/shopping/servlet/classic17");break;case 1703:res.sendRedirect("/shopping/servlet/classic17");break;
case 1704:res.sendRedirect("/shopping/servlet/classic17");break;case 1705:res.sendRedirect("/shopping/servlet/classic17");break;
case 1706:res.sendRedirect("/shopping/servlet/classic17");break;case 1707:res.sendRedirect("/shopping/servlet/classic17");break;
case 1708:res.sendRedirect("/shopping/servlet/classic17");break;case 1709:res.sendRedirect("/shopping/servlet/classic17");break;
case 1710:res.sendRedirect("/shopping/servlet/classic17");break;

case 1801:res.sendRedirect("/shopping/servlet/classic18");break;
case 1802:res.sendRedirect("/shopping/servlet/classic18");break;case 1803:res.sendRedirect("/shopping/servlet/classic18");break;
case 1804:res.sendRedirect("/shopping/servlet/classic18");break;case 1805:res.sendRedirect("/shopping/servlet/classic18");break;
case 1806:res.sendRedirect("/shopping/servlet/classic18");break;case 1807:res.sendRedirect("/shopping/servlet/classic18");break;
case 1808:res.sendRedirect("/shopping/servlet/classic18");break;case 1809:res.sendRedirect("/shopping/servlet/classic18");break;
case 1810:res.sendRedirect("/shopping/servlet/classic18");break;


case 1901:res.sendRedirect("/shopping/servlet/classic19");break;
case 1902:res.sendRedirect("/shopping/servlet/classic19");break;case 1903:res.sendRedirect("/shopping/servlet/classic19");break;
case 1904:res.sendRedirect("/shopping/servlet/classic19");break;case 1905:res.sendRedirect("/shopping/servlet/classic19");break;
case 1906:res.sendRedirect("/shopping/servlet/classic19");break;case 1907:res.sendRedirect("/shopping/servlet/classic19");break;
case 1908:res.sendRedirect("/shopping/servlet/classic19");break;case 1909:res.sendRedirect("/shopping/servlet/classic19");break;
case 1910:res.sendRedirect("/shopping/servlet/classic19");break;

//********************************************10-19 pakege complete *****************************************************************

case 20000:res.sendRedirect("/shopping/servlet/classic20");break;case 20005:res.sendRedirect("/shopping/servlet/classic20");break;
case 20001:res.sendRedirect("/shopping/servlet/classic20");break;case 20006:res.sendRedirect("/shopping/servlet/classic20");break;
case 20002:res.sendRedirect("/shopping/servlet/classic29");break;case 20007:res.sendRedirect("/shopping/servlet/classic20");break;
case 20003:res.sendRedirect("/shopping/servlet/classic20");break;case 20008:res.sendRedirect("/shopping/servlet/classic20");break;
case 20004:res.sendRedirect("/shopping/servlet/classic20");break;case 20009:res.sendRedirect("/shopping/servlet/classic20");break;

case 21001:res.sendRedirect("/shopping/servlet/classic21");break;case 21006:res.sendRedirect("/shopping/servlet/classic21");break;
case 21002:res.sendRedirect("/shopping/servlet/classic21");break;case 21007:res.sendRedirect("/shopping/servlet/classic21");break;
case 21003:res.sendRedirect("/shopping/servlet/classic21");break;case 21008:res.sendRedirect("/shopping/servlet/classic21");break;
case 21004:res.sendRedirect("/shopping/servlet/classic21");break;case 21009:res.sendRedirect("/shopping/servlet/classic21");break;
case 21005:res.sendRedirect("/shopping/servlet/classic21");break;


}




			
		
//****************************************************************


}


}
