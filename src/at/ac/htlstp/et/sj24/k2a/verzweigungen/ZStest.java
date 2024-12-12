package at.ac.htlstp.et.sj24.k2a.verzweigungen;

import at.ac.htlstp.et.sj24.k2a.methoden.Methoden1;

public class ZStest {
    public static void main(String[] args) {
        int z,zs;
        z=Methoden1.readInteger("Enter z: ");
        zs = Methoden1.ziffernsumme(z);
        System.out.println("zs = "+zs);
    }
}
