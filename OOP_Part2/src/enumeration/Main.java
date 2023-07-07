package enumeration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Game Joystick direction
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your Direction");
		String direction = userInput.next();
		userInput.close();
		
		Direction clickDirection = switch (direction) {
		case "north"-> Direction.NORTH;
		case "south"-> Direction.SOUTH; 
		case "east"-> Direction.EAST; 
		case "west"-> Direction.WEST; 
		
		
		
		default ->Direction.STAND;
		};
		
		String charactorStatus = switch (clickDirection) {
		case NORTH -> "Charactor is moving North";
		case SOUTH -> "Charactor is moving South";
		case EAST -> "Charactor is moving East";
		case WEST-> "Charactor is moving West";
		case STAND-> "Charactor is Standing";
		};
		
		System.out.println(charactorStatus);
		
	}
	

}

