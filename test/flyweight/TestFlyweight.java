package flyweight;

import static org.junit.Assert.assertTrue;

import java.awt.Font;

import org.junit.Test;

public class TestFlyweight {

	@Test
	public void testCharacterFlyweight() {
		
		FlyweightCharacterFactory fcf = FlyweightCharacterFactory.instance();
		
		AbsCharacter firstChar, secondChar;

		firstChar = fcf.getFlyweight('a');
		
		try {
			wait(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		secondChar = fcf.getFlyweight('a');
		
		assertTrue(
				"Chars should be the same",
				firstChar.equals(secondChar)
				);
	}

	@Test
	public void testFontFlyweight() {
		
		FlyweightFontFactory fff = FlyweightFontFactory.instance();
		
		Font firstFont, secondFont;

		firstFont = fff.getFlyweight("Times New Roman", Font.BOLD, 12);
		
		try {
			wait(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		secondFont = fff.getFlyweight("Times New Roman", Font.BOLD, 12);
		
		assertTrue(
				"Fonts should be the same",
				firstFont.equals(secondFont)
				);
	}

}
