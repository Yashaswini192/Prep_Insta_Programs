package prepinsta;

import java.util.Scanner;

public class Fractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v = new Scanner(System.in);
		System.out.println("enter numerator of first fraction:");
		int n1 = v.nextInt();
		System.out.println("enter denomiator of first fraction:");
		int d1 = v.nextInt();
		System.out.println("enter numerator of second fraction:");
		int n2 = v.nextInt();
		System.out.println("enter denomiator of second fraction:");
		int d2 = v.nextInt();
		int num;
		int den,x;

		System.out.println("(" + n1 + "/" + d1 +") + (" + n2 + "/" + d2 + ") =");


		if(d1 == d2) {
			num = n1 + n2;
			den = d1;
		}
		else {
			num = (n1 * d2) + (d1 * n2);
			den = d1 * d2;
		}
		
		if(num > den) 
			x = num;
		
		else 
			x = den ;
		for(int i = 1 ; i <= x ;i++) {
			if(num % i == 0 && den % i ==0) {
				num = num/i;
				den = den/i;
			}
		}
		
		int n=1;
		int p= num;
		int q =den;
		if(num != den) {
			while(n!=0) {
				n = num % den;
				if(n!=0) {
					num = den ;
					 den = n;
				}
			}
		}
		System.out.println("("+p/den+"/"+q/den+")");
		v.close();
	}
}
