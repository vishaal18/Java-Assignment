package Model;

import javax.servlet.http.HttpServletRequest;

public class Form {

    private final String itemNumber;
    private final String description;
    private final String price;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String shippingLocation;
    private final String creditCardNumber;
    private final String repeatCreditCardNumber;
    private final String creditCard;

    public Form(String itemNumber, String description, String price, String firstName, String middleName, String lastName,
                String shippingLocation, String creditCardNumber, String repeatCreditCardNumber, String creditCard) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.shippingLocation = shippingLocation;
        this.creditCardNumber = creditCardNumber;
        this.repeatCreditCardNumber = repeatCreditCardNumber;
        this.creditCard = creditCard;
    }


    public static Form fromRequestParameters(HttpServletRequest request) {
        return new Form( request.getParameter("itemNumber"),
                request.getParameter("description"),
                request.getParameter("price") ,
                request.getParameter("firstName"),
                request.getParameter("middleName"),
                request.getParameter("lastName"),
                 request.getParameter("shippingLocation"),
                 request.getParameter("creditCardNumber"),
                request.getParameter("repeatCreditCardNumber"), request.getParameter("creditCard"));
    }

    public void setAsRequestParameters(HttpServletRequest request) {
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("itemNumber", itemNumber);
        request.setAttribute("description", description);
        request.setAttribute("middleName", middleName);
        request.setAttribute("priceEach", price);
        request.setAttribute("shippingLocation", shippingLocation);
        request.setAttribute("creditCardNumber", creditCardNumber);
        request.setAttribute("repeatCreditCardNumber", repeatCreditCardNumber);
        request.setAttribute("creditCard",creditCard);
    }
}

