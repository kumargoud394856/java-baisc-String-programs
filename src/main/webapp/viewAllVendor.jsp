<!-- BOOTSTRAP STYLES-->
<%@page import="java.sql.ResultSet"%>
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
<%@page import="com.ojas.CMS.db.DBUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" import="java.sql.*"%>
<%!ResultSet rs = null;%>
<%
Connection con = DBUtility.getConnection();
PreparedStatement ps = con.prepareStatement("SELECT * FROM VENDOR");
rs = ps.executeQuery();
%>

<table class="table table-striped">
	<thead>
		<tr>
			<th>VID</th>
			<th>VNAME</th>
			<th>EMAIL</th>
			<th>MOBILE</th>
			<th>ADDRESS</th>
			<th>ACTION</th>
		</tr>
	</thead>
	<tbody>
		<%
		while (rs.next()) {
		%>
		<tr>
			<td><% out.println(rs.getInt(1)); %></td>
			<td><% out.println(rs.getString(2)); %></td>
			<td><% out.println(rs.getString(3)); %></td>
			<td><% out.println(rs.getLong(4)); %></td>
			<td><% out.println(rs.getString(5)); %></td>
			<td>
			 <a class="btn btn-primary" href=./updatevendor.jsp?vid=<%=rs.getInt(1) %>>Update</a>
			 <a class="btn btn-danger"  href=./deletevendor.jsp?vid=<%=rs.getInt(1) %>>Delete</a>
			</td>
		</tr>
		<%
		}
		%>
	</tbody>
</table>


