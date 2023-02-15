package prepinsta;

import java.util.Scanner;

public class positive {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = s.nextInt();
		
		if(n>0) {
			System.out.println("positive number");
		}else if(n<0) {
			System.out.println("negative number");
		}else {
			System.out.println("zero");
		}
		s.close();
	}

}
