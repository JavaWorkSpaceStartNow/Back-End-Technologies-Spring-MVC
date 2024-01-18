package D_SpringConfiguration.CustomValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class B_CustomErrorConstraintValidator implements ConstraintValidator<A_CustomError, String> {

	private String passWord;

	@Override
	public void initialize(A_CustomError customError) {
		passWord = customError.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result;

		if (value != null) {
			result = value.startsWith(passWord);
		} else {
			result = true;
		}

		return result;
	}

}
