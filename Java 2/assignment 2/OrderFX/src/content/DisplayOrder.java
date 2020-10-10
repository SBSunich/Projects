/**
 * Sunil Sunichura
 * Student Number: 991578383
 * Assignment 2
 * February 25, 2020
 */
package content;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayOrder extends Stage {

    public DisplayOrder(Order one) {

        setScene(getScene(one));
    }

    private Scene getScene(Order one) {
        String orderID = one.getOrderID();
        String firstName = one.getFirstName();
        String lastName = one.getLastName();
        String city = one.getCity();
        int num1 = one.getNum1();
        int num2 = one.getNum2();
        int num3 = one.getNum3();
        int num4 = one.getNum4();
        Label lblId = new Label("Order num is: " + orderID);
        Label lblFName = new Label("Customer First Name: " + firstName);
        Label lblLName = new Label("Customer Last Name: " + lastName);
        Label lblCity = new Label("Customer city is: " + city);
        Label lblNum1 = new Label("Number of order 1: " + num1);
        Label lblNum2 = new Label("Number of order 2: " + num2);
        Label lblNum3 = new Label("Number of order 3: " + num3);
        Label lblNum4 = new Label("Number of order 4: " + num4);
        VBox pane = new VBox(20, lblId, lblFName, lblLName, lblCity, 
                lblNum1, lblNum2, lblNum3, lblNum4);
        Scene scene = new Scene(pane, 400, 400);
        return scene;
    }

}
