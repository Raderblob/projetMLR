import com.sun.scenario.effect.light.SpotLight;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static javafx.beans.binding.Bindings.select;
public class Main extends Application {
    static public long lastNanoTime;

    public static void main(String[] args) {
        System.out.println("If you see this then you got githb to work");
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Soo What now?");
        primaryStage.show();

        lastNanoTime = System.nanoTime();
        AnimationTimer animator = new AnimationTimer(){

            @Override
            public void handle(long arg0) {

            }
        };

        animator.start();
    }
}






