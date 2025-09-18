package practiceQ.elevator.lift;

import java.util.List;

public class InternalButtonDispatcher {

    private List<ElevatorController> elevatorControllers;
    public InternalButtonDispatcher(List<ElevatorController> elevatorControllers){
        this.elevatorControllers = elevatorControllers;
    }
    public void submitNewInternalRequest(int floor){
        ElevatorController elevatorController =  elevatorControllers.get(0);
        elevatorController.submitNewInternalRequest(floor);
    }
}
