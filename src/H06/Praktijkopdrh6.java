package H06;

import java.applet.Applet;
import java.awt.*;


public class Praktijkopdrh6 extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;


    double uitkomst;
    double gemiddelde;
    int afgekapt;


    public void init() {
        super.init();
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;

    }

        public void paint(Graphics g){
            super.paint(g);
            g.drawString(" "+ gemiddelde,50,50);





    }




    }


