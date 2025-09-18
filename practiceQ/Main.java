package practiceQ;

import practiceQ.elevator.Direction;
import practiceQ.elevator.building.Building;
import practiceQ.elevator.lift.Elevator;
import practiceQ.elevator.lift.ElevatorController;

public class Main {

    public static void main(String[] args){

        // Create building with 10 floors and 3 elevators
        Building building = new Building(10,3); // 10 floors, 3 elevators
        System.out.println("Building Obj ready");

       // Up direction
        System.out.println("=== Up direction ===");
        // Someone on floor 3 presses UP
        ElevatorController  elevatorController = building.getExternalButtonDispatcher()
                .submitRequest(3,Direction.UP);
        // Now passenger is inside elevator presses internal button for floor 5
        elevatorController.submitNewInternalRequest(5);


        System.out.println("=== down Direction ===");
        // down Direction
        // Someone on floor 5 presses Down
        elevatorController = building.getExternalButtonDispatcher()
                .submitRequest(5,Direction.DOWN);
        // Now passenger is inside elevator presses internal button for floor 1
        elevatorController.submitNewInternalRequest(1);

    }
}
