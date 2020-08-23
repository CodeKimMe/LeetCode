package practice;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(giveFactorial(10));

	}
	
	public static int giveFactorial(int n) {
		if (n == 0) return 1;
		
		return n*giveFactorial(n-1);
	}

}
