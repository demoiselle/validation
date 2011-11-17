package br.gov.frameworkdemoiselle.validation.internal.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TituloEleitorValidatorTest {

	@Test
	public void testValidator() {
		TituloEleitorValidator validator = new TituloEleitorValidator();

		assertFalse(validator.isValid(null, null));
		assertFalse(validator.isValid("", null));
		assertFalse(validator.isValid("ABC", null));

		assertTrue(validator.isValid("026878511287", null));
		assertTrue(validator.isValid("60524580680", null));
		assertTrue(validator.isValid("106644440302", null));
		assertTrue(validator.isValid("000000000000", null));
		assertTrue(validator.isValid("0000000000000000", null));
	}

}
