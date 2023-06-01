

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
 

 <%
String id1=request.getParameter("id1");
%>

 <%
String id2=request.getParameter("id2");
%>

 <%
String id3=request.getParameter("id3");
%>





<form action="/shopping/servlet/FileUploadServlet_from_1_19_4" method="post" enctype="multipart/form-data">
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
