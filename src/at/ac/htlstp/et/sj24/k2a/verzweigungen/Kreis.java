package at.ac.htlstp.et.sj24.k2a.verzweigungen;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 *
 * Lies einen Kreis (x,y Koordinate von Mittelpunkt und Radius) und einen Punkt ein und bestimme ob dieser Punkt innerhalb des Kreise liegt!
 *
 * Lies der Reihe nach ein: Mittelpunkt x, Mittelpunkt y, Radius, zweiter Punkt x, zweiter Punkt y
 *
 * Als Antwort gibt entweder "innerhalb des Kreises" oder "außerhalb des Kreises" aus!
 */
public class Kreis {
    public static void main(String[] args) {
        double mx,my,r,px,py,a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mx: ");
        mx=sc.nextDouble();
        System.out.print("My: ");
        my=sc.nextDouble();
        System.out.print("r: ");
        r=sc.nextDouble();
        System.out.print("Px: ");
        px=sc.nextDouble();
        System.out.print("Py: ");
        py=sc.nextDouble();
        a=Math.sqrt(Math.pow(mx-px,2)+Math.pow(my-py,2));
        if (a<r)System.out.println("innerhalb des Kreises!");
        else    System.out.println("außerhalb des Kreises!");
        sc.close();
    }
}
