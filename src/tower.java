public class Tower {

    private double posI;
    private double posJ;
    private double attack;
    private double hp;

    public Tower(double posI, double posJ, double attack, double hp) {
        this.posI=posI;
        this.posJ=posJ;
        this.attack=attack;
        this.hp=hp;
    }

    public void attacking (double damages){


    }

    public void takingDamages (double getDamages){

        if (getDamages <= hp) {
            this.hp = hp - getDamages;
        }

        hp=0;
    }
}
