<!-- BOOTSTRAP STYLES-->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!-- MORRIS CHART STYLES-->
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
PreparedStatement ps = con.prepareStatement("select * from vendor where vid=?");
ps.setInt(1, vid);
ResultSet rs = ps.executeQuery();
while (rs.next()) {
	out.println("<form action='updatevendor' method=post>");
	out.println("Vendor Id : <input type=text name=vid value='" + rs.getInt(1)+"'</input>");
	out.println("<br>");
	out.println("Vendor Name :<input type=text name=vname value='"  + rs.getString(2)+"'</input>");
	out.println("<br>");
	out.println("Vendor Email Id :<input type=text name=vname value='"  + rs.getString(3)+"'</input>");
	out.println("<br>");
	out.println("Vendor Mobile No : <input type=text name=vname value='"  + rs.getLong(4)+"'</input>");
	out.println("<br>");
	out.println("Vendor Address : <input type=text name=vname value='"  + rs.getString(5)+"'</input>");
	out.println("<br>");
	out.println("<br>");
	out.println("<button class=btn btn-primary>Update</button>");
	out.println("<form>");

}
%>