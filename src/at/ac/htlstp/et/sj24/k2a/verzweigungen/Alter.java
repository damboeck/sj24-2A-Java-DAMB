package at.ac.htlstp.et.sj24.k2a.verzweigungen;

import java.util.Scanner;

/** Beurteile das Alter eines Benutzers */
public class Alter {

    public static void main(String[] args) {
        int alter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie alt sind sie?");
        alter = sc.nextInt();
        if (alter<5) {
            System.out.println("Du bist ein Kleinkind!");
        } else if (alter<6) System.out.println("Du bist ein Kindergartenkind!");
        else if (alter<10)  System.out.println("Du bist ein Volksschüler!");
        else if (alter<18)  System.out.println("Du bist ein Kind!");
        else if (alter<60)  System.out.println("Sie sind erwachsen!");
        else System.out.println("Sind sind nicht mehr jung!");
        sc.close();
    }

}
