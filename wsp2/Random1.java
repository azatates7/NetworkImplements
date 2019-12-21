package networkimplements.wsp2;
//Network Random Application 24/10/19 v0.1
public class Random1 {

	public static void main(String[]args) {
		//int denemesiniri = 100;
		Random1 izle = new Random1();
		izle.basla();
		}
	public void basla(){
		Uret a = new Uret();
		int n;
		n=0;
		for(int i = 1; i <= 100; i++){
			System.out.println(i+".Takip basladi. uretilen sayi 2 olana kadar döngüdeyim");
			while(a.sayi!=2){
				a.RandomDeg();
				n++;
				}
			System.out.println("Takip bitti çünkü a 2 oldu");
			a.sayi=0;
			}
		System.out.println("Döngü "+n+" defada 2 yi buldu");
		System.out.println("Detect Avg : %"+n/100);
	}
}