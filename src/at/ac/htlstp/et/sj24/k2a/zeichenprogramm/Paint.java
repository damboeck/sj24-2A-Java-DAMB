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
                paintables.add(new Linie(new Vect2D(e.getX(),e.getY()),Color.red,1));
                repaint();
                drawMode = DrawMode.DRAW;
                break;
            case NORMAL:
                break;
            case DRAW:
                Paintable last = paintables.get(paintables.size()-1);
                if (last instanceof Zweipunkt) {
                    ((Zweipunkt)last).p2 = new Vect2D(e.getX(),e.getY());
                    repaint();
                    drawMode = DrawMode.NEW;
                }
        }
    }
}
