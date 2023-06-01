

<%@ page import="java.sql.*" %>

<%@ page import="java.io.*" %>

<%@ page import="javax.servlet.*" %>

<%@ page import="javax.servlet.http.*" %>


<html>
<script>
function winopen(){
window.open("LINK LOCATION", "WINDOW NAME", "toolbar=yes,location=yes,directories=no,status=no, menubar=yes,scrollbars=yes,resizable=no,copyhistory=yes,width=200,height=260")
}
</script>


<br><br><br><br><br><br>
<body onLoad="winopen()">


<myprefix:MyMsg>
 
<form action=/shopping/servlet/insertcategory6 method=get>


 <%
String id3=request.getParameter("id3");
%>

 <%
String id=request.getParameter("id");
%>

 <%
String id2=request.getParameter("id2");
%>
<%



out.println("<input type=hidden name=id3 value="+id3+"> ");
out.println("<input type=hidden name=id2 value="+id2+"> ");
out.println("<input type=hidden name=id value="+id+"> ");

out.println("<html><body><table>");
out.println("<tr><td><h2>Insert</h2></td></tr>");



out.println("<tr><td>Quantity:</td>		<td><input type=text name=quantity size=10></td></tr>");
out.println("<tr><td>UnitPrice:</td>		<td><input type=text name=unitprice size=10></td></tr>");
out.println("<tr><td>Price</td>			<td><input type=text name=price size=10></td></tr>");

out.println("<tr><td>Product Country:</td>	<td><input type=text name=procountry size=10></td></tr>");
out.println("<tr><td>Product Region:</td>	<td><input type=text name=proregion size=10></td></tr>");

out.println("<tr><td>Product Type:</td>		<td><input type=text name=type size=10></td></tr>");
out.println("<tr><td>Product Date:</td>		<td><input type=text name=dat size=10></td></tr>");

out.println("<tr><td></td>			<td><input type=submit value=submit></td></tr>");


%>


</form>


<% out.println("<a href=/shopping/servlet/category30_39_table6?id="+id2+">back</a>  ");%>


  </myprefix:MyMsg>
</body>
</html>
