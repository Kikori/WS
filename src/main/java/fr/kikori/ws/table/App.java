package fr.kikori.ws.table;

import fr.kikori.ws.table.utils.BeerProvider;

public class App {

    public static void main(String[] args) {
        BeerProvider.getMockBeers()
            .forEach(System.out::println);
    }
}
