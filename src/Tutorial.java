import java.util.Scanner;
public class Tutorial {
	
	static Scanner input = new Scanner(System.in);

	 public static void main(String[] args) {
		 countNumber();
	 }
	 
	 public static void inputTest(){
		 String message = input.nextLine();
		 System.out.println(Hello(message));
	 }
	 
	 public static String Hello(String message){
		 if (message.equals("Hi")) {
			 return "Hello";
		 } else {
			 return "Goodbye";
		 }
	 }
	 
	 public static void countNumber(){
		 int i = 0;
		 while (i <= 100) {
			 System.out.println(i);
			 i++;
		 }
	 }
}
