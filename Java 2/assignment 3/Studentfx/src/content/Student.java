/**
 * Sunil Sunichura
 * Student Number: 991578383
 * Assignment 3
 * March 11, 2020
 */
package content;

public class Student {

    private int stdId;
    private int stuOverAvg;
    private int mathGrade;
    private int gymGrade;
    private int scienceGrade;
    private int geoGrade;
    private int musicGrade;

    public Student(int stdId) {
        this.stdId = stdId;
    }

    public int getStdId() {
        return this.stdId;
    }

    public void calculateStuOverAvgGrade() {
        this.stuOverAvg = (this.getMathGrade() + this.getGymGrade()
                + this.getGeoGrade() + this.getMusicGrade()
                + this.getScienceGrade()) / 5;
    }

    public double getStuOverAvg() {
        calculateStuOverAvgGrade();
        return this.stuOverAvg;
    }

    public int getMathGrade() {
        return this.mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getGymGrade() {
        return gymGrade;
    }

    public void setGymGrade(int gymGrade) {
        this.gymGrade = gymGrade;
    }

    public int getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(int scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public int getGeoGrade() {
        return geoGrade;
    }

    public void setGeoGrade(int geoGrade) {
        this.geoGrade = geoGrade;
    }

    public int getMusicGrade() {
        return musicGrade;
    }

    public void setMusicGrade(int musicGrade) {
        this.musicGrade = musicGrade;
    }

}
