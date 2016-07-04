
public class TryCatch {

	public static void main(String[] args) {
		
		// This code may encounter errors
		// Try lets us run it without errors crashing everything
		try {
			int x = 0;
			int y = 2;
			int answer = y / x;
			
			System.out.println(answer);
		}
		
		// Catch lets us handle any errors arising from code in 'try'
		catch(ArithmeticException mathError) {
			
			// Store system error message as String
			String errorMessage = mathError.getMessage();
			
			// Print default error
			System.out.println("Error: " + errorMessage);
			mathError.printStackTrace();
			
			// Print custom error messages
			if (errorMessage.equals("/ by zero")) {
				System.out.println("You can't divide by zero");
			} else {
				System.out.println("Math Error");
			}
		}
		
	
	}
	
}
