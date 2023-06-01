

<%@ page import="java.sql.*" %>

<%@ page import="java.io.*" %>

<%@ page import="javax.servlet.*" %>

<%@ page import="javax.servlet.http.*" %>

<% Connection con=null; %>















<html><style type="text/css">
.mainstyle{ padding: 4px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,2);  
		background-image: url(''); font-size: 10px;color:blue; border: #feaaee solid 0px; }
.mainstyle:hover{ color: #77aa66;}
.heading{color: black; font-size: 18px; font-weight: bolder; padding-left: 10px;}

.font{ padding: 4px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,2);  
		background-image: url(''); font-size: 10px;color:blue; border: #feaaee solid 0px; }
</style>


<script language="JavaScript">
function x(){
        window.open('1001.jpg', 'h.html', 'toolbar=yes,location=yes,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=yes,width=1200,height=1200')
         
}



function x1(){
        window.open('1001.jpg', 'h.html', 'toolbar=yes,location=yes,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=yes,width=1200,height=1200')
         
}


function x2(){
        window.open('1001.jpg', 'h.html', 'toolbar=yes,location=yes,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=yes,width=1200,height=1200')
         
}
</script>




<style>
		html, body {
			padding: 0;
			margin: 0;
		 	overflow: hidden;
		}
		#container {
			position: absolute;
			left: 0;
			top: 0;
			right: 0;
			bottom: 0;	
			padding-right: 0px;
			overflow-x: scrolling;
		}

</style>





<!bgcolor ="rgb(230, 245, 230);"          style="border-top: 0px solid green; border-bottom: 0px solid green; background-color: rgb(230, 245, 230);">
<center>


<body style="margin: 0px; font-family: Serif,Arial,Times,serif;" >
<div id="container">

<table  width="12%" align="center" background="" border="0">

<tr>
<td>

  <style>
.asd{text-decoration: none; cursor: pointer; font-family: arial, verdana, san-serif; font-size: 12px; color: red;}
.row1{background-color: black;}
.row2{background-color: black;}
</style>

<script language="javascript">
var color1 = "lightgray";
var color2 = "lightgray";
var mouseocolor = "yellow";
var sitename = "hscripts.com";

window.onerror = null;
var bName = navigator.appName;
var bVer = parseInt(navigator.appVersion);
var IE4 = (bName == "Microsoft Internet Explorer" && bVer >= 4);
var menuActive = 0;
var menuOn = 0;
var onLayer;
var timeOn = null;
var url = window.location;
var title = document.title;
var colnow = color1;

function bookmark(title,url){
	if(window.sidebar) 
          window.sidebar.addPanel(title,url,"");
	else if(window.opera && window.print){
          var elem = document.createElement('a');
          elem.setAttribute('href',url);
          elem.setAttribute('title',title);
          elem.setAttribute('rel','sidebar');
          elem.click();
	}
	else if(os == "ie")
          window.external.AddFavorite(url,title);
}

function showLayer(layerName,aa){
	var x =document.getElementById(aa);
	var tt =findPosX(x);
	var ww =findPosY(x)+10;
	
	//alert(tt+"---"+ww);

	if (timeOn != null) {
	clearTimeout(timeOn);
	hideLayer(onLayer);
	}
	if (IE4) {
	var layers = eval('document.all["'+layerName+'"].style');
	layers.left = tt;
	layers.top = ww;
	eval('document.all["'+layerName+'"].style.visibility="visible"');
	}
	else {
		if(document.getElementById){
		var elementRef = document.getElementById(layerName);
		if((elementRef.style)&& (elementRef.style.visibility!=null)){
		elementRef.style.visibility = 'visible';
		elementRef.style.left = tt;
		elementRef.style.top = ww;
		}
		}
	}
	onLayer = layerName
}

function hideLayer(layerName){
	if (menuActive == 0)
	{
		if (IE4){
		eval('document.all["'+layerName+'"].style.visibility="hidden"');
		}
		else{
			if(document.getElementById){
				var elementRef = document.getElementById(layerName);
				if((elementRef.style)&& (elementRef.style.visibility!=null)){
					elementRef.style.visibility = 'hidden';
				}
			}
		}
	}
}

function btnTimer() {
	timeOn = setTimeout("btnOut()",600)
}

function btnOut(layerName){
	if (menuActive == 0){
	hideLayer(onLayer)
	}
}

var item;
function menuOver(itemName){
	item=itemName;
	itemName.style.backgroundColor = mouseocolor; //background color change on mouse over
	clearTimeout(timeOn);
	menuActive = 1
}

function menuOut(itemName,iid){
	if(iid == 1)
		colnow = color1;
	else
		colnow = color2;

	if(item)
		itemName.style.backgroundColor = colnow;
	menuActive = 0
	timeOn = setTimeout("hideLayer(onLayer)", 100)
}

function findPosX(obj)
{
var curleft = 0;
if (obj.offsetParent)
{
while (obj.offsetParent)
{
curleft += obj.offsetLeft
obj = obj.offsetParent;
}
}
else if (obj.x)
curleft += obj.x;
return curleft;
}

function findPosY(obj)
{
var curtop = 0;
if (obj.offsetParent)
{
while (obj.offsetParent)
{
curtop += obj.offsetTop
obj = obj.offsetParent;
}
}
else if (obj.y)
curtop += obj.y;
return curtop;
}

</script>

<div id="Menu251" style="border: 0px solid rgb(230, 245, 2230); position: absolute; visibility: hidden; z-index: 1; left: 494px; top: 1px;">
<table style="border-collapse: collapse;" cellpadding="0" cellspacing="0">
<tbody>


<tr style="background-color: lightgray;" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="1">
<td align="left"><a class="font"  href="/shopping/shop/IMAGE/30-39/image/300011_1.jpg width=700 heigh=700" target="/shopping/shop/IMAGE/30-39/30/30001/300011/300011.html" class="mainstyle"><img  src=/shopping/shop/IMAGE/30-39/image/300011_1.jpg width=90 heigh=100></a> &nbsp;&nbsp;
</td>
</tr>

<tr style="background-color: lightgray;" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="1">
<td align="left"><a class="font"  href="/shopping/shop/IMAGE/30-39/image/300011_2.jpg " target="/shopping/shop/IMAGE/30-39/30/30001/300011/300011.html" class="mainstyle"><img  src=/shopping/shop/IMAGE/30-39/image/300011_2.jpg width=90 heigh=100></a> &nbsp;&nbsp;
</td>
</tr>
<tr style="background-color: lightgray;" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="1">
<td align="left"><a class="font"  href="/shopping/shop/IMAGE/30-39/image/300011_3.jpg " target="/shopping/shop/IMAGE/30-39/30/30001/300011/300011.html" class="mainstyle"><img  src=/shopping/shop/IMAGE/30-39/image/300011_3.jpg width=90 heigh=100></a> &nbsp;&nbsp;
</td>
</tr>




</tbody>
</table>
</div>


<table style="border-top: 0px solid green; border-bottom: 0px solid green; " width="80%" align="center" background="" border="0">
<tbody><tr valign="bottom" align="center">
<td valign="center" align="center">

 <%

String id=request.getParameter("id");
String id2=request.getParameter("id2");
String id3=request.getParameter("id3");
%>

<%
try{

Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","");
Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from category6 where id2="+id3" ");
}
%>



hello





</td></tr>



</tbody>
</table>




</div>



</body><center></html>



