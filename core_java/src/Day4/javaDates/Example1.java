package Day4.javaDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate= LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime= LocalDateTime.now();
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
	}

}
