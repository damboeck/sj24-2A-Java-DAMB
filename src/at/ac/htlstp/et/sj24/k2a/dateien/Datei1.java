package at.ac.htlstp.et.sj24.k2a.dateien;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Datei1 {

    public static final String outfilename = "data/test1.txt";

    public static void main(String[] args) {
        File f = new File(outfilename);
        if (f.exists()) {
            System.out.println("Datei existiert bereits!");
        } else {
            System.out.println("Datei nicht gefunden!");
        }
        Path p = Paths.get(outfilename);
        f =p.toFile();
        p = f.toPath();
    }
}
