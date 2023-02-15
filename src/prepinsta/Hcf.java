package prepinsta;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jk = new Scanner(System.in);
		System.out.println("enter 1st number:");
		int num1 = jk.nextInt();
		System.out.println("enter 2nd number:");
		int num2 = jk.nextInt();
		int hcf = 1;
		
		for(int i = 1;i <= num1 || i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0)
				hcf = i;
		}
		System.out.println("hcf is " + hcf);
	}

}
