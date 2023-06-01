

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
 
<form action="/shopping/servlet/DownloadServlet2" method="get" enctype="multipart/form-data">



 <%
String id1=request.getParameter("id1");
%>


 <%
String id2=request.getParameter("id2");
%>


 <%
String id3=request.getParameter("id3");
%>

<%


out.println("id1:<input type=text name=id1 size=10> ");

out.println("id2:<input type=text name=id2 size=10> ");

out.println("id3:<input type=text name=id3 size=10> ");











%>

<input type=submit value=submit>
</form>

  </myprefix:MyMsg>
</body>
</html>
