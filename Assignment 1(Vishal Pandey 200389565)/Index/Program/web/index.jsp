<%--
  Created by IntelliJ IDEA.
  User: vishal
  Date: 2018-06-24
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form action="${pageContext.request.contextPath}/test" method="post">
Item Number: <input type="text" name="itemNumber" id="itemNumber"  required></br>
Description: <input type="text" name="description" id="description"  required></br>
Price Each: <input type="number" name="price" id="price" required></br>
firstName: <input type="text" name="firstName" id="firstName"  required></br>
Middle Name: <input type="text" name="middleName" id="middleName"  required></br>
Last Name: <input type="text" name="lastName" id="lastName"  required></br>
Shipping location: <textarea name="shippingLocation" id="shippingLocation"
                             cols="30" rows="10"></textarea></br>
Visa: <input type="radio" name="creditCard" value="Visa" required></br>
MasterCard: <input type="radio" name="creditCard"
                   value="MasterCard"  required></br>
American Express: <input type="radio" name="creditCard"
                         value="American Express"  required></br>
Discover: <input type="radio" name="creditCard"
                 value="Discover" value="N/A" required></br>
Java: <input type="radio" name="creditCard" value="Java"
              required></br>
Credit Card Number: <input type="password"
                           name="creditCardNumber" id="creditCardNumber"  required></br>
Repeat Credit Card Number: <input type="password"
                                  name="repeatCreditCardNumber" id="repeatCreditCardNumber"
                                   required></br>
Submit <input type="submit" name="login" value="Submit"></br>
</form>

