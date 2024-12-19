package at.ac.htlstp.et.sj24.k2a.schleifen;

import java.util.Scanner;

public class TestZs {
    public static void main(String[] args) {
        int x,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X:");
        x = sc.nextInt();
        s = Ziffernsummen.zs(x);
        System.out.printf("Ziffernsumme von %d = %d\n", x, s);
        sc.close();
    }
}
