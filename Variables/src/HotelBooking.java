public class HotelBooking {
    public static void main(String[] args) {
        System.out.println("*** Hotel Reservation System ***");
        // Definimos Variables
        String customerName = "Gian Barboza";
        int daysBooked = 5;
        double dailyPrice = 55.6;
        boolean hasSeaView = true;

        //Imprimimos Variables
        System.out.println("customerName = " + customerName);
        System.out.println("daysBooked = " + daysBooked);
        System.out.println("dailyPrice = " + dailyPrice);
        System.out.println("hasSeaView = " + hasSeaView);

        //Modificamos Variables
        daysBooked = 4;
        dailyPrice = 34.6;
        hasSeaView = false;

        // volvemos a imprimir variables
        System.out.println("---------------------------");
        System.out.println("customerName = " + customerName);
        System.out.println("daysBooked = " + daysBooked);
        System.out.println("dailyPrice = " + dailyPrice);
        System.out.println("hasSeaView = " + hasSeaView);

    }
}
