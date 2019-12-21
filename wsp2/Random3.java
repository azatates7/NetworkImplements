package networkimplements.wsp2;

import java.security.SecureRandom; 

public class Random3 {

public static void main(String [] args) {
		
		SecureRandom r = new SecureRandom(); 
		int a = r.nextInt(100); 
		System.out.println("My Random Number : "+a);
	}
	
}