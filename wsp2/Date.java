package networkimplements.wsp2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

	public static void main(String args[]){
		int gun, ay, yil;
		int saniye, dakika, saat;       
		GregorianCalendar date =new GregorianCalendar();
		gun =date.get(Calendar.DAY_OF_MONTH);
		ay =date.get(Calendar.MONTH);
		yil =date.get(Calendar.YEAR);
		saniye =date.get(Calendar.SECOND);
		dakika =date.get(Calendar.MINUTE);
		saat =date.get(Calendar.HOUR);       
		System.out.println("Şuanki Tarih "+gun+"/"+(ay+1)+"/"+yil);      
		System.out.println("Şuanki Saat  "+saat+" : "+dakika+" : "+saniye);
		} 
} 