package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Stefan van Tilburg
 *
 *         Controller class NamenBestandVerwerker. Op basis van bestandsnaam wordt aantal regels geteld,
 *         deze wordt teruggegeven.
 */
public class NamenBestandVerwerker {
    public static int telNamenBestand(String bestandsnaam) {
        File file = new File(bestandsnaam);

        int countLines = 0;
        try {
            Scanner readFile = new Scanner(file);

            while (readFile.hasNextLine()) {
                countLines++;
                readFile.nextLine();
            }

            readFile.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        return countLines;
    }

    public static ArrayList<String> leesNamenBestand(String bestandsnaam) {
        File bestand = new File(bestandsnaam);
        ArrayList<String> namen = new ArrayList<>();

        try {
            Scanner bestandInput = new Scanner(bestand);

            while (bestandInput.hasNextLine()) {
                namen.add(bestandInput.next());
            }

            bestandInput.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        return namen;
    }
}
