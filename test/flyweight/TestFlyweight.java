package flyweight;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestFlyweight {

	@Test
	public void test() {
		
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
				firstChar.getCreateTimeInMillis() == secondChar.getCreateTimeInMillis()
				);
		
		fail("Not yet implemented");
	}

}
