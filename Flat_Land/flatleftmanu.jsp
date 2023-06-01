<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style type="text/css">

.container {position: absolute;	left: 0;top: 50;right: -90px;bottom: 0;	padding-right: 15px;overflow-y: scroll;	}


.mainstyle{ padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,0);  
		background-image: url(''); font-size: 15px;color:blue; border: #feaaee solid 0px; }
.mainstyle:hover{ color: #77aa66;}


.contenttable{border-top-width: 0px; background-color: #042F01;}



/*Left box and its styles */

.leftbox{background-color: #eeffee; border: green solid 0px; border-right-width: 0px; }
.lefttitle{ font-size: 13px; color: 000000; background-image: url('/images/tab1.jpg');}

.topics { padding-left: 2px; border-bottom: grey solid 0px; color: white; background-color: #ffffff;}

.topics1 {  font-size: 14px;  text-decoration: none; color: #333333; 
		font-family: verdana,arial,times roman,serif; font-weight: 400; cursor: pointer;}

.topics1:hover { color: #333111; }
.topics2 {  font-size: 11px;  text-decoration: none; color: #696969;
		font-family: verdana,arial,serif;}
.topics2:hover { color: #444111; }
.topics3 {  font-size: 11px;  text-decoration: none; color: #965511;
		font-family: verdana,arial,serif;}
.topics3:hover { color: #236633; }
.utilstd{font-size: 12px; color: blue; background-color: #eeffee;}
.utilslink{color: #001100; font-size: 13px; text-decoration: none;}
.sublinks{margin-left: 15px; font-size: 13px; color:#aa300a; text-decoration:none; }
.sublinks:hover { font-size: 13px; color: #333111; }




/*Center box and its styles */

.mainbox{background-color: cyan; border-top: #042f01 solid 1px;}
.centerbox { color: #3D366F; font-family: Verdana, Arial, Times; font-size: 8pt; font-weight: 200;}
.scriptname{padding:5px; margin: 0px; font-size: 15px; color: #111660; 
		font-family: Verdana,arial,san-serif;}
.scripttags{padding-left:15px; color: #773563; font-weight: bold;}
.copybox{margin:5px; padding:5px; background-color: white; border: black 2px inset; 
	 color: green; font-size: 13px; height: 150px; width: 400px; overflow: auto;
	font-family: verdana, arial, san-serif;}
.copybox2{margin: 0px; padding: 5px; padding-left: 15px; padding-right: 15px; 
		font-family:  verdana, arial, san-serif; background-color: #fafffa; 
		border: #000000 2px inset; color: green; font-size: 14px; }
.copybox3{margin:2px; padding: 2px; padding-left: 6px;  background-color: white; border: black 1px inset; 
	 color: green; font-size: 12px; height: 160px; overflow: auto;
	font-family: verdana, arial, san-serif;}

.clinks{ font-size: 13px; color:#aa300a; text-decoration:none; }
.clinks:hover { font-size: 13px; color: #333111; }
.downlink { font-size: 12px; color: #3331c1; text-decoration:none;}


/*Right box and its styles */
.addcol{background-color: #eeffee;}
.addbox{background-color: #eeffee; border: green solid 0px; border-left-width: 1px;
	 font-size: 13px; color: #958383;}

.abouttablehead{padding-left: 5px; font-size: 12pt; color: #3D366F; font-family: Georgia, Times, serif;  
	background-image: url('../../images/tab1.jpg');}
.abouttabletext{background-color: #ffffff; font-size: 13px; border: #abe680 solid 1px; padding: 5px; color: #3D366F; 
	font-family: Verdana, Arial, Georgia, serif;}
.codetext{color:#af45aa; padding:4px; padding-left:36px;}

.colc{ font-family: san-serif; color: #9EFF36; }
.colc:hover{ font-family: san-serif; color: #456745; }
-->

.dnstab2{font-family: arial, verdana;  font-size:12px; border: 0px solid #006600; background-color: #f3f7f3; padding: 5px; }



</style>

</head>






















<script language="javascript">
var color1 = "lightgray";
var color2 = "lightgray";
var mouseocolor = "yellow";
var sitename = "";

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
	var ww =findPosY(x)+23;
	
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


<!------------------------------------>

<body>
<table>






<div >
<table style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="container">


<tr style="background-color: rgb(230, 245, 230);" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="mainstyle" href="/shopping/Flat&Land/software.jsp" target="/shopping/ourservice/displayarea.jsp">&nbsp;&nbsp;Mirpur Dhaka</a> &nbsp;&nbsp;</td>
</tr>
<tr style="background-color: rgb(230, 245, 230);" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="mainstyle" href="/shopping/Flat&Land/webpage.jsp" target="/shopping/ourservice/displayarea.jsp">&nbsp;&nbsp;Savar</a> &nbsp;&nbsp;</td>
</tr>


<tr style="background-color: rgb(230, 245, 230);" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td></td>
</tr>

<tr style="background-color: rgb(230, 245, 230);" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="mainstyle" href="/shopping/Flat&Land/building.jsp" target="/shopping/ourservice/displayarea.jsp">&nbsp;&nbsp;Jahangirnagar University</a> &nbsp;&nbsp;</td>
</tr>

<tr style="background-color: rgb(230, 245, 230);" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="mainstyle" href="/shopping/Flat&Land/mapmaking.jsp" target="/shopping/ourservice/displayarea.jsp">&nbsp;&nbsp;</a> &nbsp;&nbsp;</td>
</tr>


<tr style="background-color: rgb(230, 245, 230);" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td></td>
</tr>


<tr style="background-color: rgb(230, 245, 230);" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="mainstyle" href="/shopping/Flat&Land/surveying.jsp" target="/shopping/ourservice/displayarea.jsp">&nbsp;&nbsp;</a> &nbsp;&nbsp;</td>
</tr>
<tr style="background-color: rgb(230, 245, 230);" class="row1" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="mainstyle" href="/shopping/Flat&Land/cctv.jsp" target="/shopping/ourservice/displayarea.jsp">&nbsp;&nbsp;</a> &nbsp;&nbsp;</td>
</tr>

</tbody></table>
</div>






















</table>
</body>

</html>