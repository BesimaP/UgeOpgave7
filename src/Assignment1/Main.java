package Assignment1;
import java.util.Scanner;

    public class Main {
        static Scanner scan = new Scanner(System.in);

        public static void main(String [] args){
            int tal = promptNumber("Indtast et tal:");
            System.out.println("Du indtastede: " + tal);
        }

        public static int promptNumber(String msg) {
            System.out.println(msg);
            try {
                return Integer.parseInt(scan.nextLine()); //prøv dette
            } catch (NumberFormatException e){            // hvis det fejler
                System.out.println("Ugyldigt input - prøv igen");
                return promptNumber(msg);                 //prøv igen (rekursion)
            }
        }
    }
