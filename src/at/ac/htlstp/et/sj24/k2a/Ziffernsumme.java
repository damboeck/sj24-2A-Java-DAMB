package at.ac.htlstp.et.sj24.k2a;

import java.util.Scanner;

/**
 * Schreibe ein Java Programm, welches eine Ganzzahl welche maximal 5 Stellen haben darf einliest,
 * die Ziffernsumme berechnet und anschließend die Ziffernsumme ausgibt.
 *
 * Die Ausgabe sollte dabei wie folgt aussehen:
 *
 * Gib eine Zahl ein : 34
 * Ziffernsumme : 7
 */
public class Ziffernsumme {

    public static void main(String[] args) {
        // Deklaration
        int z; // Zahl
        int zs; // Ziffernsumme
        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Gib eine Zahl ein : ");
        z = sc.nextInt();

        // Verarbeitung
        zs = (z%10)+(z/10%10)+(z/100%10)+(z/1000%10)+(z/10000%10);

        // Ausgabe
        System.out.println("Ziffernsumme : " + zs);

        // Zusammenräumen
        sc.close();
    }
}
