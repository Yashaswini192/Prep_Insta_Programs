package prepinsta;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter range:");
		int a = s.nextInt();
		int b = s.nextInt();
		int sum=0;
		for (int i=a;i<=b;i++) {
			System.out.println(i);
			sum = sum + i;
		}
			System.out.println("sum:"+sum);
		s.close();
	}

}
