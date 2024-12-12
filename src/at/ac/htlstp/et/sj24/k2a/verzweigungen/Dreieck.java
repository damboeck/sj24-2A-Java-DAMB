package at.ac.htlstp.et.sj24.k2a.verzweigungen;

import java.util.Scanner;

public class Dreieck {
    public static void main(String[] args) {
        double a,b,c,h;
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();

        // Berechnung
        if (a>b) {
            // Tausche a mit c
            h = a;
            a = h;
            b = c;
        }
        if (a>c) {
            h = a;
            a = c;
            c = h;
        }
        if (b>c) {
            h = b;
            b = c;
            c = a;
        }

        System.out.printf("a=%4.2f b=%4.2f c=%4.2f\n", a, b, c);

        sc.close();
    }
}
