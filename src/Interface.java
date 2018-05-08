import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Interface {
    private Image myBackground ;

    public Interface(){
        myBackground = new Image(getClass().getResource("placeholderMenu.png").toExternalForm());
    }

    public void renderMe(GraphicsContext myGraphics){
        myGraphics.drawImage(myBackground,0,0);
    }
}
