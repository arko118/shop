
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
   
<form action=/shopping/servlet/cat1updatename method=get>

 <%
String id=request.getParameter("id");
%>

 <%
String name=request.getParameter("name");
%>

 
<%
out.println("Product Name: "+name+" ");


out.println("<input type=hidden name=id value="+id+"> ");

out.println("<br>Change product Name:<input type=text name=user size=10>");

%>

<input type=submit value=submit>
</form>

  </myprefix:MyMsg>
</body>
</html>
