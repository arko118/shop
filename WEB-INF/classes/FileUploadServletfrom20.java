//package com.journaldev.servlet;
  
import java.io.File;
import java.io.IOException;
  
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
  
@WebServlet("/FileUploadServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*10,    // 10 MB
                 maxFileSize=1024*1024*50,          // 50 MB
                 maxRequestSize=1024*1024*100)      // 100 MB
public class FileUploadServletfrom20 extends HttpServlet {


 private static final long serialVersionUID = 205242440643911308L;

 String a1="20001";  String j1="29001"; String s1="38001";  
 String a2="20002";  String j2="29002"; String s2="38002";  
 String a3="20003";  String j3="29003"; String s3="38003";  
 String a4="20004";  String j4="29004"; String s4="38004"; 
 String a5="20005";  String j5="29005"; String s5="38005";  
 String a6="20006";  String j6="29006"; String s6="38006";  
 String a7="20007";  String j7="29007"; String s7="38007";  
 String a8="20008";  String j8="29008"; String s8="38008";  
 String a9="20009";  String j9="29009"; String s9="38009";  
 
 
 String b1="21001";  String k1="30001"; String t1="39001"; 
 String b2="21002";  String k2="30002"; String t2="39002";  
 String b3="21003";  String k3="30003"; String t3="39003";  
 String b4="21004";  String k4="30004"; String t4="39004";  
 String b5="21005";  String k5="30005"; String t5="39005";  
 String b6="21006";  String k6="30006"; String t6="39006";  
 String b7="21007";  String k7="30007"; String t7="39007";  
 String b8="21008";  String k8="30008"; String t8="39008"; 
 String b9="21009";  String k9="30009"; String t9="39009";  
 
 String c1="22001";  String l1="31001"; String u1="40001";  
 String c2="22002";  String l2="31002"; String u2="40002";  
 String c3="22003";  String l3="31003"; String u3="40003";  
 String c4="22004";  String l4="31004"; String u4="40004"; 
 String c5="22005";  String l5="31005"; String u5="40005";  
 String c6="22006";  String l6="31006"; String u6="40006";  
 String c7="22007";  String l7="31007"; String u7="40007";  
 String c8="22008";  String l8="31008"; String u8="40008";  
 String c9="22009";  String l9="31009"; String u9="40009";  
 
 String d1="23001";  String m1="32001"; String v1="41001";  
 String d2="23002";  String m2="32002"; String v2="41002";  
 String d3="23003";  String m3="32003"; String v3="41003";  
 String d4="23004";  String m4="32004"; String v4="41004";  
 String d5="23005";  String m5="32005"; String v5="41005";  
 String d6="23006";  String m6="32006"; String v6="41006";  
 String d7="23007";  String m7="32007"; String v7="41007";  
 String d8="23008";  String m8="32008"; String v8="41008";  
 String d9="23009";  String m9="32009"; String v9="41009";  
 
 String e1="24001";  String n1="33001"; String w1="42001";  
 String e2="24002";  String n2="33002"; String w2="42002";  
 String e3="24003";  String n3="33003"; String w3="42003";  
 String e4="24004";  String n4="33004"; String w4="42004";  
 String e5="24005";  String n5="33005"; String w5="42005";  
 String e6="24006";  String n6="33006"; String w6="42006";  
 String e7="24007";  String n7="33007"; String w7="42007";  
 String e8="24008";  String n8="33008"; String w8="42008";  
 String e9="24009";  String n9="33009"; String w9="42009"; 
 
 String f1="25001";  String o1="34001"; String x1="43001";  
 String f2="25002";  String o2="34002"; String x2="43002"; 
 String f3="25003";  String o3="34003"; String x3="43003";  
 String f4="25004";  String o4="34004"; String x4="43004";  
 String f5="25005";  String o5="34005"; String x5="43005";  
 String f6="25006";  String o6="34006"; String x6="43006"; 
 String f7="25007";  String o7="34007"; String x7="43007";  
 String f8="25008";  String o8="34008"; String x8="43008"; 
 String f9="25009";  String o9="34009"; String x9="43009";  
 
 String g1="26001";  String p1="35001"; String y1="44001";  
 String g2="26002";  String p2="35002"; String y2="44002";  
 String g3="26003";  String p3="35003"; String y3="44003";  
 String g4="26004";  String p4="35004"; String y4="44004";  
 String g5="26005";  String p5="35005"; String y5="44005"; 
 String g6="26006";  String p6="35006"; String y6="44006";  
 String g7="26007";  String p7="35007"; String y7="44007";  
 String g8="26008";  String p8="35008"; String y8="44008";  
 String g9="26009";  String p9="35009"; String y9="44009";  
 
 String h1="27001";  String q1="36001"; String z1="45001";  
 String h2="27002";  String q2="36002"; String z2="45002";  
 String h3="27003";  String q3="36003"; String z3="45003";  
 String h4="27004";  String q4="36004"; String z4="45004";  
 String h5="27005";  String q5="36005"; String z5="45005";  
 String h6="27006";  String q6="36006"; String z6="45006";  
 String h7="27007";  String q7="36007"; String z7="45007";  
 String h8="27008";  String q8="36008"; String z8="45008";  
 String h9="27009";  String q9="36009"; String z9="45009";  
 
 String i1="28001";  String r1="37001"; String aa1="46001";  
 String i2="28002";  String r2="37002"; String aa2="46002";  
 String i3="28003";  String r3="37003"; String aa3="46003";  
 String i4="28004";  String r4="37004"; String aa4="46004"; 
 String i5="28005";  String r5="37005"; String aa5="46005";  
 String i6="28006";  String r6="37006"; String aa6="46006"; 
 String i7="28007";  String r7="37007"; String aa7="46007";  
 String i8="28008";  String r8="37008"; String aa8="46008"; 
 String i9="28009";  String r9="37009"; String aa9="46009"; 



 String bb1="47001"; String cc1="48001"; String dd1="49001"; String ee1="50001"; String ff1="51001"; String gg1="52001";
 String bb2="47002"; String cc2="48002"; String dd2="49002"; String ee2="50002"; String ff2="51002"; String gg2="52002";
 String bb3="47003"; String cc3="48003"; String dd3="49003"; String ee3="50003"; String ff3="51003"; String gg3="52003";
 String bb4="47004"; String cc4="48004"; String dd4="49004"; String ee4="50004"; String ff4="51004"; String gg4="52004";
 String bb5="47005"; String cc5="48005"; String dd5="49005"; String ee5="50005"; String ff5="51005"; String gg5="52005";
 String bb6="47006"; String cc6="48006"; String dd6="49006"; String ee6="50006"; String ff6="51006"; String gg6="52006";
 String bb7="47007"; String cc7="48007"; String dd7="49007"; String ee7="50007"; String ff7="51007"; String gg7="52007";
 String bb8="47008"; String cc8="48008"; String dd8="49008"; String ee8="50008"; String ff8="51008"; String gg8="52008";
 String bb9="47009"; String cc9="48009"; String dd9="49009"; String ee9="50009"; String ff9="51009"; String gg9="52009";
 
