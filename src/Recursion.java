
public class Recursion {
	
	public static void main(String[] args) {
		int i = 0;
		
		while (i < 101) {
			System.out.println(fibonacci(i));
			i++;
		}
	}
	
	public static long fibonacci(int i) {
		if (i == 0) return 0;
		if (i <= 2) return 1;
		long fibRet = fibonacci(i - 1) + fibonacci(i - 2);
		return fibRet;
	}

}
