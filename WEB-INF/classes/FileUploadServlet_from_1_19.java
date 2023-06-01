  
import java.io.File;
import java.io.IOException;
  
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
  
@WebServlet("/FileUploadServlet_from_1_19")
@MultipartConfig(fileSizeThreshold=1024*1024*10,    // 10 MB
                 maxFileSize=1024*1024*50,          // 50 MB
                 maxRequestSize=1024*1024*100)      // 100 MB
public class FileUploadServlet_from_1_19 extends HttpServlet {


 private static final long serialVersionUID = 205242440643911308L;

 String a1="1101";  //String j1="29001"; String s1="38001";  //String add4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String a2="1102";  //String j2="29002"; String s2="38002";  //String bd4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String a3="1103";  //String j3="29003"; String s3="38003";  //String cd4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String a4="1104";  //String j4="29004"; String s4="38004";  //String dd4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String a5="1105";  //String j5="29005"; String s5="38005";  //String ed4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String a6="1106";  //String j6="29006"; String s6="38006";  //String fd4="504";  String f5="505";  String f6="506";  String f7="507";  String f8="508";  String f9="509";
 String a7="1107";  //String j7="29007"; String s7="38007";  //String gd4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String a8="1108";  //String j8="29008"; String s8="38008";  //String hd4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String a9="1109";  //String j9="29009"; String s9="38009";  //String id4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
 String b1="1201";  //String k1="30001"; String t1="39001";  //String a23="103";String av4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String b2="1202";  //String k2="30002"; String t2="39002";  //String b23="203";String bv4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String b3="1203";  //String k3="30003"; String t3="39003";  //String c23="303";String cv4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String b4="1204";  //String k4="30004"; String t4="39004";  //String d23="403";String dv4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String b5="1205";  //String k5="30005"; String t5="39005";  //String e23="503";String ev4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String b6="1206";  //String k6="30006"; String t6="39006";  //String f23="503";String fv4="504";  String f5="505";  String f6="506";  String f7="507";  String f8="508";  String f9="509";
 String b7="1207";  //String k7="30007"; String t7="39007";  //String g23="103";String gv4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String b8="1208";  //String k8="30008"; String t8="39008";  //String h23="203";String hv4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String b9="1209";  //String k9="30009"; String t9="39009";  //String i23="303";String iv4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
 String c1="1301";  //String l1="31001"; String u1="40001";  //String a33="103";String a4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String c2="1302";  //String l2="31002"; String u2="40002";  //String b33="203";String b4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String c3="1303";  //String l3="31003"; String u3="40003";  //String c33="303";String c4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String c4="1304";  //String l4="31004"; String u4="40004";  //String d33="403";String d4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String c5="1305";  //String l5="31005"; String u5="40005";  //String e33="503";String e4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String c6="1306";  //String l6="31006"; String u6="40006";  //String f33="503";String f4="504";  String f5="505";  String f6="506";  String f7="507";  String f8="508";  String f9="509";
 String c7="1307";  //String l7="31007"; String u7="40007";  //String g33="103";String g4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String c8="1308";  //String l8="31008"; String u8="40008";  //String h33="203";String h4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String c9="1309";  //String l9="31009"; String u9="40009";  //String i33="303";String i4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
 String d1="1401";  //String m1="32001"; String v1="41001";  //String a43="103";String a4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String d2="1402";  //String m2="32002"; String v2="41002";  //String b43="203";String b4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String d3="1403";  //String m3="32003"; String v3="41003";  //String c43="303";String c4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String d4="1404";  //String m4="32004"; String v4="41004";  //String d43="403";String d4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String d5="1405";  //String m5="32005"; String v5="41005";  //String e43="503";String e4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String d6="1406";  //String m6="32006"; String v6="41006";  //String f43="503";String f4="504";  String f5="505";  String f6="506";  String f7="507";  String f8="508";  String f9="509";
 String d7="1407";  //String m7="32007"; String v7="41007";  //String g43="103";String g4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String d8="1408";  //String m8="32008"; String v8="41008";  //String h43="203";String h4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String d9="1409";  //String m9="32009"; String v9="41009";  //String i43="303";String i4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
 String e1="1501";  //String n1="33001"; String w1="42001";  //String a53="103";String a4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String e2="1502";  //String n2="33002"; String w2="42002";  //String b53="203";String b4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String e3="1503";  //String n3="33003"; String w3="42003";  //String c53="303";String c4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String e4="1504";  //String n4="33004"; String w4="42004";  //String d53="403";String d4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String e5="1505";  //String n5="33005"; String w5="42005";  //String e53="503";String e4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String e6="1506";  //String n6="33006"; String w6="42006";  //String f53="503";String f4="504";  String f5="505";  String f6="506";  String f7="507";  String f8="508";  String f9="509";
 String e7="1507";  //String n7="33007"; String w7="42007";  //String g53="103";String g4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String e8="1508";  //String n8="33008"; String w8="42008";  //String h53="203";String h4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String e9="1509";  //String n9="33009"; String w9="42009";  //String i53="303";String i4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
 String f1="1601";  //String o1="34001"; String x1="43001";  //String a63="103";String a4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String f2="1602";  //String o2="34002"; String x2="43002";  //String b63="203";String b4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String f3="1603";  //String o3="34003"; String x3="43003";  //String c63="303";String c4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String f4="1604";  //String o4="34004"; String x4="43004";  //String d63="403";String d4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String f5="1605";  //String o5="34005"; String x5="43005";  //String e63="503";String e4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String f6="1606";  //String o6="34006"; String x6="43006";  //String f63="503";String f4="504";  String f5="505";  String f6="506";  String f7="507";  String f8="508";  String f9="509";
 String f7="1607";  //String o7="34007"; String x7="43007";  //String g63="103";String g4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String f8="1608";  //String o8="34008"; String x8="43008";  //String h63="203";String h4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String f9="1609";  //String o9="34009"; String x9="43009";  //String i63="303";String i4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
 String g1="1701";  //String p1="35001"; String y1="44001";  //String a73="103";String a4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String g2="1702";  //String p2="35002"; String y2="44002";  //String b73="203";String b4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String g3="1703";  //String p3="35003"; String y3="44003";  //String c73="303";String c4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String g4="1704";  //String p4="35004"; String y4="44004";  //String d73="403";String d4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String g5="1705";  //String p5="35005"; String y5="44005";  //String e73="503";String e4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String g6="1706";  //String p6="35006"; String y6="44006";  //String f73="503";String f4="504";  String f5="505";  String f6="506";  String f7="507";  String f8="508";  String f9="509";
 String g7="1707";  //String p7="35007"; String y7="44007";  //String g73="103";String g4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String g8="1708";  //String p8="35008"; String y8="44008";  //String h73="203";String h4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String g9="1709";  //String p9="35009"; String y9="44009";  //String i73="303";String i4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
 String h1="1801";  //String q1="36001"; String z1="45001";  //String a83="103";String a4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String h2="1802";  //String q2="36002"; String z2="45002";  //String b83="203";String b4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String h3="1803";  //String q3="36003"; String z3="45003";  //String c83="303";String c4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String h4="1804";  //String q4="36004"; String z4="45004";  //String d83="403";String d4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String h5="1805";  //String q5="36005"; String z5="45005";  //String e83="503";String e4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String h6="1806";  //String q6="36006"; String z6="45006";  //String f83="503";String f4="504";  String f5="505";  String f6="506";  String f7="507";  String f8="508";  String f9="509";
 String h7="1807";  //String q7="36007"; String z7="45007";  //String g83="103";String g4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String h8="1808";  //String q8="36008"; String z8="45008";  //String h83="203";String h4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String h9="1809";  //String q9="36009"; String z9="45009";  //String i83="303";String i4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
 String i1="1901";  //String r1="37001"; String aa1="46001";  //String a93="103";String a4="104";  String a5="105";  String a6="106";  String a7="107";  String a8="108";  String a9="109";
 String i2="1902";  //String r2="37002"; String aa2="46002";  //String b93="203";String b4="204";  String b5="205";  String b6="206";  String b7="207";  String b8="208";  String b9="209";
 String i3="1903";  //String r3="37003"; String aa3="46003";  //String c93="303";String c4="304";  String c5="305";  String c6="306";  String c7="307";  String c8="308";  String c9="309";
 String i4="1904";  //String r4="37004"; String aa4="46004";  //String d93="403";String d4="404";  String d5="405";  String d6="406";  String d7="407";  String d8="408";  String d9="409";
 String i5="1905";  //String r5="37005"; String aa5="46005";  //String e93="503";String e4="504";  String e5="505";  String e6="506";  String e7="507";  String e8="508";  String e9="509";
 String i6="1906";  //String r6="37006"; String aa6="46006";
 String i7="1907";  //String r7="37007"; String aa7="46007";  //String g93="103";String g4="104";  String g5="105";  String g6="106";  String g7="107";  String g8="108";  String g9="109";
 String i8="1908";  //String r8="37008"; String aa8="46008";  //String h93="203";String h4="204";  String h5="205";  String h6="206";  String h7="207";  String h8="208";  String h9="209";
 String i9="1909";  //String r9="37009"; String aa9="46009";  //String i93="303";String i4="304";  String i5="305";  String i6="306";  String i7="307";  String i8="308";  String i9="309";
 
//***************************************************************************************************************************************************************************************

 
 
