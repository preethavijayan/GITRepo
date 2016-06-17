<%@ taglib uri="/WEB-INF/struts-bean.tld"     prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld"     prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld"    prefix="logic" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<html:form action="/login">
<div id="art1" style="position:absolute; overflow:hidden; left:122px; top:36px; width:214px; height:40px; z-index:0"><img border="0" alt="Registration Page" src="images/art20823044.gif"></div>

<div id="table1" style="position:absolute; overflow:hidden; left:32px; top:89px;">
<div >
<div><TABLE bgcolor="#FFFFFF" border=1 bordercolorlight="#C0C0C0" bordercolordark="#808080">

<TR valign="top">
<TD width="150" height="15">User name:
</TD>
<TD><html:text name="registrationForm" property="userName"/>
</TD>
</TR>
<TR valign="top">
<TD width="150" height="15">Password:
</TD>
<TD><html:password name="registrationForm" property="password"/>
</TD>
</TR>
<TR valign="top">
<TD ><html:submit value="Login"/>
</TD>
</TR>
</TABLE>
</div>
</div></div>
</html:form>
</body>
</html>