import java.awt.*;

public class MapConfig {

    private int[][] infosTours1= {{1,1,100,2000},{10,6,100,2000}};
    Tower[] tours1 = new Tower[2];
    public Map map1;

    public MapConfig(){

        towerConfig();

        map1 = new Map("resources\\Grille.bmp", tours1 );
    }

    private void towerConfig(){
        for(int i=0;i<infosTours1.length;i++) {
            Tower tour = new Tower(infosTours1[i][0], infosTours1[i][1], infosTours1[i][2], infosTours1[i][3],new javafx.geometry.Point2D(80,178));
            tours1[i]=tour;

        }

    }


}