 String hh1="53001";  String jj1="54001";  String kk1="55001"; String ll1="56001"; String mm1="57001"; String nn1="58001"; String oo1="59001"; String pp1="60001";
 String hh2="53002";  String jj2="54002";  String kk2="55002"; String ll2="56002"; String mm2="57002"; String nn2="58002"; String oo2="59002"; String pp2="60002";
 String hh3="53003";  String jj3="54003";  String kk3="55003"; String ll3="56003"; String mm3="57003"; String nn3="58003"; String oo3="59003"; String pp3="60003";
 String hh4="53004";  String jj4="54004";  String kk4="55004"; String ll4="56004"; String mm4="57004"; String nn4="58004"; String oo4="59004"; String pp4="60004";
 String hh5="53005";  String jj5="54005";  String kk5="55005"; String ll5="56005"; String mm5="57005"; String nn5="58005"; String oo5="59005"; String pp5="60005";
 String hh6="53006";  String jj6="54006";  String kk6="55006"; String ll6="56006"; String mm6="57006"; String nn6="58006"; String oo6="59006"; String pp6="60006";
 String hh7="53007";  String jj7="54007";  String kk7="55007"; String ll7="56007"; String mm7="57007"; String nn7="58007"; String oo7="59007"; String pp7="60007";
 String hh8="53008";  String jj8="54008";  String kk8="55008"; String ll8="56008"; String mm8="57008"; String nn8="58008"; String oo8="59008"; String pp8="60008";
 String hh9="53009";  String jj9="54009";  String kk9="55009"; String ll9="56009"; String mm9="57009"; String nn9="58009"; String oo9="59009"; String pp9="60009";

 String qq1="61001";  String rr1="62001"; String ss1="63001";  String tt1="64001"; String uu1="65001"; String vv1="66001"; String ww1="67001"; String xx1="68001"; String yy1="69001"; String zz1="70001";
 String qq2="61002";  String rr2="62002"; String ss2="63002";  String tt2="64002"; String uu2="65002"; String vv2="66002"; String ww2="67002"; String xx2="68001"; String yy2="69002"; String zz2="70002";
 String qq3="61003";  String rr3="62003"; String ss3="63003";  String tt3="64003"; String uu3="65003"; String vv3="66003"; String ww3="67003"; String xx3="68001"; String yy3="69003"; String zz3="70003";
 String qq4="61004";  String rr4="62004"; String ss4="63004";  String tt4="64004"; String uu4="65004"; String vv4="66004"; String ww4="67004"; String xx4="68001"; String yy4="69004"; String zz4="70004";
 String qq5="61005";  String rr5="62005"; String ss5="63005";  String tt5="64005"; String uu5="65005"; String vv5="66005"; String ww5="67005"; String xx5="68001"; String yy5="69005"; String zz5="70005";
 String qq6="61006";  String rr6="62006"; String ss6="63006";  String tt6="64006"; String uu6="65006"; String vv6="66006"; String ww6="67006"; String xx6="68001"; String yy6="69006"; String zz6="70006";
 String qq7="61007";  String rr7="62007"; String ss7="63007";  String tt7="64007"; String uu7="65007"; String vv7="66007"; String ww7="67007"; String xx7="68001"; String yy7="69007"; String zz7="70007";
 String qq8="61008";  String rr8="62008"; String ss8="63008";  String tt8="64008"; String uu8="65008"; String vv8="66008"; String ww8="67008"; String xx8="68001"; String yy8="69008"; String zz8="70008";
 String qq9="61009";  String rr9="62009"; String ss9="63009";  String tt9="64009"; String uu9="65009"; String vv9="66009"; String ww9="67009"; String xx9="68001"; String yy9="69009"; String zz9="70009";

 String aaa1="71001";  String bbb1="72001"; String ccc1="73001";  String ddd1="74001"; String eee1="75001"; String fff1="76001"; String ggg1="77001"; String hhh1="78001"; String iii1="79001"; String jjj1="80001";
 String aaa2="71002";  String bbb2="72002"; String ccc2="73002";  String ddd2="74002"; String eee2="75002"; String fff2="76002"; String ggg2="77002"; String hhh2="78001"; String iii2="79002"; String jjj2="80002";
 String aaa3="71003";  String bbb3="72003"; String ccc3="73003";  String ddd3="74003"; String eee3="75003"; String fff3="76003"; String ggg3="77003"; String hhh3="78001"; String iii3="79003"; String jjj3="80003";
 String aaa4="71004";  String bbb4="72004"; String ccc4="73004";  String ddd4="74004"; String eee4="75004"; String fff4="76004"; String ggg4="77004"; String hhh4="78001"; String iii4="79004"; String jjj4="80004";
 String aaa5="71005";  String bbb5="72005"; String ccc5="73005";  String ddd5="74005"; String eee5="75005"; String fff5="76005"; String ggg5="77005"; String hhh5="78001"; String iii5="79005"; String jjj5="80005";
 String aaa6="71006";  String bbb6="72006"; String ccc6="73006";  String ddd6="74006"; String eee6="75006"; String fff6="76006"; String ggg6="77006"; String hhh6="78001"; String iii6="79006"; String jjj6="80006";
 String aaa7="71007";  String bbb7="72007"; String ccc7="73007";  String ddd7="74007"; String eee7="75007"; String fff7="76007"; String ggg7="77007"; String hhh7="78001"; String iii7="79007"; String jjj7="80007";
 String aaa8="71008";  String bbb8="72008"; String ccc8="73008";  String ddd8="74008"; String eee8="75008"; String fff8="76008"; String ggg8="77008"; String hhh8="78001"; String iii8="79008"; String jjj8="80008";
 String aaa9="71009";  String bbb9="72009"; String ccc9="73009";  String ddd9="74009"; String eee9="75009"; String fff9="76009"; String ggg9="77009"; String hhh9="78001"; String iii9="79009"; String jjj9="80009";

