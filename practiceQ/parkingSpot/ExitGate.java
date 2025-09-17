package practiceQ.parkingSpot;

import practiceQ.parkingSpot.paymentStrategy.FourWheelerPayment;
import practiceQ.parkingSpot.paymentStrategy.PaymentStrategy;
import practiceQ.parkingSpot.paymentStrategy.TwoWheelerPayment;
import practiceQ.parkingSpot.spotService.ParkingSpotManager;
import practiceQ.parkingSpot.spotService.ParkingSpotManagerFactory;

import java.time.LocalDateTime;

public class ExitGate {
    private ParkingSpotManagerFactory managerFactory;

    public ExitGate(ParkingSpotManagerFactory managerFactory) {
        this.managerFactory = managerFactory;
    }
    public void processExit(Ticket ticket){
        Vehicle vehicle = ticket.getVehicle();
        ParkingSpotManager parkingSpotManager = managerFactory.getParkingManager(vehicle.getType());
        // calc fees
        PaymentStrategy paymentStrategy;
        if (vehicle.getType() == VehicleType.TWO_WHEELER) {
            paymentStrategy = new TwoWheelerPayment();
        } else {
            paymentStrategy = new FourWheelerPayment();
        }
        double fee = paymentStrategy.calculateFee(ticket);
        System.out.println("💰 Parking Fee: ₹" + fee + "for vehicle "+ vehicle.getNumber());

        // free the spot
        parkingSpotManager.removeVehicle(vehicle.getNumber());
        System.out.println("Vehicle " + vehicle.getNumber() + " exited at " + ticket.getExitTime());

    }
}
