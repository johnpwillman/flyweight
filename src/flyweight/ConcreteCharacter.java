package flyweight;

/**
 * Character class which defines objects to be distributed via the 
 * FlyweightCharacterFactory. The object represents a single Java
 * Character.
 * 
 * @author John Willman
 * REDID: 809362691
 *
 */
public class ConcreteCharacter extends AbsCharacter {
	
	//Holds the primitive Java Character
	private char codePoint;
	
	public ConcreteCharacter(char c) {
		codePoint = c;
	}

	/**
	 * Returns the Java character contained in this object.
	 */
	@Override
	public char getChar() {
		return codePoint;
	}

}
