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
        // TODO moet NamenBestandVerwerker nu abstract worden?
        String bestandspad = "resources/9.2 GesorteerdeNamenOrigineel.txt";
        String extrabestandspad = "resources/9.2 ExtraNamen.txt";

        System.out.printf("Aantal namen in bestand : %d\n",
                NamenBestandVerwerker.telNamenBestand(bestandspad));

        ArrayList<String> namenUitBestand = NamenBestandVerwerker.leesNamenBestand(bestandspad);
        ArrayList<String> extraNamenUitBestand = NamenBestandVerwerker.leesNamenBestand(extrabestandspad);
        NamenBestandVerwerker.voegLijstToeAanGesorteerdeLijst(extraNamenUitBestand, namenUitBestand);
        for (String naam : namenUitBestand) {
            System.out.println(naam);
        }

        NamenBestandVerwerker.maakBestandvanLijst(namenUitBestand,
                "resources/9.2 GesoorteerdeNamenNieuw.txt");
    }
}
