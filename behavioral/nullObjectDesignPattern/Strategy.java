package DesignPatterns.behavioral.nullObjectDesignPattern;

public class Strategy {

    public Vehicle getVehicle(String name){
        if(name.equalsIgnoreCase("CAR"))
            return new Car();
        else if (name.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        else
            return new NullObject();
    }
}
