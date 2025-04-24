package at.ac.htlstp.et.sj24.k2a.zeichenprogramm;

/**
 * Eine einfache 2D-Vektor-Klasse
 */
public class Vect2D {

    public final double x,y;

    public Vect2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)",x,y);
    }

    public int xI() { return (int)x; }
    public int yI() { return (int)y; }

}
