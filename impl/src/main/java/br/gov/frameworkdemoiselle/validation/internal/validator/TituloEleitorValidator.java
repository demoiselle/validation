package br.gov.frameworkdemoiselle.validation.internal.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.gov.frameworkdemoiselle.validation.annotation.TituloEleitor;

/**
 * Titulo Eleitor constraint validation.
 */
public class TituloEleitorValidator implements ConstraintValidator<TituloEleitor, String> {

	@Override
	public void initialize(final TituloEleitor constraintAnnotation) {
	}

	public String insertZeros(final String string, final int howMuchZeros) {
		StringBuffer result = new StringBuffer((string == null ? "" : string).trim());
		int difference = howMuchZeros - string.length();

		for (int j = 0; j < difference; j++) {
			result.insert(0, '0');
		}

		return result.toString();
	}

	@Override
	public boolean isValid(final String value, final ConstraintValidatorContext context) {
		boolean result = false;

		if (value != null && !value.equals("")) {
			String tituloCalc = insertZeros(removeChars(value, '.', '/', '-', ' '), 12);
			String verifierDigit = tituloCalc.substring(tituloCalc.length() - 2, tituloCalc.length());

			int sum1 = 0;
			for (int index = 0; index < 8; index++) {
				sum1 += (tituloCalc.charAt(index) - 48) * (index + 2);
			}

			int digit1 = (sum1 % 11) % 10;
			int sum2 = ((tituloCalc.charAt(8) - 48) * 7) + ((tituloCalc.charAt(9) - 48) * 8)
					+ ((tituloCalc.charAt(10) - 48) * 9);
			int digit2 = (sum2 % 11) % 10;
			String dvReal = digit1 + "" + digit2;
			if (dvReal.equals(verifierDigit)) {
				result = true;
			}
		}
		return result;
	}

	public String removeChars(String string, final char... chars) {
		if (string != null) {
			for (char ch : chars) {
				string = string.replace(String.valueOf(ch), "");
			}
		}
		return string;
	}

}
