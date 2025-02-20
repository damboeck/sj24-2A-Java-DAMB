package at.ac.htlstp.et.sj24.k2a.felder;

import java.util.Arrays;

public class Feld5 {

    /**
     * Fügt in ein bestehendes Feld an einer definierten Position einen Wert ein
     * @param f      Feld
     * @param pos    Position
     * @param value  Wert
     * @return       neues Feld mit dem eingefügten Wert
     */
    public static double[] insert(double[] f, int pos, double value) {
        double[] result = new double[f.length + 1];
        for (int i=0;i<f.length;i++) {
            if (i<pos) result[i]   = f[i];
            else       result[i+1] = f[i];
        }
        result[pos] = value;
        return result;
    }

    public static double[] remove(double[] f, int pos) {
        double[] result = new double[f.length - 1];
        for (int i=0;i<f.length;i++) {
            if (i<pos)       result[i]   = f[i];
            else if (i>pos)  result[i-1] = f[i];
        }
        return result;
    }

    public static void main(String[] args) {
        double[] x={2,6,3,7,4};
        double[] y;
        y = insert(x,2,14.3);
        x[1]=14;
        System.out.println("x = "+ Arrays.toString(x));
        System.out.println("y = "+ Arrays.toString(y));

        x = new double[]{6,7,2};
        y = insert(x,1,5);
        System.out.println("x = "+ Arrays.toString(x));
        System.out.println("y = "+ Arrays.toString(y));

        y = remove(x,0);
        System.out.println("x = "+ Arrays.toString(x));
        System.out.println("y = "+ Arrays.toString(y));
    }

}
