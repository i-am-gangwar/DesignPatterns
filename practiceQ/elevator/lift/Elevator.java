package practiceQ.elevator.lift;

import practiceQ.elevator.Direction;
import practiceQ.elevator.Status;
import practiceQ.elevator.building.Display;

import java.util.List;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private Status status;
    private Display display;
    private Door door;
    private InternalButton internalButton;
    public Elevator(int id){
        this.id = id;
        this.currentFloor = 0;

    }
    public void move(int destinationFloor, Direction dir){
        this.direction = dir; // ✅ keep direction for later (important!)
        if(dir==Direction.UP) {
            status = Status.MOVING;
            System.out.println("Elevator Number " + id+1 + " moving from floor " + currentFloor + " to " + destinationFloor + " (" + dir + ")");
            currentFloor = destinationFloor;
            status = Status.IDLE;
            System.out.println("Elevator Number " + id+1 + " reached floor " + currentFloor+" Ready to pick Users");
        }
        if(dir==Direction.DOWN) {

            if(currentFloor<destinationFloor){
                status = Status.MOVING;
                System.out.println("Elevator Number " + id+1 + " moving from floor " + currentFloor + " to " + destinationFloor + " (" + Direction.UP + ")");
            }
            else if(currentFloor>destinationFloor){
                status = Status.MOVING;
                System.out.println("Elevator Number " + id+1 + " moving from floor " + currentFloor + " to " + destinationFloor + " (" + Direction.DOWN + ")");
            }
            else {
                System.out.println("Elevator Number " + id+1 + " already on floor " + currentFloor + " to " + destinationFloor + " (" + Direction.UP + ")");
            }
            currentFloor = destinationFloor;
            status = Status.IDLE;
            System.out.println("Elevator Number " + id+1 + " reached floor " + currentFloor+" Ready to pick Users");
        }
        this.currentFloor = destinationFloor;
    }

//    public void move(int destinationFloor){
//        System.out.println("Internal Button Pressed");
//        if(direction==Direction.UP) {
//            status = Status.MOVING;
//            System.out.println("Elevator " + id + " moving from floor " + currentFloor + " to " + destinationFloor + " (" + direction + ")");
//            currentFloor = destinationFloor;
//            status = Status.IDLE;
//            System.out.println("Elevator " + id + " reached floor " + currentFloor+" User reached destination");
//        }
//        if(direction==Direction.DOWN) {
//            status = Status.MOVING;
//            System.out.println("Elevator " + id + " moving from floor " + currentFloor + " to " + destinationFloor + " (" + direction + ")");
//            currentFloor = destinationFloor;
//            status = Status.IDLE;
//            System.out.println("Elevator " + id + " reached floor " + currentFloor+" User reached destination");
//        }
//    }

    public void move(int destinationFloor){
        System.out.println("Internal Button Pressed");

        if (destinationFloor > currentFloor) {
            direction = Direction.UP;   // ✅ infer from current and destination
        } else if (destinationFloor < currentFloor) {
            direction = Direction.DOWN; // ✅ infer from current and destination
        }

        status = Status.MOVING;
        System.out.println("Elevator Number " + id+1 + " moving from floor " + currentFloor + " to " + destinationFloor + " (" + direction + ")");
        currentFloor = destinationFloor;
        status = Status.IDLE;
        System.out.println("Elevator Number " + id+1 + " reached floor " + currentFloor+" User reached destination");
        this.currentFloor = destinationFloor;
    }

    public InternalButton getInternalButton(){
        return this.internalButton;
    }


}
