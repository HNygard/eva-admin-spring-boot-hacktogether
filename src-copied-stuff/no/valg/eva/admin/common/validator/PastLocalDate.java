package no.valg.eva.admin.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PastLocalDateValidator.class)
@Documented
public @interface PastLocalDate {
	String message() default "must be in the past";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
