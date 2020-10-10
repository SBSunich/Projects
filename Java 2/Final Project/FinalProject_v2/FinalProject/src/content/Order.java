/**
 * Sunil Sunichura, Sudesh Sunichura
 * Student Number: 991578383, 991421780
 * Final Project
 * April 5, 2020
 */

package content;

public class Order {

    private String orderID;
    private String customerID;
    private String product;
    private String shippingMethod;

    public Order(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}
