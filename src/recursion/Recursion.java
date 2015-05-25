package recursion;

public class Recursion {
	// Factorial (falkultet) findes ved at gange alle tal fra og med n til 1. Derfor kan vi g�re det rekursivt:
	public static int factorial(int n){
		if(n<=1){
			return 1; 
		}
		return n * factorial(n-1);
	}
	
	// Find nummer n fibonaccital.
	public static long fibonacci(int n){
		if(n<=1){
			return n;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void printFileSystem(){
		
	}
}