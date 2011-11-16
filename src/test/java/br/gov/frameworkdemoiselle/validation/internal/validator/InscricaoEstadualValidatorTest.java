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

import junit.framework.Assert;

import org.alfredlibrary.utilitarios.inscricaoestadual.InscricaoEstadual.PadraoInscricaoEstadual;
import org.alfredlibrary.validadores.InscricaoEstadual;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.gov.frameworkdemoiselle.validation.PatternInscricaoEstadual;

@RunWith(PowerMockRunner.class)
@PrepareForTest(InscricaoEstadual.class)
public class InscricaoEstadualValidatorTest {

	@Test
	@SuppressWarnings("all")
	public void testValidacao() {
//		Class classToMock = br.gov.frameworkdemoiselle.component.validation.annotation.InscricaoEstadual.class;
//		br.gov.frameworkdemoiselle.component.validation.annotation.InscricaoEstadual ie = PowerMock.createMock(classToMock);
//		EasyMock.expect(ie.pattern()).andReturn(PatternInscricaoEstadual.ACRE);
//		
//		InscricaoEstadualValidator validator = new InscricaoEstadualValidator();
//		EasyMock.replay(ie);
//		validator.initialize(ie);
//
//		PowerMock.mockStatic(InscricaoEstadual.class);
//
//		EasyMock.expect(InscricaoEstadual.isValido(EasyMock.anyObject(PadraoInscricaoEstadual.class), EasyMock.anyObject(String.class))).andReturn(true);
//		PowerMock.replay(InscricaoEstadual.class);
//		
//		// validator.isValid() must use the return of InscricaoEstadual.isValido().
//		// Inscrição Estadual value doesn't matter because we use Alfred's InscricaoEstadual validator and we don't want to test Alfred. It's already tested.
//		Assert.assertTrue(validator.isValid("12312312312", null));
//		PowerMock.verifyAll();
	}
	
}
