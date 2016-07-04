import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
	
	static Scanner reader = new Scanner(System.in);
	static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		// Retrieve numbers from user
		System.out.println("Please enter an array of numbers, type 0 when finished");
		int in = reader.nextInt();
		
		// Keep asking for numbers until '0' is inputted
		while (in != 0) {
			array.add(in);
			in = reader.nextInt();
		}
		
		// Print out inputted numbers
		PrintArray();
		
		// Retrieve a number to delete from array
		System.out.println("What number whould you like to delete?");
		int del = reader.nextInt();
		
		// Remove element from the array
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == del) {
				array.remove(i);
				break;
			}
		}
		
		// Print array to verify deleted number
		PrintArray();
	}
	
	public static void PrintArray() {
		System.out.println("-------------------------------------");
		for (int i : array) {
			System.out.println(i);
		}
	}

}
