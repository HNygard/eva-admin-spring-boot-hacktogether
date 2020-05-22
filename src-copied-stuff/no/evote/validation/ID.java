package no.evote.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NotNull
@ReportAsSingleViolation
@Pattern(regexp = "[0-9]*", message = ID.MESSAGE)
@Constraint(validatedBy = IDValidator.class)
@Target({ METHOD })
@Retention(RUNTIME)
public @interface ID {

	String MESSAGE = "{@validation.id}";

	int size();

	String message() default MESSAGE;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
