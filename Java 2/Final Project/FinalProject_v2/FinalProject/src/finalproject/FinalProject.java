/**
 * Sunil Sunichura, Sudesh Sunichura
 * Student Number: 991578383, 991421780
 * Final Project
 * April 5, 2020
 */

package finalproject;

import content.Customer;
import content.CustomerFile;
import content.Order;
import content.OrderFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FinalProject extends Application {

    private int count = 0;
    private ArrayList<Customer> customerList;
    private ArrayList<Order> orderList;
    private Label lblOrderID = new Label("Order ID: ");
    private TextField txtOrderID = new TextField();
    private Label lblCustomerID = new Label("Customer ID: ");
    private TextField txtCustomerID = new TextField();
    private Label lblProduct = new Label("Product: ");
    private TextField txtProduct = new TextField();
    private Label lblShipping = new Label("Shipping method: ");
    private TextField txtShipping = new TextField();
    private boolean addClick = false;

    private Button btnFirst = new Button("First");
    private Button btnNext = new Button("Next");
    private Button btnPrevious = new Button("Previous");
    private Button btnLast = new Button("Last");
    private Button btnUpdate = new Button("Update");
    private Button btnDelete = new Button("Delete");
    private Button btnAdd = new Button("Add");
    private Button btnDisplay = new Button("Display");

    @Override
    public void start(Stage primaryStage) throws IOException {
        customerList = CustomerFile.getCustomerRecords();
        orderList = OrderFile.getOrders();
        int size = orderList.size() - 1;
        btnNext.setOnAction((e) -> {
            count++;
            if (count > size) {
                count = 0;
                nextField(orderList, count);
            } else {
                nextField(orderList, count);
            }
        });
        btnPrevious.setOnAction((e) -> {
            count--;
            if (count < 0) {
                count = size;
                previousField(orderList, count);
            } else {

                previousField(orderList, count);

            }
        });

        btnFirst.setOnAction((e) -> {
            setFields(orderList);
        });

        btnLast.setOnAction((e) -> {
            lastField(orderList);
        });

        btnUpdate.setOnAction((e) -> {
            if (addClick == true) {
                Alert dlgConfirmation = new Alert(AlertType.CONFIRMATION);
                Optional<ButtonType> result = dlgConfirmation.showAndWait();
                if (result.get() == ButtonType.OK) {
                    try {
                        newCustomerOrder();
                    } catch (IOException ex) {
                        System.err.println(ex);
                    }
                }
            } else {
                Alert dlgConfirmation = new Alert(AlertType.CONFIRMATION);
                Optional<ButtonType> result = dlgConfirmation.showAndWait();
                if (result.get() == ButtonType.OK) {
                    updateOrder(orderList, count);
                }
            }
        });

        btnDelete.setOnAction((e) -> {
            Alert dlgConfirmation = new Alert(AlertType.CONFIRMATION);
            Optional<ButtonType> result = dlgConfirmation.showAndWait();
            if (result.get() == ButtonType.OK) {
                deleteOrder(orderList, count);
            }
        });

        btnAdd.setOnAction((e) -> {
            txtOrderID.clear();
            txtCustomerID.clear();
            txtProduct.clear();
            txtShipping.clear();
            txtOrderID.focusedProperty();
            newOrder();
            addClick = true;
        });

        btnDisplay.setOnAction((e) -> {
            try {
                DisplayCustomersStage dcs
                        = new DisplayCustomersStage(customerList);
                dcs.show();
            } catch (IOException ex) {
                System.err.println(ex);
            }
            try {
                DisplayOrdersStage dos = new DisplayOrdersStage(orderList);
                dos.show();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        });

        Scene scene = new Scene(addPane(), 500, 500);
        setFields(orderList);
        primaryStage.setTitle("Store Orders");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane addPane() {
        GridPane pane = new GridPane();
        pane.add(lblOrderID, 0, 0);
        pane.add(txtOrderID, 1, 0);
        pane.add(lblCustomerID, 0, 1);
        pane.add(txtCustomerID, 1, 1);
        pane.add(lblProduct, 0, 2);
        pane.add(txtProduct, 1, 2);
        pane.add(lblShipping, 0, 3);
        pane.add(txtShipping, 1, 3);

        pane.add(btnFirst, 0, 5);
        pane.add(btnNext, 0, 6);
        pane.add(btnPrevious, 0, 7);
        pane.add(btnLast, 0, 8);
        pane.add(btnUpdate, 1, 5);
        pane.add(btnDelete, 1, 6);
        pane.add(btnAdd, 1, 7);
        pane.add(btnDisplay, 1, 8);
        return pane;
    }

    private void setFields(ArrayList<Order> orderList) {
        txtOrderID.setText(orderList.get(0).getOrderID());
        txtCustomerID.setText(orderList.get(0).getCustomerID());
        txtProduct.setText(orderList.get(0).getProduct());
        txtShipping.setText(orderList.get(0).getShippingMethod());
    }

    private void nextField(ArrayList<Order> orderList, int count) {
        txtOrderID.setText(orderList.get(count).getOrderID());
        txtCustomerID.setText(orderList.get(count).getCustomerID());
        txtProduct.setText(orderList.get(count).getProduct());
        txtShipping.setText(orderList.get(count).getShippingMethod());

    }

    private void previousField(ArrayList<Order> orderList, int count) {
        txtOrderID.setText(orderList.get(count).getOrderID());
        txtCustomerID.setText(orderList.get(count).getCustomerID());
        txtProduct.setText(orderList.get(count).getProduct());
        txtShipping.setText(orderList.get(count).getShippingMethod());

    }

    private void lastField(ArrayList<Order> orderList) {
        txtOrderID.setText(orderList.get(orderList.size()
                - 1).getOrderID());
        txtCustomerID.setText(orderList.get(orderList.size()
                - 1).getCustomerID());
        txtProduct.setText(orderList.get(orderList.size() - 1).getProduct());
        txtShipping.setText(orderList.get(orderList.size()
                - 1).getShippingMethod());

    }

    private void updateOrder(ArrayList<Order> orderList, int count) {
        orderList.get(count).setProduct(txtProduct.getText());
        orderList.get(count).setShippingMethod(txtShipping.getText());
    }

    private void deleteOrder(ArrayList<Order> orderList, int count) {
        orderList.remove(count);
    }

    private void newOrder() {
        Order one = orderList.get(orderList.size() - 1);
        int lastOrderID = Integer.parseInt((one.getOrderID().substring(1,
                one.getOrderID().length())));
        int newOrderID = lastOrderID + 1;
        String orderID = "O" + newOrderID;
        txtOrderID.setText(orderID);
    }

    private void newCustomerOrder() throws IOException {
        DisplayNewCustomerStage dncs = 
                new DisplayNewCustomerStage(customerList);
        String custID = new String();
        int count = 0;
        for (int sub = 0; sub < customerList.size(); sub++) {
            if (!txtCustomerID.getText().equalsIgnoreCase(custID)) {
                Customer two = customerList.get(customerList.size() - 1);
                int lastCustomerID = Integer.parseInt((two.getID().substring(1,
                        two.getID().length())));
                int newCustomerID = lastCustomerID + 1;
                String customerID = "C" + newCustomerID;
                dncs.txtCustomerID.setText(customerID);
                dncs.show();
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