 String kkk1="81001";  String lll1="82001"; String mmm1="83001";  String nnn1="84001"; String ooo1="85001"; String ppp1="86001"; String qqq1="87001"; String rrr1="88001"; String sss1="89001"; String ttt1="90001";
 String kkk2="81002";  String lll2="82002"; String mmm2="83002";  String nnn2="84002"; String ooo2="85002"; String ppp2="86002"; String qqq2="87002"; String rrr2="88001"; String sss2="89002"; String ttt2="90002";
 String kkk3="81003";  String lll3="82003"; String mmm3="83003";  String nnn3="84003"; String ooo3="85003"; String ppp3="86003"; String qqq3="87003"; String rrr3="88001"; String sss3="89003"; String ttt3="90003";
 String kkk4="81004";  String lll4="82004"; String mmm4="83004";  String nnn4="84004"; String ooo4="85004"; String ppp4="86004"; String qqq4="87004"; String rrr4="88001"; String sss4="89004"; String ttt4="90004";
 String kkk5="81005";  String lll5="82005"; String mmm5="83005";  String nnn5="84005"; String ooo5="85005"; String ppp5="86005"; String qqq5="87005"; String rrr5="88001"; String sss5="89005"; String ttt5="90005";
 String kkk6="81006";  String lll6="82006"; String mmm6="83006";  String nnn6="84006"; String ooo6="85006"; String ppp6="86006"; String qqq6="87006"; String rrr6="88001"; String sss6="89006"; String ttt6="90006";
 String kkk7="81007";  String lll7="82007"; String mmm7="83007";  String nnn7="84007"; String ooo7="85007"; String ppp7="86007"; String qqq7="87007"; String rrr7="88001"; String sss7="89007"; String ttt7="90007";
 String kkk8="81008";  String lll8="82008"; String mmm8="83008";  String nnn8="84008"; String ooo8="85008"; String ppp8="86008"; String qqq8="87008"; String rrr8="88001"; String sss8="89008"; String ttt8="90008";
 String kkk9="81009";  String lll9="82009"; String mmm9="83009";  String nnn9="84009"; String ooo9="85009"; String ppp9="86009"; String qqq9="87009"; String rrr9="88001"; String sss9="89009"; String ttt9="90009";


 
//***************************************************************************************************************************************************************************************

 
 
 private static final String A1 = "/shop/IMAGE/20/20001";	private static final String J1 = "/shop/IMAGE/29/29001";  private static final String S1 = "/shop/IMAGE/38/38001"; 
 private static final String A2 = "/shop/IMAGE/20/20002";	private static final String J2 = "/shop/IMAGE/29/29002";  private static final String S2 = "/shop/IMAGE/38/38002";
 private static final String A3 = "/shop/IMAGE/20/20003";	private static final String J3 = "/shop/IMAGE/29/29003";  private static final String S3 = "/shop/IMAGE/38/38003";
 private static final String A4 = "/shop/IMAGE/20/20004";	private static final String J4 = "/shop/IMAGE/29/29004";  private static final String S4 = "/shop/IMAGE/38/38004";
 private static final String A5 = "/shop/IMAGE/20/20005";	private static final String J5 = "/shop/IMAGE/29/29005";  private static final String S5 = "/shop/IMAGE/38/38005";
 private static final String A6 = "/shop/IMAGE/20/20006";	private static final String J6 = "/shop/IMAGE/29/29006";  private static final String S6 = "/shop/IMAGE/38/38006";
 private static final String A7 = "/shop/IMAGE/20/20007";	private static final String J7 = "/shop/IMAGE/29/29007";  private static final String S7 = "/shop/IMAGE/38/38007";
 private static final String A8 = "/shop/IMAGE/20/20008";	private static final String J8 = "/shop/IMAGE/29/29008";  private static final String S8 = "/shop/IMAGE/38/38008";
 private static final String A9 = "/shop/IMAGE/20/20009";	private static final String J9 = "/shop/IMAGE/29/29009";  private static final String S9 = "/shop/IMAGE/38/38009";


 private static final String B1 = "/shop/IMAGE/21/21001";	private static final String K1 = "/shop/IMAGE/30/30001";  private static final String T1 = "/shop/IMAGE/39/39001"; 
 private static final String B2 = "/shop/IMAGE/21/21002";	private static final String K2 = "/shop/IMAGE/30/30002";  private static final String T2 = "/shop/IMAGE/39/39002";
 private static final String B3 = "/shop/IMAGE/21/21003";	private static final String K3 = "/shop/IMAGE/30/30003";  private static final String T3 = "/shop/IMAGE/39/39003";
 private static final String B4 = "/shop/IMAGE/21/21004";	private static final String K4 = "/shop/IMAGE/30/30004";  private static final String T4 = "/shop/IMAGE/39/39004";
 private static final String B5 = "/shop/IMAGE/21/21005";	private static final String K5 = "/shop/IMAGE/30/30005";  private static final String T5 = "/shop/IMAGE/39/39005";
 private static final String B6 = "/shop/IMAGE/21/21006";	private static final String K6 = "/shop/IMAGE/30/30006";  private static final String T6 = "/shop/IMAGE/39/39006";
 private static final String B7 = "/shop/IMAGE/21/21007";	private static final String K7 = "/shop/IMAGE/30/30007";  private static final String T7 = "/shop/IMAGE/39/39007";
 private static final String B8 = "/shop/IMAGE/21/21008";	private static final String K8 = "/shop/IMAGE/30/30008";  private static final String T8 = "/shop/IMAGE/39/39008";
 private static final String B9 = "/shop/IMAGE/21/21009";	private static final String K9 = "/shop/IMAGE/30/30009";  private static final String T9 = "/shop/IMAGE/39/39009";


