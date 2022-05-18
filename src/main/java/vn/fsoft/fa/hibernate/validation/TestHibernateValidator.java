package vn.fsoft.fa.hibernate.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class TestHibernateValidator {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// Create ValidatorFactory which returns validator
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		// It validates bean instances
		Validator validator = factory.getValidator();

		// User user = new User(null, "1", "abcgmail.com");
		// User user = new User(1L, "Nguyen Van A", "nguyenvana@gmail.com");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String date = "2016/08/10";

		// convert String to LocalDate
		Date localDate = new SimpleDateFormat("yyyy/MM/dd").parse(date);
		//User user = new User(1L, "Nguyen Van A", "nguyenvana@gmail.com", localDate);
		User user = new User(1L, "Nguyen Van A", "nguyenvana@gmail.com", "10/101/20161");

		// Validate bean
		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

		// Show errors
		if (constraintViolations.size() > 0) {
			for (ConstraintViolation<User> violation : constraintViolations) {
				System.out.println(violation.getMessage());
			}
		} else {
			System.out.println("Valid Object");
		}
	}

}
