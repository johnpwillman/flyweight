package flyweight;

public abstract class Character {

	public abstract char getChar(Font extrinsicFont);
	
	public abstract long getCreateTimeInMillis();
}
