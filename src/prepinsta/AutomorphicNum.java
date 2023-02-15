package prepinsta;

import java.util.Scanner;

public class AutomorphicNum {
//a number when squared ends with the number itself
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("enter a number:");
		int num = s.nextInt();
		int sqr = num * num;
		System.out.println("square:"+sqr);

		int a =	(sqr % 10);
		//System.out.println(a);

		if(a == (num % 10)) {
			System.out.println(num+" is a automorphic number");
		}else {
			System.out.println(num+" is not a automorphic number");
		}
	}
}
