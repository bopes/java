import java.util.Scanner;
public class DigitExtractorTester {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Digit Extractor! Please enter 5 digits.");
		String entry = input.nextLine();
		
		System.out.println("Mathematically:");
		DigitExtractor dEMath = new DigitExtractor(Integer.parseInt(entry));
		dEMath.returnInvertedOrderByMath();
		
		System.out.println("By String:");
		DigitExtractor dEString = new DigitExtractor(entry);
		dEString.returnInvertedOrderByString();
	}

}
