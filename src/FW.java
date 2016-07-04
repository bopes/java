import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FW {

	public static void main(String[] args) {
		File newFile = new File("/Users/charleslee/Desktop/Eclipse/Tutorial/newFile.txt");
		
		if (newFile.exists()) {
			System.out.println("File already exists");
		} else {
			try {
				newFile.createNewFile();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			try {
				FileWriter fileW = new FileWriter(newFile);
				BufferedWriter buffW = new BufferedWriter(fileW);
				buffW.write("It wrote successfully!");
				buffW.close();
				System.out.println("File written!");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
