package H06;


import java.awt.*;
import java.applet.*;


public class Opdr6_2 extends Applet {
    double seconden;
    double uur;
    double dag;
    double jaar;
    double uitkomst1;
    double uitkomst2;
    double uitkomst3;





    public void init() {
        seconden=60;
        uur=3600;
        dag=86400;
        jaar=31536000;

        uitkomst1=seconden*60;
        uitkomst2=uur*24;
        uitkomst3=dag*365;


    }

    public void paint(Graphics g) {
        g.drawString("er zitten"+uitkomst1, 20,20  );
        g.drawString("seconden in een uur", 120, 20 );
        g.drawString("er zitten"+uitkomst2, 20, 40 );
        g.drawString("seconden in een dag", 130, 40 );
        g.drawString("er zitten"+uitkomst3, 20, 60 );
        g.drawString("seconden in een jaar", 125, 60 );

    }
}

