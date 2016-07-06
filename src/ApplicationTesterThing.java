import java.util.Scanner;

public class ApplicationTesterThing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1 : Print current year \n"
						 + "2 : Print programming language\n"
						 + "3 : Print the first few digits of Pi\n"
						 + "4 : Print the first few terms of Fibonacci Sequence");
		int option = input.nextInt();
		
		if (option == Enumerations.PRINT_CURRENT_YEAR)
			System.out.println(2016);
		else if (option == Enumerations.PRINT_CURRENT_LANGUAGE)
			System.out.println("Java");
		else if (option == Enumerations.PRINT_FIB)
			System.out.println("1, 1, 2, 3, 5, 8, 13...");
		else if (option == Enumerations.PRINT_PI)
			System.out.println("3.14159");
		else 
			System.out.println("Option not valid");
		
		// This repeats the method so it doesn't stop after one loop
		main(args);
		
	}
	
}

class Enumerations {
	
	public static final int PRINT_CURRENT_YEAR = 1;
	public static final int PRINT_CURRENT_LANGUAGE = 2;
	public static final int PRINT_PI = 3;
	public static final int PRINT_FIB = 4;
	
}