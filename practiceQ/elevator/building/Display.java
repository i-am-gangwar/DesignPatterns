package practiceQ.elevator.building;

import practiceQ.elevator.Direction;

public class Display {
    private int floor;
    private Direction dir;
    public void show(int floor, Direction dir){
        System.out.println("Current Floor: "+ floor);
        System.out.println("Current Direction: "+ dir);
    }


}
