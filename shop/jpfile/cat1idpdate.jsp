
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
   
<form action=/shopping/servlet/cat1updateid method=get>

 <%
String d=request.getParameter("id");
%>

 <%
String name=request.getParameter("name");
%>

 



 
<%

out.println("ProductId:    "+d+" ");


out.println("<input type=hidden name=d value="+d+"> ");
out.println("<input type=hidden name=name value="+name+"> ");

out.println("<br>Change product Id:<input type=text name=user size=10>");

%>

<input type=submit value=submit>
</form>

  </myprefix:MyMsg>
</body>
</html>
