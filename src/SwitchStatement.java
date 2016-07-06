
public class SwitchStatement {
	
	public static void main(String[] args) {
		
		int day = 2;
		String dayString = "";
		
		switch (day) {
			case 0: dayString = "Sunday";
					break; // Without this break, the switch will execute the first successful case and then all cases after it
			case 1: dayString = "Monday";
					break;
			case 2: dayString = "Tuesday";
					break;
			case 3: dayString = "Wednesday";
					break;
			case 4: dayString = "Thursday";
					break;
			case 5: dayString = "Friday";
					break;
			case 6: dayString = "Saturday";
					break;
		}
		
		System.out.println(dayString);

	}
	
}