 private static final String A1 = "/shop/IMAGE/11/1101";	//private static final String J1 = "/shop/IMAGE/29/29001";  private static final String S1 = "/shop/IMAGE/38/38001"; 
 private static final String A2 = "/shop/IMAGE/11/1102";	//private static final String J2 = "/shop/IMAGE/29/29002";  private static final String S2 = "/shop/IMAGE/38/38002";
 private static final String A3 = "/shop/IMAGE/11/1103";	//private static final String J3 = "/shop/IMAGE/29/29003";  private static final String S3 = "/shop/IMAGE/38/38003";
 private static final String A4 = "/shop/IMAGE/11/1104";	//private static final String J4 = "/shop/IMAGE/29/29004";  private static final String S4 = "/shop/IMAGE/38/38004";
 private static final String A5 = "/shop/IMAGE/11/1105";	//private static final String J5 = "/shop/IMAGE/29/29005";  private static final String S5 = "/shop/IMAGE/38/38005";
 private static final String A6 = "/shop/IMAGE/11/1106";	//private static final String J6 = "/shop/IMAGE/29/29006";  private static final String S6 = "/shop/IMAGE/38/38006";
 private static final String A7 = "/shop/IMAGE/11/1107";	//private static final String J7 = "/shop/IMAGE/29/29007";  private static final String S7 = "/shop/IMAGE/38/38007";
 private static final String A8 = "/shop/IMAGE/11/1108";	//private static final String J8 = "/shop/IMAGE/29/29008";  private static final String S8 = "/shop/IMAGE/38/38008";
 private static final String A9 = "/shop/IMAGE/11/1109";	//private static final String J9 = "/shop/IMAGE/29/29009";  private static final String S9 = "/shop/IMAGE/38/38009";


