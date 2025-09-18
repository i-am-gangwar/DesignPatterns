package practiceQ.elevator.building;

public class Floor {
    private int floorNo;
    private ExternalButton externalButton;
    public Floor(int floorNumber, ExternalButtonDispatcher dispatcher) {
        this.floorNo = floorNumber;
        this.externalButton = new ExternalButton(floorNumber, dispatcher);
    }
    public ExternalButton getExternalButton() {
        return this.externalButton;
    }
}
