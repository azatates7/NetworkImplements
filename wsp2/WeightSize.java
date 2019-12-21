package networkimplements.wsp2;

import java.util.Scanner;

public class WeightSize {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Weight : ");
		int weight = sc1.nextInt();
		
		System.out.println("Size(cm) : ");
		int size = sc2.nextInt();
		
		int index = weight/((size*size)/10000);
		
		if((index >= 20) && (index < 25)) {
			System.out.println("W/S Index : "+index+" State : Normal");
		}
		else if((index >= 25) && (index < 30)){
			System.out.println("W/S Index : "+index+" State : Over Normal");
		}
		else if((index >= 30) && (index < 40)){
			System.out.println("W/S Index : "+index+" State : Very Fat");
		}
		
		else if((index >= 15) && (index < 20)){
			System.out.println("W/S Index : "+index+" State : Weak");
		}
		
		else {
			System.out.println("Error Parameter");
		}
		
		sc1.close();
		sc2.close();
	}

}