 private static final String B1 = "/shop/IMAGE/12/1201";	//private static final String K1 = "/shop/IMAGE/30/30001";  private static final String T1 = "/shop/IMAGE/39/39001"; 
 private static final String B2 = "/shop/IMAGE/12/1202";	//private static final String K2 = "/shop/IMAGE/30/30002";  private static final String T2 = "/shop/IMAGE/39/39002";
 private static final String B3 = "/shop/IMAGE/12/1203";	//private static final String K3 = "/shop/IMAGE/30/30003";  private static final String T3 = "/shop/IMAGE/39/39003";
 private static final String B4 = "/shop/IMAGE/12/1204";	//private static final String K4 = "/shop/IMAGE/30/30004";  private static final String T4 = "/shop/IMAGE/39/39004";
 private static final String B5 = "/shop/IMAGE/12/1205";	//private static final String K5 = "/shop/IMAGE/30/30005";  private static final String T5 = "/shop/IMAGE/39/39005";
 private static final String B6 = "/shop/IMAGE/12/1206";	//private static final String K6 = "/shop/IMAGE/30/30006";  private static final String T6 = "/shop/IMAGE/39/39006";
 private static final String B7 = "/shop/IMAGE/12/1207";	//private static final String K7 = "/shop/IMAGE/30/30007";  private static final String T7 = "/shop/IMAGE/39/39007";
 private static final String B8 = "/shop/IMAGE/12/1208";	//private static final String K8 = "/shop/IMAGE/30/30008";  private static final String T8 = "/shop/IMAGE/39/39008";
 private static final String B9 = "/shop/IMAGE/12/1209";	//private static final String K9 = "/shop/IMAGE/30/30009";  private static final String T9 = "/shop/IMAGE/39/39009";


