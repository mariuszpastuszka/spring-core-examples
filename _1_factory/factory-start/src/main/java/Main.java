public class Main {

    public static void main(String[] args) {}
}

/* TODO 1 model - klasa Beer
                    double alkohol
*/

/*
    TODO 2 BeerFactory
                        statyczne, finalne  pola: ALCOHOL:String i ID:double
                        użyjemy tych wartości w BeerFactoryConfig i w teście

                        pola instancji alcoholAmount:double, factoryId:String

                        implementuje FactoryBean
                        w getObject utwórz obiekt Beer, przekaż do konstruktora alkoholAmount


                        getObjectType zwraca Beer.class
 */

/*

    TODO 3 BeerFactoryConfig - konfiguracyjna klasa springa (użyj odpowiedniej adnotacji)

                            definicja ziarna:
                                            nazwa metody beerFactory
                                            zwraca BeerFactory
                                            ustawiona nazwa bean'a: "beer"
                                            w metodzie beerFactory ustawiamy pola instancji BeerFactory, wykorzystując
                                            stałe z BeerFactory

 */

/*

    TODO 4 test FactoryTest
                            (ustaw klasę konfiguracyjną na BeerFactoryConfig)

                            wstrzykujemy pole typu Beer, nazwa wstrzykiwanego ziarna: "beer"
                            wstrzykujemy pole typu FactoryBeer, nazwa wstrzykiwanego ziarna: "&beer"


                            Przetestuj referencje do obiektów:
                            czy "beer" to instancja Beer z alkoholAmount ustawionym w fabryce
                            czy "&beer" to instancja BeerFactory z id ustawionym w fabryce


 */