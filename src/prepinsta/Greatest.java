package prepinsta;

import java.util.Scanner;

public class Greatest { // greatest of two digits

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter p value:");
		int p=s.nextInt();
		System.out.println("enter f value:");
		int f=s.nextInt();

		if(p>f) {
			System.out.println(p+ " is largest number");
		}else {
			System.out.println(f+ " is largest number");
		}
		s.close();
	}
}
