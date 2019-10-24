import java.util.Scanner;

public class FibonacciRekursiv {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Geben Sie ein Zahl an: ");
		int i = sc.nextInt();
		System.out.println("Fibonacci("+i+") = " + fibonacci(i));
	}
	
	 private static int fibonacci(int i){
		 if (i==1||i==2) return 1;
		 else
		 {
			 return fibonacci(i-1) + fibonacci(i-2);
		 }
	 }
}
