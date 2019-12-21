package networkimplements.wsp2;
 
import java.util.Random;

public class Random2 {
	
	public static void main(String [] args) {
		Random r = new Random(); 
		int a = r.nextInt(100); 
		System.out.println("My Random Number : "+a);
	}
	
}