package networkimplements.wsp2;
//Network FahrenheitToCelsius Application 24/10/19 v0.1
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		float temperatue;
		Scanner in = new Scanner(System.in);
		System.out.println("Fahrenheit sıcaklığı giriniz : ");
		temperatue = in.nextInt();
		temperatue = ((temperatue - 32)*5)/9; // in -40 C = F
		System.out.println("Celcius Değeri = " +temperatue);
		in.close();
	}

}