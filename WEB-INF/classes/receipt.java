import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import java. text.DecimalFormat;
import javax.servlet.*;
import javax.servlet.http.*;


public class receipt extends HttpServlet{

Connection con;
FileInputStream fileInputStream;
	Shoppingbean p= new Shoppingbean();

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


//res.setContentType("text/html"); 


res.setContentType(""application/pdf""); 
PrintWriter out=res.getWriter();


Vector v=new Vector(20);
Shoppingbean cus=new Shoppingbean();
Shoppingbean cus1=new Shoppingbean();
Shoppingbean t= new Shoppingbean();
Shoppingbean t1= new Shoppingbean();
Shoppingbean t2= new Shoppingbean();
Shoppingbean x= new Shoppingbean();
double totalprice=0.0;
double pp=0.0;
 
int item=0;
HttpSession sesson=req.getSession(true);
Vector s=(Vector)sesson.getValue("cusid");
if(s !=null){
item=s.size();
for(int k=0; k<item; k++){
Shoppingbean h=(Shoppingbean)s.elementAt(k);

	cus.setDat(h.getDat());
	cus.setUserName(h.getUserName());
	//}}


out.println("<html><body><center><table border=1 width=50% height=50% bgimage=src/shopping/image/temp.jpg><tr bgcolor=lightgray><td><center><table   ><tr><td><h6>"+cus.getDat()+"</h6><h2><center>Software Developed and Multiproduct Seals</center></h2></td></tr><tr><td><h2><center>Shoppingbd.com</center></h2></td></tr></table></center></td></tr><tr><Td>");

out.println("<h1><center>Your Calan</center> </h1>");
 
int items1=0;
HttpSession session1=req.getSession(true);
Vector px1=(Vector)session1.getValue("customer");
if(px1 !=null){
items1=px1.size();
for(int xx1=0; xx1<items1; xx1++){
Shoppingbean m1=(Shoppingbean)px1.elementAt(xx1);

	cus1.setTime(m1.getTime());
	cus1.setUserName(cus.getUserName());
	cus1.setName(m1.getName());
	cus1.setCountry(m1.getCountry());
	cus1.setDistrict(m1.getDistrict());
	cus1.setThana(m1.getThana());
	cus1.setPostoffice(m1.getPostoffice());
	cus1.setArea(m1.getArea());
	cus1.setHolding(m1.getHolding());
	cus1.setFloor(m1.getFloor());
	cus1.setMobail(m1.getMobail());
	cus1.setEmail(m1.getEmail());




}}


out.println("<center><table  width=80%>");

out.println("<tr  bgcolor=lightyellow><td >Customer Id</td> <td><font color=red>"+h.getUserName()+"   </font>   </td> </td>");

out.println("<tr><td  bgcolor=lightyellow>Customer Name</td> <td bgcolor=lightyellow>"+cus1.getName()+"     </td> <td></td>      <td  bgcolor=lightyellow>Country</td>     <td bgcolor=lightyellow>"+cus1.getCountry()+"</td>");
out.println("<tr><td  bgcolor=lightyellow>Holding</td>       <td bgcolor=lightyellow>"+cus1.getHolding()+"  </td> <td></td>      <td  bgcolor=lightyellow>District</td>    <td bgcolor=lightyellow>"+cus1.getDistrict()+"</td>");
out.println("<tr><td  bgcolor=lightyellow>Floor</td>         <td bgcolor=lightyellow>"+cus1.getFloor()+"   </td> <td></td>       <td  bgcolor=lightyellow>Thana</td>       <td bgcolor=lightyellow>"+cus1.getThana()+"</td>");
out.println("<tr><td  bgcolor=lightyellow>Area</td>          <td bgcolor=lightyellow>"+cus1.getArea()+"	   </td> <td></td>       <td  bgcolor=lightyellow>Post Office</td> <td bgcolor=lightyellow>"+cus1.getPostoffice()+"</td>");
out.println("<tr><td  bgcolor=lightyellow>Mobail</td>        <td bgcolor=lightyellow>"+cus1.getMobail()+"  </td> <td></td>       <td  bgcolor=lightyellow>Email</td>       <td bgcolor=lightyellow>"+cus1.getEmail()+"</td>");



out.println("</table></center>");

}}

//***********************************************************************up table************************************
out.println("<center><table  width=80% height=2% >");






out.println("<tr>");//body tr start

out.println("<tr bgcolor=green><td><font color=white>Product Name</font></td><td><font color=white>Product Id</font></td><td><font color=white>Unit Price</font></td><td><font color=white>Quantity</font></td><td><font color=white>Price</font></td></tr>");



 
int items=0;
HttpSession session=req.getSession(true);
Vector px=(Vector)session.getValue("customer");
if(px !=null){
items=px.size();
for(int xx=0; xx<items; xx++){
Shoppingbean m=(Shoppingbean)px.elementAt(xx);

	cus.setTime(m.getTime());
	cus.setUserName(m.getUserName());
	cus.setName(m.getName());
	cus.setCountry(m.getCountry());
	cus.setDistrict(m.getDistrict());
	cus.setThana(m.getThana());
	cus.setPostoffice(m.getPostoffice());
	cus.setArea(m.getArea());
	cus.setHolding(m.getHolding());
	cus.setFloor(m.getFloor());
	cus.setMobail(m.getMobail());
	cus.setEmail(m.getEmail());
	
	
	cus.setAid(m.getAid());
	cus.setBid(m.getBid());
	cus.setCid(m.getCid());
	cus.setProname(m.getProname());
	cus.setQuantity(m.getQuantity());

	
	cus.setEachprice(m.getEachprice());
	cus.setPrice(m.getPrice());
	cus.setTotal(m.getTotal());
	
	


out.println("<tr bgcolor=lightcyan>");

out.println("<td>"+cus.getProname()+"</td> <td >"+cus.getAid()+"</td> <td >"+cus.getEachprice()+"</td> <td>"+cus.getQuantity()+"</td> <td >"+cus.getPrice()+"</td>");

out.println("<tr bgcolor=lightgray></tr>");
	
}


}


out.println("<tr><td > </td><td > </td><td> </td><td ></td><td><font color=blue>=====</font></td></tr>");


out.println("<tr><td > </td><td > </td><td> </td><td  bgcolor=lightgray><font color=blue><b>Total:</b></font> </td><td><font color=red>"+cus.getTotal()+"</font></td></tr>");







out.println("</tr>");//End start



out.println("<tr>");

out.println("<td>");

out.println("<font color=red><h3>Note:<h3></font>");





out.println("</td>");





out.println("</tr>");




out.println("</table></td></tr></table></center></body></center></html>");

out.println("<iframe src=/shopping/servlet/receiptclear frameborder=0></iframe>");


}

}
	


