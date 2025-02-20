package at.ac.htlstp.et.sj24.k2a.felder;

import java.util.Arrays;

public class PrimErathostenes {

    /**
     * Bestimmt alle Primzahlen bis zum Wert max (https://de.wikipedia.org/wiki/Sieb_des_Eratosthenes)
     * @param max maximaler Wert
     * @return    Primzahlen
     */
    public static int[] prims(int max) {
        boolean[] sieb = new boolean[max+1];
        int count = 0;
        // Initialisierung
        for (int i=2;i<=max;i++) { sieb[i] = true; }
        // Sieb
        for (int i=2;i<=max;i++) {
            if (sieb[i]) {
                // Primzahl
                count++;
                for (int j=2*i;j<=max;j+=i) {
                    sieb[j] = false;
                }
            }
        }
        // Sieb auswerten
        int[] result = new int[count];
        count=0;
        for (int i=2;i<=max;i++) {
            if (sieb[i]) {
                // Primzahl
                result[count] = i;
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Primzahlen:"+ Arrays.toString(prims(100)));
    }
}