 private static final String C1 = "/shop/IMAGE/22/22001";	private static final String L1 = "/shop/IMAGE/31/31001";  private static final String U1 = "/shop/IMAGE/40/40001"; 
 private static final String C2 = "/shop/IMAGE/22/22002";	private static final String L2 = "/shop/IMAGE/31/31002";  private static final String U2 = "/shop/IMAGE/40/40002";
 private static final String C3 = "/shop/IMAGE/22/22003";	private static final String L3 = "/shop/IMAGE/31/31003";  private static final String U3 = "/shop/IMAGE/40/40003";
 private static final String C4 = "/shop/IMAGE/22/22004";	private static final String L4 = "/shop/IMAGE/31/31004";  private static final String U4 = "/shop/IMAGE/40/40004";
 private static final String C5 = "/shop/IMAGE/22/22005";	private static final String L5 = "/shop/IMAGE/31/31005";  private static final String U5 = "/shop/IMAGE/40/40005";
 private static final String C6 = "/shop/IMAGE/22/22006";	private static final String L6 = "/shop/IMAGE/31/31006";  private static final String U6 = "/shop/IMAGE/40/40006";
 private static final String C7 = "/shop/IMAGE/22/22007";	private static final String L7 = "/shop/IMAGE/31/31007";  private static final String U7 = "/shop/IMAGE/40/40007";
 private static final String C8 = "/shop/IMAGE/22/22008";	private static final String L8 = "/shop/IMAGE/31/31008";  private static final String U8 = "/shop/IMAGE/40/40008";
 private static final String C9 = "/shop/IMAGE/22/22009";	private static final String L9 = "/shop/IMAGE/31/31009";  private static final String U9 = "/shop/IMAGE/40/40009";
 
 
 private static final String D1 = "/shop/IMAGE/23/23001";	private static final String M1 = "/shop/IMAGE/32/32001";  private static final String V1 = "/shop/IMAGE/41/41001"; 
 private static final String D2 = "/shop/IMAGE/23/23002";	private static final String M2 = "/shop/IMAGE/32/32002";  private static final String V2 = "/shop/IMAGE/41/41002";
 private static final String D3 = "/shop/IMAGE/23/23003";	private static final String M3 = "/shop/IMAGE/32/32003";  private static final String V3 = "/shop/IMAGE/41/41003";
 private static final String D4 = "/shop/IMAGE/23/23004";	private static final String M4 = "/shop/IMAGE/32/32004";  private static final String V4 = "/shop/IMAGE/41/41004";
 private static final String D5 = "/shop/IMAGE/23/23005";	private static final String M5 = "/shop/IMAGE/32/32005";  private static final String V5 = "/shop/IMAGE/41/41005";
 private static final String D6 = "/shop/IMAGE/23/23006";	private static final String M6 = "/shop/IMAGE/32/32006";  private static final String V6 = "/shop/IMAGE/41/41006";
 private static final String D7 = "/shop/IMAGE/23/23007";	private static final String M7 = "/shop/IMAGE/32/32007";  private static final String V7 = "/shop/IMAGE/41/41007";
 private static final String D8 = "/shop/IMAGE/23/23008";	private static final String M8 = "/shop/IMAGE/32/32008";  private static final String V8 = "/shop/IMAGE/41/41008";
 private static final String D9 = "/shop/IMAGE/23/23009";	private static final String M9 = "/shop/IMAGE/32/32009";  private static final String V9 = "/shop/IMAGE/41/41009";
 
 private static final String E1 = "/shop/IMAGE/24/24001";	private static final String N1 = "/shop/IMAGE/33/33001";  private static final String W1 = "/shop/IMAGE/42/42001"; 
 private static final String E2 = "/shop/IMAGE/24/24002";	private static final String N2 = "/shop/IMAGE/33/33002";  private static final String W2 = "/shop/IMAGE/42/42002";
 private static final String E3 = "/shop/IMAGE/24/24003";	private static final String N3 = "/shop/IMAGE/33/33003";  private static final String W3 = "/shop/IMAGE/42/42003";
 private static final String E4 = "/shop/IMAGE/24/24004";	private static final String N4 = "/shop/IMAGE/33/33004";  private static final String W4 = "/shop/IMAGE/42/42004";
 private static final String E5 = "/shop/IMAGE/24/24005";	private static final String N5 = "/shop/IMAGE/33/33005";  private static final String W5 = "/shop/IMAGE/42/42005";
 private static final String E6 = "/shop/IMAGE/24/24006";	private static final String N6 = "/shop/IMAGE/33/33006";  private static final String W6 = "/shop/IMAGE/42/42006";
 private static final String E7 = "/shop/IMAGE/24/24007";	private static final String N7 = "/shop/IMAGE/33/33007";  private static final String W7 = "/shop/IMAGE/42/42007";
 private static final String E8 = "/shop/IMAGE/24/24008";	private static final String N8 = "/shop/IMAGE/33/33008";  private static final String W8 = "/shop/IMAGE/42/42008";
 private static final String E9 = "/shop/IMAGE/24/24009";	private static final String N9 = "/shop/IMAGE/33/33009";  private static final String W9 = "/shop/IMAGE/42/42009";
 
 private static final String F1 = "/shop/IMAGE/25/25001";	private static final String O1 = "/shop/IMAGE/34/34001";  private static final String X1 = "/shop/IMAGE/43/43001"; 
 private static final String F2 = "/shop/IMAGE/25/25002";	private static final String O2 = "/shop/IMAGE/34/34002";  private static final String X2 = "/shop/IMAGE/43/43002";
 private static final String F3 = "/shop/IMAGE/25/25003";	private static final String O3 = "/shop/IMAGE/34/34003";  private static final String X3 = "/shop/IMAGE/43/43003";
 private static final String F4 = "/shop/IMAGE/25/25004";	private static final String O4 = "/shop/IMAGE/34/34004";  private static final String X4 = "/shop/IMAGE/43/43004";
 private static final String F5 = "/shop/IMAGE/25/25005";	private static final String O5 = "/shop/IMAGE/34/34005";  private static final String X5 = "/shop/IMAGE/43/43005";
 private static final String F6 = "/shop/IMAGE/25/25006";	private static final String O6 = "/shop/IMAGE/34/34006";  private static final String X6 = "/shop/IMAGE/43/43006";
 private static final String F7 = "/shop/IMAGE/25/25007";	private static final String O7 = "/shop/IMAGE/34/34007";  private static final String X7 = "/shop/IMAGE/43/43007";
 private static final String F8 = "/shop/IMAGE/25/25008";	private static final String O8 = "/shop/IMAGE/34/34008";  private static final String X8 = "/shop/IMAGE/43/43008";
 private static final String F9 = "/shop/IMAGE/25/25009";	private static final String O9 = "/shop/IMAGE/34/34009";  private static final String X9 = "/shop/IMAGE/43/43009";
 
