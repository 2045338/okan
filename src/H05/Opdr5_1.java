package H05;
import java.applet.Applet;
import java.awt.*;

public class Opdr5_1 extends Applet{
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {

        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 50;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawLine(10, 20, 120, 20);
        g.drawString("Lijn", 50, 35);
        g.drawRect(10, 40, 110, 50);
        g.drawString("rechthoek", 35, 105);
        g.drawRoundRect(10, 110, 110, 60, 15, 15);
        g.drawString("Afgeronde rechthoek", 10, 185);
        g.setColor(opvulkleur);
        g.fillRect(140, 40, 110, 50);
        g.setColor(lijnkleur);
        g.drawOval(140, 40, 110, 50);
        g.drawString("RechthoekmetOvaal", 140, 105);
        g.setColor(opvulkleur);
        g.fillOval(140, 115, 110, 50);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 160, 185);
        g.drawOval(270, 40, 110, 50);
        g.setColor(opvulkleur);
        g.fillArc(271, 40, 110, 50, 350, 50);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt", 295, 105);
        g.drawOval(300, 120, 50, 50);
        g.drawString("Cirkel",310,185);
        


    }
}