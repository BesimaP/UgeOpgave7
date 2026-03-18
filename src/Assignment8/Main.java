package Assignment8;

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args){
            ArrayList<Customer>customers = new ArrayList<>();


            // instantier og add i samme linje
            customers.add(new Customer("Peter", "Pedersen", "peter_p"));
            customers.add(new Customer("Sofie", "Andersen", "sofie_a"));

            // Print alle kunder
            printCustomers(customers);
        }

        public static void printCustomers(ArrayList<Customer> customers) {
            for (Customer c : customers) {
                System.out.println(c);
            }
        }
    }
