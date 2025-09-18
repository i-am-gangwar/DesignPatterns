package practiceQ.elevator.lift;

public class InternalButton {
    private InternalButtonDispatcher internalButtonDispatcher;
    public InternalButton(InternalButtonDispatcher internalButtonDispatcher){
        this.internalButtonDispatcher = internalButtonDispatcher;
    }
    public void pressButton(int destinationFloor) {
        System.out.println("Internal button pressed for floor " + destinationFloor);
        internalButtonDispatcher.submitNewInternalRequest(destinationFloor);
    }
}
