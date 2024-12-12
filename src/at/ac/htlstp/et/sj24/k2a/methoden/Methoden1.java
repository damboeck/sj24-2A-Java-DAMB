package at.ac.htlstp.et.sj24.k2a.methoden;

import java.util.Scanner;

public class Methoden1 {

    // globale Variable z
    public static int z;

    /**
     * Berechnet die Ziffernsumme einer maximal 4-stelligen Zahl.<br>
     * Das Vorzeichen der Zahl bleibt im Ergebnis erhalten
     * @param x Zahl von der die Ziffernsumme bestimmt werden soll
     * @return  Ziffernsumme von x
     */
    public static int ziffernsumme(int x) {
        int
        sum = x%10;
        sum += x/10%10;
        sum += x/100%10;
        sum += x/1000%10;
        return sum;
    }

    /**
     * Liest einen Wert als int von der Tastatur
     * @param meldung  Prompt
     * @return  Wert
     */
    public static int readInteger(String meldung) {
        Scanner sc = new Scanner(System.in);
        System.out.print(meldung);
        int result = sc.nextInt();
        sc.close();
        return result;
    }

    public static void main(String[] args) {
        int zs;
        z=readInteger("Zahl = ");
        zs = ziffernsumme(z);
        System.out.println("Ziffernsumme = "+zs);
    }
}