 private static final String C1 = "/shop/IMAGE/13/1301";	//private static final String L1 = "/shop/IMAGE/31/31001";  private static final String U1 = "/shop/IMAGE/40/40002"; 
 private static final String C2 = "/shop/IMAGE/13/1302";	//private static final String L2 = "/shop/IMAGE/31/31002";  private static final String U2 = "/shop/IMAGE/40/40003";
 private static final String C3 = "/shop/IMAGE/13/1303";	//private static final String L3 = "/shop/IMAGE/31/31003";  private static final String U3 = "/shop/IMAGE/40/40004";
 private static final String C4 = "/shop/IMAGE/13/1304";	//private static final String L4 = "/shop/IMAGE/31/31004";  private static final String U4 = "/shop/IMAGE/40/40005";
 private static final String C5 = "/shop/IMAGE/13/1305";	//private static final String L5 = "/shop/IMAGE/31/31005";  private static final String U5 = "/shop/IMAGE/40/40006";
 private static final String C6 = "/shop/IMAGE/13/1306";	//private static final String L6 = "/shop/IMAGE/31/31006";  private static final String U6 = "/shop/IMAGE/40/40007";
 private static final String C7 = "/shop/IMAGE/13/1307";	//private static final String L7 = "/shop/IMAGE/31/31007";  private static final String U7 = "/shop/IMAGE/40/40008";
 private static final String C8 = "/shop/IMAGE/13/1308";	//private static final String L8 = "/shop/IMAGE/31/31008";  private static final String U8 = "/shop/IMAGE/40/40009";
 private static final String C9 = "/shop/IMAGE/13/1309";	//private static final String L9 = "/shop/IMAGE/31/31009";  private static final String U9 = "/shop/IMAGE/40/40009";
 
 
 private static final String D1 = "/shop/IMAGE/14/1401";	//private static final String M1 = "/shop/IMAGE/32/32001";  private static final String V1 = "/shop/IMAGE/41/41001"; 
 private static final String D2 = "/shop/IMAGE/14/1402";	//private static final String M2 = "/shop/IMAGE/32/32002";  private static final String V2 = "/shop/IMAGE/41/41002";
 private static final String D3 = "/shop/IMAGE/14/1403";	//private static final String M3 = "/shop/IMAGE/32/32003";  private static final String V3 = "/shop/IMAGE/41/41003";
 private static final String D4 = "/shop/IMAGE/14/1404";	//private static final String M4 = "/shop/IMAGE/32/32004";  private static final String V4 = "/shop/IMAGE/41/41004";
 private static final String D5 = "/shop/IMAGE/14/1405";	//private static final String M5 = "/shop/IMAGE/32/32005";  private static final String V5 = "/shop/IMAGE/41/41005";
 private static final String D6 = "/shop/IMAGE/14/1406";	//private static final String M6 = "/shop/IMAGE/32/32006";  private static final String V6 = "/shop/IMAGE/41/41006";
 private static final String D7 = "/shop/IMAGE/14/1407";	//private static final String M7 = "/shop/IMAGE/32/32007";  private static final String V7 = "/shop/IMAGE/41/41007";
 private static final String D8 = "/shop/IMAGE/14/1408";	//private static final String M8 = "/shop/IMAGE/32/32008";  private static final String V8 = "/shop/IMAGE/41/41008";
 private static final String D9 = "/shop/IMAGE/14/1409";	//private static final String M9 = "/shop/IMAGE/32/32009";  private static final String V9 = "/shop/IMAGE/41/41009";
 
