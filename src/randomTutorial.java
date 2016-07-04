import java.util.Random;
public class randomTutorial {
	
	public static void main(String[] args){
		
		// Instantiate random generator
		Random rnd = new Random();
		
		// Print out random call. Number will be from [0..2). 2 is upper bound, not inclusive
		System.out.println(rnd.nextInt(2));
		
		
	}

}
