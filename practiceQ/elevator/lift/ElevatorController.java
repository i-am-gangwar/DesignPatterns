package practiceQ.elevator.lift;

import practiceQ.elevator.Direction;

import java.util.PriorityQueue;

public class ElevatorController {
    private Elevator elevator;
    private PriorityQueue<Integer> upRequests;
    private PriorityQueue<Integer> downRequests;

    public ElevatorController(Elevator elevator){
        this.elevator = elevator;
    }

    // select using Algo for ele

    public Elevator getElevator(){
        return this.elevator;
    }





    // External request
    public void submitNewRequest(int floor, Direction dir){
        System.out.println("Controller received request for floor " + floor + " going " + dir);
        elevator.move(floor, dir);  // directly move for now

    }

    // Internal request
    public void submitNewInternalRequest(int floor) {
        System.out.println("Controller received INTERNAL request for floor " + floor);
        elevator.move(floor);
    }
}
