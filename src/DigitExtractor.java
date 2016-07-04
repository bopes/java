
public class DigitExtractor {
	
	int tNumber = 0;

	public DigitExtractor(int numSequence) {
		
		tNumber = numSequence;
		
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
		
		System.out.print(integer1 + "\n" + integer2 + "\n" + integer3 + "\n" + integer4 + "\n" + integer5);
		
	}
	
}
