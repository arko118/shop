

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
 
<form action=/shopping/servlet/categoryid6_30change method=get>


 <%
String id1=request.getParameter("id1");
%>

 <%
String proname=request.getParameter("proname");
%>

 <%
String id2=request.getParameter("id2");
%>

 <%
String d2=request.getParameter("d2");
%>

<%
out.println("Id2: "+id2+" ");


out.println("<input type=hidden name=id1 value="+id1+"> ");
out.println("<input type=hidden name=d2 value="+d2+"> ");
out.println("<input type=hidden name=proname value="+proname+"> ");
out.println("<br>Change Id:<input type=text name=user size=10>");

%>

<input type=submit value=submit>
</form>

  </myprefix:MyMsg>
</body>
</html>
