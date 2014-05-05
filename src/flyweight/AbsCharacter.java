package flyweight;

public abstract class AbsCharacter {

	public abstract char getChar();
	
	public abstract long getCreateTimeInMillis();
	
	public abstract boolean equals(AbsCharacter charToCompare);
}
