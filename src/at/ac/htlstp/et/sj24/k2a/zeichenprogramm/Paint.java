package at.ac.htlstp.et.sj24.k2a.zeichenprogramm;

import at.ac.htlstp.et.sj24.k2a.graphisch.MyFrame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class Paint extends MyFrame {

    private DrawMode drawMode = DrawMode.NEW;

    /** Alle Zeichenobjekte die gezeichnet wurden */
    private Vector<Paintable> paintables = new Vector<>();

    /** aktuelles Zeichenobjekt */
    private Paintable current;

    public static void main(String[] args) {
        Paint frame = new Paint("Paint", 800, 600);
        frame.setVisible(true);
    }

    public Paint(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    public void paint(Graphics g) {
        for (Paintable paintable : paintables) {
            paintable.paint(g);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch (drawMode) {
            case NEW:
                current = new Rechteck(new Vect2D(e.getX(),e.getY()),Color.red,1);
                paintables.add(current);
                repaint();
                drawMode = DrawMode.DRAW;
                break;
            case NORMAL:
                break;
            case DRAW:
                if (current instanceof Zweipunkt) {
                    ((Zweipunkt)current).p2 = new Vect2D(e.getX(),e.getY());
                    current=null;
                    repaint();
                    drawMode = DrawMode.NEW;
                }
        }
    }

    @Override public void mouseMoved(MouseEvent e) {
        switch(drawMode) {
            case NEW: case NORMAL: default: break;
            case DRAW:
                if (current instanceof Zweipunkt) {
                    ((Zweipunkt)current).p2 = new Vect2D(e.getX(),e.getY());
                    repaint();
                }
        }
    }
}
