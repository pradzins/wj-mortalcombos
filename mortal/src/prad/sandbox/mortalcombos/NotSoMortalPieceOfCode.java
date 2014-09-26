package prad.sandbox.mortalcombos;

import java.util.Random;

public class NotSoMortalPieceOfCode {

	static class IntGenerator {

		int randomIntForLimit(int length) {
			return (new Random()).nextInt(length);
		}

	}
	public String doSomethingToKillTime(String string2) {
		String[] strings = string2.split(" ");

		int index = getIntGenerator().randomIntForLimit(strings.length);

		StringBuilder newStringBuilder = new StringBuilder(
				string2.length());
		for (int i = index; i < strings.length; i++) {
			newStringBuilder.append(strings[i]).append("\t");
		}

		for (int i = 0; i < index; i++) {
			newStringBuilder.append(strings[i]).append("\t");
		}

		return newStringBuilder.toString();
	}
	public IntGenerator getIntGenerator() {
		return intGenerator;
	}
	public void setIntGenerator(IntGenerator intGenerator) {
		this.intGenerator = intGenerator;
	}
	private IntGenerator intGenerator = new IntGenerator();
}
