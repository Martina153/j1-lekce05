package cz.czechitas.lekce5.model;

public class Adresa {
    private String ulice;
    private String castObce;
    private String obec;
    private String psc;

    //konstruktor na vytvoreni vlastnosti
    public Adresa(String ulice, String castObce, String obec, String psc) {
        this.ulice = ulice;
        this.castObce = castObce;
        this.obec = obec;
        //volanie metody na kontrolu
        setPsc(psc);
    }

    public String getUlice() {
        return ulice;
    }

    //nesmi byt null ani prazdny string
    public void setUlice(String ulice) {
        if (isValidString(ulice)) {
            this.ulice = ulice;
        } else {
            System.err.println("Chyba: Ulice nesmí být null nebo prázdný řetězec.");
        }
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        if (isValidString(obec)) {
            this.obec = obec;
        } else {
            System.err.println("Chyba: Obec nesmí být null nebo prázdný řetězec.");
        }
    }
    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        if (isValidPSC(psc)) {
            this.psc = psc;
        } else {
            System.err.println("Chyba: Neplatné PSČ.");
        }
    }
    public String toString() {
        return ulice + " " + castObce + ", " + obec + ", " + psc;
    }

    //pomocna metoda ktora je volana u setu
    private boolean isValidString(String str) {
        return str != null && !str.isEmpty();
    }
    private boolean isValidPSC(String psc) {
        return isValidString(psc) && psc.length() == 5 && psc.matches("\\d+");
    }

}
