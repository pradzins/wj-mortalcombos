package prad.sandbox.mortalcombos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NotSoMortalPieceOfCodeTest {

	private NotSoMortalPieceOfCode notSoMortalPieceOfCode;

	@Before
	public void setUp() throws Exception {
		notSoMortalPieceOfCode = new NotSoMortalPieceOfCode();
	}
	
	

	@Test
	public void testDoSomethingToKillTime() {
		String result = notSoMortalPieceOfCode.doSomethingToKillTime();
		System.out.println(result);
		assertNotNull("result", result);
	}

}
