package Assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    static String header;

        private ArrayList<Drink> coffeMenu = new ArrayList<>();

        public void loadData() {
            File file = new File("data/menu.csv"); //henter

            try {
                Scanner scan = new Scanner(file);  //åbner file
                header = scan.nextLine(); //læser header

                while(scan.hasNextLine()){
                    String line = scan.nextLine(); //læser linjerne
                    String [] data = line.split(",");

                    String name = data[0];
                    int price = Integer.parseInt(data[1].trim());
                    int soldNumber = Integer.parseInt(data[2].trim());

                    Drink drink = new Drink(name, price, soldNumber);
                    coffeMenu.add(drink);
                }
                scan.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

        }

        public void saveData(){

        }

        public void showMenu(){

        }

        //loadData() — læser data/menu.csv og opretter Drink-objekter
        //saveData() — gemmer den opdaterede menu tilbage til filen
        //showMenu() — viser menuen og lader brugeren vælge

    }
