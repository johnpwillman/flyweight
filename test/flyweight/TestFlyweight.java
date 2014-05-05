package flyweight;

import static org.junit.Assert.assertTrue;

import java.awt.Font;
import java.util.Random;

import org.junit.Test;

public class TestFlyweight {

	@Test
	public void testCharacterFlyweight() {
		
		FlyweightCharacterFactory fcf = FlyweightCharacterFactory.instance();
		
		AbsCharacter firstChar, secondChar, thirdChar;

		firstChar = fcf.getFlyweight('a');
		
		secondChar = fcf.getFlyweight('j');
		
		thirdChar = fcf.getFlyweight('a');
		
		assertTrue(
				"Chars should be the same",
				firstChar.equals(thirdChar)
				);
		
		assertTrue(
				"Chars should not be the same",
				!firstChar.equals(secondChar)
				);
	}

	@Test
	public void testFontFlyweight() {
		
		FlyweightFontFactory fff = FlyweightFontFactory.instance();
		
		Font firstFont, secondFont, thirdFont;

		firstFont = fff.getFlyweight("Times New Roman", Font.BOLD, 12);
		
		secondFont = fff.getFlyweight("Times New Roman", Font.ITALIC, 12);
		
		thirdFont = fff.getFlyweight("Times New Roman", Font.BOLD, 12);
		
		assertTrue(
				"Fonts should be the same",
				firstFont.equals(thirdFont)
				);
		
		assertTrue(
				"Fonts should not be the same",
				!firstFont.equals(secondFont)
				);
	}
	
	@Test
	public void testRunArray() {
		RunArray ra = new RunArray();
		
		FlyweightFontFactory fff = FlyweightFontFactory.instance();
		
		Font firstFont, secondFont;

		firstFont = fff.getFlyweight("Times New Roman", Font.BOLD, 12);
		secondFont = fff.getFlyweight("Times New Roman", Font.ITALIC, 12);

		ra.addRun(0, 250, firstFont);
		ra.addRun(250, 10, secondFont);
		
		ra.appendRun(320, firstFont);
		
		Random r = new Random();
		int randomRun;
		
		randomRun = Math.abs(r.nextInt() % 250);
		System.out.println(randomRun);
		
		assertTrue(
				"Font at " + randomRun + " should be firstFont",
				ra.elementAt(randomRun).equals(firstFont)
				);
		
		randomRun = Math.abs(r.nextInt() % 10) + 250;
		System.out.println(randomRun);
		
		assertTrue(
				"Font at " + randomRun + " should be secondFont",
				ra.elementAt(randomRun).equals(secondFont)
				);
		
		randomRun = Math.abs(r.nextInt() % 320) + 260;
		System.out.println(randomRun);
		
		assertTrue(
				"Font at " + randomRun + " should be firstFont",
				ra.elementAt(randomRun).equals(firstFont)
				);
		
	}

}
