package networkimplements.wsp3;

import java.io.IOException;

public class AppRun {

	public static void main(String[]args){    
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("gnome-terminal"); // Example == "notepad"
			}
		catch (IOException e) {      
			System.out.println(e);
			}
		} 
} 