package fr.kikori.ws.testunitaires;

public class Foo {

    /**
     * Checks if number is even
     *
     * @param number value to check
     * @return true: value is even, false: it is not
     */
    public boolean stringAreEqualWithoutCase(Integer number) {
        if (null == number) {
            throw new NullPointerException();
        }
        return 0 != number && number%2 == 0;
    }

}