 private static final String G1 = "/shop/IMAGE/26/26001";	private static final String P1 = "/shop/IMAGE/35/35001";  private static final String Y1 = "/shop/IMAGE/44/44001"; 
 private static final String G2 = "/shop/IMAGE/26/26002";	private static final String P2 = "/shop/IMAGE/35/35002";  private static final String Y2 = "/shop/IMAGE/44/44002";
 private static final String G3 = "/shop/IMAGE/26/26003";	private static final String P3 = "/shop/IMAGE/35/35003";  private static final String Y3 = "/shop/IMAGE/44/44003";
 private static final String G4 = "/shop/IMAGE/26/26004";	private static final String P4 = "/shop/IMAGE/35/35004";  private static final String Y4 = "/shop/IMAGE/44/44004";
 private static final String G5 = "/shop/IMAGE/26/26005";	private static final String P5 = "/shop/IMAGE/35/35005";  private static final String Y5 = "/shop/IMAGE/44/44005";
 private static final String G6 = "/shop/IMAGE/26/26006";	private static final String P6 = "/shop/IMAGE/35/35006";  private static final String Y6 = "/shop/IMAGE/44/44006";
 private static final String G7 = "/shop/IMAGE/26/26007";	private static final String P7 = "/shop/IMAGE/35/35007";  private static final String Y7 = "/shop/IMAGE/44/44007";
 private static final String G8 = "/shop/IMAGE/26/26008";	private static final String P8 = "/shop/IMAGE/35/35008";  private static final String Y8 = "/shop/IMAGE/44/44008";
 private static final String G9 = "/shop/IMAGE/26/26009";	private static final String P9 = "/shop/IMAGE/35/35009";  private static final String Y9 = "/shop/IMAGE/44/44009";
 
 private static final String H1 = "/shop/IMAGE/27/27001";	private static final String Q1 = "/shop/IMAGE/36/36001";  private static final String Z1 = "/shop/IMAGE/45/45001"; 
 private static final String H2 = "/shop/IMAGE/27/27002";	private static final String Q2 = "/shop/IMAGE/36/36002";  private static final String Z2 = "/shop/IMAGE/45/45002";
 private static final String H3 = "/shop/IMAGE/27/27003";	private static final String Q3 = "/shop/IMAGE/36/36003";  private static final String Z3 = "/shop/IMAGE/45/45003";
 private static final String H4 = "/shop/IMAGE/27/27004";	private static final String Q4 = "/shop/IMAGE/36/36004";  private static final String Z4 = "/shop/IMAGE/45/45004";
 private static final String H5 = "/shop/IMAGE/27/27005";	private static final String Q5 = "/shop/IMAGE/36/36005";  private static final String Z5 = "/shop/IMAGE/45/45005";
 private static final String H6 = "/shop/IMAGE/27/27006";	private static final String Q6 = "/shop/IMAGE/36/36006";  private static final String Z6 = "/shop/IMAGE/45/45006";
 private static final String H7 = "/shop/IMAGE/27/27007";	private static final String Q7 = "/shop/IMAGE/36/36007";  private static final String Z7 = "/shop/IMAGE/45/45007";
 private static final String H8 = "/shop/IMAGE/27/27008";	private static final String Q8 = "/shop/IMAGE/36/36008";  private static final String Z8 = "/shop/IMAGE/45/45008";
 private static final String H9 = "/shop/IMAGE/27/27009";	private static final String Q9 = "/shop/IMAGE/36/36009";  private static final String Z9 = "/shop/IMAGE/45/45009";
 
