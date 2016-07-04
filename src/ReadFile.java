import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	
	public static void main(String[] args) throws Exception {
		
//		File raw_file = new File("ex://Users/charleslee/Desktop/Eclipse/Tutorial/text.txt");
//		FileReader file = new FileReader(raw_file);
		 
		FileReader file = new FileReader("/Users/charleslee/Desktop/Eclipse/Tutorial/text.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();
		
		while (line != null) {
			text += line;
			line = reader.readLine();
		}
		
		System.out.println("---\n" + text + "\n---");
		
	}

}