 private static final String E1 = "/shop/IMAGE/15/1501";	//private static final String N1 = "/shop/IMAGE/33/33001";  private static final String W1 = "/shop/IMAGE/42/42001"; 
 private static final String E2 = "/shop/IMAGE/15/1502";	//private static final String N2 = "/shop/IMAGE/33/33002";  private static final String W2 = "/shop/IMAGE/42/42002";
 private static final String E3 = "/shop/IMAGE/15/1503";	//private static final String N3 = "/shop/IMAGE/33/33003";  private static final String W3 = "/shop/IMAGE/42/42003";
 private static final String E4 = "/shop/IMAGE/15/1504";	//private static final String N4 = "/shop/IMAGE/33/33004";  private static final String W4 = "/shop/IMAGE/42/42004";
 private static final String E5 = "/shop/IMAGE/15/1505";	//private static final String N5 = "/shop/IMAGE/33/33005";  private static final String W5 = "/shop/IMAGE/42/42005";
 private static final String E6 = "/shop/IMAGE/15/1506";	//private static final String N6 = "/shop/IMAGE/33/33006";  private static final String W6 = "/shop/IMAGE/42/42006";
 private static final String E7 = "/shop/IMAGE/15/1507";	//private static final String N7 = "/shop/IMAGE/33/33007";  private static final String W7 = "/shop/IMAGE/42/42007";
 private static final String E8 = "/shop/IMAGE/15/1508";	//private static final String N8 = "/shop/IMAGE/33/33008";  private static final String W8 = "/shop/IMAGE/42/42008";
 private static final String E9 = "/shop/IMAGE/15/1509";	//private static final String N9 = "/shop/IMAGE/33/33009";  private static final String W9 = "/shop/IMAGE/42/42009";
 
 private static final String F1 = "/shop/IMAGE/16/1601";	//private static final String O1 = "/shop/IMAGE/34/34001";  private static final String X1 = "/shop/IMAGE/43/43001"; 
 private static final String F2 = "/shop/IMAGE/16/1602";	//private static final String O2 = "/shop/IMAGE/34/34002";  private static final String X2 = "/shop/IMAGE/43/43002";
 private static final String F3 = "/shop/IMAGE/16/1603";	//private static final String O3 = "/shop/IMAGE/34/34003";  private static final String X3 = "/shop/IMAGE/43/43003";
 private static final String F4 = "/shop/IMAGE/16/1604";	//private static final String O4 = "/shop/IMAGE/34/34004";  private static final String X4 = "/shop/IMAGE/43/43004";
 private static final String F5 = "/shop/IMAGE/16/1605";	//private static final String O5 = "/shop/IMAGE/34/34005";  private static final String X5 = "/shop/IMAGE/43/43005";
 private static final String F6 = "/shop/IMAGE/16/1606";	//private static final String O6 = "/shop/IMAGE/34/34006";  private static final String X6 = "/shop/IMAGE/43/43006";
 private static final String F7 = "/shop/IMAGE/16/1607";	//private static final String O7 = "/shop/IMAGE/34/34007";  private static final String X7 = "/shop/IMAGE/43/43007";
 private static final String F8 = "/shop/IMAGE/16/1608";	//private static final String O8 = "/shop/IMAGE/34/34008";  private static final String X8 = "/shop/IMAGE/43/43008";
 private static final String F9 = "/shop/IMAGE/16/1609";	//private static final String O9 = "/shop/IMAGE/34/34009";  private static final String X9 = "/shop/IMAGE/43/43009";
 
 private static final String G1 = "/shop/IMAGE/17/1701";	//private static final String P1 = "/shop/IMAGE/35/35001";  private static final String Y1 = "/shop/IMAGE/44/44001"; 
 private static final String G2 = "/shop/IMAGE/17/1702";	//private static final String P2 = "/shop/IMAGE/35/35002";  private static final String Y2 = "/shop/IMAGE/44/44002";
 private static final String G3 = "/shop/IMAGE/17/1703";	//private static final String P3 = "/shop/IMAGE/35/35003";  private static final String Y3 = "/shop/IMAGE/44/44003";
 private static final String G4 = "/shop/IMAGE/17/1704";	//private static final String P4 = "/shop/IMAGE/35/35004";  private static final String Y4 = "/shop/IMAGE/44/44004";
 private static final String G5 = "/shop/IMAGE/17/1705";	//private static final String P5 = "/shop/IMAGE/35/35005";  private static final String Y5 = "/shop/IMAGE/44/44005";
 private static final String G6 = "/shop/IMAGE/17/1706";	//private static final String P6 = "/shop/IMAGE/35/35006";  private static final String Y6 = "/shop/IMAGE/44/44006";
 private static final String G7 = "/shop/IMAGE/17/1707";	//private static final String P7 = "/shop/IMAGE/35/35007";  private static final String Y7 = "/shop/IMAGE/44/44007";
 private static final String G8 = "/shop/IMAGE/17/1708";	//private static final String P8 = "/shop/IMAGE/35/35008";  private static final String Y8 = "/shop/IMAGE/44/44008";
 private static final String G9 = "/shop/IMAGE/17/1709";	//private static final String P9 = "/shop/IMAGE/35/35009";  private static final String Y9 = "/shop/IMAGE/44/44009";
 
