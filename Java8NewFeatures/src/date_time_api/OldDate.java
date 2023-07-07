package date_time_api;

import java.util.Date;

public class OldDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		
		System.out.println("Today :"+now);
		
		System.out.println("Day :"+now.getDay());
		
		System.out.println(now.getMinutes());
		
		System.out.println(now.getTime());
		
		Date specifyDate = new Date(121, 11, 01);
		System.out.println("SpecifyDate :"+specifyDate);
		
		long currenTime = System.currentTimeMillis();
		
		Date currentDate = new Date(currenTime);
		System.out.println("CurrentDateTime :"+ currentDate);

	}

}
