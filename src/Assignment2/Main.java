package Assignment2;

import java.util.ArrayList;

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args){

            // Opretter et Drink objekt
            Drink drink1 = new Drink();

            // Prøver at sætte en ugyldig pris
            try {
                drink1.setPrice(-25.0);
                System.out.println("Pris: " + drink1.getPrice());
                // Fanger fejlen hvis prisen er negativ
            } catch (IllegalArgumentException e){
                System.out.println("Fejl: " + e.getMessage());
            }

            // Opretter en liste af strings
            ArrayList<String> liste = new ArrayList<>();
            // Tilføjer elementer til listen
            liste.add("Thor");   // index 0
            liste.add("Louise"); // index 1
            liste.add("Tess");   // index 2

            // Prøver at hente elementet på index 2 (gyldigt)
            try{
                System.out.println(getItem(liste, 2));
                // Fanger fejlen hvis index er ugyldigt
            } catch (IllegalArgumentException e){
                System.out.println("Fejl: " + e.getMessage());
            }

            // Prøver at hente elementet på index 99 (ugyldigt)
            try{
                System.out.println(getItem(liste, 99));
                // Fanger fejlen hvis index er ugyldigt
            } catch (IllegalArgumentException e){
                System.out.println("Fejl: " + e.getMessage());
            }
        }

        // Returnerer elementet på det givne index - kaster fejl hvis index er ugyldigt
        public static String getItem(ArrayList<String> items, int index) {
            // Tjekker om index er uden for listens gyldige range
            if(index < 0 || index >= items.size()){ // hvis enten index er for lille eller for stort, er det ugyldigt
                throw new IllegalArgumentException("Gyldigt range er 0 til " + (items.size() - 1)); // size() - 1 fordi index starter på 0, ikke 1
            }
            return items.get(index);
        }

    }