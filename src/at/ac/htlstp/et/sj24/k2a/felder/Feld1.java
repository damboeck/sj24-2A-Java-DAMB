package at.ac.htlstp.et.sj24.k2a.felder;

public class Feld1 {


    public static double parallel(int[] r) {
        double sum = 0;
        for (int i = 0; i < r.length; i++) {
            sum += 1.0/r[i];
        }
        return 1d/sum;
    }

    public static void printFeld(int[] f) {
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + (i == f.length - 1 ? "\n" : ","));
        }
    }

    public static void alter(int x,int[] y) {
        x=14;
        y[1]=22;
    }

    public static void main(String[] args) {
        int[] r = {3,6,1,8};
        printFeld(r);
        System.out.println("Parallel:"+parallel(r));
        r[1] = 15;
        printFeld(r);
        System.out.println(r);
        alter(r[0],r);
        printFeld(r);
        /*for (int i=0; i<r.length; i++) {
            System.out.println(r[i]);
        }*/
    }
}
