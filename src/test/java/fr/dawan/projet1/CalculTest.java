package fr.dawan.projet1;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculTest  extends TestCase{

	@Test
	public void testSomme() {
		
		assertEquals(3,Calcul.somme(2, 1));
		//assetEquals(3,Calcul.somme(2,1));
		
	}

}
