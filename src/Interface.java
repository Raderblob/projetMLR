import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

import java.io.File;

public class Interface {
    private Image myBackground ;
    private Button menuButton;
    private Button addUnitButton;
    private Button changeUnitButton;
    private int selectedUnit=0;
    Map myMap;

    public Interface(Group myRoot, Map myM){
        myMap=myM;
        myBackground = new Image(new File("resources\\placeholderMenu.png").toURI().toString() );

        menuButton = new Button("OpenMenu");
        menuButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //Open menu
            }
        });
        menuButton.setLayoutX(0);
        menuButton.setLayoutY(550);
        myRoot.getChildren().add(menuButton);

        addUnitButton = new Button("Spawn Unit");
        addUnitButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //spawn the tower obliterating unit
                myMap.addUnit(0);
            }
        });
        addUnitButton.setLayoutX(100);
        addUnitButton.setLayoutY(550);
        myRoot.getChildren().add(addUnitButton);

        changeUnitButton = new Button("Change selected Unit");
        changeUnitButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                selectedUnit += 1;
                if(selectedUnit > 5)
                {
                    selectedUnit =0;
                }
            }
        });
        changeUnitButton.setLayoutX(200);
        changeUnitButton.setLayoutY(550);
        myRoot.getChildren().add(changeUnitButton);


    }

    public void renderMe(GraphicsContext myGraphics){
        myGraphics.drawImage(myBackground,0,0);

    }
}
