
public class Array {

	public static void main(String[] args){
		
		// initiate array by designating object type it's holding and including '[]' in the variable name. Then specify the length.
		int arrInt[] = new int[5];
				
		// Assigning individual elements in the array
		arrInt[0] = 1;
		
		// Assign multiple values (all done individually)
		int i = 1;
		while (i <= 4) {
			arrInt[i] = i + 1;
			i++;
		}
		
		// View the entire array. If the argument here includes Strings, it will convert the number values to Strings
		System.out.println(arrInt[0] + " " + arrInt[1] + " " + arrInt[2] + " " + arrInt[3] + " " + arrInt[4]);
		
		// Printing the array does not look pretty... this looks like: [I@7852e922
		System.out.println(arrInt);
			
		
	}
	
}
