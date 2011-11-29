/*
 * Demoiselle Framework
 * Copyright (C) 2010 SERPRO
 * ----------------------------------------------------------------------------
 * This file is part of Demoiselle Framework.
 * 
 * Demoiselle Framework is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License version 3
 * along with this program; if not,  see <http://www.gnu.org/licenses/>
 * or write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA  02110-1301, USA.
 * ----------------------------------------------------------------------------
 * Este arquivo é parte do Framework Demoiselle.
 * 
 * O Framework Demoiselle é um software livre; você pode redistribuí-lo e/ou
 * modificá-lo dentro dos termos da GNU LGPL versão 3 como publicada pela Fundação
 * do Software Livre (FSF).
 * 
 * Este programa é distribuído na esperança que possa ser útil, mas SEM NENHUMA
 * GARANTIA; sem uma garantia implícita de ADEQUAÇÃO a qualquer MERCADO ou
 * APLICAÇÃO EM PARTICULAR. Veja a Licença Pública Geral GNU/LGPL em português
 * para maiores detalhes.
 * 
 * Você deve ter recebido uma cópia da GNU LGPL versão 3, sob o título
 * "LICENCA.txt", junto com esse programa. Se não, acesse <http://www.gnu.org/licenses/>
 * ou escreva para a Fundação do Software Livre (FSF) Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02111-1301, USA.
 */
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
