<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>The Servlet Model</title>
</head>
<body>
<%@ taglib prefix = "ex" uri = "WEB-INF/custom.tld"%>
<ex:Logo/>
<p> We talk about the basic concepts of the Servlet model.This Web application contains the following example.
1. This web application also implements the simple application explained in slides.Here is the <a href="login.jsp">Login Page</a>
    for the application. As explained, the usernames/password are hard coded in the LoginServlet. You can use any of the following values:
    1. ann/aaa
    2.john/jjj
    3.mark/mmm

    Once you login, you should see the account information of the user

    <a href="change%20password.jsp">Change Password</a>
    <a href="Registrationpage.jsp">Registration Page</a>

</p>
</body>
</html>