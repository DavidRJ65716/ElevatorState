package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Controller.Elevator;

public class FloorNumbers {

	public FloorNumbers(String newFile) throws FileNotFoundException{		
		
		StringBuffer newFileContents = new StringBuffer();
		
		Scanner data = null;
		
		data = new Scanner(new File(newFile));
		
		String[] floorNumbers = data.nextLine().split(" ");
		
		Elevator startElevator = new Elevator(floorNumbers);
	}
}
