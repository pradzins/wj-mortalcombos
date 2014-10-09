package prad.sandbox.mortalcombos;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prad.sandbox.mortalcombos.NotSoMortalPieceOfCode.IntGenerator;

public class NotSoMortalPieceOfCodeTest {

	private final class FakeIntGenerator extends IntGenerator {
		int intToReturn;

		public void setIntToReturn(int intToReturn) {
			this.intToReturn = intToReturn;
		}
	}



	private NotSoMortalPieceOfCode notSoMortalPieceOfCode;
	private FakeIntGenerator intGenerator;



	@Before
	public void setUp() throws Exception {
		notSoMortalPieceOfCode = new NotSoMortalPieceOfCode();
		intGenerator = new FakeIntGenerator();
		notSoMortalPieceOfCode.setIntGenerator(intGenerator);
	}
	
	

	@Test
	public void testDoSomethingToKillTime() {
		intGenerator.setIntToReturn(1);
		String result = notSoMortalPieceOfCode.doSomethingToKillTime("an attempt to do something");
		
		assertThat(result, containsString("attempt"));
		System.out.println();
	}

}
