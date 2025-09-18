package practiceQ.elevator.building;

import practiceQ.elevator.Direction;

public class ExternalButton {
    private int floorNumber;
    private ExternalButtonDispatcher externalButtonDispatcher;
    public ExternalButton(int floorNumber, ExternalButtonDispatcher externalButtonDispatcher) {
        this.floorNumber = floorNumber;
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public void pressButton(int floor, Direction dir) {
        System.out.println("External button pressed at floor " + floor + " for " + dir);
        externalButtonDispatcher.submitRequest(floor, dir);
    }

}
