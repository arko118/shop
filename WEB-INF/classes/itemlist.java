import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class itemlist extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();
//out.println("<html><body><font color=blue><b><h4><i>Item List</i></h4></b></font></body></html>");
out.println("<html><body><table><tr><td></td></tr>");

Shoppingbean b=new Shoppingbean();


String d=req.getParameter("id");
int i=new Integer(d).intValue();

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();


ResultSet rs=stmt.executeQuery("select * from category2 where id="+i+" ");
while(rs.next()){
	String d2=new Integer(rs.getInt("id2")).toString();
	int id2=new Integer(d2).intValue();
	String id1=new Integer(rs.getInt("id")).toString();
	int id=new Integer(id1).intValue();
	String name=rs.getString("name");
		
	
	
	if(i==1){
	if(id2==100 || id2==101 || id2==102 || id2==103 || id2==104 || id2==105 || id2==106 || id2==107 || id2==108 || id2==109){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
		}	
	}
	
	



	
	if(i==11){
	if(id2==1101 || id2==1102 || id2==1103 || id2==1104 || id2==1105 || id2==1106 || id2==1107 || id2==1108 || id2==1109 || id2==1110){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	
	if(i==12){
	if(id2==1201 || id2==1202 || id2==1203 || id2==1204 || id2==1205 || id2==1206 || id2==1207 || id2==1208 || id2==1209 || id2==1210){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	
	if(i==13){
	if(id2==1301 || id2==1302 || id2==1303 || id2==1304 || id2==1305 || id2==1306 || id2==1307 || id2==1308 || id2==1309){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>"); 	}	
	}
	
	if(i==14){
	if(id2==1401 || id2==1402 || id2==1403 || id2==1404 || id2==1405 || id2==1406 || id2==1407 || id2==1408 || id2==1409){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>"); 	}	
	}

	if(i==15){
	if(id2==1501 || id2==1502 || id2==1503 || id2==1504 || id2==1505 || id2==1506 || id2==1507 || id2==1508 || id2==1509){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>"); 	}	
	}
	if(i==16){
	if(id2==1601 || id2==1602 || id2==1603 || id2==1604 || id2==1605 || id2==1606 || id2==1607 || id2==1608 || id2==1609){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>"); 	}	
	}
	if(i==17){
	if(id2==1701 || id2==1702 || id2==1703 || id2==1704 || id2==1705 || id2==1706 || id2==1707 || id2==1708 || id2==1709){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>"); 	}	
	}
	if(i==18){
	if(id2==1801 || id2==1802 || id2==1803 || id2==1804 || id2==1805 || id2==1806 || id2==1807 || id2==1808 || id2==1809){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>"); 	}	
	}
	if(i==19){
	if(id2==1901 || id2==1902 || id2==1903 || id2==1904 || id2==1905 || id2==1906 || id2==1907 || id2==1908 || id2==1909){
	out.println("<tr><td ><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+i+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>"); 	}	
	}
//****************************************************************1-9****************************************************************************





	if(i==20){
	if(id2==20001 || id2==20002 || id2==20003 || id2==20004 || id2==20005 || id2==20006 || id2==20007 || id2==20008 || id2==20009){			
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	
	}
	
	if(i==21){
	if(id2==21001 || id2==21002 || id2==21003 || id2==21004 || id2==21005 || id2==21006 || id2==21007 || id2==21008 || id2==21009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	
	if(i==22){
	if(id2==22001 || id2==22002 || id2==22003 || id2==22004 || id2==22005 || id2==22006 || id2==22007 || id2==22008 || id2==22009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	
	if(i==23){
	if(id2==23001 || id2==23002 || id2==23003 || id2==23004 || id2==23005 || id2==23006 || id2==23007 || id2==23008 || id2==23009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	
	if(i==24){
	if(id2==24001 || id2==24002 || id2==24003 || id2==24004 || id2==24005 || id2==24006 || id2==24007 || id2==24008 || id2==24009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	if(i==25){
	if(id2==25001 || id2==25002 || id2==25003 || id2==25004 || id2==25005 || id2==25006 || id2==25007 || id2==25008 || id2==25009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	if(i==26){
	if(id2==26001 || id2==26002 || id2==26003 || id2==26004 || id2==26005 || id2==26006 || id2==26007 || id2==26008 || id2==26009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	if(i==27){
	if(id2==27001 || id2==27002 || id2==27003 || id2==27004 || id2==27005 || id2==27006 || id2==27007 || id2==27008 || id2==27009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	if(i==28){
	if(id2==28001 || id2==28002 || id2==28003 || id2==28004 || id2==28005 || id2==28006 || id2==28007 || id2==28008 || id2==28009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}
	if(i==29){
	if(id2==29001 || id2==29002 || id2==29003 || id2==29004 || id2==29005 || id2==29006 || id2==29007 || id2==29008 || id2==29009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");		}	
	}

//.................................................................................................................................................................

	if(i==30){
	if(id2==30001 || id2==30002 || id2==30003 || id2==30004 || id2==30005 || id2==30006 || id2==30007 || id2==30008 || id2==30009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==31){
	if(id2==31001 || id2==31002 || id2==31003 || id2==31004 || id2==31005 || id2==31006 || id2==31007 || id2==31008 || id2==31009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==32){
	if(id2==32001 || id2==32002 || id2==32003 || id2==32004 || id2==32005 || id2==32006 || id2==32007 || id2==32008 || id2==32009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	
	if(i==33){
	if(id2==33001 || id2==33002 || id2==33003 || id2==33004 || id2==33005 || id2==33006 || id2==33007 || id2==33008 || id2==33009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	
	if(i==34){
	if(id2==34001 || id2==34002 || id2==34003 || id2==34004 || id2==34005 || id2==34006 || id2==34007 || id2==34008 || id2==34009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==35){
	if(id2==35001 || id2==35002 || id2==35003 || id2==35004 || id2==35005 || id2==35006 || id2==35007 || id2==35008 || id2==35009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}



//.....................................................................36-55.....................................................................................

	if(i==36){
	if(id2==36001 || id2==36002 || id2==36003 || id2==36004 || id2==36005 || id2==36006 || id2==36007 || id2==36008 || id2==36009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==37){
	if(id2==37001 || id2==37002 || id2==37003 || id2==37004 || id2==37005 || id2==37006 || id2==37007 || id2==37008 || id2==37009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==38){
	if(id2==38001 || id2==38002 || id2==38003 || id2==38004 || id2==38005 || id2==38006 || id2==38007 || id2==38008 || id2==38009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==39){
	if(id2==39001 || id2==39002 || id2==39003 || id2==39004 || id2==39005 || id2==39006 || id2==39007 || id2==39008 || id2==39009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==40){
	if(id2==40001 || id2==40002 || id2==40003 || id2==40004 || id2==40005 || id2==40006 || id2==40007 || id2==40008 || id2==40009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==41){
	if(id2==41001 || id2==41002 || id2==41003 || id2==41004 || id2==41005 || id2==41006 || id2==41007 || id2==41008 || id2==41009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==42){
	if(id2==42001 || id2==42002 || id2==42003 || id2==42004 || id2==42005 || id2==42006 || id2==42007 || id2==42008 || id2==42009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	
	if(i==43){
	if(id2==43001 || id2==43002 || id2==43003 || id2==43004 || id2==43005 || id2==43006 || id2==43007 || id2==43008 || id2==43009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	
	if(i==44){
	if(id2==44001 || id2==44002 || id2==44003 || id2==44004 || id2==44005 || id2==44006 || id2==44007 || id2==44008 || id2==44009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==45){
	if(id2==45001 || id2==45002 || id2==45003 || id2==45004 || id2==45005 || id2==45006 || id2==45007 || id2==45008 || id2==45009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==46){
	if(id2==46001 || id2==46002 || id2==46003 || id2==46004 || id2==46005 || id2==46006 || id2==46007 || id2==46008 || id2==46009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==47){
	if(id2==47001 || id2==47002 || id2==47003 || id2==47004 || id2==47005 || id2==47006 || id2==47007 || id2==47008 || id2==47009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==48){
	if(id2==48001 || id2==48002 || id2==48003 || id2==48004 || id2==48005 || id2==48006 || id2==48007 || id2==48008 || id2==48009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==49){
	if(id2==49001 || id2==49002 || id2==49003 || id2==49004 || id2==49005 || id2==49006 || id2==49007 || id2==49008 || id2==49009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==50){
	if(id2==50001 || id2==50002 || id2==50003 || id2==50004 || id2==50005 || id2==50006 || id2==50007 || id2==50008 || id2==50009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==51){
	if(id2==51001 || id2==51002 || id2==51003 || id2==51004 || id2==51005 || id2==51006 || id2==51007 || id2==51008 || id2==51009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==52){
	if(id2==52001 || id2==52002 || id2==52003 || id2==52004 || id2==52005 || id2==52006 || id2==52007 || id2==52008 || id2==52009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==53){
	if(id2==53001 || id2==53002 || id2==53003 || id2==53004 || id2==53005 || id2==53006 || id2==53007 || id2==53008 || id2==53009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==54){
	if(id2==54001 || id2==54002 || id2==54003 || id2==54004 || id2==54005 || id2==54006 || id2==54007 || id2==54008 || id2==54009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==55){
	if(id2==55001 || id2==55002 || id2==55003 || id2==55004 || id2==55005 || id2==55006 || id2==55007 || id2==55008 || id2==55009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

//.....................................................................56-75.....................................................................................

	if(i==56){
	if(id2==56001 || id2==56002 || id2==56003 || id2==56004 || id2==56005 || id2==56006 || id2==56007 || id2==56008 || id2==56009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==57){
	if(id2==57001 || id2==57002 || id2==57003 || id2==57004 || id2==57005 || id2==57006 || id2==57007 || id2==57008 || id2==57009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==58){
	if(id2==58001 || id2==58002 || id2==58003 || id2==58004 || id2==58005 || id2==58006 || id2==58007 || id2==58008 || id2==58009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==59){
	if(id2==59001 || id2==59002 || id2==59003 || id2==59004 || id2==59005 || id2==59006 || id2==59007 || id2==59008 || id2==59009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==60){
	if(id2==60001 || id2==60002 || id2==60003 || id2==60004 || id2==60005 || id2==60006 || id2==60007 || id2==60008 || id2==60009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==61){
	if(id2==61001 || id2==61002 || id2==61003 || id2==61004 || id2==61005 || id2==61006 || id2==61007 || id2==61008 || id2==61009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==62){
	if(id2==62001 || id2==62002 || id2==62003 || id2==62004 || id2==62005 || id2==62006 || id2==62007 || id2==62008 || id2==62009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	
	if(i==63){
	if(id2==63001 || id2==63002 || id2==63003 || id2==63004 || id2==63005 || id2==63006 || id2==63007 || id2==63008 || id2==63009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	
	if(i==64){
	if(id2==64001 || id2==64002 || id2==64003 || id2==64004 || id2==64005 || id2==64006 || id2==64007 || id2==64008 || id2==64009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==65){
	if(id2==65001 || id2==65002 || id2==65003 || id2==65004 || id2==65005 || id2==65006 || id2==65007 || id2==65008 || id2==65009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==66){
	if(id2==66001 || id2==66002 || id2==66003 || id2==66004 || id2==66005 || id2==66006 || id2==66007 || id2==66008 || id2==66009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==67){
	if(id2==67001 || id2==67002 || id2==67003 || id2==67004 || id2==67005 || id2==67006 || id2==67007 || id2==67008 || id2==67009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==68){
	if(id2==68001 || id2==68002 || id2==68003 || id2==68004 || id2==68005 || id2==68006 || id2==68007 || id2==68008 || id2==68009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==69){
	if(id2==69001 || id2==69002 || id2==69003 || id2==69004 || id2==69005 || id2==69006 || id2==69007 || id2==69008 || id2==69009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==70){
	if(id2==70001 || id2==70002 || id2==70003 || id2==70004 || id2==70005 || id2==70006 || id2==70007 || id2==70008 || id2==70009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==71){
	if(id2==71001 || id2==71002 || id2==71003 || id2==71004 || id2==71005 || id2==71006 || id2==71007 || id2==71008 || id2==71009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==72){
	if(id2==72001 || id2==72002 || id2==72003 || id2==72004 || id2==72005 || id2==72006 || id2==72007 || id2==72008 || id2==72009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==73){
	if(id2==73001 || id2==73002 || id2==73003 || id2==73004 || id2==73005 || id2==73006 || id2==73007 || id2==73008 || id2==73009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==74){
	if(id2==74001 || id2==74002 || id2==74003 || id2==74004 || id2==74005 || id2==74006 || id2==74007 || id2==74008 || id2==74009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==75){
	if(id2==75001 || id2==75002 || id2==75003 || id2==75004 || id2==75005 || id2==75006 || id2==75007 || id2==75008 || id2==75009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	//.....................................................................76-95.....................................................................................

	if(i==76){
	if(id2==76001 || id2==76002 || id2==76003 || id2==76004 || id2==76005 || id2==76006 || id2==76007 || id2==76008 || id2==76009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==77){
	if(id2==77001 || id2==77002 || id2==77003 || id2==77004 || id2==77005 || id2==77006 || id2==77007 || id2==77008 || id2==77009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==78){
	if(id2==78001 || id2==78002 || id2==78003 || id2==78004 || id2==78005 || id2==78006 || id2==78007 || id2==78008 || id2==78009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==79){
	if(id2==79001 || id2==79002 || id2==79003 || id2==79004 || id2==79005 || id2==79006 || id2==79007 || id2==79008 || id2==79009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==80){
	if(id2==80001 || id2==80002 || id2==80003 || id2==80004 || id2==80005 || id2==80006 || id2==80007 || id2==80008 || id2==80009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==81){
	if(id2==81001 || id2==81002 || id2==81003 || id2==81004 || id2==81005 || id2==81006 || id2==81007 || id2==81008 || id2==81009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==82){
	if(id2==82001 || id2==82002 || id2==82003 || id2==82004 || id2==82005 || id2==82006 || id2==82007 || id2==82008 || id2==82009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	
	if(i==83){
	if(id2==83001 || id2==83002 || id2==83003 || id2==83004 || id2==83005 || id2==83006 || id2==83007 || id2==83008 || id2==83009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	
	if(i==84){
	if(id2==84001 || id2==84002 || id2==84003 || id2==84004 || id2==84005 || id2==84006 || id2==84007 || id2==84008 || id2==84009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==85){
	if(id2==85001 || id2==85002 || id2==85003 || id2==85004 || id2==85005 || id2==85006 || id2==85007 || id2==85008 || id2==85009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==86){
	if(id2==86001 || id2==86002 || id2==86003 || id2==86004 || id2==86005 || id2==86006 || id2==86007 || id2==86008 || id2==86009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==87){
	if(id2==87001 || id2==87002 || id2==87003 || id2==87004 || id2==87005 || id2==87006 || id2==87007 || id2==87008 || id2==87009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==88){
	if(id2==88001 || id2==88002 || id2==88003 || id2==88004 || id2==88005 || id2==88006 || id2==88007 || id2==88008 || id2==88009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==89){
	if(id2==89001 || id2==89002 || id2==89003 || id2==89004 || id2==89005 || id2==89006 || id2==89007 || id2==89008 || id2==89009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==90){
	if(id2==90001 || id2==90002 || id2==90003 || id2==90004 || id2==90005 || id2==90006 || id2==90007 || id2==90008 || id2==90009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}
	if(i==91){
	if(id2==91001 || id2==91002 || id2==91003 || id2==91004 || id2==91005 || id2==91006 || id2==91007 || id2==91008 || id2==91009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==92){
	if(id2==92001 || id2==92002 || id2==92003 || id2==92004 || id2==92005 || id2==92006 || id2==92007 || id2==92008 || id2==92009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==93){
	if(id2==93001 || id2==93002 || id2==93003 || id2==93004 || id2==93005 || id2==93006 || id2==93007 || id2==93008 || id2==93009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==94){
	if(id2==94001 || id2==94002 || id2==94003 || id2==94004 || id2==94005 || id2==94006 || id2==94007 || id2==94008 || id2==94009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
	}
	}

	if(i==95){
	if(id2==95001 || id2==95002 || id2==95003 || id2==95004 || id2==95005 || id2==95006 || id2==95007 || id2==95008 || id2==95009){
	out.println("<tr><td><a target=/shopping/servlet/navigation href=/shopping/servlet/category30?id=" +id2+ "><img src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id2+".jpg width=100 height=80 frameborder=0></a></td></tr>");
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
finally{try{if(con !=null)con.close();}
	   catch(SQLException ignored)
	{}
	}



out.println("</table><body><html>");





}
} 