package jp.fullkawa;

import java.util.ArrayList;

public class Neighbors extends ArrayList<Cell> {

	public int getPopulatedNum() {
		int count = 0;
		for (Cell cell : this) {
			if (cell.isPopulated()) {
				count++;
			}
		}
		return count;
	}
}
