package behavioral.nullObjectDesignPattern;

public class Main {

     public static void main(String[] arg){
         Strategy strategy = new Strategy();
         Vehicle car =  strategy.getVehicle("CAR");
         Vehicle bike =  strategy.getVehicle("Bike");
         Vehicle plane =  strategy.getVehicle("Plane");

         //  car
         car.getTankCapacity();
         car.getSeatCapacity();

         // bike
         bike.getTankCapacity();
         bike.getSeatCapacity();

         // plane
         plane.getTankCapacity();
         plane.getSeatCapacity();



     }
}
