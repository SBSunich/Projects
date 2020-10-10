/**
 * Sunil Sunichura
 * 991 578 383
 * Assignment 1
 * January 14, 2020
 */
package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StageThree extends Stage {

    private Text name = new Text(70, 20, "Sunil Sunichura");
    private Rectangle rect1 = new Rectangle(30, 30, 10, 180);
    private Arc arc1 = new Arc(100, 220, 100, 15, 45, 90);
    private Ellipse ellipse1 = new Ellipse(170, 120, 10, 90);
    private Pane pane = new Pane(rect1, ellipse1, arc1, name);
    private Scene scene = new Scene(pane, 300, 300);

    public StageThree() {

        Text name = new Text(150, 0, "Sunil Sunichura");
        setTitle("Sunil Sunichura");
        setWidth(300);
        setHeight(300);
        setY(100);
        setX(700);
        setRectangle();
        setEllipse();
        setArc();
        setScene(scene);
    }

    private void setRectangle() {
        rect1.setFill(Color.CADETBLUE);
        rect1.setStroke(Color.BROWN);
        rect1.setStrokeWidth(2.3);
    }

    private void setEllipse() {
        ellipse1.setFill(Color.BROWN);
        ellipse1.setStroke(Color.CADETBLUE);
        ellipse1.setStrokeWidth(2.3);
    }

    private void setArc() {
        arc1.setFill(Color.PURPLE);
        arc1.setStroke(Color.BLACK);
        arc1.setStrokeWidth(0.4);
    }

}
