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
public class FileUploadServletladies extends HttpServlet {

 private static final long serialVersionUID = 205242440643911308L;

String a1="1";String a2="2";String a3="3";String a4="4";String a5="5";String a6="6";String a7="7";String a8="8";String a9="9";String a10="10";String a11="11";String a12="12";String a13="13";String a14="14";String a15="15";String a16="16";String a17="17";String a18="18";String a19="19"; String a20="20";String a21="21";String a22="22";String a23="23";String a24="24";String a25="25";String a26="26";String a27="27";String a28="28"; String a29="29";String a30="30";String a31="31";String a32="32";String a33="33"; 
String a34="34";String a35="35";String a36="36";String a37="37";String a38="38";String a39="39";String a40="40";String a41="41";String a42="42";String a43="43";String a44="44";String a45="45";String a46="46";String a47="47";String a48="48";String a49="49";String a50="50";String a51="51";String a52="52"; String a53="53";String a54="54";String a55="55";String a56="56";String a57="57";String a58="58";String a59="59";String a60="60";String a61="61";String a62="62"; String a63="63";String a64="64";String a65="65";
String a66="66";String a67="67";String a68="68";String a69="69";String a70="70";String a71="71";String a72="72";String a73="73";String a74="74";String a75="75";String a76="76";String a77="77";String a78="78";String a79="79";String a80="80";String a81="81";String a82="82";String a83="83";String a84="84";String a85="85";String a86="86";String a87="87";String a88="88";String a89="89";String a90="90";






private static final String A1 = "/shop/manuimage/manu_image";	private static final String A34 ="/shop/manuimage/manu2_image";	private static final String A67 ="/shop/manuimage/manu5_image";

private static final String A2 = "/shop/manuimage/manu_image";	private static final String A35 ="/shop/manuimage/manu2_image";	private static final String A68 ="/shop/manuimage/manu6_image";

private static final String A3 = "/shop/manuimage/manu_image";	private static final String A36 ="/shop/manuimage/manu2_image";	private static final String A69 ="/shop/manuimage/manu6_image";

private static final String A4 = "/shop/manuimage/manu_image";	private static final String A37 ="/shop/manuimage/manu2_image";	private static final String A70 ="/shop/manuimage/manu6_image";

private static final String A5 = "/shop/manuimage/manu_image";	private static final String A38 ="/shop/manuimage/manu2_image";	private static final String A71 ="/shop/manuimage/manu6_image";

private static final String A6 = "/shop/manuimage/manu_image";	private static final String A39 ="/shop/manuimage/manu3_image";	private static final String A72 ="/shop/manuimage/manu6_image";

private static final String A7 = "/shop/manuimage/manu_image";	private static final String A40 ="/shop/manuimage/manu3_image";	private static final String A73 ="/shop/manuimage/manu6_image";

private static final String A8 = "/shop/manuimage/manu_image";	private static final String A41 ="/shop/manuimage/manu3_image";	private static final String A74 ="/shop/manuimage/manu6_image";

private static final String A9 = "/shop/manuimage/manu_image";	private static final String A42 ="/shop/manuimage/manu3_image";	private static final String A75 ="/shop/manuimage/manu6_image";

private static final String A10 ="/shop/manuimage/manu_image";	private static final String A43 ="/shop/manuimage/manu3_image";	private static final String A76 ="/shop/manuimage/manu6_image";

private static final String A11 ="/shop/manuimage/manu_image";	private static final String A44 ="/shop/manuimage/manu3_image";	private static final String A77 ="/shop/manuimage/manu7_image";

private static final String A12 ="/shop/manuimage/manu_image";	private static final String A45 ="/shop/manuimage/manu3_image";	private static final String A78 ="/shop/manuimage/manu7_image";

private static final String A13 ="/shop/manuimage/manu_image";	private static final String A46 ="/shop/manuimage/manu3_image";	private static final String A79 ="/shop/manuimage/manu7_image";

private static final String A14 ="/shop/manuimage/manu_image";	private static final String A47 ="/shop/manuimage/manu3_image";	private static final String A80 ="/shop/manuimage/manu7_image";

private static final String A15 ="/shop/manuimage/manu_image";	private static final String A48 ="/shop/manuimage/manu4_image";	private static final String A81 ="/shop/manuimage/manu7_image";

private static final String A16 ="/shop/manuimage/manu_image";	private static final String A49 ="/shop/manuimage/manu4_image";	private static final String A82 ="/shop/manuimage/manu7_image";

private static final String A17 ="/shop/manuimage/manu_image";	private static final String A50 ="/shop/manuimage/manu4_image";	private static final String A83 ="/shop/manuimage/manu7_image";

private static final String A18 ="/shop/manuimage/manu_image";	private static final String A51 ="/shop/manuimage/manu4_image";	private static final String A84 ="/shop/manuimage/manu7_image";

private static final String A19 ="/shop/manuimage/manu_image";	private static final String A52 ="/shop/manuimage/manu4_image";	private static final String A85 ="/shop/manuimage/manu7_image";

private static final String A20 ="/shop/manuimage/manu1_image";	private static final String A53 ="/shop/manuimage/manu4_image";	private static final String A86 ="/shop/manuimage/manu8_image";

private static final String A21 ="/shop/manuimage/manu1_image";	private static final String A54 ="/shop/manuimage/manu4_image";	private static final String A87 ="/shop/manuimage/manu8_image";

private static final String A22 ="/shop/manuimage/manu1_image";	private static final String A55 ="/shop/manuimage/manu4_image";	private static final String A88 ="/shop/manuimage/manu8_image";

private static final String A23 ="/shop/manuimage/manu1_image";	private static final String A56 ="/shop/manuimage/manu4_image";	private static final String A89 ="/shop/manuimage/manu8_image";

private static final String A24 ="/shop/manuimage/manu1_image";	private static final String A57 ="/shop/manuimage/manu4_image";	private static final String A90 ="/shop/manuimage/manu8_image";

private static final String A25 ="/shop/manuimage/manu1_image";	private static final String A58 ="/shop/manuimage/manu5_image";	private static final String A91 ="/shop/manuimage/manu8_image";

private static final String A26 ="/shop/manuimage/manu1_image";	private static final String A59 ="/shop/manuimage/manu5_image";	private static final String A92 ="/shop/manuimage/manu8_image";

private static final String A27 ="/shop/manuimage/manu1_image";	private static final String A60 ="/shop/manuimage/manu5_image";	private static final String A93 ="/shop/manuimage/manu8_image";

private static final String A28 ="/shop/manuimage/manu1_image";	private static final String A61 ="/shop/manuimage/manu5_image";	private static final String A94 ="/shop/manuimage/manu8_image";

private static final String A29 ="/shop/manuimage/manu1_image";	private static final String A62 ="/shop/manuimage/manu5_image";	private static final String A95 ="/shop/manuimage/manu9_image";

private static final String A30 ="/shop/manuimage/manu2_image";	private static final String A63 ="/shop/manuimage/manu5_image";	private static final String A96 ="/shop/manuimage/manu9_image";

private static final String A31 ="/shop/manuimage/manu2_image";	private static final String A64 ="/shop/manuimage/manu5_image";	private static final String A97 ="/shop/manuimage/manu9_image";

private static final String A32 ="/shop/manuimage/manu2_image";	private static final String A65 ="/shop/manuimage/manu5_image";	private static final String A98 ="/shop/manuimage/manu9_image";

private static final String A33 ="/shop/manuimage/manu2_image";	private static final String A66 ="/shop/manuimage/manu5_image";	private static final String A99 ="/shop/manuimage/manu9_image";




    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

String id1=request.getParameter("id1"); 
String id2=request.getParameter("id2"); 
String id3=request.getParameter("id3"); 

if(id1.equals(a1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A1=""+id1+".jpg";part.write(uploadFilePath + File.separator + A1 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A2=""+id1+".jpg";part.write(uploadFilePath + File.separator + A2 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A3=""+id1+".jpg";part.write(uploadFilePath + File.separator + A3 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A4=""+id1+".jpg";part.write(uploadFilePath + File.separator + A4 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A5=""+id1+".jpg";part.write(uploadFilePath + File.separator + A5 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A6=""+id1+".jpg";part.write(uploadFilePath + File.separator + A6 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A7=""+id1+".jpg";part.write(uploadFilePath + File.separator + A7 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A8=""+id1+".jpg";part.write(uploadFilePath + File.separator + A8 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if

if(id1.equals(a9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A9=""+id1+".jpg";part.write(uploadFilePath + File.separator + A9 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if

if(id1.equals(a10)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A10;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A10=""+id1+".jpg";part.write(uploadFilePath + File.separator + A10 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a11)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A11;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A11=""+id1+".jpg";part.write(uploadFilePath + File.separator + A11 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a12)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A12;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A12=""+id1+".jpg";part.write(uploadFilePath + File.separator + A12 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a13)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A13;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A13=""+id1+".jpg";part.write(uploadFilePath + File.separator + A13 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a14)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A14;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A14=""+id1+".jpg";part.write(uploadFilePath + File.separator + A14 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a15)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A15;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A15=""+id1+".jpg";part.write(uploadFilePath + File.separator + A15 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a16)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A16;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A16=""+id1+".jpg";part.write(uploadFilePath + File.separator + A16 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a17)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A17;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A17=""+id1+".jpg";part.write(uploadFilePath + File.separator + A17 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a18)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A18;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A18=""+id1+".jpg";part.write(uploadFilePath + File.separator + A18 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a19)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A19;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A19=""+id1+".jpg";part.write(uploadFilePath + File.separator + A19 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a20)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A20;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A20=""+id1+".jpg";part.write(uploadFilePath + File.separator + A20 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a21)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A21;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A21=""+id1+".jpg";part.write(uploadFilePath + File.separator + A21 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a22)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A22;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A22=""+id1+".jpg";part.write(uploadFilePath + File.separator + A22 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a23)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A23;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A23=""+id1+".jpg";part.write(uploadFilePath + File.separator + A23 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a24)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A24;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A24=""+id1+".jpg";part.write(uploadFilePath + File.separator + A24 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a25)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A25;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A25=""+id1+".jpg";part.write(uploadFilePath + File.separator + A25 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a26)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A26;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A26=""+id1+".jpg";part.write(uploadFilePath + File.separator + A26 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a27)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A27;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A27=""+id1+".jpg";part.write(uploadFilePath + File.separator + A27 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a28)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A28;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A28=""+id1+".jpg";part.write(uploadFilePath + File.separator + A28 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a29)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A29;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A29=""+id1+".jpg";part.write(uploadFilePath + File.separator + A29 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a30)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A30;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A30=""+id1+".jpg";part.write(uploadFilePath + File.separator + A30 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a31)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A31;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A31=""+id1+".jpg";part.write(uploadFilePath + File.separator + A31 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a32)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A32;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A32=""+id1+".jpg";part.write(uploadFilePath + File.separator + A32 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a33)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A33;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A33=""+id1+".jpg";part.write(uploadFilePath + File.separator + A33 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if

if(id1.equals(a34)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A34;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A34=""+id1+".jpg";part.write(uploadFilePath + File.separator + A34 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a35)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A35;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A35=""+id1+".jpg";part.write(uploadFilePath + File.separator + A35 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a36)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A36;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A36=""+id1+".jpg";part.write(uploadFilePath + File.separator + A36 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a37)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A37;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A37=""+id1+".jpg";part.write(uploadFilePath + File.separator + A37 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a38)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A38;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A38=""+id1+".jpg";part.write(uploadFilePath + File.separator + A38 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a39)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A39;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A39=""+id1+".jpg";part.write(uploadFilePath + File.separator + A39 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a40)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A40;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A40=""+id1+".jpg";part.write(uploadFilePath + File.separator + A40 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a41)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A41;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A41=""+id1+".jpg";part.write(uploadFilePath + File.separator + A41 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a42)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A42;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A42=""+id1+".jpg";part.write(uploadFilePath + File.separator + A42 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a43)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A43;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A43=""+id1+".jpg";part.write(uploadFilePath + File.separator + A43 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a44)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A44;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A44=""+id1+".jpg";part.write(uploadFilePath + File.separator + A44 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a45)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A45;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A45=""+id1+".jpg";part.write(uploadFilePath + File.separator + A45 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a46)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A46;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A46=""+id1+".jpg";part.write(uploadFilePath + File.separator + A46 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a47)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A47;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A47=""+id1+".jpg";part.write(uploadFilePath + File.separator + A47 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a48)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A48;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A48=""+id1+".jpg";part.write(uploadFilePath + File.separator + A48 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a49)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A49;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A49=""+id1+".jpg";part.write(uploadFilePath + File.separator + A49 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a50)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A50;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A50=""+id1+".jpg";part.write(uploadFilePath + File.separator + A50 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a51)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A51;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A51=""+id1+".jpg";part.write(uploadFilePath + File.separator + A51 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a52)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A52;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A52=""+id1+".jpg";part.write(uploadFilePath + File.separator + A52 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a53)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A53;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A53=""+id1+".jpg";part.write(uploadFilePath + File.separator + A53 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a54)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A54;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A54=""+id1+".jpg";part.write(uploadFilePath + File.separator + A54 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a55)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A55;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A55=""+id1+".jpg";part.write(uploadFilePath + File.separator + A55 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a56)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A56;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A56=""+id1+".jpg";part.write(uploadFilePath + File.separator + A56 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a57)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A57;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A57=""+id1+".jpg";part.write(uploadFilePath + File.separator + A57 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a58)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A58;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A58=""+id1+".jpg";part.write(uploadFilePath + File.separator + A58 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a59)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A59;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A59=""+id1+".jpg";part.write(uploadFilePath + File.separator + A59 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a60)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A60;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A60=""+id1+".jpg";part.write(uploadFilePath + File.separator + A60 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a61)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A61;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A61=""+id1+".jpg";part.write(uploadFilePath + File.separator + A61 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a62)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A62;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A62=""+id1+".jpg";part.write(uploadFilePath + File.separator + A62 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a63)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A63;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A63=""+id1+".jpg";part.write(uploadFilePath + File.separator + A63 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a64)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A64;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A64=""+id1+".jpg";part.write(uploadFilePath + File.separator + A64 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a65)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A65;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A65=""+id1+".jpg";part.write(uploadFilePath + File.separator + A65 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a66)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A66;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A66=""+id1+".jpg";part.write(uploadFilePath + File.separator + A66 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a67)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A87;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A67=""+id1+".jpg";part.write(uploadFilePath + File.separator + A67 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a68)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A68;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A68=""+id1+".jpg";part.write(uploadFilePath + File.separator + A68 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a69)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A69;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A69=""+id1+".jpg";part.write(uploadFilePath + File.separator + A69 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a70)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A70;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A70=""+id1+".jpg";part.write(uploadFilePath + File.separator + A70 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a71)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A71;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A71=""+id1+".jpg";part.write(uploadFilePath + File.separator + A71 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a72)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A72;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A72=""+id1+".jpg";part.write(uploadFilePath + File.separator + A72 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a73)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A73;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A73=""+id1+".jpg";part.write(uploadFilePath + File.separator + A73 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a74)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A74;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A74=""+id1+".jpg";part.write(uploadFilePath + File.separator + A74 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a75)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A75;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A75=""+id1+".jpg";part.write(uploadFilePath + File.separator + A75 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a76)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A76;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A76=""+id1+".jpg";part.write(uploadFilePath + File.separator + A76 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a77)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A77;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A77=""+id1+".jpg";part.write(uploadFilePath + File.separator + A77 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a78)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A78;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A78=""+id1+".jpg";part.write(uploadFilePath + File.separator + A78 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a79)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A79;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A79=""+id1+".jpg";part.write(uploadFilePath + File.separator + A79 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a80)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A80;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A80=""+id1+".jpg";part.write(uploadFilePath + File.separator + A80 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a81)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A81;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A81=""+id1+".jpg";part.write(uploadFilePath + File.separator + A81 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a82)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A82;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A82=""+id1+".jpg";part.write(uploadFilePath + File.separator + A82 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a83)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A83;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A83=""+id1+".jpg";part.write(uploadFilePath + File.separator + A83 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a84)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A84;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A84=""+id1+".jpg";part.write(uploadFilePath + File.separator + A84 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a85)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A85;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A85=""+id1+".jpg";part.write(uploadFilePath + File.separator + A85 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a86)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A86;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A86=""+id1+".jpg";part.write(uploadFilePath + File.separator + A86 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a87)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A87;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A87=""+id1+".jpg";part.write(uploadFilePath + File.separator + A87 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a88)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A88;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A88=""+id1+".jpg";part.write(uploadFilePath + File.separator + A88 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a89)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A89;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A89=""+id1+".jpg";part.write(uploadFilePath + File.separator + A89 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
}//if
if(id1.equals(a90)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + A90;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String A90=""+id1+".jpg";part.write(uploadFilePath + File.separator + A90 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/shopping/servlet/category30_39?id="+id1+"");
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