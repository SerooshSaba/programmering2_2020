package no.hiof.larseknu.figurarv;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(2, 8, "Grønn");

        Sirkel sirkelen = new Sirkel(3, "Rød");

        Kvadrat kvadratet = new Kvadrat(4, "Blå");

        Rektangel rektangelet2 = new Rektangel(1, 0.5, "Svart");

        System.out.println(rektangelet + " Areal: " + rektangelet.areal() + " Omkrets: " + rektangelet.omkrets());
        // String.format() gjør det her mulig å runde av double-verdien til å kun vise 2 desimaler
        System.out.println(String.format("%s Areal: %.2f Omkrets: %.2f", sirkelen, sirkelen.areal(), sirkelen.omkrets()));

        ArrayList<Figur> figurListe = new ArrayList<>();

        figurListe.add(rektangelet);
        figurListe.add(sirkelen);
        figurListe.add(kvadratet);
        figurListe.add(rektangelet2);

        System.out.println("\n******Tilfeldig liste:*******");

        for (Figur figur : figurListe)
            System.out.println(String.format("Areal: %05.2f Omkrets: %05.2f  -  ", + (float)figur.areal(), (float)figur.omkrets()) + figur);

        Collections.sort(figurListe);

        System.out.println("\n******Sortert liste:*******");

        for (Figur figur : figurListe)
            System.out.println(String.format("Areal: %.2f Omkrets: %.2f  -  ", + figur.areal(), figur.omkrets()) + figur);

        System.out.println("\n******Tegninger:*******");

        for (Figur enFigur : figurListe) {
            if (enFigur instanceof Tegnbar) {
                ((Tegnbar) enFigur).tegn();
            }
        }
    }
}
