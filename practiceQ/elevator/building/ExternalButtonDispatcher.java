package practiceQ.elevator.building;

import practiceQ.elevator.algo.SchedulingStrategy;
import practiceQ.elevator.Direction;
import practiceQ.elevator.lift.ElevatorController;

import java.util.List;

public class ExternalButtonDispatcher {
    private List<ElevatorController> elevatorControllers;
    private SchedulingStrategy strategy;
    public ExternalButtonDispatcher(List<ElevatorController> elevatorControllers){
        this.elevatorControllers = elevatorControllers;
    }

    // external request
    public ElevatorController submitRequest(int floor, Direction dir) {
        // TODO: later implement algo to pick best elevator
          // strategy.assignElevator(floor, dir, elevatorControllers);
        // picked 1 for now
        ElevatorController elevatorController =  elevatorControllers.get(0);
        elevatorController.submitNewRequest(floor, dir);
        return elevatorController;
    }

}

