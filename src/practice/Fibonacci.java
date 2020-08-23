package practice;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(getFibonacciAtIndex(9));

	}
	
	public static int getFibonacciAtIndex(int i) {
		if (i == 1 || i == 2) return 1;
		
		return getFibonacciAtIndex(i-1) + getFibonacciAtIndex(i-2);
	}

}