 private static final String I1 = "/shop/IMAGE/28/28001";	private static final String R1 = "/shop/IMAGE/37/37001";  private static final String  ZZ1= "/shop/IMAGE/46/46001"; 
 private static final String I2 = "/shop/IMAGE/28/28002";	private static final String R2 = "/shop/IMAGE/37/37002";  private static final String  ZZ2= "/shop/IMAGE/46/46002";
 private static final String I3 = "/shop/IMAGE/28/28003";	private static final String R3 = "/shop/IMAGE/37/37003";  private static final String  ZZ3= "/shop/IMAGE/46/46003";
 private static final String I4 = "/shop/IMAGE/28/28004";	private static final String R4 = "/shop/IMAGE/37/37004";  private static final String  ZZ4= "/shop/IMAGE/46/46004";
 private static final String I5 = "/shop/IMAGE/28/28005";	private static final String R5 = "/shop/IMAGE/37/37005";  private static final String  ZZ5= "/shop/IMAGE/46/46005";
 private static final String I6 = "/shop/IMAGE/28/28006";	private static final String R6 = "/shop/IMAGE/37/37006";  private static final String  ZZ6= "/shop/IMAGE/46/46006";
 private static final String I7 = "/shop/IMAGE/28/28007";	private static final String R7 = "/shop/IMAGE/37/37007";  private static final String  ZZ7= "/shop/IMAGE/46/46007";
 private static final String I8 = "/shop/IMAGE/28/28008";	private static final String R8 = "/shop/IMAGE/37/37008";  private static final String  ZZ8= "/shop/IMAGE/46/46008";
 private static final String I9 = "/shop/IMAGE/28/28009";	private static final String R9 = "/shop/IMAGE/37/37009";  private static final String  ZZ9= "/shop/IMAGE/46/46009";
 


    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

String id1=request.getParameter("id1"); 
String id2=request.getParameter("id2"); 
String id3=request.getParameter("id3"); 


if(id2.equals(a1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A1=""+id3+".jpg";part.write(uploadFilePath + File.separator + A1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(a2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A2=""+id3+".jpg";part.write(uploadFilePath + File.separator + A2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(a3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A3=""+id3+".jpg";part.write(uploadFilePath + File.separator + A3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(a4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A4=""+id3+".jpg";part.write(uploadFilePath + File.separator + A4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(a5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A5=""+id3+".jpg";part.write(uploadFilePath + File.separator + A5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(a6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A6=""+id3+".jpg";part.write(uploadFilePath + File.separator + A6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(a7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A7=""+id3+".jpg";part.write(uploadFilePath + File.separator + A7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(a8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A8=""+id3+".jpg";part.write(uploadFilePath + File.separator + A8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(a9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A9=""+id3+".jpg";part.write(uploadFilePath + File.separator + A9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//B...................................................B................................B...................................................


if(id2.equals(b1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B1=""+id3+".jpg";part.write(uploadFilePath + File.separator + B1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(b2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B2=""+id3+".jpg";part.write(uploadFilePath + File.separator + B2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(b3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B3=""+id3+".jpg";part.write(uploadFilePath + File.separator + B3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(b4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B4=""+id3+".jpg";part.write(uploadFilePath + File.separator + B4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(b5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B5=""+id3+".jpg";part.write(uploadFilePath + File.separator + B5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(b6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B6=""+id3+".jpg";part.write(uploadFilePath + File.separator + B6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(b7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B7=""+id3+".jpg";part.write(uploadFilePath + File.separator + B7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(b8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B8=""+id3+".jpg";part.write(uploadFilePath + File.separator + B8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(b9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B9=""+id3+".jpg";part.write(uploadFilePath + File.separator + B9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................c......................................c....................

if(id2.equals(c1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C1=""+id3+".jpg";part.write(uploadFilePath + File.separator + C1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(c2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C2=""+id3+".jpg";part.write(uploadFilePath + File.separator + C2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(c3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C3=""+id3+".jpg";part.write(uploadFilePath + File.separator + C3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(c4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C4=""+id3+".jpg";part.write(uploadFilePath + File.separator + C4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(c5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C5=""+id3+".jpg";part.write(uploadFilePath + File.separator + C5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(c6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C6=""+id3+".jpg";part.write(uploadFilePath + File.separator + C6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(c7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C7=""+id3+".jpg";part.write(uploadFilePath + File.separator + C7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(c8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C8=""+id3+".jpg";part.write(uploadFilePath + File.separator + C8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(c9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C9=""+id3+".jpg";part.write(uploadFilePath + File.separator + C9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................D......................................D....................



if(id2.equals(d1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D1=""+id3+".jpg";part.write(uploadFilePath + File.separator + D1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(d2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D2=""+id3+".jpg";part.write(uploadFilePath + File.separator + D2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(d3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D3=""+id3+".jpg";part.write(uploadFilePath + File.separator + D3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(d4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D4=""+id3+".jpg";part.write(uploadFilePath + File.separator + D4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(d5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D5=""+id3+".jpg";part.write(uploadFilePath + File.separator + D5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(d6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D6=""+id3+".jpg";part.write(uploadFilePath + File.separator + D6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(d7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D7=""+id3+".jpg";part.write(uploadFilePath + File.separator + D7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(d8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D8=""+id3+".jpg";part.write(uploadFilePath + File.separator + D8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(d9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D9=""+id3+".jpg";part.write(uploadFilePath + File.separator + D9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
//........................................................................E......................................E....................



if(id2.equals(e1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E1=""+id3+".jpg";part.write(uploadFilePath + File.separator + E1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(e2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E2=""+id3+".jpg";part.write(uploadFilePath + File.separator + E2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(e3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E3=""+id3+".jpg";part.write(uploadFilePath + File.separator + E3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(e4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E4=""+id3+".jpg";part.write(uploadFilePath + File.separator + E4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(e5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E5=""+id3+".jpg";part.write(uploadFilePath + File.separator + E5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(e6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E6=""+id3+".jpg";part.write(uploadFilePath + File.separator + E6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(e7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E7=""+id3+".jpg";part.write(uploadFilePath + File.separator + E7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(e8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E8=""+id3+".jpg";part.write(uploadFilePath + File.separator + E8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(e9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E9=""+id3+".jpg";part.write(uploadFilePath + File.separator + E9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................F......................................F....................


if(id2.equals(f1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F1=""+id3+".jpg";part.write(uploadFilePath + File.separator + F1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(f2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F2=""+id3+".jpg";part.write(uploadFilePath + File.separator + F2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(f3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F3=""+id3+".jpg";part.write(uploadFilePath + File.separator + F3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(f4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F4=""+id3+".jpg";part.write(uploadFilePath + File.separator + F4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(f5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F5=""+id3+".jpg";part.write(uploadFilePath + File.separator + F5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(f6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F6=""+id3+".jpg";part.write(uploadFilePath + File.separator + F6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(f7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F7=""+id3+".jpg";part.write(uploadFilePath + File.separator + F7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(f8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F8=""+id3+".jpg";part.write(uploadFilePath + File.separator + F8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(f9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F9=""+id3+".jpg";part.write(uploadFilePath + File.separator + F9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................G......................................G....................



if(id2.equals(g1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G1=""+id3+".jpg";part.write(uploadFilePath + File.separator + G1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(g2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G2=""+id3+".jpg";part.write(uploadFilePath + File.separator + G2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(g3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G3=""+id3+".jpg";part.write(uploadFilePath + File.separator + G3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(g4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G4=""+id3+".jpg";part.write(uploadFilePath + File.separator + G4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(g5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G5=""+id3+".jpg";part.write(uploadFilePath + File.separator + G5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(g6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G6=""+id3+".jpg";part.write(uploadFilePath + File.separator + G6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(g7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G7=""+id3+".jpg";part.write(uploadFilePath + File.separator + G7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(g8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G8=""+id3+".jpg";part.write(uploadFilePath + File.separator + G8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(g9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G9=""+id3+".jpg";part.write(uploadFilePath + File.separator + G9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


//........................................................................H......................................H....................


if(id2.equals(h1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H1=""+id3+".jpg";part.write(uploadFilePath + File.separator + H1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(h2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H2=""+id3+".jpg";part.write(uploadFilePath + File.separator + H2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(h3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H3=""+id3+".jpg";part.write(uploadFilePath + File.separator + H3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(h4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H4=""+id3+".jpg";part.write(uploadFilePath + File.separator + H4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(h5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H5=""+id3+".jpg";part.write(uploadFilePath + File.separator + H5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(h6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H6=""+id3+".jpg";part.write(uploadFilePath + File.separator + H6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(h7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H7=""+id3+".jpg";part.write(uploadFilePath + File.separator + H7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(h8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H8=""+id3+".jpg";part.write(uploadFilePath + File.separator + H8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(h9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H9=""+id3+".jpg";part.write(uploadFilePath + File.separator + H9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................I......................................I....................



if(id2.equals(i1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I1=""+id3+".jpg";part.write(uploadFilePath + File.separator + I1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(i2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I2=""+id3+".jpg";part.write(uploadFilePath + File.separator + I2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(i3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I3=""+id3+".jpg";part.write(uploadFilePath + File.separator + I3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(i4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I4=""+id3+".jpg";part.write(uploadFilePath + File.separator + I4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(i5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I5=""+id3+".jpg";part.write(uploadFilePath + File.separator + I5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(i6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I6=""+id3+".jpg";part.write(uploadFilePath + File.separator + I6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(i7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I7=""+id3+".jpg";part.write(uploadFilePath + File.separator + I7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(i8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I8=""+id3+".jpg";part.write(uploadFilePath + File.separator + I8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(i9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I9=""+id3+".jpg";part.write(uploadFilePath + File.separator + I9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................J......................................J....................



if(id2.equals(j1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J1=""+id3+".jpg";part.write(uploadFilePath + File.separator + J1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(j2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J2=""+id3+".jpg";part.write(uploadFilePath + File.separator + J2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(j3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J3=""+id3+".jpg";part.write(uploadFilePath + File.separator + J3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(j4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J4=""+id3+".jpg";part.write(uploadFilePath + File.separator + J4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(j5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J5=""+id3+".jpg";part.write(uploadFilePath + File.separator + J5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(j6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J6=""+id3+".jpg";part.write(uploadFilePath + File.separator + J6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(j7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J7=""+id3+".jpg";part.write(uploadFilePath + File.separator + J7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(j8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J8=""+id3+".jpg";part.write(uploadFilePath + File.separator + J8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(j9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + J9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String J9=""+id3+".jpg";part.write(uploadFilePath + File.separator + J9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................K......................................K....................



if(id2.equals(k1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K1=""+id3+".jpg";part.write(uploadFilePath + File.separator + K1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(k2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K2=""+id3+".jpg";part.write(uploadFilePath + File.separator + K2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(k3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K3=""+id3+".jpg";part.write(uploadFilePath + File.separator + K3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(k4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K4=""+id3+".jpg";part.write(uploadFilePath + File.separator + K4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(k5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K5=""+id3+".jpg";part.write(uploadFilePath + File.separator + K5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(k6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K6=""+id3+".jpg";part.write(uploadFilePath + File.separator + K6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(k7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K7=""+id3+".jpg";part.write(uploadFilePath + File.separator + K7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(k8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K8=""+id3+".jpg";part.write(uploadFilePath + File.separator + K8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(k9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String K9=""+id3+".jpg";part.write(uploadFilePath + File.separator + K9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................L......................................L....................



if(id2.equals(l1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + L1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L1=""+id3+".jpg";part.write(uploadFilePath + File.separator + L1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(l2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + L2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L2=""+id3+".jpg";part.write(uploadFilePath + File.separator + L2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(l3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + L3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L3=""+id3+".jpg";part.write(uploadFilePath + File.separator + L3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(l4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + L4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L4=""+id3+".jpg";part.write(uploadFilePath + File.separator + L4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(l5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + L5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L5=""+id3+".jpg";part.write(uploadFilePath + File.separator + L5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(l6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + L6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L6=""+id3+".jpg";part.write(uploadFilePath + File.separator + L6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(l7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + L7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L7=""+id3+".jpg";part.write(uploadFilePath + File.separator + L7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(l8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + L8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L8=""+id3+".jpg";part.write(uploadFilePath + File.separator + L8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(l9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + K9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String L9=""+id3+".jpg";part.write(uploadFilePath + File.separator + K9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................M......................................M....................



if(id2.equals(m1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M1=""+id3+".jpg";part.write(uploadFilePath + File.separator + M1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(m2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M2=""+id3+".jpg";part.write(uploadFilePath + File.separator + M2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(m3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M3=""+id3+".jpg";part.write(uploadFilePath + File.separator + M3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(m4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M4=""+id3+".jpg";part.write(uploadFilePath + File.separator + M4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(m5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M5=""+id3+".jpg";part.write(uploadFilePath + File.separator + M5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(m6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M6=""+id3+".jpg";part.write(uploadFilePath + File.separator + M6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(m7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M7=""+id3+".jpg";part.write(uploadFilePath + File.separator + M7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(m8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M8=""+id3+".jpg";part.write(uploadFilePath + File.separator + M8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(m9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + M9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String M9=""+id3+".jpg";part.write(uploadFilePath + File.separator + M9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................N......................................N....................



if(id2.equals(n1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N1=""+id3+".jpg";part.write(uploadFilePath + File.separator + N1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(n2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N2=""+id3+".jpg";part.write(uploadFilePath + File.separator + N2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(n3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N3=""+id3+".jpg";part.write(uploadFilePath + File.separator + N3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(n4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N4=""+id3+".jpg";part.write(uploadFilePath + File.separator + N4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(n5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N5=""+id3+".jpg";part.write(uploadFilePath + File.separator + N5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(n6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N6=""+id3+".jpg";part.write(uploadFilePath + File.separator + N6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(n7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N7=""+id3+".jpg";part.write(uploadFilePath + File.separator + N7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(n8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N8=""+id3+".jpg";part.write(uploadFilePath + File.separator + N8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(n9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + N9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String N9=""+id3+".jpg";part.write(uploadFilePath + File.separator + N9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................O......................................O....................



if(id2.equals(o1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O1=""+id3+".jpg";part.write(uploadFilePath + File.separator + O1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(o2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O2=""+id3+".jpg";part.write(uploadFilePath + File.separator + O2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(o3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O3=""+id3+".jpg";part.write(uploadFilePath + File.separator + O3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(o4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O4=""+id3+".jpg";part.write(uploadFilePath + File.separator + O4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(o5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O5=""+id3+".jpg";part.write(uploadFilePath + File.separator + O5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(o6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O6=""+id3+".jpg";part.write(uploadFilePath + File.separator + O6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(o7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O7=""+id3+".jpg";part.write(uploadFilePath + File.separator + O7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(o8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O8=""+id3+".jpg";part.write(uploadFilePath + File.separator + O8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(o9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + O9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String O9=""+id3+".jpg";part.write(uploadFilePath + File.separator + O9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................P......................................P....................



if(id2.equals(p1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P1=""+id3+".jpg";part.write(uploadFilePath + File.separator + P1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(p2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P2=""+id3+".jpg";part.write(uploadFilePath + File.separator + P2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(p3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P3=""+id3+".jpg";part.write(uploadFilePath + File.separator + P3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(p4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P4=""+id3+".jpg";part.write(uploadFilePath + File.separator + P4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(p5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P5=""+id3+".jpg";part.write(uploadFilePath + File.separator + P5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(p6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P6=""+id3+".jpg";part.write(uploadFilePath + File.separator + P6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(p7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P7=""+id3+".jpg";part.write(uploadFilePath + File.separator + P7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(p8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P8=""+id3+".jpg";part.write(uploadFilePath + File.separator + P8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(p9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + P9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String P9=""+id3+".jpg";part.write(uploadFilePath + File.separator + P9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
//........................................................................Q......................................Q....................



if(id2.equals(q1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q1=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(q2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q2=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(q3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q3=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(q4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q4=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(q5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q5=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(q6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q6=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(q7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q7=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(q8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q8=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(q9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Q9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Q9=""+id3+".jpg";part.write(uploadFilePath + File.separator + Q9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................R......................................R....................



if(id2.equals(r1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R1=""+id3+".jpg";part.write(uploadFilePath + File.separator + R1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(r2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R2=""+id3+".jpg";part.write(uploadFilePath + File.separator + R2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(r3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R3=""+id3+".jpg";part.write(uploadFilePath + File.separator + R3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(r4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R4=""+id3+".jpg";part.write(uploadFilePath + File.separator + R4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(r5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R5=""+id3+".jpg";part.write(uploadFilePath + File.separator + R5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(r6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R6=""+id3+".jpg";part.write(uploadFilePath + File.separator + R6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(r7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R7=""+id3+".jpg";part.write(uploadFilePath + File.separator + R7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(r8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R8=""+id3+".jpg";part.write(uploadFilePath + File.separator + R8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(r9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + R9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String R9=""+id3+".jpg";part.write(uploadFilePath + File.separator + R9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
//........................................................................S......................................S....................



if(id2.equals(s1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S1=""+id3+".jpg";part.write(uploadFilePath + File.separator + S1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(s2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S2=""+id3+".jpg";part.write(uploadFilePath + File.separator + S2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(s3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S3=""+id3+".jpg";part.write(uploadFilePath + File.separator + S3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(s4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S4=""+id3+".jpg";part.write(uploadFilePath + File.separator + S4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(s5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S5=""+id3+".jpg";part.write(uploadFilePath + File.separator + S5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(s6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S6=""+id3+".jpg";part.write(uploadFilePath + File.separator + S6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(s7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S7=""+id3+".jpg";part.write(uploadFilePath + File.separator + S7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(s8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S8=""+id3+".jpg";part.write(uploadFilePath + File.separator + S8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(s9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + S9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String S9=""+id3+".jpg";part.write(uploadFilePath + File.separator + S9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
//........................................................................T......................................T....................




if(id2.equals(t1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T1=""+id3+".jpg";part.write(uploadFilePath + File.separator + T1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(t2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T2=""+id3+".jpg";part.write(uploadFilePath + File.separator + T2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(t3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T3=""+id3+".jpg";part.write(uploadFilePath + File.separator + T3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(t4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T4=""+id3+".jpg";part.write(uploadFilePath + File.separator + T4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(t5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T5=""+id3+".jpg";part.write(uploadFilePath + File.separator + T5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(t6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T6=""+id3+".jpg";part.write(uploadFilePath + File.separator + T6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(t7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T7=""+id3+".jpg";part.write(uploadFilePath + File.separator + T7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(t8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T8=""+id3+".jpg";part.write(uploadFilePath + File.separator + T8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(t9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + T9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String T9=""+id3+".jpg";part.write(uploadFilePath + File.separator + T9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
//...............................................................U............................U...................................................................

if(id2.equals(u1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U1=""+id3+".jpg";part.write(uploadFilePath + File.separator + U1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(u2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U2=""+id3+".jpg";part.write(uploadFilePath + File.separator + U2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(u3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U3=""+id3+".jpg";part.write(uploadFilePath + File.separator + U3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(u4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U4=""+id3+".jpg";part.write(uploadFilePath + File.separator + U4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(u5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U5=""+id3+".jpg";part.write(uploadFilePath + File.separator + U5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(u6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U6=""+id3+".jpg";part.write(uploadFilePath + File.separator + U6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(u7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U7=""+id3+".jpg";part.write(uploadFilePath + File.separator + U7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(u8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U8=""+id3+".jpg";part.write(uploadFilePath + File.separator + U8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(u9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + U9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String U9=""+id3+".jpg";part.write(uploadFilePath + File.separator + U9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
//........................................................................V......................................V....................



if(id2.equals(v1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V1=""+id3+".jpg";part.write(uploadFilePath + File.separator + V1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(v2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V2=""+id3+".jpg";part.write(uploadFilePath + File.separator + V2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(v3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V3=""+id3+".jpg";part.write(uploadFilePath + File.separator + V3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(v4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V4=""+id3+".jpg";part.write(uploadFilePath + File.separator + V4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(v5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V5=""+id3+".jpg";part.write(uploadFilePath + File.separator + V5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(v6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V6=""+id3+".jpg";part.write(uploadFilePath + File.separator + V6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(v7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V7=""+id3+".jpg";part.write(uploadFilePath + File.separator + V7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(v8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V8=""+id3+".jpg";part.write(uploadFilePath + File.separator + V8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(v9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + V9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String V9=""+id3+".jpg";part.write(uploadFilePath + File.separator + K9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................W......................................W....................



if(id2.equals(w1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W1=""+id3+".jpg";part.write(uploadFilePath + File.separator + W1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(w2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W2=""+id3+".jpg";part.write(uploadFilePath + File.separator + W2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(w3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W3=""+id3+".jpg";part.write(uploadFilePath + File.separator + W3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(w4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W4=""+id3+".jpg";part.write(uploadFilePath + File.separator + W4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(w5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W5=""+id3+".jpg";part.write(uploadFilePath + File.separator + W5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(w6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W6=""+id3+".jpg";part.write(uploadFilePath + File.separator + W6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(w7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W7=""+id3+".jpg";part.write(uploadFilePath + File.separator + W7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(w8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W8=""+id3+".jpg";part.write(uploadFilePath + File.separator + W8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(w9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + W9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String W9=""+id3+".jpg";part.write(uploadFilePath + File.separator + W9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
//........................................................................X.....................................X...................



if(id2.equals(x1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X1=""+id3+".jpg";part.write(uploadFilePath + File.separator + X1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(x2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X2=""+id3+".jpg";part.write(uploadFilePath + File.separator + X2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(x3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X3=""+id3+".jpg";part.write(uploadFilePath + File.separator + X3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(x4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X4=""+id3+".jpg";part.write(uploadFilePath + File.separator + X4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(x5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X5=""+id3+".jpg";part.write(uploadFilePath + File.separator + X5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(x6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X6=""+id3+".jpg";part.write(uploadFilePath + File.separator + X6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(x7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X7=""+id3+".jpg";part.write(uploadFilePath + File.separator + X7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(x8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X8=""+id3+".jpg";part.write(uploadFilePath + File.separator + X8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(x9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + X9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String X9=""+id3+".jpg";part.write(uploadFilePath + File.separator + X9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
//........................................................................Y......................................Y....................



if(id2.equals(y1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y1=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(y2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y2=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(y3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y3=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(y4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y4=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(y5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y5=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(y6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y6=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(y7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y7=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(y8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y8=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(y9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Y9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Y9=""+id3+".jpg";part.write(uploadFilePath + File.separator + Y9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

//........................................................................Z......................................Z....................



if(id2.equals(z1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z1=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if


if(id2.equals(z2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z2=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(z3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z3=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(z4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z4=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(z5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z5=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(z6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z6=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if
if(id2.equals(z7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z7=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(z8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z8=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if

if(id2.equals(z9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + Z9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String Z9=""+id3+".jpg";part.write(uploadFilePath + File.separator + Z9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+"");
}//if




    }
  
    /**
     * Utility method to get file name from HTTP header content-disposition
     */
    private String getFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        System.out.println("content-disposition header= "+contentDisp);
        String[] tokens = contentDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length()-1);
            }
        }
        return "";
    }
}