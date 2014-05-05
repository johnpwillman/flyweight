package flyweight;

import java.util.Calendar;

public class ConcreteCharacter extends AbsCharacter {
	
	private long createTime;
	private char codePoint;
	
	public ConcreteCharacter(char c) {
		createTime = Calendar.getInstance().getTimeInMillis();
		codePoint = c;
	}

	@Override
	public char getChar() {
		return codePoint;
	}

	@Override
	public long getCreateTimeInMillis() {
		return createTime;
	}
	
	@Override
	public boolean equals(AbsCharacter charToCompare) {
		return this.createTime == charToCompare.getCreateTimeInMillis();
	}

}
