/**
 * Sunil Sunichura, Sudesh Sunichura
 * Student Number: 991578383, 991421780
 * Final Project
 * April 5, 2020
 */

package finalproject;

import content.Customer;
import content.CustomerFile;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayCustomersStage extends Stage {

    private String elements = new String();
    private ArrayList<Customer> customerList
            = CustomerFile.getCustomerRecords();
    private TextArea txtCustomers = new TextArea(elements);
    private TextField txtSearch = new TextField();
    private Button btnSearch = new Button("Search");

    public DisplayCustomersStage(ArrayList<Customer> customerList)
            throws IOException {
        setScene(addScene());
        txtCustomers.setText(displayAll());
        btnSearch.setOnAction((e) -> {
            txtCustomers.setText(searchResults());
        });

    }

    private String searchResults() {
        String result = txtSearch.getText();
        String elements = new String();
        for (int sub = 0; sub < customerList.size(); sub++) {
            Customer one = new Customer(customerList.get(sub).getID());
            one = customerList.get(sub);
            if (result.equalsIgnoreCase(customerList.get(sub).getID())) {
                elements += "Customer ID: " + one.getID() + "\n"
                        + "Name: " + one.getName() + "\n"
                        + "Street Address: " + one.getStreetAdress() + "\n"
                        + "City: " + one.getCity() + "\n\n";
            }

        }

        return elements;
    }

    private String displayAll() {
        String allCustomers = new String();
        for (int sub = 0; sub < customerList.size(); sub++) {
            Customer one = new Customer(customerList.get(sub).getID());
            one = customerList.get(sub);

            allCustomers += "Customer ID: " + one.getID() + "\n"
                    + "Name: " + one.getName() + "\n"
                    + "Street Address: " + one.getStreetAdress() + "\n"
                    + "City: " + one.getCity() + "\n\n";

        }
        return allCustomers;
    }

    private Scene addScene() {

        BorderPane pane = new BorderPane();
        pane.setCenter(txtCustomers);
        pane.setLeft(btnSearch);
        pane.setBottom(txtSearch);
        Scene scene = new Scene(pane, 400, 400);
        return scene;
    }
}
