package H10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opdr10_2 extends Applet {
    TextField tekstveld;
    Button knop;
    int hoogstegetal;
    int laagstegetal;


    public void init() {
        super.init();
        tekstveld = new TextField("", 10);
        add(tekstveld);

        knop = new Button("check");
        knoplistener kl = new knoplistener();
        knop.addActionListener(kl);


        add(knop);
        hoogstegetal=0;
        laagstegetal=0;



    }


        public void paint(Graphics g) {
        super.paint(g);
            int x =50;
            int y =70;

            g.drawString("hoogste getal"+hoogstegetal ,x ,y);
            y= y+20;
            g.drawString("laagste getal"+laagstegetal,x ,y);


       }
       class knoplistener implements  ActionListener{

           public void actionPerformed(ActionEvent e) {
               String getalstring = tekstveld.getText();
               int getal = Integer.parseInt(getalstring);
               if (getal > hoogstegetal) ;
               hoogstegetal = getal;
               if (getal < laagstegetal) ;
               laagstegetal = getal;


               repaint();



           }
       }

    }



