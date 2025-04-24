package at.ac.htlstp.et.sj24.k2a.zeichenprogramm;

import java.awt.*;

public abstract class Zweipunkt implements Paintable {

    /** erster und zweiter Punkt */
    protected Vect2D p1,p2;

    /** Farbe */
    protected Color  linecolor;

    /** Strichstärke */
    private int    width;

    /** Zeichnenmodus */
    private DrawMode drawmode;

    /** Erzeugt eine Objekt für die Eingabe */
    public Zweipunkt(Vect2D p1, Color linecolor, int width) {
        this.p1 = p1;
        this.p2 = p1;
        this.linecolor = linecolor;
        this.width = width;
        this.drawmode = DrawMode.NEW;
    }

    public Vect2D getP1() {
        return p1;
    }

    public void setP1(Vect2D p1) {
        this.p1 = p1;
    }

    public Vect2D getP2() {
        return p2;
    }

    public void setP2(Vect2D p2) {
        this.p2 = p2;
    }

    public Color getLinecolor() {
        return linecolor;
    }

    public void setLinecolor(Color linecolor) {
        this.linecolor = linecolor;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public DrawMode getDrawmode() {
        return drawmode;
    }

    public void setDrawmode(DrawMode drawmode) {
        this.drawmode = drawmode;
    }
}
