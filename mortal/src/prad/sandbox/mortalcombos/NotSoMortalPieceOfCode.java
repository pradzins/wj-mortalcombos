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

		return constructStringStartingFromIndex(strings, index);
	}
	private String constructStringStartingFromIndex(String[] strings, int index) {
		WordAppender wordAppender = new WordAppender();
		for (int i = index; i < strings.length; i++) {
			String word = strings[i];
			wordAppender.appendWord(word);
		}

		for (int i = 0; i < index; i++) {
			String word = strings[i];
			wordAppender.appendWord(word);
		}

		return wordAppender.toString();
	}
	public IntGenerator getIntGenerator() {
		return intGenerator;
	}
	public void setIntGenerator(IntGenerator intGenerator) {
		this.intGenerator = intGenerator;
	}
	private IntGenerator intGenerator = new IntGenerator();
}
