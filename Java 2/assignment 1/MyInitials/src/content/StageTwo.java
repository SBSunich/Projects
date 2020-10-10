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

public class StageTwo extends Stage {

    private Text name = new Text(70, 20, "Sunil Sunichura");
    private Rectangle rect1 = new Rectangle(30, 50, 100, 10);
    private Ellipse ellipse1 = new Ellipse(30, 100, 10, 50);
    private Arc arc1 = new Arc(80, 165, 75, 25, 45, 100);
    private Ellipse ellipse2 = new Ellipse(120, 185, 10, 45);
    private Rectangle rect2 = new Rectangle(30, 225, 100, 10);
    private Pane pane = new Pane(rect1, ellipse1, arc1, ellipse2, rect2, name);
    private Scene scene = new Scene(pane, 300, 300);

    public StageTwo() {

        setTitle("Sunil Sunichura");
        setWidth(300);
        setHeight(300);
        setY(100);
        setX(400);
        setRectangle1();
        setRectangle2();
        setEllipse1();
        setEllipse2();
        setArc();
        setScene(scene);
    }

    private void setRectangle1() {
        rect1.setFill(Color.LIGHTBLUE);
        rect1.setStroke(Color.LIGHTSALMON);
        rect1.setStrokeWidth(4.5);
    }

    private void setRectangle2() {
        rect2.setFill(Color.LIGHTBLUE);
        rect2.setStroke(Color.LIGHTSALMON);
        rect2.setStrokeWidth(4.5);
    }

    private void setEllipse1() {
        ellipse1.setFill(Color.ALICEBLUE);
        ellipse1.setStroke(Color.BLACK);
        ellipse1.setStrokeWidth(2.0);
    }

    private void setEllipse2() {
        ellipse2.setFill(Color.ALICEBLUE);
        ellipse2.setStroke(Color.BLACK);
        ellipse2.setStrokeWidth(2.0);
    }

    private void setArc() {
        arc1.setFill(Color.SEASHELL);
        arc1.setStroke(Color.FIREBRICK);
        arc1.setStrokeWidth(2.1);
    }

}
