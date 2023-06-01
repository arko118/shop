

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
String id1=request.getParameter("id1");
%>

 <%
String id2=request.getParameter("id2");
%>

 <%
String id3=request.getParameter("id3");
%>



<% out.println("<a href=/shopping/servlet/category30_39_6?id="+id2+"><bold><font color=red>Back</font></bold></a>");%>



<br><br><br><br><br><br>
<body onLoad="winopen()">


<myprefix:MyMsg>
 




<form action="/shopping/servlet/FileUploadServlet" method="post" enctype="multipart/form-data">
<%
out.println("<input type=hidden name=id1 value="+id1+"> ");
%>

<%
out.println("<input type=hidden name=id2 value="+id2+"> ");
%>
<%
out.println("<input type=hidden name=id3 value="+id3+"> ");
%>
<%
out.println("<input type=file name=filename> ");
%>

<input type=submit value=submit>
</form>




  </myprefix:MyMsg>
</body>
</html>
