package no.evote.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.io.Serializable;

public class StringNotNullEmptyOrBlanksValidator implements ConstraintValidator<StringNotNullEmptyOrBlanks, String>, Serializable {

	public void initialize(final StringNotNullEmptyOrBlanks constraint) {
		// Do nothing.  Exists to satisfy ConstraintValidator interface.
	}

	public boolean isValid(final String value, final ConstraintValidatorContext constraintValidatorContext) {
        return value != null && value.trim().length() > 0;
	}
}
