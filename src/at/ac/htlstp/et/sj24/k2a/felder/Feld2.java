package at.ac.htlstp.et.sj24.k2a.felder;

import java.util.Arrays;

public class Feld2 {

    public static double min(double ... f) {
        double m = f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i]<m)
                m = f[i];
        }
        return m;
    }

    public static void main(String[] args) {
        double[] a = {3,7,-3,5,9};
        double m = min(a);
        System.out.println("min("+ Arrays.toString(a)+") = "+m);

        m = min(4,7,0.5,-3.4,6,10);
        System.out.print("min = "+m);

        // m = min(a,4,5);  verboten!!

    }
}
