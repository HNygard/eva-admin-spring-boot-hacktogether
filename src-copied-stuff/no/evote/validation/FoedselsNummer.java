package no.evote.validation;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NotEmpty
@Documented
@ReportAsSingleViolation
@Constraint(validatedBy = FoedselsNummerValidator.class)
@Target({ METHOD })
@Retention(RUNTIME)
public @interface FoedselsNummer {
	String MESSAGE = "{@validation.id.regex}";

	String message() default MESSAGE;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
