import java.io.BufferedReader;
import java.io.FileReader;

public class FR {
	
	public static void main(String[] args) throws Exception {
		 
		// Get file from computer - ln 11 will throw FileNotFoundException if it can't find the file 
		// It will also require so preemptive Exception handling JUST IN CASE it can't find the file
		// See the 'throws Exception' in ln 8 for the preemptive Exception handling
		FileReader file = new FileReader("/Users/charleslee/Desktop/Eclipse/Tutorial/text.txt");
		BufferedReader reader = new BufferedReader(file);
		
		// Create variables to hold data from text file
		// If reader can't find the file, lns 21 and 26 will throw exceptions
		// These are preemptively handled by the 'throws Exception' on ln 8
		// The 'throws Exception' covers all Exceptions in the method
		String text = "";
		String line = reader.readLine();
		
		// Retrieve all lines from txt file
		while (line != null) {
			text += line;
			line = reader.readLine();
		}
		file.close();
		
		// Print file contents to console
		System.out.println("---\n" + text + "\n---");
		
	}

}
