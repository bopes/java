import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FW {

	public static void main(String[] args) {
		// Define filepath for file we will be creating
		File newFile = new File("/Users/charleslee/Desktop/Eclipse/Tutorial/newFile.txt");
		
		// Check if the file already exists
		if (newFile.exists()) {
			System.out.println("File already exists");
		} 
		// If file doesn't exist, make it:
		else {
			
			// Error handling in case file already exists
			// This shouldn't be triggered, but Java requires the preemptive error handling
			try {
				 // Java will always 'try' this code
				newFile.createNewFile();
			}
			catch (Exception e) {
				// If exception occurs, Java will print stack trace
				e.printStackTrace(); 
			}
			
			// Error handling in case file doesn't exist
			// This shouldn't be trigger, but Java requires the preemptive error handling
			try {
				// Java will always 'try' this code
				FileWriter fileW = new FileWriter(newFile);
				BufferedWriter buffW = new BufferedWriter(fileW);
				buffW.write("It wrote successfully!");
				buffW.close();
				System.out.println("File written!");
			}
			catch (Exception e) {
				// If exception occurs, Java will print stack trace
				e.printStackTrace();
			}
			
		}
		
	}
	
}
