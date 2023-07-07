package date_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		System.out.println("Today :"+today);
		
		LocalDate nextWeb =today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("nextWeb :"+nextWeb);
		
		LocalDate previousSun =today.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
		System.out.println("previousSun :"+previousSun);
		
		LocalDate nextThur =today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("nextThur :"+nextThur);
		
		LocalDate nextTue =today.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
		System.out.println("nextTue :"+nextTue);
		
		LocalDate nextMonth1st =today.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("nextMonth1st :"+nextMonth1st);
		
		LocalDate thisMonth1st =today.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("thisMonth1st :"+thisMonth1st);
		

	}

}
