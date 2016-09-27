package H06;


import java.awt.*;
import java.applet.*;


public class Opdr6_3 extends Applet {
    int max;
    int uitkomst;





    public void init(){
        max=2147483647;
        uitkomst= max+1;











    }
    public void paint(Graphics g) {
        g.drawString(""+ uitkomst, 20,20);


}











}