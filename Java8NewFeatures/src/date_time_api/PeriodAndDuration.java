package date_time_api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {
	
	static void period() {
		
		LocalDate startdate = LocalDate.of(2022, 10, 05);
		
		LocalDate today = LocalDate.now();
		
		Period teachPeriod = Period.between(startdate, today);
		
		System.out.println("TeachPeriod :"+teachPeriod);
		
		
	}
	
	static void duration() {
		
		LocalTime currentTime = LocalTime.now();
		
		Duration twoHr = Duration.ofHours(2);
		
		LocalTime next2HR = currentTime.plus(twoHr);
		
		Duration timeDiff = Duration.between(currentTime, next2HR);
		
		System.out.println("TimeDiff :"+timeDiff);
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		period();
		duration();
		
	}

}
