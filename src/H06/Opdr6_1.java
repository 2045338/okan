package H06;
import java.awt.*;
import java.applet.*;

public class Opdr6_1 extends Applet {
    double cijfer1;
    double cijfer2;


    double uitkomst;


    public void init() {
        super.init();
        cijfer1 = 113;
        cijfer2 = 4;

        uitkomst = (cijfer1 / cijfer2);

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
