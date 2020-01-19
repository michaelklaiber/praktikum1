package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hfu.residents.domain.Resident;

public class ResidentTest {
	
	Resident r =new Resident();

	@Test
	public void testName() {
		r.setGivenName("Michael");
		assertEquals(r.getGivenName(), "Michael");
	}

}
