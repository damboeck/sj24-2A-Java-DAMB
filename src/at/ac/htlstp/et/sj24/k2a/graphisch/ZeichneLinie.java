package at.ac.htlstp.et.sj24.k2a.graphisch;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ZeichneLinie extends Frame implements WindowListener {

    public ZeichneLinie(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.addWindowListener(this);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(50,50,500,500);
        g.drawOval(0,0,100,100);
    }


    public static void main(String[] args) {
        new ZeichneLinie("Mein erstes Fenster", 800, 600);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e) {

    }
    @Override
    public void windowIconified(WindowEvent e) {

    }
    @Override
    public void windowDeiconified(WindowEvent e) {

    }
    @Override
    public void windowActivated(WindowEvent e) {

    }
    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
