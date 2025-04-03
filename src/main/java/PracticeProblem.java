public class PracticeProblem {

	public static void main(String args[]) {

	}
	// use recursion means calling the function back inside of itself
	public static int sumOfDigits(int x) {
		x = Math.abs(x); // for negative numbers
		// Base case for if x is only one digit
		if (x < 10){
			return x; 
		}
		// x % 10 gives me the last digit, x /10 gives me the remainder 
		return (x % 10) + sumOfDigits(x/10); 
		// takes the last digit adds after using the function itself to do the same to the remainder and so on until there is only one digit left

	}
	public static int factorial(int n){
		// Base Cases
		if (n < 0){ // negative numbers
			return 0; 
		}
		if (n == 0){ // defintion for 0!
			return 1;
		}
		return n * factorial(n-1); // literally almost the exact formula for factorials
	}
	

}
