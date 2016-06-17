<%@ taglib uri="/WEB-INF/struts-bean.tld"     prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld"     prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld"    prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled</title>


</head>

<body>

<html:form action="/registration">
<div id="art1" style="position:absolute; overflow:hidden; left:122px; top:36px; width:214px; height:40px; z-index:0"><img border="0" alt="Registration Page" src="images/art10609643.gif"></div>

<div id="table1" style="position:absolute;  left:32px; top:89px;">
<html:errors/>
<div >
<div><TABLE bgcolor="#FFFFFF" border=1 bordercolorlight="#C0C0C0" bordercolordark="#808080">
<TR valign="top">
<TD width="150">Name:
</TD>
<TD ><html:text name="registrationForm" property="name" />
</TD>
</TR>
<TR valign="top">
<TD width="150" height="15">Address:
</TD>
<TD><html:text name="registrationForm" property="address" />
</TD>
</TR>
<TR valign="top">
<TD width="150" height="15">City:
</TD>
<TD><html:text name="registrationForm" property="city" />
</TD>
</TR>
<TR valign="top">
<TD width="150" height="15">State:
</TD>
<TD><html:text name="registrationForm" property="state" />
</TD>
</TR>
<TR valign="top">
<TD width="150" height="15">Country:
</TD>
<TD><html:text name="registrationForm" property="country" />
</TD>
</TR>
<TR valign="top">
<TD width="150" height="15">Pin:
</TD>
<TD><html:text name="registrationForm" property="pinCode" />
</TD>
</TR>
<TR valign="top">
<TD width="150" height="15"><br/>
</TD>
<TD><br/>
</TD>
</TR>
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
<TD ><html:submit value="Register"/>
</TD>
</TR>
</TABLE>
</div>
</div></div>
</html:form>
</body>
</html>
