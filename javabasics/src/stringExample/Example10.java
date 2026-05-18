package stringExample;

import java.time.LocalDate;
import java.time.Period;

public class Example10 {
	public static void main(String[] args) {
		String birthDate = "2002-10-10";

		LocalDate birthdate = LocalDate.parse(birthDate);
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(birthdate, currentDate);

		System.out.println("Your Current age is: " + age.getYears());
	}
}
