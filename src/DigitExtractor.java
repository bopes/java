
public class DigitExtractor {
	
	int tNumber;
	String sNumber;

	public DigitExtractor(int numSequence) {
		tNumber = numSequence;
	}
	
	public DigitExtractor(String numSequence) {
		sNumber = numSequence;
	}
	
	public void returnInvertedOrderByMath(){
		
		int integer1;
		int integer2;
		int integer3;
		int integer4;
		int integer5;
		
		integer1 = (tNumber % 10    ) / 1;
		integer2 = (tNumber % 100   ) / 10;
		integer3 = (tNumber % 1000  ) / 100;
		integer4 = (tNumber % 10000 ) / 1000;
		integer5 = (tNumber % 100000) / 10000;
		
		System.out.println(integer1 + "\n" + integer2 + "\n" + integer3 + "\n" + integer4 + "\n" + integer5);
		
	}
	
	public void returnInvertedOrderByString() {
		
		char string1;
		char string2;
		char string3;
		char string4;
		char string5;
		
		string1 = sNumber.charAt(4);
		string2 = sNumber.charAt(3);
		string3 = sNumber.charAt(2);
		string4 = sNumber.charAt(1);
		string5 = sNumber.charAt(0);
		
		System.out.println(string1 + "\n" + string2 + "\n" + string3 + "\n" + string4 + "\n" + string5);
		
	}
	
}
