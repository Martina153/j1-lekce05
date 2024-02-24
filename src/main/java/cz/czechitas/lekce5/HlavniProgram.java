package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Osoba kucera = new Osoba();
        kucera.setJmeno("Jakub");
        kucera.setPrijmeni("Kucera");
        kucera.setAdresa(new Adresa("Národní 1/23", "Černý Most", "Praha", "11000"));
        System.out.println(kucera);

    }

}
