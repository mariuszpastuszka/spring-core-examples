public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        KlasaZPolamiDoWstrzyknięcia klasaZPolamiDoWstrzyknięcia = new KlasaZPolamiDoWstrzyknięcia();

        System.out.println("##############  Przed wstyrzyknięciem");
        // TODO 8 wywołaj showColaborators() na klasaZPolamiDoWstrzyknięcia

        MojeRefleksje.wstrzyknij(klasaZPolamiDoWstrzyknięcia, "Jakaś wartość");

        System.out.println("##############  Po wsytrzyknięciu");
        // TODO 9 wywołaj showColaborators() na klasaZPolamiDoWstrzyknięcia

    }


}



/*
        TODO 1 utwórz adnotację @WstrzyknijJesliMnieZnajdziesz
        @Target(ElementType.FIELD)
        @Retention(RetentionPolicy.RUNTIME)
  */



/*
    TODO 2 utwórz klasę Colaborator -  jej instancja będzie tworzona i 'wstrzykiwana' za pomocą reflekcji
    Pola / metody:

    String name
    Nadpisz toString - zwraca dowolny komunikat + wartość pola name
  */

/*
    TODO 3 uzupełnij klasę KlasaZPolamiDoWstrzyknięcia

    1. Dwoma polama typu Colaborator

    Colaborator colaboratorZAdnotacją - użyja na tym polu adnotację, utworzoną w TODO1

    Colaborator colaboratorBezAdnotacji


    2. Metodą
    void showColaborators(), która wypisuje do konsoli colaboratorZAdnotacją, colaboratorBezAdnotacji
 */

class KlasaZPolamiDoWstrzyknięcia {

}

/*
    TODO 4 Uzupełnij klasę MojeRefleksje (użyj mechanizmu refleksji)

 */
class MojeRefleksje {
    static void wstrzyknij(Object target, String name) throws IllegalAccessException {
        // TODO 5 Pobierz pola obiektu target i przeiteruj po nich

        // TODO 6 W każdej iteracji (po polach), pobierz adnotacje z bieżącego i przeiteruj po nich

        /*  TODO 7 jeśli znaleziona adnotacja na polu to @WstrzyknijJesliMnieZnajdziesz,
            utwórz nową instancję Colaborator'a i przypisz ją do znalezionego pola
            przekaż do konstruktora argument metody name
            */

    }
}