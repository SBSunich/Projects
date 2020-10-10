/**
 * Sunil Sunichura
 * Student Number: 991578383
 * Assignment 3
 * March 11, 2020
 */
package studentfx;

import content.Student;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayStage extends Stage {

    private ArrayList<Student> studentList = new ArrayList<>();
    private String elements = new String();
    private int mathAvg;
    private int gymAvg;
    private int scienceAvg;
    private int geoAvg;
    private int musicAvg;
    private int overAvg;
    public Button btnAddAnother = new Button("Add Another Student");
    private Button btnSave = new Button("Save");

    public DisplayStage(ArrayList<Student> studentList) {
        btnAddAnother.setOnAction((e) -> {
            close();
        });

        btnSave.setOnAction((e) -> {
            setData(elements);
        });

        this.studentList = studentList;
        setScene(addScene());
    }

    private Scene addScene() {
        for (int sub = 0; sub < studentList.size(); sub++) {
            Student one = studentList.get(sub);
            elements += "Student ID: " + one.getStdId() + "      "
                    + "Student Overall "
                    + "Average: " + one.getStuOverAvg() + "\nMath Overall "
                    + "Average: " + calculateMathAvg() + "\nGym Overall "
                    + "Average: " + calculateGymAvg() + "\nScience Overall "
                    + "Average: " + calculateScienceAvg() + "\nGeography "
                    + "Overall Average: " + calculateGeoAvg() + "\nMusic "
                    + "Overall Grade: " + calculateMusicAvg() + "\nOverall "
                    + "Average For All Students: " + calculateOverAvg()
                    + "\n\n";
        }
        TextArea txtDisplay = new TextArea(elements);
        BorderPane pane = new BorderPane();
        pane.setCenter(txtDisplay);
        pane.setTop(btnAddAnother);
        pane.setBottom(btnSave);
        Scene scene = new Scene(pane, 400, 400);
        return scene;
    }

    public int calculateMathAvg() {
        int mathGrade = 0;
        for (int sub = 0; sub < studentList.size(); sub++) {
            mathGrade += studentList.get(sub).getMathGrade();
        }
        this.mathAvg = mathGrade / studentList.size();
        return this.mathAvg;
    }

    public int calculateGymAvg() {
        int gymGrade = 0;
        for (int sub = 0; sub < studentList.size(); sub++) {
            gymGrade += studentList.get(sub).getGymGrade();
        }
        this.gymAvg = gymGrade / studentList.size();
        return this.gymAvg;
    }

    public int calculateScienceAvg() {
        int scienceGrade = 0;
        for (int sub = 0; sub < studentList.size(); sub++) {
            scienceGrade += studentList.get(sub).getScienceGrade();
        }
        this.scienceAvg = scienceGrade / studentList.size();
        return this.scienceAvg;
    }

    public int calculateGeoAvg() {
        int geoGrade = 0;
        for (int sub = 0; sub < studentList.size(); sub++) {
            geoGrade += studentList.get(sub).getGeoGrade();
        }
        this.geoAvg = geoGrade / studentList.size();
        return this.geoAvg;
    }

    public int calculateMusicAvg() {
        int musicGrade = 0;
        for (int sub = 0; sub < studentList.size(); sub++) {
            musicGrade += studentList.get(sub).getMusicGrade();
        }
        this.musicAvg = musicGrade / studentList.size();
        return this.musicAvg;
    }

    public int calculateOverAvg() {
        this.overAvg = (this.mathAvg + this.gymAvg + this.scienceAvg
                + this.geoAvg + this.musicAvg) / 5;
        return this.overAvg;
    }

    public static void setData(String elements) {
        try {
            FileWriter fw = new FileWriter("Student.dat");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(elements);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
