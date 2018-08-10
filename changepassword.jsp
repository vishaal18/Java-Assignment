<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Change password</title>
</head>
<body>
<%@ taglib prefix = "ex" uri = "WEB-INF/custom.tld"%>
<ex:Logo/>
<form action="${pageContext.request.contextPath}/changePassword" method="post">
Username:<br> <input type="text"  name="Username"  required></br>
OldPassword: <br><input type="text" name="OldPassword"  required></br>
NewPassword:<br> <input type="text"  name="NewPassword"  required></br>
Submit <input type="submit" name="submit" value="Submit"></br>
Reset <input type="reset" name="Reset" value="Reset"></br>

</form>

</body>
</html>