 private static final String H1 = "/shop/IMAGE/18/1801";	//private static final String Q1 = "/shop/IMAGE/36/36001";  private static final String Z1 = "/shop/IMAGE/45/45001"; 
 private static final String H2 = "/shop/IMAGE/18/1802";	//private static final String Q2 = "/shop/IMAGE/36/36002";  private static final String Z2 = "/shop/IMAGE/45/45002";
 private static final String H3 = "/shop/IMAGE/18/1803";	//private static final String Q3 = "/shop/IMAGE/36/36003";  private static final String Z3 = "/shop/IMAGE/45/45003";
 private static final String H4 = "/shop/IMAGE/18/1804";	//private static final String Q4 = "/shop/IMAGE/36/36004";  private static final String Z4 = "/shop/IMAGE/45/45004";
 private static final String H5 = "/shop/IMAGE/18/1805";	//private static final String Q5 = "/shop/IMAGE/36/36005";  private static final String Z5 = "/shop/IMAGE/45/45005";
 private static final String H6 = "/shop/IMAGE/18/1806";	//private static final String Q6 = "/shop/IMAGE/36/36006";  private static final String Z6 = "/shop/IMAGE/45/45006";
 private static final String H7 = "/shop/IMAGE/18/1807";	//private static final String Q7 = "/shop/IMAGE/36/36007";  private static final String Z7 = "/shop/IMAGE/45/45007";
 private static final String H8 = "/shop/IMAGE/18/1808";	//private static final String Q8 = "/shop/IMAGE/36/36008";  private static final String Z8 = "/shop/IMAGE/45/45008";
 private static final String H9 = "/shop/IMAGE/18/1809";	//private static final String Q9 = "/shop/IMAGE/36/36009";  private static final String Z9 = "/shop/IMAGE/45/45009";
 
