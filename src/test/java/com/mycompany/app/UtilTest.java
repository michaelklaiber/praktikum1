package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilTest {

	@Test
	public void testUtilIN() {
		assertEquals("erstes halbesjahr", true, Util.istErstesHalbjahr(1));
	}
	
	@Test
	public void testUtilOut() {
		assertEquals("erstes halbesjahr", false, Util.istErstesHalbjahr(12));
	}
	


}
