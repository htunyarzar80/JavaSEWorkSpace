package date_time_api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneId japan = ZoneId.of("Asia/Tokyo");
		
		LocalDateTime defaultDateTime = LocalDateTime.now();
		System.out.println("DefaultDateTime : "+defaultDateTime);
		
		LocalDateTime japanDateTime = LocalDateTime.now(japan);
		System.out.println("japanDateTime : "+japanDateTime);
		
		ZoneId uk = ZoneId.of("Europe/London");
		
		ZonedDateTime defaultZoneDateTime = ZonedDateTime.now();
		System.out.println("defaultZoneDdateTime :"+defaultZoneDateTime);
		System.out.println("ZoneId :"+defaultZoneDateTime.getZone());
		
		ZonedDateTime ukZoneDateTime = ZonedDateTime.now();
		System.out.println("ukZoneDdateTime :"+ukZoneDateTime);
		System.out.println("ZoneId :"+ukZoneDateTime.getZone());
		
		ZoneId france = ZoneId.of("Europe/Paris");
		ZonedDateTime franceDateTime=defaultDateTime.atZone(france);
		System.out.println("FranceDateTime :"+france);
		
		ZoneId thailand = ZoneId.of("Asia/Bangkok");
		ZonedDateTime customThailandDT= ZonedDateTime.of(2020, 11,23,12,27,36,47438337,thailand);
		System.out.println("customThailandDT :"+customThailandDT);
		
		
		
	}

}
