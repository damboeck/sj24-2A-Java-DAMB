package at.ac.htlstp.et.sj24.k2a.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class LinienS10 extends MyFrame{

    private int linienAnzahl = 10;

    public static void main(String[] args) {
        LinienS10 linien = new LinienS10("Linien", 800, 600);
        linien.setVisible(true);
    }

    public LinienS10(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        for (int i=0;i<linienAnzahl;i++) {
            int x = (i+1)*getWidth()/(linienAnzahl+1);
            g.drawLine(x,0,x,getHeight());
        }
    }

    @Override public void mouseWheelMoved(MouseWheelEvent e) {
        linienAnzahl += e.getWheelRotation();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        boolean changed=true;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_PLUS  -> linienAnzahl++;
            case KeyEvent.VK_MINUS -> linienAnzahl--;
            default -> changed=false;
        }
        if (changed) repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
}
