
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class navigation extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();








public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();


out.println(" <style type=text/css>");

out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow; font-size: 17px;color: rgb(0,0,0); border: #feaaee solid 0px; } ");

out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; font-size: 20px;color: rgb(0,0,0); border: blue solid 2px; } ");
out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");











String d=req.getParameter("id");
int i=new Integer(d).intValue();


	




try{

	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
	Statement stmt=con.createStatement();

	

ResultSet rs=stmt.executeQuery("select * from category6 where id="+i+" ");
while(rs.next()){


	String id4=new Integer(rs.getInt("id3")).toString();
	int id3=new Integer(id4).intValue();


	String d2=new Integer(rs.getInt("id2")).toString();
	int id2=new Integer(d2).intValue();

	String id1=new Integer(rs.getInt("id")).toString();
	int id=new Integer(id1).intValue();

	String name=rs.getString("name");


	
if(i==1){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
	
if(i==11){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==12){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==13){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==14){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==15){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==16){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==17){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==18){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==19){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}



if(i==20){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==21){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==22){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==23){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==24){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==25){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==26){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==27){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==28){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==29){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==30){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==31){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==32){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==33){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==34){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==35){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==36){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==37){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==38){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==39){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==40){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}

if(i==41){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==42){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==43){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==44){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==45){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==46){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==47){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==48){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==49){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==50){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==51){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==52){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==53){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==54){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==55){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==56){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==57){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==58){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==59){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==60){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==61){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==62){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==63){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==64){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==65){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==66){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==67){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==68){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==69){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==70){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==71){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==72){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==73){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==74){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==75){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==76){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==77){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==78){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==79){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==80){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==81){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==82){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==83){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==84){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==85){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==86){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==87){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==88){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==89){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==90){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==91){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==92){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==93){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==94){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==95){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==96){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==97){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==98){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}
if(i==99){RequestDispatcher view = req.getRequestDispatcher("category30?id="+id2+"");view.forward(req, res); return;}



	


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





out.println(" <center>             <font size=6><font color=blue><br><br>Please Select your product</font></font></center>");





//..................................................................................................
}

}
}