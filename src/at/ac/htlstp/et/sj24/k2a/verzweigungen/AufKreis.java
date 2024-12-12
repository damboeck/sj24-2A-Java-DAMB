package at.ac.htlstp.et.sj24.k2a.verzweigungen;

import java.util.Scanner;

public class AufKreis {

    /** absolute Schranke für die Gleichheitsüberprüfung */
    public static double S=0.1;

    /** relative Schranke für die Gleichheitsüberprüfung in Prozent! */
    public static double Rp=2;

    public static void main(String[] args) {
        double mx = 3, my=2, r=1.8;
        double px,py;
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Px: ");
        px = sc.nextDouble();
        System.out.print("Py: ");
        py = sc.nextDouble();

        a = Math.sqrt(Math.pow(mx-px,2)+Math.pow(my-py,2));

        //if (Math.abs(a-r)<S) System.out.println("Auf dem Kreis!");
        if (100d*Math.abs(a-r)/Math.max(Math.abs(a),Math.abs(r))<Rp) System.out.println("Auf dem Kreis!");
        else      System.out.println("daneben!");

    }
}
