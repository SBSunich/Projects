/**
 * Sunil Sunichura
 * 991 578 383
 * Assignment 1
 * January 14, 2020
 */
package myinitials;

import content.StageThree;
import content.StageTwo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Text name = new Text(70, 20, "Sunil Sunichura");
        ImageView fred = new ImageView("images/fred.jpg");
        fred.setFitHeight(225);
        fred.setFitWidth(225);
        fred.setX(25);
        fred.setY(25);
        Pane pane = new Pane(fred, name);
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Sunil Sunichura");
        primaryStage.setScene(scene);
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.setY(100);
        primaryStage.setX(100);
        primaryStage.show();

        StageTwo stageTwo = new StageTwo();
        stageTwo.show();

        StageThree stageThree = new StageThree();
        stageThree.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
