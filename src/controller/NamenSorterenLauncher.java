package controller;


/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 9.2 Text IO
 * <p>
 * Doel     Importeer 2 tekst bestanden en verwerk deze via ArrayLists, waarbij sortering toegepast wordt
 */
public class NamenSorterenLauncher {
    public static void main(String[] args) {

        System.out.printf("Aantal namen in bestand : %d",
                NamenBestandVerwerker.telNamenBestand("resources/9.2 GesorteerdeNamenOrigineel.txt"));
    }
}
