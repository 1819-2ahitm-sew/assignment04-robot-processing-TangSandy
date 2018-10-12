package at.htl.robot.gui;

import at.htl.robot.model.Robot;
import processing.core.PApplet;


public class Main extends PApplet {

    int leftMargin = 28;
    int upperMargin = 50;
    int boxlenght = 50;
    Robot robot;




    public static void main(String[] args) {
        PApplet.main("at.htl.robot.gui.Main", args);
    }

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        background(209); //https://processing.org/tutorials/color/

        robot = new Robot();
        robot.setX(5);          // Anzhal von x die man einrücken muss
        robot.setY(7);

    }

    /**
     * Diese Methode wird iterativ durchlaufen (wie loop() beim Arduino)
     */
    public void draw() {
        for (int i = 0; i < 11; i++) {
            line(
                    leftMargin + i * boxlenght,
                     upperMargin,
                    leftMargin + i * boxlenght,
                    upperMargin + 10 * boxlenght
            );

            line(
                    leftMargin,
                    upperMargin + i * boxlenght,
                    leftMargin + 10 * boxlenght,
                    upperMargin + i * boxlenght
            );

            int  boxCenterX = leftMargin + robot.getX() * boxlenght  - boxlenght / 2;
            int boxCenterY = upperMargin + robot.getY() * boxlenght  - boxlenght / 2;

            ellipse(boxCenterX, boxCenterY,
                    (int) (boxlenght * 0.8),
                    (int) (boxlenght * 0.8)
            );

        }

    }

    /**
     * Erstellen Sie eine eigene Methode, mittels der der Roboter am Bildschirm gezeichnet wird
     * Die Angabe zu Position des Roboters am Spielfeld erhalten Sie aus dem Roboter-Objekt, welches
     * als Parameter übergeben wird.
     *
     * @param robot Objekt des zu zeichnenden Roboters
     */
    public void drawRobot(Robot robot) {


    }

    /**
     * Erstellen Sie eine eigene Methode zum Löschen des Bildschirms
     */
    public void deleteAll() {
        background(209);
    }

    /**
     * In dieser Methode reagieren Sie auf die Tasten
     */
    public void keyPressed() {
        println("pressed " + key + " " + keyCode);

        if (key == 'f' || key == 'F') {
            robot.stepForward();
        } else if (key == 'l' || key == 'L') {
            robot.rotateLeft();
        }
        deleteAll();
    }

//    public void keyTyped() {
//        println("typed " + key + " " + keyCode);
//    }
//
//    public void keyReleased() {
//        println("released " + key + " " + keyCode);
//    }

}
