import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Map {
    //800,600 cases : 16,12
    //constructeur
    String ImageFileName;
    Tower[] tours;
    public Image myMap;
    private Image colliImage;
    private List<Unities> myUnities;
    private Image towerAtlas;
    private Image thanosImg;

    public Map(String ImageFileName, Tower[] tours ){
        this.ImageFileName = ImageFileName;
        this.tours = tours;
        myUnities = new ArrayList<Unities>();
        myMap = new Image(new File(ImageFileName).toURI().toString() );
        colliImage =  new Image(new File("resources\\Grille.png").toURI().toString());
        towerAtlas = new Image(new File("resources\\Towers.gif").toURI().toString());
        thanosImg = new Image(new File("resources\\miniThanos.gif").toURI().toString());
        myUnities.add(new Unities(10,10,533/50,565/50));
    }

    public void addUnit(int unitType)
    {
        switch (unitType){
            case 0:
                myUnities.add(new Unities(100,1,533/50,565/50));
                break;
            case 2:
                myUnities.add(new Unities(1,100,533/50,565/50));
                break;
        }
    }


    public void avance(){
        for(int i = myUnities.toArray().length-1; i>-1;i--)
        {
            myUnities.get(i).move(colliImage);
            if (myUnities.get(i).posI*50 == 400 && myUnities.get(i).posJ*50==100)
            {
                myUnities.remove(i);
            }
        }

    }

    public void renderMe(GraphicsContext myGC)
    {
        for(int i = 0;i< tours.length;i++)
        {
            myGC.drawImage(towerAtlas,tours[i].texCoords.getX(),tours[i].texCoords.getY(),161,202,tours[i].getPosI()*50,tours[i].getPosJ()*50,50,50);
        }
        for(int i = 0;i< myUnities.toArray().length;i++)
        {
            myGC.drawImage(thanosImg,myUnities.get(i).posI*50,myUnities.get(i).posJ*50,50,50);
        }
    }



}
