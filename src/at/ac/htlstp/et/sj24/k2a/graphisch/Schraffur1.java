package at.ac.htlstp.et.sj24.k2a.graphisch;

import java.awt.*;

public class Schraffur1 extends ZeichneLinie {

    public Schraffur1(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    public void paint(Graphics g) {
        for (int x=40;x<this.getWidth();x+=40) {
            g.drawLine(x,0,x,this.getHeight());
        }
    }

    public static void main(String[] args) {
        new Schraffur1("Schraffur1", 800, 600);
    }

}
