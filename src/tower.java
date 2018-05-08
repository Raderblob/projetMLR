import javafx.scene.effect.Light;

public class Tower {

    private int posI;
    private int posJ;
    private int attack;
    private int hp;
    public javafx.geometry.Point2D texCoords;

    public Tower(int posI, int posJ, int attack, int hp,javafx.geometry.Point2D texC) {
        this.posI=posI;
        this.posJ=posJ;
        this.attack=attack;
        this.hp=hp;
        this.texCoords = texC;
    }

    public void takingDamages (int getDamages){
        if (getDamages <= hp) {
            this.hp = hp - getDamages;
        }
        hp=0;
    }

    public int getPosI(){
        return this.posI;
    }

    public int getPosJ(){
        return this.posJ;
    }

    public int getHp(){
        return this.hp;
    }

    public int getAtatck(){
        return this.attack;
    }
}

