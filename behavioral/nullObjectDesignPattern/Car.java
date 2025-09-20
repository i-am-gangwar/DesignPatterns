package DesignPatterns.behavioral.nullObjectDesignPattern;

public class Car implements Vehicle{

    @Override
    public void getTankCapacity() {
        System.out.println("Car tank capacity: "+40 +"L");
    }

    @Override
    public void getSeatCapacity() {
        System.out.println("Car seat capacity: "+7);
    }
}
