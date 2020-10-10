package finalproject;

import content.Customer;
import content.CustomerFile;
import content.Order;
import content.OrderFile;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FinalProject extends Application {

    private ArrayList<Customer> customerList = new ArrayList<>();
    private ArrayList<Order> orderList = new ArrayList<>();
    private Label lblOrderID = new Label("Order ID: ");
    private TextField txtOrderID = new TextField();
    private Label lblCustomerID = new Label("Customer ID: ");
    private TextField txtCustomerID = new TextField();
    private Label lblProduct = new Label("Product: ");
    private TextField txtProduct = new TextField();
    private Label lblShipping = new Label("Shipping method: ");
    private TextField txtShipping = new TextField();

    private Button btnFirst = new Button("First");
    private Button btnNext = new Button("Next");
    private Button btnPrevious = new Button("Previous");
    private Button btnLast = new Button("Last");

    @Override
    public void start(Stage primaryStage) throws IOException {
        customerList = CustomerFile.getCustomerRecords();
        orderList = OrderFile.getOrders();
        Scene scene = new Scene(addPane(), 400, 350);
        setFields();
        primaryStage.setTitle("Hello World!");
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

        pane.add(btnFirst, 1, 5);
        pane.add(btnNext, 2, 5);
        pane.add(btnPrevious, 3, 5);
        pane.add(btnLast, 4, 5);
        return pane;
    }

    private void setFields() {
        txtOrderID.setText(orderList.get(0).getOrderID());
        txtCustomerID.setText(orderList.get(0).getCustomerID());
        txtProduct.setText(orderList.get(0).getProduct());
        txtShipping.setText(orderList.get(0).getShippingMethod());
    }

    public static void main(String[] args) {
        launch(args);
    }

}
