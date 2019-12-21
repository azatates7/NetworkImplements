package networkimplements.wsp1;
//Network Aritmetics2 Application 24/10/19 v0.1
public class Aritmetics2 {
 
		public static void main(String[] args) {
			int x = 10;
			int y = 12;
				System.out.format("x= %d ve y = %d ise x +=y = %d %n", x, y, (x += y));
				System.out.format("x= %d ve y = %d ise x ‐=y = %d %n", x, y, (x = x - y));
				System.out.format("x= %d ve y = %d ise x *=y = %d %n",x, y, (x *= y));
				System.out.format("x= %d ve y = %d ise x /=y = %d %n",x, y, (x /= y));
				System.out.format("x= %d ve y = %d ise x mod=y = %d %n", x,y, (x %= y));
	}

}
