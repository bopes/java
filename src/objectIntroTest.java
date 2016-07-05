
public class objectIntroTest {
	
	public static void main(String[] args){
		
		// Create new water bottle
		objectIntro waterBottle = new objectIntro();
		
		// Fill bottle
		waterBottle.addWater(100);
		
		// Drink some water
		waterBottle.drinkWater(20);
		
		// Check how much water is left
		System.out.println("Your remaining water level is: " + waterBottle.getWater());
	}

}
