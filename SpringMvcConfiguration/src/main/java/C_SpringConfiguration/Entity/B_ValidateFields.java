package C_SpringConfiguration.Entity;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import D_SpringConfiguration.CustomValidation.A_CustomError;

public class B_ValidateFields {
	private long id;

	// @NotNull: a constrained CharSequence, Collection, Map, or Array is valid as
	// long as it’s not null, but it can be empty.
	// @NotNull(message = "Is Required")

	// @NotEmpty: a constrained CharSequence, Collection, Map, or Array is valid as
	// long as it’s not null, and its size/length is greater than zero.
	@NotEmpty(message = "first name is required")
	private String firstName;

	// @Size and @Length are similar. We can use either annotation to validate the
	// size of a field
	@NotNull(message = "Is Required")
	@Size(min = 1, message = "Min One Char Required")
	private String middleName;

	@NotEmpty(message = "Is Required")
	private String lastName;

	@NotEmpty(message = "Is Required")
	private String gender;

	@NotEmpty(message = "Is Required")
	private String emailAddress;

	@NotEmpty(message = "Is Required")
	private String phoneNumber;

	@NotEmpty(message = "Is Required")
	private String[] technologies;

	@NotEmpty(message = "Is Required")
	private String country;

	// Validate a Number Range
	// User can only enter a range: 0 to 10

	@Min(value = 0, message = "Please Enter You Role Number GreaterThan 0")
	@Max(value = 10, message = "Please Enter You Role Number LessThan 10")
	@NotNull(message = "Is Required")
	private Integer roleNo;

	// This are the pattern Which we can created as per our requirement
	// This pattern is used to find or match strings
	@Pattern(regexp = "^[a-zA-Z0-9]{11}", message = "Password Must Be 11 digit")
	@NotNull(message = "Is Required")
	@Size(min = 1, message = "Min One Char Required")
	// This are the customError Which we can created as per our requirement
	@A_CustomError(value = "Password@", message = "Must be start with Password@")
	private String passWord;

	private LinkedHashMap<String, String> countryOptions;

	public B_ValidateFields() {

		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();

		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String[] getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(Integer roleNo) {
		this.roleNo = roleNo;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

}
