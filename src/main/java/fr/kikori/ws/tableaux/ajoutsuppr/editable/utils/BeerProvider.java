package fr.kikori.ws.tableaux.ajoutsuppr.editable.utils;

import fr.kikori.ws.tableaux.ajoutsuppr.editable.model.Beer;
import java.math.BigDecimal;
import java.time.LocalDate;
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
            new Beer(1,"Leffe blonde", ARTOIS, BLONDE, new BigDecimal("6.6"), new BigDecimal("0.25"), LocalDate.ofYearDay(1967, 1), true),
            new Beer(2,"Leffe brune", ARTOIS, BRUNE, new BigDecimal("6.5"), new BigDecimal("0.33"), LocalDate.ofYearDay(1952, 1), true),
            new Beer(3,"Leffe triple", ARTOIS, TRIPLE, new BigDecimal("8.5"), new BigDecimal("0.25"), LocalDate.ofYearDay(1954, 1), true),
            new Beer(4,"Leffe ambrée", ARTOIS, AMBREE, new BigDecimal("6.6"), new BigDecimal("0.25"), LocalDate.ofYearDay(2018, 1), true),
            new Beer(5,"Leffe ruby", ARTOIS, ROUGE, new BigDecimal("5.0"), new BigDecimal("0.50"), LocalDate.ofYearDay(2011, 1)),
            new Beer(6,"Chimay bleue", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BRUNE, new BigDecimal("9.0"), new BigDecimal("0.33"), LocalDate.ofYearDay(1956, 1), true),
            new Beer(7,"Chimay blanche", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BLONDE, new BigDecimal("8.0"), new BigDecimal("0.33"), LocalDate.ofYearDay(1956, 1)),
            new Beer(8,"Chimay rouge", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BRUNE, new BigDecimal("7"), new BigDecimal("0.33"), LocalDate.ofYearDay(1956, 1), true),
            new Beer(9,"Chimay dorée", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BLONDE, new BigDecimal("4.8"), new BigDecimal("0.33"), LocalDate.ofYearDay(1956, 1), true),
            new Beer(10,"Chimay verte", ABBAYE_NOTRE_DAME_DE_SCOURMONT, BLONDE, new BigDecimal("10"), new BigDecimal("0.33"), LocalDate.ofYearDay(2021, 1)),
            new Beer(11,"Trappe blond", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, BLONDE, new BigDecimal("6.5"), new BigDecimal("0.33"), null, true),
            new Beer(12,"Trappe dubbel", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, AMBREE, new BigDecimal("7"), new BigDecimal("0.33"), null, true),
            new Beer(13,"Trappe tripel", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, BLONDE, new BigDecimal("8"), new BigDecimal("0.33"), null, true),
            new Beer(14,"Trappe quadrupel", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, AMBREE, new BigDecimal("10"), new BigDecimal("0.33"), null),
            new Beer(15,"Trappe witte trappist", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, BLANCHE, new BigDecimal("5.5"), new BigDecimal("0.33"), null),
            new Beer(16,"Trappe bockbier", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, BRUNE, new BigDecimal("7.3"), new BigDecimal("0.33"), null, true),
            new Beer(17,"Trappe isid'Or", ABBAYE_NOTRE_DAME_DE_KONINGSHOEVEN, AMBREE, new BigDecimal("7.5"), new BigDecimal("0.33"), null),
            new Beer(18,"Barbar blonde", BRASSERIE_LEFEBVRE, BLONDE, new BigDecimal("8"), new BigDecimal("0.33"), null, true),
            new Beer(19,"Barbar bök", BRASSERIE_LEFEBVRE, BRUNE, new BigDecimal("8.5"), new BigDecimal("0.33"), null, true),
            new Beer(20,"Barbar rouge", BRASSERIE_LEFEBVRE, ROUGE, new BigDecimal("8"),new BigDecimal("0.33"), null, true)
        );
    }

}
