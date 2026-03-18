package Assignment4;

import java.util.ArrayList;

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {
            // Opretter en liste med drinks i CSV-format: navn, beskrivelse, pris
            ArrayList<String> data = new ArrayList<>();
            data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
            data.add("Latte, Espresso med dampet mælk, 45.0");
            data.add("Cola, Kold og brusende, 30.0");
            data.add("Vand, Stille kildevand, gratis");


            double total = 0;
            // Gennemløber listen ét element ad gangen
            for (String element : data) {
                // Deler strengen op ved hvert komma → giver et array med tre dele
                String[] parts = element.split(",");
                // Fjerner mellemrum foran og bagved hvert element
                String name = parts[0].trim();        // index 0 → navn
                String description = parts[1].trim(); // index 1 → beskrivelse

                try {
                    double price = Double.parseDouble(parts[2].trim()); // index 2 → pris
                    total += price;
                    // Printer drink i det ønskede format
                    System.out.println(name + " - " + description + " (" + price + " kr.)");
                } catch (NumberFormatException e){
                    System.out.println("Ugyldig pris for " + name + ": " + parts[2].trim());
                }
            }
            //Printer samlede pris på alle drinks
            System.out.println("Total price: " + total + " kr.");
        }
    }