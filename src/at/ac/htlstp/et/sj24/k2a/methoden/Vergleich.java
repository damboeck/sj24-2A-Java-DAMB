package at.ac.htlstp.et.sj24.k2a.methoden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Vergleich {

    /**
     * Vergleicht die zwei Zahlen x und y mit einer Toleranz
     * @param x          1. Zahl
     * @param y          2. Zahl
     * @param tolerance  Toleranz entweder in Prozent oder absolut
     * @param absolut    true bei absoluter Toleranz, false bei relativer Toleranz
     * @return           true wenn x ungefähr gleich y innerhalb der Toleranz
     */
    public static boolean equals(double x, double y, double tolerance, boolean absolut) {
        if (absolut) {
            // absoluter Vergleich
            return Math.abs(x - y) <= Math.abs(tolerance);
        } else {
            // relativer Vergleich
            return Math.abs(x - y)/Math.max(Math.abs(x),Math.abs(y))*100 <= Math.abs(tolerance);
        }
    }

    /**
     * Vergleich zwei Zahlen mit einer Toleranz von 0.1 Prozent
     * @param x    1. Zahl
     * @param y    2. Zahl
     * @return     true wenn x auf 0.1 Prozent genau gleich y ist
     */
    public static boolean equals(double x, double y) {
        return equals(x,y,0.1,false);
    }

    /**
     * Vergleich zwei Zahlen mit einer relativen Toleranz in Prozent
     * @param x    1. Zahl
     * @param y    2. Zahl
     * @param tolerance   relative Toleranz in Prozent
     * @return     true wenn gleich
     */
    public static boolean equals(double x, double y, double tolerance) {
        return equals(x,y,tolerance,false);
    }

    public static void testeEquals(double x, double y, double tol, boolean absolut) {
        boolean r;
        r = equals(x,y,tol,absolut);
        if (absolut) {
            System.out.printf("%f mit %f und %f liefert "+r+"\n", x, y, tol);
        } else {
            System.out.printf("%f mit %f und %f Prozent liefert "+r+"\n", x, y, tol);
        }
    }

    public static void testeEqualsKomplett(double x, double y, double tol, boolean absolut, boolean korrekt) {
        boolean r;
        r = equals(x,y,tol,absolut);
        if (r!=korrekt) {
            System.out.println("Test falsch bei x="+x+" y="+y+" tol="+tol+" absolut="+absolut);
        }
    }


    /*public static void main(String[] args) {
        boolean r;
        /*testeEquals(3,4,0.1,false);
        testeEquals(3,3.000001,0.1,false);*/
        /*r = equals(3,4,0.1,false);
        System.out.println("3 mit 4 und 0.1 Prozent liefert:"+r);
        r = equals(3,3.000001,0.1,false);
        System.out.println("3 mit 3.000001 und 0.1 Prozent liefert:"+r);*/
        /*testeEqualsKomplett(3,4,0.1,false,false);
        testeEqualsKomplett(3,3.000001,0.1,false,true);
        testeEqualsKomplett(5,-5,0.1,true,false);
        System.out.println("Alle Tests fertig!");
    }*/

    @Test
    public void testMethode() {
        assertFalse(equals(3,4,0.1,false));
        assertTrue(equals(3,3.000001,0.1,false));
        assertFalse(equals(5,-5,0.1,true));
    }

    @Test
    public void testMethode2() {

    }

}
