package at.ac.htlstp.et.sj24.k2a.zeichenprogramm;

import java.awt.*;

public class Linie extends Zweipunkt {

    /**
     * Erzeugt eine Objekt für die Eingabe
     *
     * @param p1
     * @param linecolor
     * @param width
     */
    public Linie(Vect2D p1, Color linecolor, int width) {
        super(p1, linecolor, width);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(linecolor);
        g.drawLine(p1.xI(),p1.yI(),p2.xI(),p2.yI());
    }
}
