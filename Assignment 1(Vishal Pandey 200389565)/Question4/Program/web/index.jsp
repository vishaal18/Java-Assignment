<%--
  Created by IntelliJ IDEA.
  User: vishal
  Date: 2018-06-27
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
  <head>
    <title>download</title>
  </head>
  <br>
  <form action="${pageContext.request.contextPath}/DownloadServlet"  method="post">
  <h1 name = "message"> Enter Filename</h1></br>
  <h2>${error}</h2>
  <label for="filename">File name</label>
  <input type="text" name="filename" id="filename"></br>
  <input type="submit" name="Download"id="Download" value="Download"></br>

  </form>
  </body>
</html>
