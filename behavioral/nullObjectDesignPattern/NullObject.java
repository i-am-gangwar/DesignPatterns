package DesignPatterns.behavioral.nullObjectDesignPattern;

public class NullObject implements Vehicle{
    @Override
    public void getTankCapacity() {
        System.out.println(0);
    }

    @Override
    public void getSeatCapacity() {
        System.out.println(0);
    }
}
