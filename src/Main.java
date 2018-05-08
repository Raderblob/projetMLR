import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;


import static javafx.beans.binding.Bindings.select;
public class Main extends Application {
    static public long lastNanoTime;
    static private Interface myInterface;

    public static void main(String[] args) {
        System.out.println("If you see this then you got githb to work");
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Soo What now?");

        Group root = new Group();
        Canvas canvas = new Canvas(800,600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);

        //stuff
        myInterface = new Interface();

        //endstuff

        primaryStage.setScene(new Scene(root));
        primaryStage.show();


        lastNanoTime = System.nanoTime();
        AnimationTimer animator = new AnimationTimer(){

            @Override
            public void handle(long arg0) {
                double cTime = (arg0- lastNanoTime)/10000;
                lastNanoTime = arg0;

                logic(cTime);

                render(gc);
            }
        };

        animator.start();
    }


    public void logic(double loopTime){

    }

    public void render(GraphicsContext displayGraphics){
        myInterface.renderMe(displayGraphics);
        displayGraphics.fillRect(10,10,80,50);
    }
}






