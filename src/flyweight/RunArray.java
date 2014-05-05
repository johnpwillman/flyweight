package flyweight;

import java.awt.Font;
import java.util.ArrayList;

public class RunArray {
	ArrayList<Font> runs = new ArrayList<Font>();
	
	public RunArray() {
		
	}
	
	public void addRun(int index, int runLength, Font font) {
		for (int i = index; i <= runLength; i++) {
			runs.set(i, font);
		}
	}
	
	public void appendRun(int runLength, Font font) {
		int maxIndex = runs.size();
		
		for (int i = maxIndex + 1; i <= maxIndex + runLength; i++) {
			runs.set(i, font);
		}
	}
}
