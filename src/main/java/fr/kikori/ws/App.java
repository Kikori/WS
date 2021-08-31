package fr.kikori.ws;

import fr.kikori.ws.utils.BeerProvider;

public class App {

    public static void main(String[] args) {
        BeerProvider.getMockBeers()
            .forEach(System.out::println);
    }
}
