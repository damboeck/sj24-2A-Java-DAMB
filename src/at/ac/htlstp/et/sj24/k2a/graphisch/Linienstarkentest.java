package at.ac.htlstp.et.sj24.k2a.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Linienstarkentest extends MyFrame{

    public static void main(String[] args) {
        Linienstarkentest frame = new Linienstarkentest("Linienstarkentest", 800, 600);
        frame.setVisible(true);
    }

    public Linienstarkentest(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    public void paint(Graphics g) {
        int w=getWidth();
        int h=getHeight();
        Graphics2D g2d = (Graphics2D) g;
        // Antialisierung
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g2d.setStroke(new BasicStroke(5));
        g2d.setStroke(new BasicStroke(2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0f, new float[]{20f, 5f,2f,5f}, 0f));
        g2d.drawLine(100, 100, 200, 200);
        g2d.setStroke(new BasicStroke(1));
        g2d.translate(w/2,h/2);
        g2d.rotate(Math.PI/4);
        g2d.scale(2,2);
        g2d.drawRect(0,0,100,50);
        g2d.scale(0.5,0.5);
        g2d.rotate(-Math.PI/4);
        g2d.translate(-w/2,-h/2);
        g2d.drawRect(100,100,100,100);

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
}
