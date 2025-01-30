package at.ac.htlstp.et.sj24.k2a.felder;

public class PfeilSMU {

    public static void pfeil(int size) {
        int sz = size/4;
        //TODO Schenkel oben
        for (int z=0; z<sz; z++) {
            for (int s=0; s<size-(1+sz)+z; s++)
              System.out.print(" ");
            System.out.println("\\");
        }
        //mittlerer Teil
        for (int i = 0; i < size-1; i++)
            System.out.print("-");
        System.out.println(">");
        //TODO Schenkel unten
        for (int z=0; z<sz; z++) {
            for (int s=0; s<size-2-z; s++)
                System.out.print(" ");
            System.out.println("/");
        }
    }

    public static void main(String[] args) {
        pfeil(2);
        pfeil(6);
        pfeil(11);
        pfeil(31);
    }

}
