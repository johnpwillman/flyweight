package flyweight;

import java.awt.Font;
import java.util.Hashtable;

public class FlyweightFontFactory {
	
	private Hashtable<String, Font> fonts;
	
	private FlyweightFontFactory() {
		fonts = new Hashtable<String, Font>();
	}
	
	private static class SingletonHolder {
		private final static FlyweightFontFactory INSTANCE = new FlyweightFontFactory();
	}
	
	public static FlyweightFontFactory instance() {
		return SingletonHolder.INSTANCE;
	}
	
	public Font getFlyweight(String name, int style, int size) {
		
		String fontToRetrieve = name + "/" + Integer.toString(style) + "/" + Integer.toString(size);
		
		if (!fonts.contains(fontToRetrieve)) {
			fonts.put(fontToRetrieve, new Font(name, style, size));
		}
		
		return fonts.get(fontToRetrieve);
	}
	
}
