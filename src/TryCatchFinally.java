
public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		// Scope needs to be defined outside of try block
		int x = 0;
		int y = 2;
		
		// Try block including variables defined otuside of scope
		try {
			int answer = y / x;
		}
		// Normal catch block
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		// Finally block will continue executing code after the try block, even if it threw an error
		finally {
			x = 0;
			y = 0;
		}
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
		
	}

}
