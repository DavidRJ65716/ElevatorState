package Model;

import Controller.Elevator;

public class ThirdFloor implements ElevatorState{
	
	private Elevator elevator;
	private final int floor = 3;
	
	public ThirdFloor(Elevator newElevator) {
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
			this.elevator.movingDown();
			this.elevator.setState(this.elevator.getSecondFloor());
			break;
			
		case 3:
			this.elevator.noMovment();
			break;
		}
	}

	@Override
	public int getFloor() {
		return this.floor;
	}
}
