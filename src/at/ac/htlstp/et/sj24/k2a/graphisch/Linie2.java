package at.ac.htlstp.et.sj24.k2a.graphisch;

import java.awt.*;

public class Linie2 extends MyFrame {

    public Linie2(String title, int width, int height) {
        super(title, width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Linie2("Linie 2", 800, 600);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawLine(50,50,500,200);
    }

}
