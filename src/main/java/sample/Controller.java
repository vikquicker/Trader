package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;


public class Controller{
    SearchPixel searchPixel = new SearchPixel();
//    ExecutorService pool = Executors.newFixedThreadPool(3);
    Thread threadStop;
    Thread threadSearch;

    @FXML
    Button ok;

    @FXML
    Button stop;

    public void search(ActionEvent actionEvent) {
        final ExecutorService pool = Executors.newSingleThreadExecutor();
        pool.submit(new Runnable() {
            public void run() {
                searchPixel.status = true;
                try {
                    searchPixel.test();
                } catch (AWTException e) {
                    e.printStackTrace();
                }
                pool.shutdown();
            }
        });
    }

    public void stop(ActionEvent actionEvent) {
        searchPixel.status = false;
    }

}
