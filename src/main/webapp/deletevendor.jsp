<link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link href="assets/css/custom.css" rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<%@page import="com.ojas.CMS.db.DBUtility,java.sql.*"%>
<%
int vid = Integer.parseInt(request.getParameter("vid"));
Connection con = DBUtility.getConnection();
PreparedStatement ps = con.prepareStatement("delete * from vendor where vid=?");
ps.setInt(1, vid);
ps.executeUpdate();
%>