package flyweight;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFlyweight {

	@Test
	public void test() {
		
		FlyweightCharacterFactory fcf = new FlyweightCharacterFactory();
		
		Character firstChar, secondChar;

		firstChar = fcf.getChar('a');
		
		wait(10);
		
		secondChar = fcf.getChar('a');
		
		assertTrue(
				"Chars should be the same",
				firstChar.getCreateTimeInMillis() == secondChar.getCreateTimeInMillis()
				);
		
		fail("Not yet implemented");
	}

}
