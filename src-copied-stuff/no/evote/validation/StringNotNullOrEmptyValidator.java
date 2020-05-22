package no.evote.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.io.Serializable;

public class StringNotNullOrEmptyValidator implements ConstraintValidator<StringNotNullOrEmpty, String>, Serializable {

	@Override
	public void initialize(final StringNotNullOrEmpty constraint) {
		// Do nothing. Exists to satisfy ConstraintValidator interface.
	}

	@Override
	public boolean isValid(final String value, final ConstraintValidatorContext constraintValidatorContext) {
        return value != null && value.length() > 0;
	}
}
