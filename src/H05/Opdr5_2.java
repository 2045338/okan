package H05;

import java.applet.Applet;
import java.awt.*;


public class Opdr5_2 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;


    public void init() {
        setBackground(Color.white);
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        breedte = 50;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawLine(80,80,80,340);
        g.setColor(lijnkleur);
        g.fillRect(100,240,breedte,hoogte);
        g.setColor(Color.blue);
        g.fillRect(170,140,breedte,hoogte);
        g.setColor(Color.red);
        g.fillRect(240,100,breedte,hoogte);
        g.setColor(lijnkleur);
        //namen
        g.drawString("Valerie",105,360);
        g.setColor(Color.blue);
        g.drawString("Hans",175,360);
        g.setColor(Color.red);
        g.drawString("Jeroen",245,360);
        //nummers
        g.setColor(Color.gray);
        g.drawString("20",60,300);
        g.setColor(Color.gray);
        g.drawString("40",60,250);
        g.setColor(Color.gray);
        g.drawString("60",60,190);
        g.setColor(Color.gray);
        g.drawString("80",60,130);
        g.setColor(Color.gray);
        g.drawString("100",55,80);








    }
}