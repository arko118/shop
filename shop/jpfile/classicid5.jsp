

<%@ page import="java.sql.*" %>

<%@ page import="java.io.*" %>

<%@ page import="javax.servlet.*" %>

<%@ page import="javax.servlet.http.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<script language="JavaScript" type="text/javascript">



var swidth=100

var sheight=200

var sspeed=2

var s=new Array()

s[0]='<div align="center"><iframe src=/shopping/shop/jpfile/classic5.jsp width=1000 height=1000 frameborder=0 scrolling="No"></iframe></div>'


if (s.length>1)
i=1
else
i=0


function start(){
 if (document.getElementById&&!document.all){
document.getElementById('ns6slider1').style.bottom=sheight
ns6marquee(document.getElementById('ns6slider1'))
}
}





function marquee(whichdiv){

if (iediv.style.pixelbottom>=sheight*-1){
iediv.style.pixelbottom-=sspeed
setTimeout("marquee(iediv)",100)
}



}



function ns6marquee(whichdiv){

ns6div=eval(whichdiv)
if (parseInt(ns6div.style.bottom)>0&&parseInt(ns6div.style.bottom)<=sspeed)
{
ns6div.style.bottom=0
setTimeout("ns6marquee(ns6div)",100)
}


if (parseInt(ns6div.style.bottom)>=sheight*-1){
ns6div.style.bottom=parseInt(ns6div.style.bottom)-sspeed
setTimeout("ns6marquee(ns6div)",100)
}

else{
ns6div.style.bottom=sheight

}


}
//-->
</script>
</head>






<body onLoad="start()">

<div align="left">
<script language="JavaScript">


if(document.getElementById&&!document.all){
document.writeln('<div style="position:relative;" onmouseover="sspeed=0;" onmouseout="sspeed=2">')
document.writeln('<div id="ns6slider1" style="position:relative;width:'+swidth+';">')

document.write(s[0])


}

</script>

</div>





</body>


</html> 