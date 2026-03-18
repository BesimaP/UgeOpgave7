package Assignment2;

     // Klassen repræsenterer en drink med en pris
    public class Drink {
        // Instansvariabel der gemmer prisen
        private double price;

        // Sætter prisen - kaster fejl hvis prisen er negativ
        public void setPrice(double price){
            // Tjekker om prisen er under 0
            if (price < 0){
                throw new IllegalArgumentException("Prisen må ikke være negativ");
            }
            // Sætter prisen hvis den er gyldig
            this.price = price;
        }

        // Returnerer den nuværende pris
        public double getPrice(){
            return price;
        }
    }