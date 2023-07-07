package date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDatetimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println("Today : "+today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("CurrentTime : "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("CurrentDateTime : "+currentDateTime);
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
			"dd/MM/yyyy hh:mm::ss.nnnnnnnnn");
		
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("Formatted DateTime : "+formattedDateTime);
		
		//Day
		System.out.println("DayOfMonth : "+ currentDateTime.getDayOfMonth());
		System.out.println("DayOfYear : "+ currentDateTime.getDayOfYear());
		System.out.println("DayOfWeek : "+ currentDateTime.getDayOfWeek());
		
		//Month
		System.out.println("Month : "+ currentDateTime.getMonthValue());
		System.out.println("Month : "+ currentDateTime.getMonth());
		
		//Year
		System.out.println("Year : "+ currentDateTime.getYear());
		
		//Time
		System.out.println("Hours : "+ currentDateTime.getHour());
		System.out.println("Minute : "+ currentDateTime.getMinute());
		System.out.println("Second : "+ currentDateTime.getSecond());
		System.out.println("Nano : "+ currentDateTime.getNano());
		
		LocalDate customDate = LocalDate.of(2010, 8, 27);
		System.out.println("CustomDate : "+customDate);
		
		
	}

}
