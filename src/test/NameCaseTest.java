package test;

import static org.junit.Assert.*;

import org.junit.Test;

import formatter.NameCase;

public class NameCaseTest {

	@Test
	public void testFormat() {
		//Von Test
		NameCase nameCase = new NameCase("VON WILLIAMS");
		assertEquals("von Williams", nameCase.format());
		
		//Generic Mac Test
		nameCase.setName("mackinley");
		assertEquals("MacKinley", nameCase.format());
		
		//Generic Mc Test
		nameCase.setName("MCCORMICK");
		assertEquals("McCormick", nameCase.format());
		
		//Odd Mac Test
		nameCase.setName("MACMURDO");
		assertEquals("MacMurdo", nameCase.format());
		
	}

}
