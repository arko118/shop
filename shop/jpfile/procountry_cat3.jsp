

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
 
<form action=/shopping/servlet/procountry_cat3 method=get>


 <%
String id3=request.getParameter("id3");
%>

 <%
String procountry=request.getParameter("procountry");
%>

 <%
String id2=request.getParameter("id2");
%>
<%
out.println("Product countery: "+procountry+" ");


out.println("<input type=hidden name=id3 value="+id3+"> ");
out.println("<input type=hidden name=id2 value="+id2+"> ");
out.println("<input type=hidden name=procountry value="+procountry+"> ");
out.println("Change:<input type=text name=user size=10>");

%>

<input type=submit value=submit>
</form>

  </myprefix:MyMsg>
</body>
</html>
