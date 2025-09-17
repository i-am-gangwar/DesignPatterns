package practiceQ.parkingSpot;

import practiceQ.parkingSpot.spotService.ParkingSpotManager;
import practiceQ.parkingSpot.spotService.ParkingSpotManagerFactory;


public class Main {

    public static void main(String[] arg){
        ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();
        ParkingSpotManager twoWheeler = factory.getParkingManager(VehicleType.TWO_WHEELER);
        ParkingSpotManager fourWheeler = factory.getParkingManager(VehicleType.FOUR_WHEELER);
        EntranceGate entry = new EntranceGate(factory);
        ExitGate exit = new ExitGate(factory);

        Vehicle bike = new Vehicle("KA01-1234", VehicleType.TWO_WHEELER);
        Vehicle bike1 = new Vehicle("KA01-1235", VehicleType.TWO_WHEELER);
        Ticket bikeTicket = entry.generateTicket(bike);
        Ticket bikeTicket1 = entry.generateTicket(bike1);
        System.out.println("Two wheeler Parking Spots with 2 bikes parked");
        twoWheeler.getAllParkingSpots();
        System.out.println("Two wheeler parking full");
        Vehicle bike2 = new Vehicle("KA01-1236", VehicleType.TWO_WHEELER);
        Ticket bikeTicket2 = entry.generateTicket(bike2);
        exit.processExit(bikeTicket);
        System.out.println("Removed 1 bike");
        System.out.println("Two wheeler Parking Spots with now 1 bike parked");
        twoWheeler.getAllParkingSpots();


//        // four Wheeler
//        Vehicle car = new Vehicle("KA02-5678", VehicleType.FOUR_WHEELER);
//        Vehicle car1 = new Vehicle("KA02-5679", VehicleType.FOUR_WHEELER);
//        Ticket carTicket = entry.generateTicket(car);
//        Ticket carTicket1 = entry.generateTicket(car1);
//        System.out.println("Four wheeler Parking Spots for 2 cars");
//        fourWheeler.getAllParkingSpots();
//        // Simulate exit
//        exit.processExit(carTicket);
//        System.out.println("Removed 1 car ");
//        System.out.println("Four wheeler Parking Spots with 1 car");
//        fourWheeler.getAllParkingSpots();





//
//        Ticket bikeTicket1 = entry.generateTicket(bike);
//        Ticket carTicket1 = entry.generateTicket(car);

      




//        exit.processExit(bikeTicket1);
//        exit.processExit(carTicket1);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter vehicle Type");
//        System.out.println("1 for Two Wheeler");
//        System.out.println("2 for Four Wheeler");
//        int type = scanner.nextInt();
//        System.out.println("You entered "+ type);

    }
}
