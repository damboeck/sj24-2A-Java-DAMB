package at.ac.htlstp.et.sj24.k2a.dateien;

public class TesteAdresse {

    public static void main(String[] args) {
        Adresse a = new Adresse("Peter","Müller",64,"Zürich",187,86.5);
        Adresse b;

        b = new Adresse("Kurt","Blachovits",72,"Wien",0,0);
        System.out.println(a);
        System.out.println(b);
    }
}
