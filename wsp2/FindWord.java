package networkimplements.wsp2;
//Network FindWord Application 24/10/19 v0.1
import java.util.Scanner;

public class FindWord {
	public static void main(String[] args) {
	 String s1,s2; 
	 Scanner in =new Scanner(System.in);
	 System.out.println("İlk kelimeyi giriniz : ");
	 s1 =in.nextLine();
	 System.out.println("İkinci kelimeyi giriniz");
	 s2 =in.nextLine();
	 if (s1.compareTo(s2) > 0 )
		 System.out.println("İlk kelime ikinciden büyük");
	 else if (s1.compareTo(s2) < 0 )           
		 System.out.println("İlk kelime ikinciden küçük");
	 else System.out.println("İki kelime eşit.");
	
	 in.close();
					} 
}