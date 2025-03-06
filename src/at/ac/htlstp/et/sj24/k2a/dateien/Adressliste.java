package at.ac.htlstp.et.sj24.k2a.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Adressliste {

    public static final String dateiname="data/daten.csv";

    public static void main(String[] args) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(dateiname));
        Vector<String[]> table = new Vector<String[]>();

        for(int i=1;i<data.size();i++) {
            if (data.get(i).trim().length()>0) {
                String line = data.get(i).trim();
                String[] row = new String[6];
                try {
                    String[] cols = line.split(";");
                    //System.out.println(cols[1]);
                    for (int j=0;j<6;j++) {
                        row[j] = cols[j];
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    for (int j=0;j<6;j++) {
                        if (row[j]==null) row[j] = "";
                    }
                }
                table.add(row);
            }
        }
        for (String[] row : table) {
            System.out.println(Arrays.toString(row));
        }

    }
}
