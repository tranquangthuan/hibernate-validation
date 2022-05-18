package vn.fsoft.fa.hibernate.validation;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
	@NotNull(message = "Please enter id")
	private Long id;

	@Size(max = 20, min = 3, message = "Please input name length in 3 - 20 character")
	@NotEmpty(message = "Please enter name")
	private String name;

	@Email(message = "Email not valid")
	@NotEmpty(message = "Please enter email")
	private String email;

	//@NotNull
	// @DateTimeFormat(pattern = "dd/MM/yyyy")
	@Future(message = "date in the past")
	private Date date;

	@NotNull
	@ValidDate(message = "pattern must yyyy/MM/dd")
	private String date2;

	public User(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public User(Long id, String name, String email, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.date = date;
	}

	public User(Long id, String name, String email, String date2) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.date2 = date2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
