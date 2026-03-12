package Assignment2;

import java.util.ArrayList;

    public class Cafe {
            ArrayList<String>coffeMenu = new ArrayList<>();

        public ArrayList<String> getCoffeMenu() {
            return coffeMenu;
        }


        /*

        2.a Lav en fil kaldet coffees.txt i roden af dit projekt (ikke i src mappen).
            Filen skal indeholde 5 kaffennavne, ét på hver linje.

        2.b Lav en klasse kaldet Main med en main-metode.

        2.c Lav en klasse kaldet Cafe med et privat felt coffeeMenu af typen ArrayList<String>.
            Tilføj en getter-metode der returnerer listen.

        2.d Tilføj en metode loadMenuData() i Cafe klassen.
            Inde i metoden skal du oprette et File-objekt der peger på coffees.txt.
            Wrap det i en try-catch og tilføj et Scanner-objekt der læser filen.

        2.e Inde i try-blokken skal du bruge et while-loop med hasNextLine() og nextLine()
            til at læse hver linje i filen og tilføje den til coffeeMenu listen.

        2.f I main-metoden skal du oprette en instans af Cafe, kalde loadMenuData()
            og derefter printe alle kafferne ud med et for-each loop via getter-metoden.

         */

    }
