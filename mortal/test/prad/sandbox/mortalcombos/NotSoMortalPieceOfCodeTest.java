package prad.sandbox.mortalcombos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prad.sandbox.mortalcombos.NotSoMortalPieceOfCode.IntGenerator;

public class NotSoMortalPieceOfCodeTest {

	private final class FakeIntGenerator extends IntGenerator {
	}



	private NotSoMortalPieceOfCode notSoMortalPieceOfCode;



	@Before
	public void setUp() throws Exception {
		notSoMortalPieceOfCode = new NotSoMortalPieceOfCode();
		notSoMortalPieceOfCode.setIntGenerator(new FakeIntGenerator());
	}
	
	

	@Test
	public void testDoSomethingToKillTime() {
		String result = notSoMortalPieceOfCode.doSomethingToKillTime("an attempt to do something");
		assertNotNull(result);
		System.out.println();
	}

}
