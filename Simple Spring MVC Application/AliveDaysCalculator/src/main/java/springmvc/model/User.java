package springmvc.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class User {

	private String userName;
	private LocalDate birthDate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getAliveDays() {
		if (birthDate != null && !userName.isEmpty()) {
			return "You have been " + ChronoUnit.DAYS.between(birthDate, LocalDate.now())
					+ " days alive since your birthdate of " + birthDate;
		} else {
			return "Error while calculating number of days!!";
		}

	}

	public void setBirthDate(String birthDate) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.birthDate = LocalDate.parse(birthDate, formatter);
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", birthDate=" + birthDate + "]";
	}

}
