package at.ac.htlstp.et.sj24.k2a.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class SMUE0515 extends MyFrame{

    int size = 100;
    int arg  = 0;
    Point pos= null;

    public static void main(String[] args) {
        SMUE0515 frame = new SMUE0515("SMUE0515", 800, 600);
        frame.setVisible(true);
    }

    public SMUE0515(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    public void paint(Graphics g) {
        if (pos!=null) {
            double angle = Math.toRadians(arg+45);
            Point p1 = new Point((int)(pos.x + size*Math.sin(angle)),(int)(pos.y+size*Math.cos(angle)));
            angle = Math.toRadians(arg+135);
            Point p2 = new Point((int)(pos.x + size*Math.sin(angle)),(int)(pos.y+size*Math.cos(angle)));
            angle = Math.toRadians(arg+225);
            Point p3 = new Point((int)(pos.x + size*Math.sin(angle)),(int)(pos.y+size*Math.cos(angle)));
            angle = Math.toRadians(arg+315);
            Point p4 = new Point((int)(pos.x + size*Math.sin(angle)),(int)(pos.y+size*Math.cos(angle)));
            g.drawLine(p1.x,p1.y,p2.x,p2.y);
            g.drawLine(p2.x,p2.y,p3.x,p3.y);
            g.drawLine(p3.x,p3.y,p4.x,p4.y);
            g.drawLine(p4.x,p4.y,p1.x,p1.y);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar()=='+') {
            size += 10;
        } else if (e.getKeyChar()=='-') {
            size -= 10;
        }
        if (size<10)   size = 10;
        if (size>1000) size = 1000;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pos = e.getPoint();
        repaint();
    }

    @Override public void mouseWheelMoved(MouseWheelEvent e) {
        arg += e.getWheelRotation()*10;
        if (arg<0) arg = 360+arg;
        if (arg>360) arg = arg-360;
        repaint();
    }
}
