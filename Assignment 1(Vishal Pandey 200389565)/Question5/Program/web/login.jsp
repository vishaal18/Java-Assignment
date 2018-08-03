<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
     <title>SCWCD_Example_1_3</title>
</head>

<body>

<h3>Please enter your userid and password  B to see you account statement:</h3><p>

<form action="${pageContext.request.contextPath}/loginDetails" method="POST">
username : <input type="text" name="username"><br><br>
Password : <input type="password" name="password"><br><br>
<input type="submit" value="Show Statement">
</form>

</body>
</html>
