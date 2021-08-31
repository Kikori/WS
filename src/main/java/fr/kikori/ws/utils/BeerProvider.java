package fr.kikori.ws.utils;

import fr.kikori.ws.model.Beer;
import java.util.Arrays;
import java.util.List;

public class BeerProvider {

    private static final String ABBAYE_NOTRE_DAME_DE_SCOURMONT = "Abbaye Notre-Dame de Scourmont";
    private static final String ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN = "Abbaye Notre-Dame de Koningshoeven";
    private static final String BRASSERIE_LEFEBVRE = "brasserie Lefèbvre";
    private static final String ARTOIS = "Artois";
    private static final String BLONDE = "Blonde";
    private static final String BRUNE = "Brune";
    private static final String AMBREE = "Ambrée";
    private static final String ROUGE = "Rouge";
    private static final String BLANCHE = "Blanche";
    private static final String TRIPLE = "Triple";

    private BeerProvider() {
        // private constructor to prevent instanciation
    }

    public static List<Beer> getMockBeers() {
        return Arrays.asList(
          new Beer(1,"Leffe blonde", ARTOIS, BLONDE, "6.6", "0.25", "1967"),
          new Beer(2,"Leffe brune", ARTOIS, BRUNE, "6.5", "0.33", "1952"),
          new Beer(3,"Leffe triple", ARTOIS, TRIPLE, "8.5", "0.25", "1954"),
          new Beer(4,"Leffe ambrée", ARTOIS, AMBREE, "6.6", "0.25", "2018"),
          new Beer(5,"Leffe ruby", ARTOIS, ROUGE, "5.0", "0.50", "2011"),
          new Beer(6,"Chimay bleue", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BRUNE, "9.0", "0.33", "1956"),
          new Beer(7,"Chimay blanche", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BLONDE, "8.0", "0.33", "1956"),
          new Beer(8,"Chimay rouge", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BRUNE, "7", "0.33", "1956"),
          new Beer(9,"Chimay dorée", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BLONDE, "4.8", "0.33", "1956"),
          new Beer(10,"Chimay verte", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BLONDE, "10", "0.33", "2021"),
          new Beer(11,"Trappe blond", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, BLONDE, "6.5", "0.33", null),
          new Beer(12,"Trappe dubbel", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, AMBREE, "7", "0.33", null),
          new Beer(13,"Trappe tripel", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, BLONDE, "8", "0.33", null),
          new Beer(14,"Trappe quadrupel", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, AMBREE, "10", "0.33", null),
          new Beer(15,"Trappe witte trappist", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, BLANCHE, "5.5", "0.33", null),
          new Beer(16,"Trappe bockbier", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, BRUNE, "7.3", "0.33", null),
          new Beer(17,"Trappe isid'Or", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, AMBREE, "7.5", "0.33", null),
          new Beer(18,"Barbar blonde", BRASSERIE_LEFEBVRE, BLONDE, "8", "0.33", null),
          new Beer(19,"Barbar bök", BRASSERIE_LEFEBVRE, BRUNE, "8.5", "0.33", null),
          new Beer(20,"Barbar rouge", BRASSERIE_LEFEBVRE, ROUGE, "8", "0.33", null)
        );
    }

}
