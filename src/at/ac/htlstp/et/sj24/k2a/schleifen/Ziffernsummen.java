package at.ac.htlstp.et.sj24.k2a.schleifen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ziffernsummen {

    /**
     * Berechnet die Ziffernsumme einer Zahl
     * @param x  Zahl
     * @return   Ziffernsumme
     */
    public static int zs(int x) {
        int summe = 0;
        int y = Math.abs(x);
        while(y>0) {
            summe += y%10;
            y     /= 10;
        }
        if (x<0) return -summe;
        return summe;
    }

    @Test
    public void testZs() {
        assertEquals(4,zs(13));
        assertEquals(39,zs(3572589));
        assertEquals(-4,zs(-13));
    }
}
