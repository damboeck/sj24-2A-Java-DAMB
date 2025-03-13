package at.ac.htlstp.et.sj24.k2a.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Vector;

public class AdresslisteObjekt {

    public static final String targetFile = "data/out.csv";

    public static void main(String[] args) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(Adressliste.dateiname));
        Vector<Adresse> adresses = new Vector<>();
        for (int i = 1; i < data.size(); i++) {
            String line = data.get(i);
            if (line.trim().length()>0) {
                try {
                    Adresse a = Adresse.fromCsvLine(line);
                    adresses.add(a);
                } catch (Exception e) { }
            }
        }
        for (Adresse adresse : adresses) {
            System.out.println(adresse);
        }
        // Datei speichern
        Adresse.saveCsv(adresses,targetFile);
    }
}
