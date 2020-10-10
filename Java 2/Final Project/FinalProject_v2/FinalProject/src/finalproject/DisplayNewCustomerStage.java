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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayNewCustomerStage extends Stage {

    private ArrayList<Customer> customerList
            = CustomerFile.getCustomerRecords();
    private String custData = new String();
    private Label lblCustomerID = new Label("Customer ID: ");
    public static TextField txtCustomerID = new TextField();
    private Label lblName = new Label("name: ");
    private TextField txtName = new TextField();
    private Label lblStreetAddress = new Label("street: ");
    private TextField txtStreetAddress = new TextField();
    private Label lblCity = new Label("city: ");
    private TextField txtCity = new TextField();
    private Button btnAddCus = new Button("Add New Customer");

    public DisplayNewCustomerStage(ArrayList<Customer> customerList) throws
            IOException {

        btnAddCus.setOnAction((e) -> {
            try {
                addCustomer();
                close();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        });
        setScene(addScene());

    }

    private Scene addScene() {
        Scene scene = new Scene(addPane(), 400, 400);
        return scene;
    }

    private void addCustomer() throws IOException {
        Customer one = new Customer(txtCustomerID.getText());
        one.setName(txtName.getText());
        one.setStreetAddress(txtStreetAddress.getText());
        one.setCity(txtCity.getText());
        customerList.add(one);
        CustomerFile.setCustomerRecords(customerList);
        txtCustomerID.clear();
        txtName.clear();
        txtStreetAddress.clear();
        txtCity.clear();
        txtCustomerID.requestFocus();

    }

    private GridPane addPane() {
        GridPane pane = new GridPane();
        pane.add(lblCustomerID, 0, 0);
        pane.add(txtCustomerID, 1, 0);
        pane.add(lblName, 0, 1);
        pane.add(txtName, 1, 1);
        pane.add(lblStreetAddress, 0, 2);
        pane.add(txtStreetAddress, 1, 2);
        pane.add(lblCity, 0, 3);
        pane.add(txtCity, 1, 3);
        pane.add(btnAddCus, 1, 5);

        return pane;
    }

}
