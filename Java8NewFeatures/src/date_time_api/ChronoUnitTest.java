package date_time_api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println("Today :"+today);
		
		LocalDate after10Day = today.plus(10,ChronoUnit.DAYS);
		System.out.println("After10Days :"+after10Day);
		
		LocalDate before5Month = today.minus(5,ChronoUnit.MONTHS);
		System.out.println("before5Month :"+before5Month);
		
		LocalDate after6Year = today.plus(6,ChronoUnit.YEARS);
		System.out.println("after6Year :"+after6Year);
		
		LocalDate before30Year = today.minus(3,ChronoUnit.DECADES);
		System.out.println("before30Year  :"+before30Year );
		
		
		LocalDate after400Year = today.plus(4,ChronoUnit.CENTURIES);
		System.out.println("after400Year :"+after400Year );
		
		
	}

}
