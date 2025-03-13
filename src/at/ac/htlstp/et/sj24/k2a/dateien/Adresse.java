package at.ac.htlstp.et.sj24.k2a.dateien;

/**
 * Klasse in der die Adressen meiner Adressdatei gespeichert werden
 */
public class Adresse {

    String vorname;
    String nachname;
    /** Alter der Person in Jahren */
    int    alter;
    String wohnort;
    /** Größe der Person in cm */
    double groesse;
    /** Gewicht der Person in kg */
    double gewicht;

    public Adresse() {
        this.vorname = "";
        nachname= "";
        alter   = 0;
        wohnort = "";
        groesse = 0;
        gewicht = 0;
    }

    public Adresse(String vorname, String nachname, int alter, String wohnort, double groesse, double gewicht) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.wohnort = wohnort;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return vorname+" "+nachname+","+wohnort+" , alter="+alter+" , grösse="+groesse+" , gewicht="+gewicht;
    }

    public static Adresse fromCsvLine(String line) {
        String[] cols = line.split(";");
        Adresse a = new Adresse();
        try {
            a.vorname   = cols[0];
            a.nachname  = cols[1];
            try {
                a.alter = Integer.parseInt(cols[2]);
            } catch (NumberFormatException e) {
                if (cols[2].matches("[0-9]+Jahre")) {
                    a.alter = Integer.parseInt(cols[2].substring(0,cols[2].length()-5));
                }
            }
            a.wohnort   = cols[3];
            try {
                a.groesse = Double.parseDouble(cols[4].replaceAll(",","."));
            } catch (NumberFormatException e) {}
            a.gewicht   = Double.parseDouble(cols[5].replaceAll(",","."));
        } catch (Exception ex) {}
        return a;
    }


}
