package at.ac.htlstp.et.sj24.k2a.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Datei3 {

    public static void main(String[] args) throws IOException {
        Path p = Paths.get(Datei1.outfilename);
        List<String> data;
        data = Files.readAllLines(p);
        for (String line : data) {
            System.out.println(line);
        }
    }
}
