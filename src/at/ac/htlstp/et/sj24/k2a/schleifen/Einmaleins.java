package at.ac.htlstp.et.sj24.k2a.schleifen;

public class Einmaleins {

    public static void main(String[] args) {
        int z,m,e;

        System.out.println("Einmaleins");
        for (z=1; z<=10; z++) {
            for (m=1; m<=10; m++) {
                System.out.printf("%2dx%2d=%3d",m,z,m*z);
                /*if (m==10) System.out.println();
                else       System.out.print(", ");*/
                System.out.print(m==10?"\n":", ");
            }
        }
    }
}
