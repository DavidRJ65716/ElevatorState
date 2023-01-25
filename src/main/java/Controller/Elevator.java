package Controller;

import Model.*;

public class Elevator {

	private ElevatorState firstFloor;
	private ElevatorState secondFloor;
	private ElevatorState thirdFloor;
	private ElevatorState elevator;
	
	private String[] floorNumbers;
	
	private boolean closedDoor = false;
	
	public Elevator(String[] newFloorNumbers){
		
		this.firstFloor = new FirstFloor(this);
		this.secondFloor = new SecondFloor(this);
		this.thirdFloor = new ThirdFloor(this);
		this.elevator = this.firstFloor;
		this.floorNumbers = newFloorNumbers;
		processCommand();
	}
	
	public void processCommand() {
		
		for(String Floor : floorNumbers) {
			System.out.println(Floor + " pressed");
			this.elevator.buttonPressed(Integer.parseInt(Floor));
		}
	}
	
	public void setState(ElevatorState state) {
		
		this.elevator = state;
		System.out.println("*ding* The elevator arrives at Floor " + this.elevator.getFloor());
		openDoors();
	}
	
	public void closeDoors() {
		
		if (!closedDoor) {
			System.out.println("Doors are closed");
			closedDoor = true;
		}
	}
	
	public void openDoors() {
		System.out.println("Doors are open");
		closedDoor = false;
	}
		
	public void movingUp() {
		System.out.println("Going up...");
	}
	
	public void movingDown() {
		System.out.println("Going down...");
	}
	
	public void noMovment() {
		System.out.println("Nothing happens");
	}
	
	public ElevatorState getFirstFloor() {
		return firstFloor;
	}

	public ElevatorState getSecondFloor() {
		return secondFloor;
	}
	
	public ElevatorState getThirdFloor() {
		return thirdFloor;
	}
	
}
