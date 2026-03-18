package Assignment10;

    public class Building {
        private String rooms;
        private int numberOfFloors;

        public Building(String rooms, int numberOfFloors){
            this.rooms = rooms;
            this.numberOfFloors = numberOfFloors;
        }

        public String getRoom(){
            return rooms;
        }

        public int getNumberOfFloors(){
            return numberOfFloors;
        }

        public void setNumberOfFloors(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
        }

        public void setRooms(String rooms) {
            this.rooms = rooms;
        }
    }
