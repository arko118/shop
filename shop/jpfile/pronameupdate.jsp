

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

 <%
String id2=request.getParameter("id2");
%>
<%
String proname=request.getParameter("proname");
%>



<% out.println("<a href=/shopping/servlet/category30_39_3?id="+id2+"><bold><font color=red>Back</font></bold></a>");%>


<br><br><br><br><br><br>
<body onLoad="winopen()">




<%
out.println("<font color=blue>Product Name:</font><font color=red> "+proname+"</font> ");
%>

<%
String id3=request.getParameter("id");
%>


<myprefix:MyMsg>
   
<form action=/shopping/servlet/pronameupdateid3 method=get>

                                       
<%
out.println("<input type=hidden name=id3 value="+id3+"> ");                            
%>

<%
out.println("<input type=hidden name=id2 value="+id2+"> ");
%>

 <%
out.println("Change product Name:<input type=text name=proname size=10>");
%>


<input type=submit value=submit>
</form>

  </myprefix:MyMsg>
</body>
</html>
