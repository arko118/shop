
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class category2 extends HttpServlet{

Connection con;
Shoppingbean b=new Shoppingbean();


//........................................
private void EmptyBasket(HttpServletRequest req){
HttpSession session=req.getSession(true);
if(session !=null){
Vector basket=(Vector)session.getValue("customer");
if(basket !=null){

basket.removeAllElements();
	}
}


}
//..............................


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

	

	ResultSet rs=stmt.executeQuery("select * from category3 where id2="+di+" ");
 
	while(rs.next()){      


	String id4=new Integer(rs.getInt("id3")).toString();
	int id3=new Integer(id4).intValue();

	String id1=new Integer(rs.getInt("id2")).toString();
	int pd=new Integer(id1).intValue();

	String id=new Integer(rs.getInt("id")).toString();
	
	String name=rs.getString("name");
        String quantity=new Integer(rs.getInt("quantity")).toString();
	int quan=new Integer(quantity).intValue();
	String price=new Integer(rs.getInt("price")).toString();

	b.setMid(quan);
	b.setPid(pd);
	b.setAid(id3);
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



	if(b.getPid()==100 || b.getPid()==101 || b.getPid()==102 || b.getPid()==103 || b.getPid()==104 || b.getPid()==105 || b.getPid()==106 || b.getPid()==107 || b.getPid()==108 || b.getPid()==109 ){
		res.sendRedirect("/shopping/shop/jpfile/classicid1.jsp");   
      		}

	

	if(b.getPid()==1101 || b.getPid()==1102 || b.getPid()==1103 || b.getPid()==1104 || b.getPid()==1105 || b.getPid()==1106 || b.getPid()==1107 || b.getPid()==1108 || b.getPid()==1109 ){
		res.sendRedirect("/shopping/shop/jpfile/classicid11.jsp");   
      		}









//***************************************************************************************************
 }

}
}