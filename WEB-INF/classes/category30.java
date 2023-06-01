
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class category30 extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();



//***************************************************************************************
private void EmptyBasket(HttpServletRequest req){
HttpSession session=req.getSession(true);
if(session !=null){
Vector basket=(Vector)session.getValue("id");
if(basket !=null){

basket.removeAllElements();
	}
}
}

//****************************************************************************************



private void addToBasket(Shoppingbean bean, HttpServletRequest req){
HttpSession session=req.getSession(true);
if(session !=null){
Vector id=(Vector)session.getValue("id");
if(id ==null){
id=new Vector();
session.putValue("id",id);
}
id.addElement(bean);
	}
}







public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


EmptyBasket(req);

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();

String d=req.getParameter("id");
int di=new Integer(d).intValue();





try{

	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
	Statement stmt=con.createStatement();

	

	ResultSet rs=stmt.executeQuery("select * from category2 where id2="+di+" ");
 
	while(rs.next()){      


	

	String id1=new Integer(rs.getInt("id2")).toString();
	int pd=new Integer(id1).intValue();

	String idz=new Integer(rs.getInt("id")).toString();
	int id=new Integer(idz).intValue();


	String name=rs.getString("name");
        String quantity=new Integer(rs.getInt("quantity")).toString();
	int quan=new Integer(quantity).intValue();
	String price=new Integer(rs.getInt("price")).toString();

	b.setMid(quan);
	b.setAid(id);
	b.setPid(pd);
	
	addToBasket(b,req);

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
//......................................................................................................

if(b.getPid()==100 || b.getPid()==101 || b.getPid()==102 || b.getPid()==103 || b.getPid()==104 || b.getPid()==105 || b.getPid()==106 || b.getPid()==107 || b.getPid()==108 || b.getPid()==109){
res.sendRedirect("/shopping/shop/jpfile/classicid1.jsp"); 
}

if(b.getPid()==1101 || b.getPid()==1102 || b.getPid()==1103 || b.getPid()==1104 || b.getPid()==1105 || b.getPid()==1106 || b.getPid()==1107 || b.getPid()==1108 || b.getPid()==1109){
res.sendRedirect("/shopping/shop/jpfile/classicid11.jsp"); 
}
if(b.getPid()==1201 || b.getPid()==1202 || b.getPid()==1203 || b.getPid()==1204 || b.getPid()==1205 || b.getPid()==1206 || b.getPid()==1207 || b.getPid()==1208 || b.getPid()==1209){
res.sendRedirect("/shopping/shop/jpfile/classicid12.jsp"); 
}
if(b.getPid()==1301 || b.getPid()==1302 || b.getPid()==1303 || b.getPid()==1304 || b.getPid()==1305 || b.getPid()==1306 || b.getPid()==1307 || b.getPid()==1308 || b.getPid()==1309){
res.sendRedirect("/shopping/shop/jpfile/classicid13.jsp"); 
}
if(b.getPid()==1401 || b.getPid()==1402 || b.getPid()==1403 || b.getPid()==1404 || b.getPid()==1405 || b.getPid()==1406 || b.getPid()==1407 || b.getPid()==1408 || b.getPid()==1409){
res.sendRedirect("/shopping/shop/jpfile/classicid14.jsp"); 
}
if(b.getPid()==1501 || b.getPid()==1502 || b.getPid()==1503 || b.getPid()==1504 || b.getPid()==1505 || b.getPid()==1506 || b.getPid()==1507 || b.getPid()==1508 || b.getPid()==1509){
res.sendRedirect("/shopping/shop/jpfile/classicid15.jsp"); 
}
if(b.getPid()==1601 || b.getPid()==1602 || b.getPid()==1603 || b.getPid()==1604 || b.getPid()==1605 || b.getPid()==1606 || b.getPid()==1607 || b.getPid()==1608 || b.getPid()==1609){
res.sendRedirect("/shopping/shop/jpfile/classicid16.jsp"); 
}
if(b.getPid()==1701 || b.getPid()==1702 || b.getPid()==1703 || b.getPid()==1704 || b.getPid()==1705 || b.getPid()==1706 || b.getPid()==1707 || b.getPid()==1708 || b.getPid()==1709){
res.sendRedirect("/shopping/shop/jpfile/classicid17.jsp"); 
}
if(b.getPid()==1801 || b.getPid()==1802 || b.getPid()==1803 || b.getPid()==1804 || b.getPid()==1805 || b.getPid()==1806 || b.getPid()==1807 || b.getPid()==1808 || b.getPid()==1809){
res.sendRedirect("/shopping/shop/jpfile/classicid18.jsp"); 
}
if(b.getPid()==1901 || b.getPid()==1902 || b.getPid()==1903 || b.getPid()==1904 || b.getPid()==1905 || b.getPid()==1906 || b.getPid()==1907 || b.getPid()==1908 || b.getPid()==1909){
res.sendRedirect("/shopping/shop/jpfile/classicid19.jsp"); 
}






if(b.getPid()==20001 || b.getPid()==20002 || b.getPid()==20003 || b.getPid()==20004 || b.getPid()==20005 || b.getPid()==20006 || b.getPid()==20007 || b.getPid()==20008){
res.sendRedirect("/shopping/shop/jpfile/classicid20.jsp"); 
		
}	


if(b.getPid()==21001 || b.getPid()==21002 || b.getPid()==21003 || b.getPid()==21004 || b.getPid()==21005 || b.getPid()==21006 || b.getPid()==21007 || b.getPid()==21008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid21.jsp");   
}

if(b.getPid()==22001 || b.getPid()==22002 || b.getPid()==22003 || b.getPid()==22004 || b.getPid()==22005 || b.getPid()==22006 || b.getPid()==22007 || b.getPid()==22008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid22.jsp ");   
}
if(b.getPid()==23001 || b.getPid()==23002 || b.getPid()==23003 || b.getPid()==23004 || b.getPid()==23005 || b.getPid()==23006 || b.getPid()==23007 || b.getPid()==23008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid23.jsp "); 
}
if(b.getPid()==24001 || b.getPid()==24002 || b.getPid()==24003 || b.getPid()==24004 || b.getPid()==24005 || b.getPid()==24006 || b.getPid()==24007 || b.getPid()==24008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid24.jsp ");    
}
if(b.getPid()==25001 || b.getPid()==25002 || b.getPid()==25003 || b.getPid()==25004 || b.getPid()==25005 || b.getPid()==25006 || b.getPid()==25007 || b.getPid()==25008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid25.jsp ");    
}
if(b.getPid()==26001 || b.getPid()==26002 || b.getPid()==26003 || b.getPid()==26004 || b.getPid()==26005 || b.getPid()==26006 || b.getPid()==26007 || b.getPid()==26008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid26.jsp "); 
}
if(b.getPid()==27001 || b.getPid()==27002 || b.getPid()==27003 || b.getPid()==27004 || b.getPid()==27005 || b.getPid()==27006 || b.getPid()==27007 || b.getPid()==27008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid27.jsp ");     
}
if(b.getPid()==28001 || b.getPid()==28002 || b.getPid()==28003 || b.getPid()==28004 || b.getPid()==28005 || b.getPid()==28006 || b.getPid()==28007 || b.getPid()==28008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid28.jsp ");   
}
if(b.getPid()==29001 || b.getPid()==29002 || b.getPid()==29003 || b.getPid()==29004 || b.getPid()==29005 || b.getPid()==29006 || b.getPid()==29007 || b.getPid()==29008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid29.jsp ");  
  		}



//....................................................................................................


if(b.getPid()==30001 || b.getPid()==30002 || b.getPid()==30003 || b.getPid()==30004 || b.getPid()==30005 || b.getPid()==30006 || b.getPid()==30007 || b.getPid()==30008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid30.jsp");   
}	

if(b.getPid()==31001 || b.getPid()==31002 || b.getPid()==31003 || b.getPid()==31004 || b.getPid()==31005 || b.getPid()==31006 || b.getPid()==31007 || b.getPid()==31008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid31.jsp");   
}

if(b.getPid()==32001 || b.getPid()==32002 || b.getPid()==32003 || b.getPid()==32004 || b.getPid()==32005 || b.getPid()==32006 || b.getPid()==32007 || b.getPid()==32008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid32.jsp ");   
}
if(b.getPid()==33001 || b.getPid()==33002 || b.getPid()==33003 || b.getPid()==33004 || b.getPid()==33005 || b.getPid()==33006 || b.getPid()==33007 || b.getPid()==33008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid33.jsp "); 
}
if(b.getPid()==34001 || b.getPid()==34002 || b.getPid()==34003 || b.getPid()==34004 || b.getPid()==34005 || b.getPid()==34006 || b.getPid()==34007 || b.getPid()==34008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid34.jsp ");    
}
if(b.getPid()==35001 || b.getPid()==35002 || b.getPid()==35003 || b.getPid()==35004 || b.getPid()==35005 || b.getPid()==35006 || b.getPid()==35007 || b.getPid()==35008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid35.jsp ");    
}
if(b.getPid()==36001 || b.getPid()==36002 || b.getPid()==36003 || b.getPid()==36004 || b.getPid()==36005 || b.getPid()==36006 || b.getPid()==36007 || b.getPid()==36008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid36.jsp "); 
}
if(b.getPid()==37001 || b.getPid()==37002 || b.getPid()==37003 || b.getPid()==37004 || b.getPid()==37005 || b.getPid()==37006 || b.getPid()==37007 || b.getPid()==37008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid37.jsp ");     
}
if(b.getPid()==38001 || b.getPid()==38002 || b.getPid()==38003 || b.getPid()==38004 || b.getPid()==38005 || b.getPid()==38006 || b.getPid()==38007 || b.getPid()==38008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid38.jsp ");   
}
if(b.getPid()==39001 || b.getPid()==39002 || b.getPid()==39003 || b.getPid()==39004 || b.getPid()==39005 || b.getPid()==39006 || b.getPid()==39007 || b.getPid()==39008){
	
		res.sendRedirect("/shopping/shop/jpfile/classicid39.jsp ");  
  		}


if(b.getPid()==40001 || b.getPid()==40002 || b.getPid()==40003 || b.getPid()==40004 || b.getPid()==40005 || b.getPid()==40006 || b.getPid()==40007 || b.getPid()==40008){
			res.sendRedirect("/shopping/shop/jpfile/classicid40.jsp ");  
  		}

if(b.getPid()==41001 || b.getPid()==41002 || b.getPid()==41003 || b.getPid()==41004 || b.getPid()==41005 || b.getPid()==41006 || b.getPid()==41007 || b.getPid()==41008){
			res.sendRedirect("/shopping/shop/jpfile/classicid41.jsp ");  
  		}

if(b.getPid()==42001 || b.getPid()==42002 || b.getPid()==42003 || b.getPid()==42004 || b.getPid()==42005 || b.getPid()==42006 || b.getPid()==42007 || b.getPid()==42008){
			res.sendRedirect("/shopping/shop/jpfile/classicid42.jsp ");  
  		}
if(b.getPid()==43001 || b.getPid()==43002 || b.getPid()==43003 || b.getPid()==43004 || b.getPid()==43005 || b.getPid()==43006 || b.getPid()==43007 || b.getPid()==43008){
			res.sendRedirect("/shopping/shop/jpfile/classicid43.jsp ");  
  		}
if(b.getPid()==44001 || b.getPid()==44002 || b.getPid()==44003 || b.getPid()==44004 || b.getPid()==44005 || b.getPid()==44006 || b.getPid()==44007 || b.getPid()==44008){
			res.sendRedirect("/shopping/shop/jpfile/classicid44.jsp ");  
  		}

if(b.getPid()==45001 || b.getPid()==45002 || b.getPid()==45003 || b.getPid()==45004 || b.getPid()==45005 || b.getPid()==45006 || b.getPid()==45007 || b.getPid()==45008){
			res.sendRedirect("/shopping/shop/jpfile/classicid45.jsp ");  
  		}
if(b.getPid()==46001 || b.getPid()==46002 || b.getPid()==46003 || b.getPid()==46004 || b.getPid()==46005 || b.getPid()==46006 || b.getPid()==46007 || b.getPid()==46008){
			res.sendRedirect("/shopping/shop/jpfile/classicid46.jsp ");  
  		}
if(b.getPid()==47001 || b.getPid()==47002 || b.getPid()==47003 || b.getPid()==47004 || b.getPid()==47005 || b.getPid()==47006 || b.getPid()==47007 || b.getPid()==47008){
			res.sendRedirect("/shopping/shop/jpfile/classicid47.jsp ");  
  		}
if(b.getPid()==48001 || b.getPid()==48002 || b.getPid()==48003 || b.getPid()==48004 || b.getPid()==48005 || b.getPid()==48006 || b.getPid()==48007 || b.getPid()==48008){
			res.sendRedirect("/shopping/shop/jpfile/classicid48.jsp ");  
  		}
if(b.getPid()==49001 || b.getPid()==49002 || b.getPid()==49003 || b.getPid()==49004 || b.getPid()==49005 || b.getPid()==49006 || b.getPid()==49007 || b.getPid()==49008){
			res.sendRedirect("/shopping/shop/jpfile/classicid49.jsp ");  
  		}
if(b.getPid()==50001 || b.getPid()==42002 || b.getPid()==50003 || b.getPid()==50004 || b.getPid()==50005 || b.getPid()==50006 || b.getPid()==50007 || b.getPid()==50008){
			res.sendRedirect("/shopping/shop/jpfile/classicid50.jsp ");  
  		}
if(b.getPid()==51001 || b.getPid()==51002 || b.getPid()==51003 || b.getPid()==51004 || b.getPid()==51005 || b.getPid()==51006 || b.getPid()==51007 || b.getPid()==51008){
			res.sendRedirect("/shopping/shop/jpfile/classicid51.jsp ");  
  		}
if(b.getPid()==52001 || b.getPid()==52002 || b.getPid()==52003 || b.getPid()==52004 || b.getPid()==52005 || b.getPid()==52006 || b.getPid()==52007 || b.getPid()==52008){
			res.sendRedirect("/shopping/shop/jpfile/classicid52.jsp ");  
  		}
if(b.getPid()==53001 || b.getPid()==53002 || b.getPid()==53003 || b.getPid()==53004 || b.getPid()==53005 || b.getPid()==53006 || b.getPid()==53007 || b.getPid()==53008){
			res.sendRedirect("/shopping/shop/jpfile/classicid53.jsp ");  
  		}
if(b.getPid()==54001 || b.getPid()==54002 || b.getPid()==54003 || b.getPid()==54004 || b.getPid()==54005 || b.getPid()==54006 || b.getPid()==54007 || b.getPid()==54008){
			res.sendRedirect("/shopping/shop/jpfile/classicid54.jsp ");  
  		}

if(b.getPid()==55001 || b.getPid()==55002 || b.getPid()==55003 || b.getPid()==55004 || b.getPid()==55005 || b.getPid()==55006 || b.getPid()==55007 || b.getPid()==55008){
			res.sendRedirect("/shopping/shop/jpfile/classicid55.jsp ");  
  		}

if(b.getPid()==56001 || b.getPid()==56002 || b.getPid()==56003 || b.getPid()==56004 || b.getPid()==56005 || b.getPid()==56006 || b.getPid()==56007 || b.getPid()==56008){
			res.sendRedirect("/shopping/shop/jpfile/classicid56.jsp ");  
  		}

if(b.getPid()==57001 || b.getPid()==57002 || b.getPid()==57003 || b.getPid()==57004 || b.getPid()==57005 || b.getPid()==57006 || b.getPid()==57007 || b.getPid()==57008){
			res.sendRedirect("/shopping/shop/jpfile/classicid57.jsp ");  
  		}

if(b.getPid()==58001 || b.getPid()==58002 || b.getPid()==58003 || b.getPid()==58004 || b.getPid()==58005 || b.getPid()==58006 || b.getPid()==58007 || b.getPid()==58008){
			res.sendRedirect("/shopping/shop/jpfile/classicid58.jsp ");  
  		}

if(b.getPid()==59001 || b.getPid()==59002 || b.getPid()==59003 || b.getPid()==59004 || b.getPid()==59005 || b.getPid()==59006 || b.getPid()==59007 || b.getPid()==59008){
			res.sendRedirect("/shopping/shop/jpfile/classicid59.jsp ");  
  		}

if(b.getPid()==60001 || b.getPid()==60002 || b.getPid()==60003 || b.getPid()==60004 || b.getPid()==60005 || b.getPid()==60006 || b.getPid()==60007 || b.getPid()==60008){
			res.sendRedirect("/shopping/shop/jpfile/classicid60.jsp ");  
  		}
if(b.getPid()==61001 || b.getPid()==61002 || b.getPid()==61003 || b.getPid()==61004 || b.getPid()==61005 || b.getPid()==61006 || b.getPid()==61007 || b.getPid()==61008){
			res.sendRedirect("/shopping/shop/jpfile/classicid61.jsp ");  
  		}
if(b.getPid()==62001 || b.getPid()==62002 || b.getPid()==62003 || b.getPid()==62004 || b.getPid()==62005 || b.getPid()==62006 || b.getPid()==62007 || b.getPid()==62008){
			res.sendRedirect("/shopping/shop/jpfile/classicid62.jsp ");  
  		}
if(b.getPid()==63001 || b.getPid()==63002 || b.getPid()==63003 || b.getPid()==63004 || b.getPid()==63005 || b.getPid()==63006 || b.getPid()==63007 || b.getPid()==63008){
			res.sendRedirect("/shopping/shop/jpfile/classicid63.jsp ");  
  		}
if(b.getPid()==64001 || b.getPid()==64002 || b.getPid()==64003 || b.getPid()==64004 || b.getPid()==64005 || b.getPid()==64006 || b.getPid()==64007 || b.getPid()==64008){
			res.sendRedirect("/shopping/shop/jpfile/classicid64.jsp ");  
  		}
if(b.getPid()==65001 || b.getPid()==65002 || b.getPid()==65003 || b.getPid()==65004 || b.getPid()==65005 || b.getPid()==65006 || b.getPid()==65007 || b.getPid()==65008){
			res.sendRedirect("/shopping/shop/jpfile/classicid65.jsp ");  
  		}
if(b.getPid()==66001 || b.getPid()==66002 || b.getPid()==66003 || b.getPid()==66004 || b.getPid()==66005 || b.getPid()==66006 || b.getPid()==66007 || b.getPid()==66008){
			res.sendRedirect("/shopping/shop/jpfile/classicid66.jsp ");  
  		}
if(b.getPid()==67001 || b.getPid()==67002 || b.getPid()==67003 || b.getPid()==67004 || b.getPid()==67005 || b.getPid()==67006 || b.getPid()==67007 || b.getPid()==67008){
			res.sendRedirect("/shopping/shop/jpfile/classicid67.jsp ");  
  		}
if(b.getPid()==68001 || b.getPid()==68002 || b.getPid()==68003 || b.getPid()==68004 || b.getPid()==68005 || b.getPid()==68006 || b.getPid()==68007 || b.getPid()==68008){
			res.sendRedirect("/shopping/shop/jpfile/classicid68.jsp ");  
  		}
if(b.getPid()==69001 || b.getPid()==69002 || b.getPid()==69003 || b.getPid()==69004 || b.getPid()==69005 || b.getPid()==69006 || b.getPid()==69007 || b.getPid()==69008){
			res.sendRedirect("/shopping/shop/jpfile/classicid69.jsp ");  
  		}
if(b.getPid()==70001 || b.getPid()==70002 || b.getPid()==70003 || b.getPid()==70004 || b.getPid()==70005 || b.getPid()==70006 || b.getPid()==70007 || b.getPid()==70008){
			res.sendRedirect("/shopping/shop/jpfile/classicid70.jsp ");  
  		}


if(b.getPid()==71001 || b.getPid()==71002 || b.getPid()==71003 || b.getPid()==71004 || b.getPid()==71005 || b.getPid()==71006 || b.getPid()==71007 || b.getPid()==71008){
			res.sendRedirect("/shopping/shop/jpfile/classicid71.jsp ");  
  		}
if(b.getPid()==72001 || b.getPid()==72002 || b.getPid()==72003 || b.getPid()==72004 || b.getPid()==72005 || b.getPid()==72006 || b.getPid()==72007 || b.getPid()==72008){
			res.sendRedirect("/shopping/shop/jpfile/classicid72.jsp ");  
  		}
if(b.getPid()==73001 || b.getPid()==73002 || b.getPid()==73003 || b.getPid()==73004 || b.getPid()==73005 || b.getPid()==73006 || b.getPid()==73007 || b.getPid()==73008){
			res.sendRedirect("/shopping/shop/jpfile/classicid73.jsp ");  
  		}
if(b.getPid()==74001 || b.getPid()==74002 || b.getPid()==74003 || b.getPid()==74004 || b.getPid()==74005 || b.getPid()==74006 || b.getPid()==74007 || b.getPid()==74008){
			res.sendRedirect("/shopping/shop/jpfile/classicid74.jsp ");  
  		}
if(b.getPid()==75001 || b.getPid()==75002 || b.getPid()==75003 || b.getPid()==75004 || b.getPid()==75005 || b.getPid()==75006 || b.getPid()==75007 || b.getPid()==75008){
			res.sendRedirect("/shopping/shop/jpfile/classicid75.jsp ");  
  		}
if(b.getPid()==76001 || b.getPid()==76002 || b.getPid()==76003 || b.getPid()==76004 || b.getPid()==76005 || b.getPid()==76006 || b.getPid()==76007 || b.getPid()==76008){
			res.sendRedirect("/shopping/shop/jpfile/classicid76.jsp ");  
  		}
if(b.getPid()==77001 || b.getPid()==77002 || b.getPid()==77003 || b.getPid()==77004 || b.getPid()==77005 || b.getPid()==77006 || b.getPid()==77007 || b.getPid()==77008){
			res.sendRedirect("/shopping/shop/jpfile/classicid77.jsp ");  
  		}
if(b.getPid()==78001 || b.getPid()==78002 || b.getPid()==78003 || b.getPid()==78004 || b.getPid()==78005 || b.getPid()==78006 || b.getPid()==78007 || b.getPid()==78008){
			res.sendRedirect("/shopping/shop/jpfile/classicid78.jsp ");  
  		}
if(b.getPid()==79001 || b.getPid()==79002 || b.getPid()==79003 || b.getPid()==79004 || b.getPid()==79005 || b.getPid()==79006 || b.getPid()==79007 || b.getPid()==79008){
			res.sendRedirect("/shopping/shop/jpfile/classicid79.jsp ");  
  		}
if(b.getPid()==80001 || b.getPid()==80002 || b.getPid()==80003 || b.getPid()==80004 || b.getPid()==80005 || b.getPid()==80006 || b.getPid()==80007 || b.getPid()==80008){
			res.sendRedirect("/shopping/shop/jpfile/classicid80.jsp ");  
  		}



if(b.getPid()==81001 || b.getPid()==81002 || b.getPid()==81003 || b.getPid()==81004 || b.getPid()==81005 || b.getPid()==81006 || b.getPid()==81007 || b.getPid()==81008){
			res.sendRedirect("/shopping/shop/jpfile/classicid81.jsp ");  
  		}
if(b.getPid()==82001 || b.getPid()==82002 || b.getPid()==82003 || b.getPid()==82004 || b.getPid()==82005 || b.getPid()==82006 || b.getPid()==82007 || b.getPid()==82008){
			res.sendRedirect("/shopping/shop/jpfile/classicid82.jsp ");  
  		}
if(b.getPid()==83001 || b.getPid()==83002 || b.getPid()==83003 || b.getPid()==83004 || b.getPid()==83005 || b.getPid()==83006 || b.getPid()==83007 || b.getPid()==83008){
			res.sendRedirect("/shopping/shop/jpfile/classicid83.jsp ");  
  		}
if(b.getPid()==84001 || b.getPid()==84002 || b.getPid()==84003 || b.getPid()==84004 || b.getPid()==84005 || b.getPid()==84006 || b.getPid()==84007 || b.getPid()==84008){
			res.sendRedirect("/shopping/shop/jpfile/classicid84.jsp ");  
  		}
if(b.getPid()==85001 || b.getPid()==85002 || b.getPid()==85003 || b.getPid()==85004 || b.getPid()==85005 || b.getPid()==85006 || b.getPid()==85007 || b.getPid()==85008){
			res.sendRedirect("/shopping/shop/jpfile/classicid85.jsp ");  
  		}
if(b.getPid()==86001 || b.getPid()==86002 || b.getPid()==86003 || b.getPid()==86004 || b.getPid()==86005 || b.getPid()==86006 || b.getPid()==86007 || b.getPid()==86008){
			res.sendRedirect("/shopping/shop/jpfile/classicid86.jsp ");  
  		}
if(b.getPid()==87001 || b.getPid()==87002 || b.getPid()==87003 || b.getPid()==87004 || b.getPid()==87005 || b.getPid()==87006 || b.getPid()==87007 || b.getPid()==87008){
			res.sendRedirect("/shopping/shop/jpfile/classicid87.jsp ");  
  		}
if(b.getPid()==88001 || b.getPid()==88002 || b.getPid()==88003 || b.getPid()==88004 || b.getPid()==88005 || b.getPid()==88006 || b.getPid()==88007 || b.getPid()==88008){
			res.sendRedirect("/shopping/shop/jpfile/classicid88.jsp ");  
  		}
if(b.getPid()==89001 || b.getPid()==89002 || b.getPid()==89003 || b.getPid()==89004 || b.getPid()==89005 || b.getPid()==89006 || b.getPid()==89007 || b.getPid()==89008){
			res.sendRedirect("/shopping/shop/jpfile/classicid89.jsp ");  
  		}
if(b.getPid()==90001 || b.getPid()==90002 || b.getPid()==90003 || b.getPid()==90004 || b.getPid()==90005 || b.getPid()==90006 || b.getPid()==90007 || b.getPid()==90008){
			res.sendRedirect("/shopping/shop/jpfile/classicid90.jsp ");  
  		}

if(b.getPid()==91001 || b.getPid()==91002 || b.getPid()==91003 || b.getPid()==91004 || b.getPid()==91005 || b.getPid()==91006 || b.getPid()==91007 || b.getPid()==91008){
			res.sendRedirect("/shopping/shop/jpfile/classicid91.jsp ");  
  		}
if(b.getPid()==92001 || b.getPid()==92002 || b.getPid()==92003 || b.getPid()==92004 || b.getPid()==92005 || b.getPid()==92006 || b.getPid()==92007 || b.getPid()==92008){
			res.sendRedirect("/shopping/shop/jpfile/classicid92.jsp ");  
  		}
if(b.getPid()==93001 || b.getPid()==93002 || b.getPid()==93003 || b.getPid()==93004 || b.getPid()==93005 || b.getPid()==93006 || b.getPid()==93007 || b.getPid()==93008){
			res.sendRedirect("/shopping/shop/jpfile/classicid93.jsp ");  
  		}
if(b.getPid()==94001 || b.getPid()==94002 || b.getPid()==94003 || b.getPid()==94004 || b.getPid()==94005 || b.getPid()==94006 || b.getPid()==94007 || b.getPid()==94008){
			res.sendRedirect("/shopping/shop/jpfile/classicid94.jsp ");  
  		}
if(b.getPid()==95001 || b.getPid()==95002 || b.getPid()==95003 || b.getPid()==95004 || b.getPid()==95005 || b.getPid()==95006 || b.getPid()==95007 || b.getPid()==95008){
			res.sendRedirect("/shopping/shop/jpfile/classicid95.jsp ");  
  		}

















//..................................................................................................
 }

}
}