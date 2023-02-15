package prepinsta;

import java.util.Scanner;

public class Factorial {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int fact = fact(n);
		System.out.println("factorial is :"+fact);
	}
	
	static int fact(int n) {
		if(n == 1) {
			return 1;
		}
		n = n * fact(n-1);
		return n;
	}
	
}
