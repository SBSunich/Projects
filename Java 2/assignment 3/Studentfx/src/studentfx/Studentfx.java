/**
 * Sunil Sunichura
 * Student Number: 991578383
 * Assignment 3
 * March 11, 2020
 */
package studentfx;

import content.Student;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Studentfx extends Application {

    private ArrayList<Student> studentList = new ArrayList<>();
    private Label lblStdId = new Label("Student ID: ");
    private TextField txtStdId = new TextField();
    private Label lblMath = new Label("Math Grade: ");
    private TextField txtMath = new TextField();
    private Label lblGym = new Label("Gym Grade: ");
    private TextField txtGym = new TextField();
    private Label lblScience = new Label("Science Grade: ");
    private TextField txtScience = new TextField();
    private Label lblGeo = new Label("Geography Grade: ");
    private TextField txtGeo = new TextField();
    private Label lblMusic = new Label("Music Grade: ");
    private TextField txtMusic = new TextField();
    private Button btnAdd = new Button("Add Student");

    @Override
    public void start(Stage primaryStage) {

        btnAdd.setOnAction((e) -> {
            addStudent();
            DisplayStage stage = new DisplayStage(studentList);
            stage.show();
        });

        Scene scene = new Scene(addPane(), 350, 300);
        primaryStage.setTitle("Student Record");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addStudent() {
        Student one = new Student(Integer.parseInt(txtStdId.getText()));
        one.setMathGrade(Integer.parseInt(txtMath.getText()));
        one.setGymGrade(Integer.parseInt(txtGym.getText()));
        one.setScienceGrade(Integer.parseInt(txtScience.getText()));
        one.setGeoGrade(Integer.parseInt(txtGeo.getText()));
        one.setMusicGrade(Integer.parseInt(txtMusic.getText()));
        studentList.add(one);

        txtStdId.clear();
        txtMath.clear();
        txtGym.clear();
        txtScience.clear();
        txtGeo.clear();
        txtMusic.clear();
        txtStdId.requestFocus();
    }

    private GridPane addPane() {
        GridPane pane = new GridPane();
        pane.add(lblStdId, 0, 0);
        pane.add(txtStdId, 1, 0);
        pane.add(lblMath, 0, 1);
        pane.add(txtMath, 1, 1);
        pane.add(lblGym, 0, 2);
        pane.add(txtGym, 1, 2);
        pane.add(lblScience, 0, 3);
        pane.add(txtScience, 1, 3);
        pane.add(lblGeo, 0, 4);
        pane.add(txtGeo, 1, 4);
        pane.add(lblMusic, 0, 5);
        pane.add(txtMusic, 1, 5);
        pane.add(btnAdd, 1, 6);
        return pane;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
