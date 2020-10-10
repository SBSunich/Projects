/**
 * Sunil Sunichura, Sudesh Sunichura
 * Student Number: 991578383, 991421780
 * Final Project
 * April 5, 2020
 */

package finalproject;

import content.Order;
import content.OrderFile;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayOrdersStage extends Stage {

    private String elements = new String();
    private ArrayList<Order> orderList = OrderFile.getOrders();
    private TextArea txtOrderID = new TextArea(elements);
    private TextField txtSearch = new TextField();
    private Button btnSearch = new Button("Search");

    public DisplayOrdersStage(ArrayList<Order> orderList) throws IOException {
        setScene(addScene());

        btnSearch.setOnAction((e) -> {
            txtOrderID.setText(searchResults());
        });
    }

    private Scene addScene() {
        for (int sub = 0; sub < orderList.size(); sub++) {
            Order one = orderList.get(sub);

            elements += "Order ID: " + one.getOrderID() + "\n"
                    + "Customer ID: " + one.getCustomerID() + "\n"
                    + "Product: " + one.getProduct() + "\n"
                    + "Shipping Method: " + one.getShippingMethod() + "\n\n";

        }
        txtOrderID.setText(elements);
        BorderPane pane = new BorderPane();
        pane.setCenter(txtOrderID);
        pane.setLeft(btnSearch);
        pane.setBottom(txtSearch);
        Scene scene = new Scene(pane, 400, 400);
        return scene;
    }

    private String searchResults() {
        String result = txtSearch.getText();
        String searchElements = new String();
        for (int sub = 0; sub < orderList.size(); sub++) {
            Order one = new Order(orderList.get(sub).getOrderID());
            one = orderList.get(sub);
            if (result.equalsIgnoreCase(orderList.get(sub).getOrderID())) {
                searchElements += "Order ID: " + one.getOrderID() + "\n"
                        + "Customer ID: " + one.getCustomerID() + "\n"
                        + "Product: " + one.getProduct() + "\n"
                        + "Shipping Method: " + one.getShippingMethod()
                        + "\n\n";
            }
        }

        return searchElements;
    }
}
