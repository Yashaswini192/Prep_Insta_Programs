package prepinsta;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d = new Scanner(System.in);
		System.out.println("enter a number :");
		int num = d.nextInt();
		int reverse = 0;

		while(num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder ;
			num = num / 10;
		}
		System.out.println("reverse of given number is :"+reverse);
		d.close();
	}

}
