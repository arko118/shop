

<%@ page import="java.sql.*" %>

<%@ page import="java.io.*" %>

<%@ page import="javax.servlet.*" %>

<%@ page import="javax.servlet.http.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled</title>
<script language="JavaScript" type="text/javascript">



var swidth=900

var sheight=400

var sspeed=3
//messages: change to your own; use as many as you'd like; set up Hyperlinks to URLs as you normally do: <a target=... href="... URL ...">..message..</a>

var singletext=new Array()
singletext[0]='<div align="center"><img src=/shopping/shop/jpfile/navigation.jpg width=400 height=200 frameborder=no></iframe></div>'

//singletext[1]='<div align="center">'
//singletext[2]='<div align="center">'
//singletext[3]='<div align="center">'

if (singletext.length>1)
i=1
else
i=0
function start(){
if (document.all){
ieslider1.style.top=sheight
iemarquee(ieslider1)
}
else if (document.layers){
document.ns4slider.document.ns4slider1.top=sheight
document.ns4slider.document.ns4slider1.visibility='show'
ns4marquee(document.ns4slider.document.ns4slider1)
}
else if (document.getElementById&&!document.all){
document.getElementById('ns6slider1').style.top=sheight
ns6marquee(document.getElementById('ns6slider1'))
}
}
function iemarquee(whichdiv){
iediv=eval(whichdiv)
if (iediv.style.pixelTop>0&&iediv.style.pixelTop<=sspeed){
iediv.style.pixelTop=0
setTimeout("iemarquee(iediv)",100)
}
if (iediv.style.pixelTop>=sheight*-1){
iediv.style.pixelTop-=sspeed
setTimeout("iemarquee(iediv)",100)
}
else{
iediv.style.pixelTop=sheight
iediv.innerHTML=singletext[i]
if (i==singletext.length-1)
i=0
else
i++
}
}
function ns4marquee(whichlayer){
ns4layer=eval(whichlayer)
if (ns4layer.top>0&&ns4layer.top<=sspeed){
ns4layer.top=0
setTimeout("ns4marquee(ns4layer)",100)
}
if (ns4layer.top>=sheight*-1){
ns4layer.top-=sspeed
setTimeout("ns4marquee(ns4layer)",100)
}
else{
ns4layer.top=sheight
ns4layer.document.write(singletext[i])
ns4layer.document.close()
if (i==singletext.length-1)
i=0
else
i++
}
}

function ns6marquee(whichdiv){
ns6div=eval(whichdiv)
if (parseInt(ns6div.style.top)>0&&parseInt(ns6div.style.top)<=sspeed){
ns6div.style.top=0
setTimeout("ns6marquee(ns6div)",100)
}
if (parseInt(ns6div.style.top)>=sheight*-1){
ns6div.style.top=parseInt(ns6div.style.top)-sspeed
setTimeout("ns6marquee(ns6div)",100)
}
else{
ns6div.style.top=sheight
ns6div.innerHTML=singletext[i]
if (i==singletext.length-1)
i=0
else
i++
}
}
//-->
</script>
</head>


<body onLoad="start()">
<div align="left">
<span style="borderWidth:5; borderColor:red; width:350; height:12; background:navy">
<ilayer id="ns4slider" width="&{swidth};" height="&{sheight};">
<layer id="ns4slider1" height="&{sheight};" onmouseover="sspeed=0;" onmouseout="sspeed=3">


</layer></ilayer>

<script language="JavaScript">
if (document.all){
document.writeln('<div style="position:relative;overflow:hidden;width:'+swidth+';height:'+sheight+';clip:rect(0 '+swidth+' '+sheight+' 0);border:0 solid red;" onmouseover="sspeed=0;" onmouseout="sspeed=2">')
document.writeln('<div id="ieslider1" style="position:relative;width:'+swidth+';">')
document.write(singletext[0])
document.writeln('</div></div>')
}
if(document.getElementById&&!document.all){
document.writeln('<div style="position:relative;overflow:hidden;width:'+swidth+';height:'+sheight+';clip:rect(0 '+swidth+' '+sheight+' 0);border:0px solid green;" onmouseover="sspeed=0;" onmouseout="sspeed=2">')
document.writeln('<div id="ns6slider1" style="position:relative;width:'+swidth+';">')
document.write(singletext[0])
document.writeln('</div></div>')
}

</script>
</span>
</div>
</body>


</html> 