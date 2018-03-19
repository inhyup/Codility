package Lessons;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Interview {

	public static void main(String[] args) {
		
		String E = "23:00";
		String L = "04:00";
		
		System.out.println(solution(E, L));

	}
	
	
	static int solution (String eTime, String lTime) {
		int output = 0;
		final int ENTRANCE_FEE = 2;
		final int FIRST_HOUR_COST = 3;
		final int SUCCESSIVE_COST = 4;
		
		String[] eHour = eTime.split(":");
		String[] lHour = lTime.split(":");
		int eHourInt = Integer.parseInt(eHour[0]);
		int lHourInt = Integer.parseInt(lHour[0]);
		
		if (eHourInt > lHourInt) {
			lHourInt = lHourInt + 24;
			lHour[0] = Integer.toString(lHourInt);
			lTime = lHour[0] + ":" + lHour[1];
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		
	
		Date e = null;
		Date l = null;
		try {
			e = dateFormat.parse(eTime);
			l = dateFormat.parse(lTime);			

			long diff = 0;

			diff = l.getTime() - e.getTime();	
			
			
			long diffMin =  diff / (60 * 1000) % 60;
			long diffHour = diff / (60 * 60 * 1000) % 24;
			
			
//			System.out.println(diffMin);
//			System.out.println(diffHour);
			
			if (diffHour < 1 ) {
				output = ENTRANCE_FEE + FIRST_HOUR_COST;
			} else {
				if (diffMin > 0) {
					output = (int) (ENTRANCE_FEE + FIRST_HOUR_COST + (SUCCESSIVE_COST * (diffHour)));
				}
				else if (diffMin == 0) {
					output = (int) (ENTRANCE_FEE + FIRST_HOUR_COST + (SUCCESSIVE_COST * (diffHour -1)));
				}
			}
			
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
		
	
		return output;
	}

}
