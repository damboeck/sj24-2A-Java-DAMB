package at.ac.htlstp.et.sj24.k2a;

import java.util.Scanner;

/**
 * Programm welches aus dem Radius eines Kreises Fläche und Umfang berechnet
 */
public class Kreisberechnung {

    public static void main(String[] args) {
        double r; // Radius
        double flaeche, umfang;
        Scanner scanner = new Scanner(System.in);

        // Wert einlesen
        System.out.print("Gib einen Radius ein:");
        r = scanner.nextDouble();

        // Berechnen
        flaeche = Math.pow(r, 2) * Math.PI;
        umfang = 2 * Math.PI * r;

        // Ausgabe
        System.out.printf("A=%7.2f\nU=%7.2f\n",flaeche,umfang);
        System.out.println("A="+flaeche);

        // Zusammenräumen
        scanner.close();
    }
}
