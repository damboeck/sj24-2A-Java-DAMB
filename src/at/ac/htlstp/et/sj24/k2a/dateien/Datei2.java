package at.ac.htlstp.et.sj24.k2a.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Datei2 {

    public static final String failname="data1/fail.txt";

    public static void main(String[] args){
        Path p = Paths.get(Datei1.outfilename);
        //p=Paths.get(failname);
        List<String> data = new ArrayList<>();
        data.add("erste Zeile");
        data.add("zweite Zeile");
        try {
            Files.write(p, data);
        } catch (IOException e) {
            System.out.println("Datei kann nicht geschrieben werden!");
        }
        System.out.println("FERTIG!");
    }
}
