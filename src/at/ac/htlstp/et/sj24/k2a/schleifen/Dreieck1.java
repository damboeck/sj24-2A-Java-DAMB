package at.ac.htlstp.et.sj24.k2a.schleifen;

public class Dreieck1 {

    /**
     * Zeichnet ein Dreieck aus lauter Sternen auf den Bildschirm <br>
     * Beispiel für die size=4: <br>
     * **** <br>
     * *** <br>
     * ** <br>
     * * <br>
     * @param size Größe des Dreiecks
     */
    public static void dreieck1(int size) {
        for (int zeile = 0;zeile < size;zeile++) {
            int anzahl = size-zeile;
            for (int spalte = 0;spalte < anzahl;spalte++) {
                System.out.print("*");
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
