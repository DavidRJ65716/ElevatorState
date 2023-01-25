package Model;

public interface ElevatorState {

	void buttonPressed(int floorNumber);
	
	int getFloor();
}
