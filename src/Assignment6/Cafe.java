package Assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
            try {
                FileWriter writer = new FileWriter("data/menu.csv");
                writer.write(header + "\n");
                for(Drink drink : coffeMenu){
                    writer.write(drink.getName() +", " + drink.getPrice() + ", " + drink.getSoldNumber() + "\n");
                }
                writer.close();
            } catch(IOException e){
                System.out.println("Vi fik ikke skrevet til filen");
            }

        }

        public void showMenu(){
            for(Drink d : coffeMenu){
                System.out.println(d);
            }
        }


        //saveData() — gemmer den opdaterede menu tilbage til filen
        //showMenu() — viser menuen og lader brugeren vælge

    }
