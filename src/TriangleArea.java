import java.util.Scanner;
public class TriangleArea {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Declare variables to hold base and height
		double base;
		double height;
		
		// Retrieve base value from user
		System.out.print("Enter the triangle's base: ");
		base = sc.nextDouble();
		
		// Retrieve height value from user
		System.out.print("Enter the triangle's height: ");
		height = sc.nextDouble();
		
		// Get initial area
		double preArea = base * height;
		
		// Get final Area
		double Area = preArea / 2;
				
		// Display the Area
		System.out.println("Your triangle has area: " + Area);
	}
	
}
