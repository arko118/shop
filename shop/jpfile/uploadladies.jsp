

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

<a href=/shopping/servlet/category30_39?id=1><bold><font color=red>Back</font></bold></a>


<br><br><br><br><br><br>
<body onLoad="winopen()">







<myprefix:MyMsg>
 

 <%
String id=request.getParameter("id");
%>

 


 <%
out.println("<font color=blue>Upload Product Image</font>");
%>



<form action="/shopping/servlet/FileUploadServletladies" method="post" enctype="multipart/form-data">
<%

out.println("<input type=hidden name=id1 value="+id+"> ");
%>

<%
out.println("<input type=file name=filename> ");
%>

<input type=submit value=submit>
</form>




  </myprefix:MyMsg>
</body>
</html>
