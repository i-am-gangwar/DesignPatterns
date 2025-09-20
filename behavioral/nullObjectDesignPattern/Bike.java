package DesignPatterns.behavioral.nullObjectDesignPattern;

public class Bike implements Vehicle{
    @Override
    public void getTankCapacity() {
        System.out.println("Bike tank capacity: "+13 +"L");
    }

    @Override
    public void getSeatCapacity() {
        System.out.println("bike seat capacity: "+2);
    }
}
