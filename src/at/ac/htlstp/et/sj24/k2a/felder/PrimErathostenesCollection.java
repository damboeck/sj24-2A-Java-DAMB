package at.ac.htlstp.et.sj24.k2a.felder;

import java.util.Arrays;
import java.util.Vector;

public class PrimErathostenesCollection {

    /**
     * Bestimmt alle Primzahlen bis zum Wert max (https://de.wikipedia.org/wiki/Sieb_des_Eratosthenes)
     * @param max maximaler Wert
     * @return    Primzahlen
     */
    public static Vector<Integer> primsEratosthenes(int max) {
        boolean[] sieb = new boolean[max+1];
        Vector<Integer> result = new Vector<>();
        // Initialisierung
        for (int i=2;i<=max;i++) { sieb[i] = true; }
        // Sieb
        for (int i=2;i<=max;i++) {
            if (sieb[i]) {
                // Primzahl
                result.add(i);
                for (int j=2*i;j<=max;j+=i) {
                    sieb[j] = false;
                }
            }
        }
        return result;
    }

    /**
     * Bestimmt alle Primzahlen bis zum Wert max
     * @param max maximaler Wert
     * @return    Primzahlen
     */
    public static Vector<Integer> prims(int max) {
        Vector<Integer> result = new Vector<>();
        result.add(2);
        LOOP:
        for (int i=3;i<=max;i+=2) {
            for (int j=0;j<result.size();j++) {
                if (result.get(j)*result.get(j) > i) continue LOOP;
                if (i%result.get(j) == 0) {
                    continue LOOP;
                }
            }
            result.add(i);
        }
        return result;
    }


    public static void main(String[] args) {
        int max = 1000000;
        long start = System.currentTimeMillis();
        primsEratosthenes(max);
        long end = System.currentTimeMillis();
        prims(max);
        long end2 = System.currentTimeMillis();
        System.out.println("Erathostenes:"+(end-start));
        System.out.println("Variante    :"+(end2-end));
    }
}
