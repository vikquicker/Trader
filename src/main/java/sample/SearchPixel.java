package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class SearchPixel{
    Color upColor = new Color(38,166,154);
    Color downColor = new Color(239,83,80);
    Color backgroundColor = new Color(255,255,255);
    Color backgroundBolBandsColorThirtyPercent = new Color(249,189,209);
    Color firstColor;
    Color secondColor;
    volatile boolean status = true;


    public Boolean findPixel() throws AWTException {
        Robot robot = new Robot();
        while (status){
            for (int x = 0; x < 1920; x++) {
                for (int y = 0; y < 1080; y++) {
                    firstColor = robot.getPixelColor(x,y);
                    if (true){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void test() throws AWTException {
        while (status) {
                mouseMoveLeft();
                mouseMoveRight();
        }
    }

    public void mouseMoveLeft() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(400,500);
    }
    public void mouseMoveRight() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(800,500);
    }
}
