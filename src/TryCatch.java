
public class TryCatch {

	public static void main(String[] args) {
		
		// This code may encounter errors
		// Try lets us run it without errors crashing everything
		// Only one error will be caught for each try section. If you want to catch multiple errors, Split code into multiple try sections
		try {
			// Initial code (Will throw ArithmeticExceptionif x == 0)
			int x = 1;
			int y = 2;
			int answer = y / x;
			System.out.println(answer);
			
			// Another error (Will throw NullPointerException)
			Object obj = null;
			obj.hashCode();
		}
		
		// Catch lets us handle any errors arising from code in 'try'
		// You can specify the type of error/exception to catch with this code block
		catch (ArithmeticException mathError) {
			
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
		// Catching another Exception type in the same try block
		catch (NullPointerException objError) {
			String errorMessage = objError.getMessage();
			System.out.println("Null Pointer Exception: " + errorMessage);
		}
		// Catch all Exceptions
		catch (Exception error) {
			String errorMessage = error.getMessage();
			System.out.println("Error: " + errorMessage);
			
			// Use #printStackTrace() for debugging
			error.printStackTrace();
		}
		
	
	}
	
}
