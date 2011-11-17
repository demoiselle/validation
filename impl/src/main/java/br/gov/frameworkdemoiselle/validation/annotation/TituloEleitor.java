package br.gov.frameworkdemoiselle.validation.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.gov.frameworkdemoiselle.validation.internal.validator.TituloEleitorValidator;

@Documented
@Target({ FIELD, METHOD })
@Retention(RUNTIME)
@Constraint(validatedBy = TituloEleitorValidator.class)
public @interface TituloEleitor {

	Class<?>[] groups() default {};

	String message() default "{br.gov.frameworkdemoiselle.tituloeleitor}";

	Class<? extends Payload>[] payload() default {};

}
