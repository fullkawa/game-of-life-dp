package jp.fullkawa;

import java.util.ArrayList;

/**
 * 周囲のセル
 *
 * @author y.furukawa
 *
 */
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
