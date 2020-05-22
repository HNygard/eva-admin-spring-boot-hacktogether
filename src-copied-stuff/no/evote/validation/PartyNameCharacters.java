package no.evote.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = PartyNameValidator.class)
@Target({ METHOD })
@Retention(RUNTIME)
public @interface PartyNameCharacters {

	String extraChars() default " .,-'/";

	String MESSAGE = "{@validation.party.name.lettersOrDigits}";

	String message() default MESSAGE;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
