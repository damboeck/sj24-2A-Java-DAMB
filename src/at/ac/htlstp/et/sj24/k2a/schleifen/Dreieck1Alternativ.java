package at.ac.htlstp.et.sj24.k2a.schleifen;

public class Dreieck1Alternativ {

    public static void dreieck1(int size) {
        for (int z=0; z<size; z++) {
            for (int s=0; s<size; s++) {
                System.out.print(z+s<=3?'*':' ');
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        dreieck1(4);
        System.out.println();
        dreieck1(8);
    }
}
