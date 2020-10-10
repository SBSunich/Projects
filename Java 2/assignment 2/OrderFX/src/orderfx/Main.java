/**
 * Sunil Sunichura
 * Student Number: 991578383
 * Assignment 2
 * February 25, 2020
 */
package orderfx;

import content.DisplayOrder;
import content.Order;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    private final Label lblId = new Label("Order ID: ");
    private final TextField txtId = new TextField();
    private final Label lblFName = new Label("First Name: ");
    private final TextField txtFName = new TextField();
    private final Label lblLName = new Label("Last Name: ");
    private final TextField txtLName = new TextField();
    private final Label lblCity = new Label("City: ");
    private final TextField txtCity = new TextField();

    private final Circle circle = new Circle(25);
    private final Rectangle rect1 = new Rectangle(10, 10, 50, 50);
    private final Ellipse elli = new Ellipse(10, 30);
    private final Rectangle rect2 = new Rectangle(10, 10, 50, 50);

    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    private int num4 = 0;

    private final HBox pane1 = new HBox(20, circle, rect1, elli, rect2);
    private final Label label = new Label("Click shape to add to order");
    private final HBox pane2 = new HBox(label);
    private final HBox pane3 = new HBox(20);
    private final VBox pane = new VBox(20, pane1, pane2, pane3);
    private final Button btnDisplay = new Button("Display Order");

    @Override
    public void start(Stage primaryStage) {

        circle.setOnMouseClicked((e) -> {
            pane3.getChildren().add(addCircle());
            this.num1 = num1 + 1;
        });

        circle.setFill(Color.RED);

        rect1.setOnMouseClicked((e) -> {
            pane3.getChildren().add(addRectangle1());
            this.num2 = num2 + 1;
        });
        rect1.setFill(Color.BLUE);

        elli.setOnMouseClicked((e) -> {
            pane3.getChildren().add(addEllipse());
            this.num3 = num3 + 1;
        });

        elli.setFill(Color.GREEN);

        rect2.setOnMouseClicked((e) -> {
            pane3.getChildren().add(addRectangle2());
            this.num4 = num4 + 1;
        });

        rect2.setFill(Color.ORANGE);

        btnDisplay.setOnAction((e) -> {
            Order one = new Order();
            String orderID = txtId.getText();
            String firstName = txtFName.getText();
            String lastName = txtLName.getText();
            String city = txtCity.getText();
            int num1 = this.num1;
            int num2 = this.num2;
            int num3 = this.num3;
            int num4 = this.num4;
            one.setOrderID(orderID);
            one.setFirstName(firstName);
            one.setLastName(lastName);
            one.setCity(city);
            one.setNum1(num1);
            one.setNum2(num2);
            one.setNum3(num3);
            one.setNum4(num4);
            DisplayOrder ds = new DisplayOrder(one);
            ds.show();

        });
        Scene scene = new Scene(getGrid(), 500, 500);

        primaryStage.setTitle("Select your order");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private Circle addCircle() {
        Circle c1 = new Circle(20);
        c1.setFill(Color.RED);
        c1.setStroke(Color.BLACK);
        return c1;
    }

    private Rectangle addRectangle1() {
        Rectangle r1 = new Rectangle(10, 10, 40, 40);
        r1.setFill(Color.BLUE);
        r1.setStroke(Color.BLACK);
        return r1;
    }

    private Ellipse addEllipse() {
        Ellipse e1 = new Ellipse(5, 20);
        e1.setFill(Color.GREEN);
        e1.setStroke(Color.BLACK);
        return e1;
    }

    private Rectangle addRectangle2() {
        Rectangle r2 = new Rectangle(10, 10, 40, 40);
        r2.setFill(Color.ORANGE);
        r2.setStroke(Color.BLACK);
        return r2;
    }

    private GridPane getGrid() {
        GridPane pane4 = new GridPane();
        pane4.add(lblId, 0, 0);
        pane4.add(txtId, 1, 0);
        pane4.add(lblFName, 0, 1);
        pane4.add(txtFName, 1, 1);
        pane4.add(lblLName, 0, 2);
        pane4.add(txtLName, 1, 2);
        pane4.add(lblCity, 0, 3);
        pane4.add(txtCity, 1, 3);
        pane4.add(pane, 1, 4);
        pane4.add(btnDisplay, 1, 5);
        return pane4;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
