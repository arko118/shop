

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

 <html><body><table>



<%
out.println("<form action=/shopping/servlet/record target=/shopping/servlet/window method=get>");
out.println("<tr><td><h2>Record details</h2></td></tr>");
out.println("<tr><td>YEAR:</td><td><input type=text name=year size=10></td></tr>");
out.println("<tr><td>MONTH:</td><td><input type=text name=month size=10></td></tr>");
out.println("<tr><td>Day:</td><td><input type=text name=day size=10></td></tr>");
out.println("<tr><td></td><td><input type=submit value=submit></td></tr>");
out.println("</form>");
%>
</table>
<table>


<%
out.println("<form action=/shopping/servlet/customerrecord target=/shopping/servlet/window method=get>");
out.println("<tr><td><h2>Query Customer</h2></td></tr>");
out.println("<tr><td>YEAR:</td><td><input type=text name=year size=10></td></tr>");
out.println("<tr><td>MONTH:</td><td><input type=text name=month size=10></td></tr>");
out.println("<tr><td>Day:</td><td><input type=text name=day size=10></td></tr>");
out.println("<tr><td>Customer Id:</td><td><input type=text name=cusid size=10></td></tr>");
out.println("<tr><td></td><td><input type=submit value=submit></td></tr>");
out.println("</form>");
%>



</table>



  </myprefix:MyMsg>
</body>
</html>
