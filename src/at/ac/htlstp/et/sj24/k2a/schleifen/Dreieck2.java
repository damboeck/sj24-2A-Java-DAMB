package at.ac.htlstp.et.sj24.k2a.schleifen;

public class Dreieck2 {

    /**
     * Zeichnet ein Dreieck aus lauter Sternen auf den Bildschirm <br>
     * Beispiel für die size=4: <br>
     * **** <br>
     *  *** <br>
     *   ** <br>
     *    * <br>
     * @param size Größe des Dreiecks
     */
    public static void dreieck2(int size) {
        for (int zeile = 0;zeile < size;zeile++) {
            for (int lz=0;lz<zeile;lz++) {
                System.out.print(" ");
            }
            int anzahl = size-zeile;
            for (int spalte = 0;spalte < anzahl;spalte++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dreieck2(4);
        System.out.println();
        dreieck2(8);
    }


}
