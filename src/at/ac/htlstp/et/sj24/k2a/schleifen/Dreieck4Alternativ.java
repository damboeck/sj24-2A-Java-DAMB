package at.ac.htlstp.et.sj24.k2a.schleifen;

public class Dreieck4Alternativ {

    public static void dreieck(int size) {
        for (int z=0; z<size*2; z++) {
            for (int s=0; s<size; s++) {
                System.out.print(s<size-Math.abs(z-size)?'*':' ');
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        dreieck(4);
        System.out.println();
        dreieck(8);
    }
}
