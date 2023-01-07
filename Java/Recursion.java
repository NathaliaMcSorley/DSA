public class Recursion {
	
	public static void main(String[] args) {
		walk(5);
		System.out.println(factorial(7));
		System.out.println(power(2, 8));
	}

	private static void walk(int steps) {
		if(steps < 1) return; //base case - when we would like to stop 
		System.out.println("You take a step!");
		walk(steps - 1); //recursive case - when we would like to continue
	}

	private static int factorial(int num) {	
	    if (num < 1) return 1; //base case
	    return num * factorial(num - 1); //recursive case
	}

	private static int power(int base, int power) {
	    if (power < 1) return 1; //base case
	    return base * power(base, power - 1); //recursive case
	}
}
