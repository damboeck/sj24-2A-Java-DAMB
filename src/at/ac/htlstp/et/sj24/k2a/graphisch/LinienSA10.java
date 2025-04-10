package at.ac.htlstp.et.sj24.k2a.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class LinienSA10 extends MyFrame {

    private int distance=10;

    public static void main(String[] args) {
        (new LinienSA10("Linien SA10", 800, 600)).setVisible(true);
    }
    public LinienSA10(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    public void paint(Graphics g) {
        for (int x=distance;x<this.getWidth();x+=distance) {
            g.drawLine(x,0,x,this.getHeight());
        }
    }


    @Override public void mouseWheelMoved(MouseWheelEvent e) {
        distance+=e.getWheelRotation();
        repaint();

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
}
