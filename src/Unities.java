import javafx.geometry.Point2D;
import javafx.scene.image.Image;

import java.awt.image.BufferedImage;

public class Unities {

    private int attack;
    private int hp;
    public int posI;
    public int posJ;
    private int counter;
    private int myDir;


    public Unities (int attack, int hp, int posI, int posJ){
        this.attack = attack;
        this.hp=hp;
        this.posI=posI;
        this.posJ=posJ;
        this.counter= 0;
    }

    public void getDamages (int getDamages){

        if (getDamages <= hp) {
            this.hp = hp - getDamages;
        }

        hp=0;
    }


    public void move (Image Platform){

     if(counter == 0) {
         Point2D myCartPosUp = getCartCoords(new Point2D(posI, posJ - 1));
         Point2D myCartPosRight = getCartCoords(new Point2D(posI + 1, posJ));
         Point2D myCartPosLeft = getCartCoords(new Point2D(posI - 1, posJ));
         Point2D temp = new Point2D(posI,posJ);
        if (Platform.getPixelReader().getColor((int)myCartPosUp.getX()+25,(int)myCartPosUp.getY()+25).getBrightness() < 0.1) {
             posJ -= 1;
             myDir=0;
         } else if (Platform.getPixelReader().getColor((int) myCartPosRight.getX()+25, (int) myCartPosRight.getY()+25).getBlue() < 0.1 && myDir !=-1) {
             posI +=1;
            myDir=1;
         } else if (Platform.getPixelReader().getColor((int) myCartPosLeft.getX()+25, (int) myCartPosLeft.getY()+25).getBlue() < 0.1 && myDir != 1) {
             posI-=1;
             myDir=-1;
         }



     }
     counter+=1;
     if (counter>80){
         counter=0;
     }
    }

    public Point2D getCartCoords(Point2D pos)
    {
        Point2D res = new Point2D(pos.getX()*50,pos.getY()*50);
        return res;
    }
    public Point2D getTablCoords(Point2D pos)
    {
        Point2D res = new Point2D(pos.getX()/50,pos.getY()/50);
        return res;
    }

    public int getHp(){
        return this.hp;
    }

    public int getAttack(){
        return this.attack;
    }
}
