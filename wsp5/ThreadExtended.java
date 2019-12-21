package networkimplements.wsp5;

public class ThreadExtended extends Thread{
	static String j;
	public void run(){
		for(int i=0;i<20;i++){
			if(i < 9) {
				j = "0"+(i+1);
				System.out.println(j+". New thread");
			} 
			else {
				System.out.println((i+1)+". Main thread");
			}
			}
		}
	public static void main(String[] args){
		ThreadExtended te=new ThreadExtended();
		te.start();
		for(int i=0;i<20;i++){
			if(i < 9) {
				j = "0"+(i+1);
				System.out.println(j+". Main thread");
			}
			else {
				System.out.println((i+1)+". Main thread");
			}
			}
		}
	}