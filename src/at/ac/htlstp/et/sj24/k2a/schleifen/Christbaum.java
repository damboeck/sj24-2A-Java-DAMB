package at.ac.htlstp.et.sj24.k2a.schleifen;

public class Christbaum {

    public static final int size = 8;

    public static void main(String[] args) {
        for (int z=1;z<=size;z++) {
            for (int lz=1;lz<=size-z;lz++) {
                System.out.print(" ");
            }
            for (int sterne=1;sterne<=2*z-1;sterne++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int z=1;z<=2;z++) {
            for (int lz=1;lz<=size-1;lz++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
