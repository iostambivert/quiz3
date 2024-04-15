package quizes.q3.tatia_iosebashvili_1;


    public class Room {
        private final int roomNumber;

        public Room(int roomNumber) {
            this.roomNumber = roomNumber;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        @Override
        public String toString() {
            return "Room number: " + roomNumber;
        }
    }

