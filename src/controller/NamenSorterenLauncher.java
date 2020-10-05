package controller;


import java.util.ArrayList;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 9.2 Text IO
 * <p>
 * Doel     Importeer 2 tekst bestanden en verwerk deze via ArrayLists, waarbij sortering toegepast wordt
 */
public class NamenSorterenLauncher {
    public static void main(String[] args) {

        String bestandspad = "resources/9.2 GesorteerdeNamenOrigineel.txt";

        System.out.printf("Aantal namen in bestand : %d\n",
                NamenBestandVerwerker.telNamenBestand(bestandspad));

        ArrayList<String> namenUitBestand = NamenBestandVerwerker.leesNamenBestand(bestandspad);
        NamenBestandVerwerker.voegNaamToeAanGesorteerdeLijst("Stefan", namenUitBestand);
        NamenBestandVerwerker.voegNaamToeAanGesorteerdeLijst("Anja", namenUitBestand);
        NamenBestandVerwerker.voegNaamToeAanGesorteerdeLijst("Zedrick", namenUitBestand);
        NamenBestandVerwerker.voegNaamToeAanGesorteerdeLijst("Vincent", namenUitBestand);
        for (String naam : namenUitBestand) {
            System.out.println(naam);
        }
    }
}
