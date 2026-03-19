package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

        public static void main(String[] args) {

            // Første test: kalder readLines med en fil der eksisterer
            try {
                // Kalder readLines med stien til filen
                ArrayList<String> lines = readLines("data/students.csv");
                //Printer linje for linje i stedet for hele listen
                for(String line : lines){
                    System.out.println(line);
                }
                System.out.println(); // tom linje efter listen

                // Fanger FileNotFoundException hvis filen ikke findes
            } catch (FileNotFoundException e) {
                // Printer en fejlbesked til brugeren
                System.out.println("File not found");
                System.out.println(); // tom linje
            }

            // Anden test: kalder readLines med en fil der ikke eksisterer
            try {
                // Kalder readLines med et filnavn der ikke findes
                ArrayList<String> lines = readLines2("data/findesikke.csv");
                //Printer linje for linje i stedet for hele listen
                for(String line : lines){
                    System.out.println(line);
                }
                System.out.println(); // tom linje efter listen
                // Fanger FileNotFoundException da filen ikke findes
            } catch (FileNotFoundException e) {
                // Printer en fejlbesked til brugeren
                System.out.println("File not found");
                System.out.println(); // tom linje
            }


            try{
                ArrayList <String> lines = readLines2("data/students.csv");
                //Printer linje for linje i stedet for hele listen
                for(String line : lines){
                    System.out.println(line);
                }
                System.out.println(); // tom linje efter listen
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                System.out.println(); // tom linje
            }
        }

        // Læser alle linjer fra en fil og returnerer dem som en ArrayList
        public static ArrayList<String> readLines(String path) throws FileNotFoundException {
            // Opretter en tom liste til at gemme linjerne fra filen
            ArrayList<String> lines = new ArrayList<>();
            // Åbner filen med Scanner – kaster FileNotFoundException hvis filen ikke findes
            Scanner scanner = new Scanner(new File(path));
            // Fortsætter så længe der er flere linjer i filen
            while (scanner.hasNextLine()) {
                // Læser næste linje fra filen
                // Tilføjer linjen til listen
                lines.add(scanner.nextLine());
            }
            scanner.close();
            // Returnerer listen med alle linjer fra filen
            return lines;
        }

        public static ArrayList<String> readLines2(String path) throws FileNotFoundException{
            ArrayList<String> lines = new ArrayList<>();

            Scanner scanner = new Scanner(new File(path));

            while(scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }
            scanner.close();
            return lines;
        }

    }