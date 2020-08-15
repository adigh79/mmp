package org.iit.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class AppLibrary {
	
	
	public  static String getFutureDate(int days)
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		Date d = cal.getTime();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		String date = sdf.format(d);
		System.out.println(date);
		return date.toString();
		
	}
	
	public static String[][] readxls(String filePath){
		
		
		String[][] str = new String[10][10];
		return str;
				
				
	}
    public static String[][] readxlsx(String filePath){
    	String[][] str = new String[10][10];
		return str;
    }
    
    public String getRandomChars(int count) {
    	Random rnd = new Random();
    	String s ="";
    	
    	for (int i = 0 ; i<count;i++ ) {
    		s = s+(char)(65 + rnd.nextInt(26));
    		
    	}
    		return s;	
    }

}