 private static final String I1 = "/shop/IMAGE/19/1901";	//private static final String R1 = "/shop/IMAGE/37/37001";  private static final String  AA1= "/shop/IMAGE/46/46001"; 
 private static final String I2 = "/shop/IMAGE/19/1902";	//private static final String R2 = "/shop/IMAGE/37/37002";  private static final String  AA2= "/shop/IMAGE/46/46002";
 private static final String I3 = "/shop/IMAGE/19/1903";	//private static final String R3 = "/shop/IMAGE/37/37003";  private static final String  AA3= "/shop/IMAGE/46/46003";
 private static final String I4 = "/shop/IMAGE/19/1904";	//private static final String R4 = "/shop/IMAGE/37/37004";  private static final String  AA4= "/shop/IMAGE/46/46004";
 private static final String I5 = "/shop/IMAGE/19/1905";	//private static final String R5 = "/shop/IMAGE/37/37005";  private static final String  AA5= "/shop/IMAGE/46/46005";
 private static final String I6 = "/shop/IMAGE/19/1906";	//private static final String R6 = "/shop/IMAGE/37/37006";  private static final String  AA6= "/shop/IMAGE/46/46006";
 private static final String I7 = "/shop/IMAGE/19/1907";	//private static final String R7 = "/shop/IMAGE/37/37007";  private static final String  AA7= "/shop/IMAGE/46/46007";
 private static final String I8 = "/shop/IMAGE/19/1908";	//private static final String R8 = "/shop/IMAGE/37/37008";  private static final String  AA8= "/shop/IMAGE/46/46008";
 private static final String I9 = "/shop/IMAGE/19/1909";	//private static final String R9 = "/shop/IMAGE/37/37009";  private static final String  AA9= "/shop/IMAGE/46/46009";
 


    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

String id1=request.getParameter("id1"); 
String id2=request.getParameter("id2"); 
String id3=request.getParameter("id3"); 


if(id2.equals(a1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A1=""+id3+".jpg";part.write(uploadFilePath + File.separator + A1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(a2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A2=""+id3+".jpg";part.write(uploadFilePath + File.separator + A2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(a3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A3=""+id3+".jpg";part.write(uploadFilePath + File.separator + A3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(a4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A4=""+id3+".jpg";part.write(uploadFilePath + File.separator + A4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(a5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A5=""+id3+".jpg";part.write(uploadFilePath + File.separator + A5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(a6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A6=""+id3+".jpg";part.write(uploadFilePath + File.separator + A6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(a7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A7=""+id3+".jpg";part.write(uploadFilePath + File.separator + A7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(a8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A8=""+id3+".jpg";part.write(uploadFilePath + File.separator + A8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(a9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A9=""+id3+".jpg";part.write(uploadFilePath + File.separator + A9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

//B...................................................B................................B...................................................


if(id2.equals(b1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B1=""+id3+".jpg";part.write(uploadFilePath + File.separator + B1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(b2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B2=""+id3+".jpg";part.write(uploadFilePath + File.separator + B2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(b3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B3=""+id3+".jpg";part.write(uploadFilePath + File.separator + B3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(b4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B4=""+id3+".jpg";part.write(uploadFilePath + File.separator + B4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(b5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B5=""+id3+".jpg";part.write(uploadFilePath + File.separator + B5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(b6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B6=""+id3+".jpg";part.write(uploadFilePath + File.separator + B6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(b7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B7=""+id3+".jpg";part.write(uploadFilePath + File.separator + B7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(b8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B8=""+id3+".jpg";part.write(uploadFilePath + File.separator + B8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(b9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B9=""+id3+".jpg";part.write(uploadFilePath + File.separator + B9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

//........................................................................c......................................c....................

if(id2.equals(c1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C1=""+id3+".jpg";part.write(uploadFilePath + File.separator + C1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(c2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C2=""+id3+".jpg";part.write(uploadFilePath + File.separator + C2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(c3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C3=""+id3+".jpg";part.write(uploadFilePath + File.separator + C3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(c4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C4=""+id3+".jpg";part.write(uploadFilePath + File.separator + C4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(c5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C5=""+id3+".jpg";part.write(uploadFilePath + File.separator + C5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(c6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C6=""+id3+".jpg";part.write(uploadFilePath + File.separator + C6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(c7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C7=""+id3+".jpg";part.write(uploadFilePath + File.separator + C7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(c8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C8=""+id3+".jpg";part.write(uploadFilePath + File.separator + C8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(c9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + C9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String C9=""+id3+".jpg";part.write(uploadFilePath + File.separator + C9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

//........................................................................D......................................D....................



if(id2.equals(d1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D1=""+id3+".jpg";part.write(uploadFilePath + File.separator + D1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(d2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D2=""+id3+".jpg";part.write(uploadFilePath + File.separator + D2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(d3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D3=""+id3+".jpg";part.write(uploadFilePath + File.separator + D3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(d4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D4=""+id3+".jpg";part.write(uploadFilePath + File.separator + D4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(d5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D5=""+id3+".jpg";part.write(uploadFilePath + File.separator + D5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(d6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D6=""+id3+".jpg";part.write(uploadFilePath + File.separator + D6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(d7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D7=""+id3+".jpg";part.write(uploadFilePath + File.separator + D7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(d8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D8=""+id3+".jpg";part.write(uploadFilePath + File.separator + D8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(d9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + D9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String D9=""+id3+".jpg";part.write(uploadFilePath + File.separator + D9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
//........................................................................E......................................E....................



if(id2.equals(e1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E1=""+id3+".jpg";part.write(uploadFilePath + File.separator + E1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(e2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E2=""+id3+".jpg";part.write(uploadFilePath + File.separator + E2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(e3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E3=""+id3+".jpg";part.write(uploadFilePath + File.separator + E3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(e4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E4=""+id3+".jpg";part.write(uploadFilePath + File.separator + E4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(e5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E5=""+id3+".jpg";part.write(uploadFilePath + File.separator + E5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(e6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E6=""+id3+".jpg";part.write(uploadFilePath + File.separator + E6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(e7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E7=""+id3+".jpg";part.write(uploadFilePath + File.separator + E7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(e8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E8=""+id3+".jpg";part.write(uploadFilePath + File.separator + E8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(e9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + E9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String E9=""+id3+".jpg";part.write(uploadFilePath + File.separator + E9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

//........................................................................F......................................F....................


if(id2.equals(f1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F1=""+id3+".jpg";part.write(uploadFilePath + File.separator + F1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(f2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F2=""+id3+".jpg";part.write(uploadFilePath + File.separator + F2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(f3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F3=""+id3+".jpg";part.write(uploadFilePath + File.separator + F3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(f4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F4=""+id3+".jpg";part.write(uploadFilePath + File.separator + F4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(f5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F5=""+id3+".jpg";part.write(uploadFilePath + File.separator + F5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(f6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F6=""+id3+".jpg";part.write(uploadFilePath + File.separator + F6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(f7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F7=""+id3+".jpg";part.write(uploadFilePath + File.separator + F7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(f8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F8=""+id3+".jpg";part.write(uploadFilePath + File.separator + F8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(f9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + F9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String F9=""+id3+".jpg";part.write(uploadFilePath + File.separator + F9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

//........................................................................G......................................G....................



if(id2.equals(g1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G1=""+id3+".jpg";part.write(uploadFilePath + File.separator + G1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(g2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G2=""+id3+".jpg";part.write(uploadFilePath + File.separator + G2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(g3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G3=""+id3+".jpg";part.write(uploadFilePath + File.separator + G3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(g4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G4=""+id3+".jpg";part.write(uploadFilePath + File.separator + G4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(g5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G5=""+id3+".jpg";part.write(uploadFilePath + File.separator + G5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(g6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G6=""+id3+".jpg";part.write(uploadFilePath + File.separator + G6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(g7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G7=""+id3+".jpg";part.write(uploadFilePath + File.separator + G7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(g8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G8=""+id3+".jpg";part.write(uploadFilePath + File.separator + G8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(g9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + G9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String G9=""+id3+".jpg";part.write(uploadFilePath + File.separator + G9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


//........................................................................H......................................H....................


if(id2.equals(h1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H1=""+id3+".jpg";part.write(uploadFilePath + File.separator + H1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(h2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H2=""+id3+".jpg";part.write(uploadFilePath + File.separator + H2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(h3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H3=""+id3+".jpg";part.write(uploadFilePath + File.separator + H3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(h4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H4=""+id3+".jpg";part.write(uploadFilePath + File.separator + H4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(h5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H5=""+id3+".jpg";part.write(uploadFilePath + File.separator + H5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(h6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H6=""+id3+".jpg";part.write(uploadFilePath + File.separator + H6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(h7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H7=""+id3+".jpg";part.write(uploadFilePath + File.separator + H7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(h8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H8=""+id3+".jpg";part.write(uploadFilePath + File.separator + H8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(h9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + H9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String H9=""+id3+".jpg";part.write(uploadFilePath + File.separator + H9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

//........................................................................I......................................I....................



if(id2.equals(i1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I1=""+id3+".jpg";part.write(uploadFilePath + File.separator + I1);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if


if(id2.equals(i2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I2=""+id3+".jpg";part.write(uploadFilePath + File.separator + I2);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(i3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I3=""+id3+".jpg";part.write(uploadFilePath + File.separator + I3);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(i4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I4=""+id3+".jpg";part.write(uploadFilePath + File.separator + I4);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(i5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I5=""+id3+".jpg";part.write(uploadFilePath + File.separator + I5);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(i6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I6=""+id3+".jpg";part.write(uploadFilePath + File.separator + I6);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if
if(id2.equals(i7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I7=""+id3+".jpg";part.write(uploadFilePath + File.separator + I7);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(i8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I8=""+id3+".jpg";part.write(uploadFilePath + File.separator + I8);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
}//if

if(id2.equals(i9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + I9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String I9=""+id3+".jpg";part.write(uploadFilePath + File.separator + I9);}
          request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39_table6?id="+id2+" ");
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