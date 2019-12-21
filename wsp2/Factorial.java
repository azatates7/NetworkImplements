package networkimplements.wsp2;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]){
		int n, c, fact = 1;
		System.out.print("Faktoriyeli hesaplanacak bir sayi giriniz : ");
		Scanner in = new Scanner(System.in);
		n =in.nextInt();
		if (n < 0 ) 
			System.out.println("Sayi negatif olamaz.");
		else{
			if(n > 16) {
				System.out.print("Invalid Value");
			}
			else {
				for(c = 1 ;c <=n ;c++ ) {
					fact =fact*c;
				}
				System.out.print(n+" Faktoriyel= "+fact);  
			}
}  
		in.close();
	}
}