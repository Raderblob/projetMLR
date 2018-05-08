import javafx.geometry.Point2D;
public class Unities {

    private int attack;
    private int hp;
    private int posI;
    private int posJ;
    private int velocity;


    public Unities (int attack, int hp, int posI, int posJ, int velocity){
        this.attack = attack;
        this.hp=hp;
        this.posI=posI;
        this.posJ=posJ;
        this.velocity=velocity;

    }

    public void getDamages (int getDamages){

        if (getDamages <= hp) {
            this.hp = hp - getDamages;
        }

        hp=0;
    }

    public void move (int posIf, int posJf){
        Point2D movement = new Point2D (posJf-posJ, posIf-posI);

    }

    public int getHp(){
        return this.hp;
    }

    public int getAttack(){
        return this.attack;
    }
}
