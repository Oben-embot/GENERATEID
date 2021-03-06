package za.co.stanlake.people;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static String generateId(String gender) {
//		String year;
//		String month;
//		String day;
//		String hour;
//		String minute;

		String id = "";

		LocalDateTime date = LocalDateTime.of(2030, Month.JANUARY, 30, 12, 14);

//		year = String.valueOf(date.getYear());
//		month = String.valueOf(date.getMonthValue());
//		day = String.valueOf(date.getDayOfYear());
//		hour = String.valueOf(date.getHour());
//		minute = String.valueOf(date.getMinute());

		id += String.valueOf(date.getYear());
		id += String.valueOf(date.getMonthValue());
		id += String.valueOf(date.getDayOfYear());
		id += String.valueOf(date.getHour());
		id += String.valueOf(date.getMinute());
		
		if (gender.equals("male")) {
			//gender = "0";
			id += "0";
		} else if (gender.contains("female")) {
			//gender = "1";
			id += "1";
		}
		//String studentId = year + "" + month + "" + day + "" + hour + "" + minute + "" + gender;

		System.out.println("ID : "+id );
		System.out.println();
		// System.out.println(date.getYear());
		// System.out.print(year+""+month+""+day+""+hour+""+minute+""+gender);

		return "";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter gender: ");
		String gender = scan.nextLine();

		String id = generateId(gender);
		System.out.println(id);

	}
}
