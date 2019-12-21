package networkimplements.wsp1;
// Network Compare Application 24/10/19 v0.1
import java.util.Scanner; 

public class Compare {

	public static void main(String[] args) {
		String s1 = "hello";  
		String s2 = "hello"; 
		String s3 = "meklo"; 
		String s4 = "hemlo";  
		String s5 = "flag";
		String x = "4.672";
		String y = "4.572";
		Integer a = 5;
		Integer b = 12;
		Scanner k = new Scanner(System.in);
		System.out.println("Double sayi giriniz : ");
		double K = k.nextDouble();
		System.out.println("Cümle giriniz : ");
		String isim = k.next();
		System.out.println("NEW VALUE");
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s1.compareTo(s3));  
		System.out.println(s1.compareTo(s4));   
		System.out.println(s1.compareTo(s5)); 
		System.out.println(x.compareTo(y)); 
		System.out.println(a.compareTo(b));  
		System.out.println(K);
		System.out.print(isim+"\n");
		System.out.print("x+y : "+(x+y)+"\n"); 
		
		k.close();
	}

}