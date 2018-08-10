<%--
  Created by IntelliJ IDEA.
  User: vishal
  Date: 2018-08-04
  Time: 2:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "ex" uri = "WEB-INF/custom.tld"%>
<ex:Logo/>
<html>
<head>
    <title>Account Bean</title>
</head>
<body>
<%@ taglib prefix = "ex" uri = "WEB-INF/custom.tld"%>
<ex:Logo/>
<%@ page import="java.util.Date" %>
<% Date date = new Date();%>

<jsp:useBean id="accountbean" class="Controller.AccountBean" scope="session">
    <jsp:setProperty name="accountbean" property="name" value="<%= request.getParameter("name") %>"/>
    <jsp:setProperty name="accountbean" property="password" value="<%= request.getParameter("password") %>"/>
    <jsp:setProperty name="accountbean" property="balance" value="1000.0"/>
    <jsp:setProperty name="accountbean" property="dateCreated" value ="<%= date%>"/>
</jsp:useBean>

<H1>Welcome <jsp:getProperty name="accountbean" property="name"/> to Banking Application </H1>
<H1>You have been registered on this date : <jsp:getProperty name="accountbean" property="dateCreated"></jsp:getProperty> with balance
:<jsp:getProperty name="accountbean" property="balance"></jsp:getProperty></H1>

<H2>Your monthly interest is ${accountbean.balance * 0.25 } </H2>

</body>
</html>
