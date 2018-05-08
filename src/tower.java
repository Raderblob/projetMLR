public class tower {

    private int posI;
    private int posJ;
    private int attack;
    private int hp;

    public tower(int posI, int posJ, int attack, int hp) {
        this.posI=posI;
        this.posJ=posJ;
        this.attack=attack;
        this.hp=hp;
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

