package Model;

import Controller.Elevator;

public class SecondFloor implements ElevatorState{

	private Elevator elevator;
	private final int floor = 2;
	
	public SecondFloor(Elevator newElevator) {
		this.elevator = newElevator;
	}
	@Override
	public void buttonPressed(int floorNumber) {
		
		this.elevator.closeDoors();
		switch(floorNumber) {
		
		case 1:
			this.elevator.movingDown();
			this.elevator.setState(this.elevator.getFirstFloor());
			break;
			
		case 2:
			this.elevator.noMovment();
			break;
			
		case 3:
			this.elevator.movingUp();
			this.elevator.setState(this.elevator.getThirdFloor());
			break;
		}
	}

	@Override
	public int getFloor() {
		return this.floor;
	}
}
