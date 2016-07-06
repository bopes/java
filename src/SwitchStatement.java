
public class SwitchStatement {
	
	public static void main(String[] args) {
		
		int day = 2;
		String wednesdaySubstitute = "Wendsday";
		String dayString = "";
		
		// Integer switch statement
		switch (day) {
			case 0: dayString = "Sunday";
					// Without this break, the switch will execute the first successful case and then all cases after it
					break; 
					
			case 1: dayString = "Monday";
					break;
					
			case 2: dayString = "Tuesday";
					break;
					
			// You can embed additional code within a case:
			case 3: if (wednesdaySubstitute != null)
						dayString = wednesdaySubstitute;
					else
						dayString = "Wednesday";
					break;
			
			case 4: dayString = "Thursday";
					break;
			
			case 5: dayString = "Friday";
					break;
			
			case 6: dayString = "Saturday";
					break;
		}
		
		System.out.println(dayString);
		
		// String switch statement
		day = 0;
		dayString = "Tuesday";
		
		switch (dayString) {
		
		case "Sunday": 
			day = 0;
			break;
		case "Monday": 
			day = 1;
			break;
		case "Tuesday": 
			day = 2;
			break;
		case "Wednesday": 
			day = 3;
			break;
		case "Thursday": 
			day = 4;
			break;
		case "Friday": 
			day = 5;
			break;
		case "Saturday": 
			day = 6;
			break;
		// Can set a default case as well
		default: 
			day = 0;
			break;
		}
		
		System.out.println(day);

	}
	
}
