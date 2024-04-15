package quizes.q3.tatia_iosebashvili_1;


import java.util.HashMap;
import java.util.Map;
import java.util.List;

    public class HotelManager {
        private Map<String, Room> guestRooms;

        public HotelManager() {
            this.guestRooms = new HashMap<>();
        }

        // Method to add guest information to the map
        public void checkIn(String guestId, Room room) {
            guestRooms.put(guestId, room);
        }
        public void checkOut(String guestId, Room room) {
            guestRooms.remove(guestId, room);
        }

        // Method to display information about all guests and their rooms
        public void displayInfo() {
            System.out.println("Guest Information:");
            for (Map.Entry<String, Room> entry : guestRooms.entrySet()) {
                String guestId = entry.getKey();
                Room room = entry.getValue();
                System.out.println("Guest ID: " + guestId + ", Room: " + room);
            }
        }


        private PersonManager personManager;

        public HotelManager(PersonManager personManager) {
            this.personManager = personManager;
        }
        // Method to use the getPersons() method from PersonManager
        public void useGetPersonsMethod() {
            List<Person> persons = personManager.getPersons();
            HotelManager hms = new HotelManager();
            // Do something with the list of person objects returned
            for (Person person : persons) {
                hms.checkIn(person.getName() + " " + person.getSurname(), new Room(Integer.parseInt(person.getId())));
                System.out.println("Person: " + person.getName() + " " + person.getSurname() + " " + person.getId());
            }
        }

        public static void main(String[] args) {
            // Create an instance of HotelManagementSystem
            HotelManager hms = new HotelManager();
           // Create an instance of PersonManager
            PersonManager personManager = new PersonManager();

            // Create an instance of HotelManager and pass the PersonManager instance to its constructor
            HotelManager hotelManager = new HotelManager(personManager);

            // Use the getPersons() method from PersonManager
            hotelManager.useGetPersonsMethod();


            // Add guest information
            hms.checkIn("101", new Room(101));
            hms.checkIn("102", new Room(102));
            hms.checkIn("103", new Room(103));

            // Display guest information
            hms.displayInfo();
        }
    }

