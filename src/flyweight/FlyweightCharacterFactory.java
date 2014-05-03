package flyweight;

import java.util.Hashtable;

public class FlyweightCharacterFactory {
	
	private Hashtable<Character, AbsCharacter> characters;
	
	private FlyweightCharacterFactory() {}
	
	private static class SingletonHolder {
		private final static FlyweightCharacterFactory INSTANCE = new FlyweightCharacterFactory();
	}
	
	public static FlyweightCharacterFactory instance() {
		return SingletonHolder.INSTANCE;
	}
	
	public AbsCharacter getFlyweight(char charToRetrieve) {
		
		if (!characters.contains(charToRetrieve)) {
			characters.put(charToRetrieve, new ConcreteCharacter(charToRetrieve));
		}
		
		return characters.get(charToRetrieve);
	}
	
}
