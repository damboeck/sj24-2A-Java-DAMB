package at.ac.htlstp.et.sj24.k2a.felder;

public class Feld3 {

    /**
     * Prüft ob value im Feld f vorkommt
     * @param value  wert
     * @param f      Feld
     * @return
     */
    public static boolean hasValue(double value, double ... f) {
        boolean result = false;
        for (int i=0; i<f.length; i++) {
            if (value==f[i]) result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean b;
        double[] a={3.1,5,78,4,2,4};
        b = hasValue(3,4,6,7,3,5);
        System.out.println(b);
        b = hasValue(3,4,6,7,7,5);
        System.out.println(b);
        b =hasValue(3,a);
        System.out.println(b);
    }
}
