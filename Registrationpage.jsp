<%--
  Created by IntelliJ IDEA.
  User: vishal
  Date: 2018-07-27
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<%@ taglib prefix = "ex" uri = "WEB-INF/custom.tld"%>
<ex:Logo/>
<form action= "AccountStatus.jsp" method="post">
    name:<br> <input type="text"  name="name"  required></br>
    age: <br><input type="text" name=age"  required></br>
    address:<br> <input type="text"  name="address"  required></br>
    password:<br> <input type="text"  name="password"  required></br>
    Submit <input type="submit" name="submit" value="Submit"></br>
</form>

</body>
</html>

