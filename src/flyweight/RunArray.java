package flyweight;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The RunArray stores a run of fonts of variable size. New runs
 * can be added into the array or appended to the end.
 * 
 * @author John Willman
 * REDID: 809362691
 *
 */
public class RunArray {
	ArrayList<Font> runs = new ArrayList<Font>();
	
	public RunArray() {
		
	}
	
	/**
	 * Adds a font into the RunArray for a specified number of
	 * consecutive runs, beginning at the specified index. 
	 * @param index
	 * @param runLength
	 * @param font
	 */
	public void addRun(int index, int runLength, Font font) {
		for (int i = index; i < index + runLength; i++) {
			runs.add(i, font);
		}
	}
	
	/**
	 * Appends a specified number of consecutive runs of a
	 * specified font to the end of the RunArray.
	 * @param runLength
	 * @param font
	 */
	public void appendRun(int runLength, Font font) {
		for (int i = 0; i < runLength; i++) {
			runs.add(font);
		}
	}
	
	/**
	 * Returns an iterator of the RunArray for easier access
	 * to stored fonts.
	 * @return
	 */
	public Iterator<Font> iterator() {
		return runs.iterator();
	}
	
	/**
	 * Returns the font at a specified run in the RunArray
	 * @param index
	 * @return
	 */
	public Font elementAt(int index) {
		return runs.get(index);
	}
}
