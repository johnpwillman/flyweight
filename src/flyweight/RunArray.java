package flyweight;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

public class RunArray {
	ArrayList<Font> runs = new ArrayList<Font>();
	
	public RunArray() {
		
	}
	
	public void addRun(int index, int runLength, Font font) {
		for (int i = index; i < index + runLength; i++) {
			runs.add(i, font);
		}
	}
	
	public void appendRun(int runLength, Font font) {
		for (int i = 0; i < runLength; i++) {
			runs.add(font);
		}
	}
	
	public Iterator<Font> iterator() {
		return runs.iterator();
	}
	
	public Font elementAt(int index) {
		return runs.get(index);
	}
}
