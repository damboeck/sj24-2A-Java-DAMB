package at.ac.htlstp.et.sj24.k2a.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Adressliste {

    public static final String dateiname="data/daten.csv";

    public static void main(String[] args) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(dateiname));
        for(int i=1;i<data.size();i++) {
            if (data.get(i).trim().length()>0) {
                String line = data.get(i).trim();
                String[] cols = line.split(";");
                System.out.println(cols[1]);
            }
        }
    }
}
