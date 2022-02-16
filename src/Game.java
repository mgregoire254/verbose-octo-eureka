//Basic text adventure. By Michael Gregoire.  Name forthcoming.
import java.util.Scanner;

public class Game {
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	int playerHP;
	String playerName;
	String playerWeapon;
	int choice;

	public static void main(String[] args) {
		
		Game game;
		game = new Game();
		
		game.playerSetUp();
		game.arrowstartownGate();

	}

	public void playerSetUp() {
		
		
		playerHP = 15;
		playerWeapon = "Knife";
		
		System.out.println("Your HP: " + playerHP);
		System.out.println("Your Weapon: " + playerWeapon);
		
		System.out.println("Please enter your name: ");
		playerName = myScanner.nextLine();
		System.out.println("Hello " + playerName + ", let's start your adventure!");
		
		
	}
	
	public void arrowstartownGate() {
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
		System.out.println("You are at the gate of the town.");
		System.out.println("A guard is standing in front of you.");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1: Talk to the guard.");
		System.out.println("2: Attack the guard.");
		System.out.println("3: Leave.");
		
		choice = myScanner.nextInt();
		
		if(choice == 1) {
			System.out.println("Guard: Hello there stranger. So your name is " + playerName + "? \nSorry but we cannot let a stranger enter our town.");
			enterScanner.nextLine();
			arrowstartownGate();
		}
		if(choice == 2) {
			playerHP= playerHP - 1;
			System.out.println("Guard: Hey dont't be stupd. \n\nThe guard hit you so hard and you gave up.\n(You recieve 1 damage)");
			System.out.println("Your HP: " + playerHP);
			enterScanner.hasNextLine();
			arrowstartownGate();
		}
		if(choice == 3) {
			towncrossRoad();
		}
		else {
			arrowstartownGate();
		}
	}
	
	public void towncrossRoad() {
		System.out.println("----------------------------------------------------------------------\n");
		System.out.println("You are at a crossroad. If you go south, you will go back to the town.\n\n");
		System.out.println("1: Go north");
		System.out.println("2: Go east");
		System.out.println("3: Go south");
		System.out.println("4: Go west");
		System.out.println("----------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice == 1) {
			river();
		}
		if(choice == 2) {
			forest();
		}
		if(choice == 3) {
			arrowstartownGate();
		}
		if(choice == 4) {
			west();
		}
		else {
			towncrossRoad();
		}
	}
	
	public void river() {
		System.out.println("----------------------------------------------------------------------\n");
		System.out.println("There is a river. You drink the water and rest at the riverside.");
		System.out.println("Your HP is recovered.");
		playerHP = playerHP + 1;
		System.out.println("Your HP: " + playerHP);
		System.out.println("\n\n1: Go back to the crossroad.");
		System.out.println("----------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice == 1) {
			towncrossRoad();
		}
		else {
			river();
		}
	}
	
	public void forest() {
		System.out.println("----------------------------------------------------------------------\n");
		System.out.println("You walked into a dark forest and found a Long Sword!");
		playerWeapon = "Long Sword";
		System.out.println("Your Weapon: " + playerWeapon);
		System.out.println("\n\n1: Go back to the crossroad.");
		System.out.println("----------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice == 1) {
			towncrossRoad();
		}
		else {
			river();
		}
		
	}
	
	public void openRoad() {
		
	}

	public void arrowstarMarket(){

	}
}
