package br.ce.wcaquino.taskbackend.util;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.taskbackend.utils.DateUtils;

public class DateUtilsTest {
	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
		
	}

}
