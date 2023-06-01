
<%@ page import="java.sql.*" %>

<%@ page import="java.io.*" %>

<%@ page import="javax.servlet.*" %>

<%@ page import="javax.servlet.http.*" %>


<html>


 <%


String id=request.getParameter("id");
String id2=request.getParameter("id2");
String id3=request.getParameter("id3");

%>


 <%


out.println("<frameset cols=*,15%, border=0,scrolling=No >");
out.println("<frame src=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jpg name=/shopping/shop/IMAGE/"+id+"/"+id2+"/"+id3+".jpg scrolling=No>");
out.println("<frame src=/shopping/shop/jpfile/size.jsp?id="+id+"&id2="+id2+"&id3="+id3+" name=/shopping/shop/jpfile/size.jsp?id="+id+"&id2="+id2+"&id3="+id3+" scrolling=No>");
out.println(" </frameset>");

%>

</html>

