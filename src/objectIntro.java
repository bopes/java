
public class objectIntro {
	
	// Water in water bottle
	int tWater = 0; 
	
	// Default constructor - this will be used if no params are passed
	public objectIntro(){
	}
	
	// Constructor with given params - this will be used if params are passed
	public objectIntro(int amount){
		tWater = amount;
	}
	
	public void addWater(int amount){
		tWater = tWater + amount;
	}
	
	public void drinkWater(int amount){
		tWater = tWater - amount;
	}
	
	public int getWater(){
		return tWater;
	}

}
