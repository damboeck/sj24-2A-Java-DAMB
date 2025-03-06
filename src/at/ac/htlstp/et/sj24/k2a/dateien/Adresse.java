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
        return vorname+" "+nachname+","+wohnort;
    }

    public static Adresse fromCsvLine(String line) {
        String[] cols = line.split(";");
        Adresse a = new Adresse();
        try {
            a.vorname   = cols[0];
            a.nachname  = cols[1];
            a.alter     = Integer.parseInt(cols[2]);
            a.wohnort   = cols[3];
            a.groesse   = Double.parseDouble(cols[4]);
            a.gewicht   = Double.parseDouble(cols[5]);
        } catch (Exception ex) {}
        return a;
    }


}
