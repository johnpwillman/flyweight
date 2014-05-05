package flyweight;


public class ConcreteCharacter extends AbsCharacter {
	
	private char codePoint;
	
	public ConcreteCharacter(char c) {
		codePoint = c;
	}

	@Override
	public char getChar() {
		return codePoint;
	}

}
