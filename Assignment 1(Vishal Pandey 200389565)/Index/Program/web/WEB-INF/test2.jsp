<%--
  Created by IntelliJ IDEA.
  User: vishal
  Date: 2018-06-26
  Time: 2:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read All Parameters</title>
</head>
<style type="text/css">
    p {
        display:list-item;
        list-style:disc inside;
        padding:0 0 0 14px;
        margin:0;
    }
</style>
<body>
<h1>Reading All Request Parameters</h1>
<table border="1">
<tr>
        <th>Parameter Name</th>
        <th>Parameter Value(s)</th>
    </tr>
    <tr>
        <td>Item Number</td>
        <td>${itemNumber}</td>
    </tr>
    <tr>
        <td>Description</td>
        <td>${description}</td>
    </tr>
    <tr>
        <td>Price</td>
        <td>${priceEach}</td>
    </tr>
    <tr>
        <td>First Name</td>
        <td>${firstName}</td>
    </tr>
    <tr>
        <td>Last Name</td>
        <td>${lastName}</td>
    </tr>
    <tr>
        <td>Middle Name</td>
        <td>${middleName}</td>
    </tr>
    <tr>
        <td>shippingLocation</td>
        <td>${shippingLocation}</td>
    </tr>
    <tr>
        <td>First Name</td>
        <td>${firstName}</td>
    </tr>
    <tr>
        <td>Card Type</td>
        <td>${creditCard}</td>
    </tr>
    <tr>
        <td>Card Number</td>
        <td><p>${creditCardNumber}</p></br><p>${repeatCreditCardNumber}</p></td>
    </tr>
</table>
</body>
</html>


</body>
</html>
