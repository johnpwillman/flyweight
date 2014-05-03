package flyweight;

import java.util.Calendar;

public class ConcreteCharacter extends Character {
	
	private long createTime;
	private char codePoint;
	
	public ConcreteCharacter(char c) {
		createTime = Calendar.getInstance().getTimeInMillis();
		codePoint = c;
	}

	@Override
	public char getChar(Font extrinsicFont) {
		return codePoint;
	}

	@Override
	public long getCreateTimeInMillis() {
		return createTime;
	}

}