package no.evote.validation;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NotNull
@NotEmpty
@Constraint(validatedBy = StringNotNullOrEmptyValidator.class)
@ReportAsSingleViolation
@Target({ METHOD })
@Retention(RUNTIME)
@Documented
public @interface StringNotNullOrEmpty {

	String MESSAGE = "{@validation.stringNotNullOrEmpty}";

	String message() default MESSAGE;

	int min() default 0;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
