package interfaces_challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;
	public static void main(String[] args) {
		Player kevin = new Player("Kevin", 10, 25);
		System.out.println(kevin.toString());
		saveObject(kevin);
		
		kevin.setHitPoints(8);
		System.out.println(kevin);
		kevin.setWeapon("The ole trusty axe");
		saveObject(kevin);
		loadObject(kevin);
		System.out.println(kevin);
	}
	public static ArrayList<String> readValues() {
		ArrayList<String> values = new ArrayList<String>();
		scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n"+ "1 to enter a string\n" + "0 to quit");
		while(!quit) {
			System.out.println("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
				quit = true;
			case 1:
				System.out.println("Enter a string: ");
				String stringInput = scanner.nextLine();
				values.add(index, stringInput);
				index++;
				break;
			}
		}
		return values;
	}
	
	
	
	public static void saveObject(ISavable objectToSave) {
		for(int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
		}
	}
	public static void loadObject(ISavable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
}