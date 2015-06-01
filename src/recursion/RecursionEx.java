package recursion;

public class RecursionEx {

	public static void main(String[] args) {

		System.out.println(factor(4));
	}

	public static int factor(int n){

		if (n == 1) {
			System.out.print( n + " = ");
			return 1;
		}

		else {
			System.out.print(n + " x ");
			return n * factor(n-1);

		}	

	}

}
