package practiceQ.elevator.building;

import practiceQ.elevator.lift.Elevator;
import practiceQ.elevator.lift.ElevatorController;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Floor> floors;
    public ExternalButtonDispatcher externalButtonDispatcher;
    private List<ElevatorController> elevatorControllers;


    public Building(int numFloors, int numElevators) {
        // create  elevatorControllers
        List<ElevatorController> elevatorControllers = new ArrayList<>();
        for (int i = 0; i < numElevators; i++) {
            elevatorControllers.add(new ElevatorController(new Elevator(i)));
        }

        // dispatcher knows about controllers
        this.externalButtonDispatcher = new ExternalButtonDispatcher(elevatorControllers);

        // create floors
        this.floors = new ArrayList<>();
        for (int i = 0; i < numFloors; i++) {
            floors.add(new Floor(i,externalButtonDispatcher));
        }
    }
    public List<Floor> getFloors() {
        return floors;
    }

     public ExternalButtonDispatcher getExternalButtonDispatcher() {
        return  externalButtonDispatcher;
    }
}
