package flyweight;

import java.util.Calendar;

public class ConcreteFont extends Font {
	
	long createDate;
	
	String name;
	long size;
	String style;
	
	public ConcreteFont(String fontName, long fontSize, String fontStyle) {
		createDate = Calendar.getInstance().getTimeInMillis();
		
		name = fontName;
		size = fontSize;
		style = fontStyle;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getSize() {
		return size;
	}

	@Override
	public String getStyle() {
		return style;
	}
	
	@Override
	public long getCreateDateInMillis() {
		return createDate;
	}

}
