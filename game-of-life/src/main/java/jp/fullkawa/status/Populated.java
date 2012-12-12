package jp.fullkawa.status;

import jp.fullkawa.Neighbors;

public class Populated implements CellStatus {

	public String toString() {
		return "■";
	}

	public CellStatus getNextStatus(Neighbors neighbors) {
		int count = neighbors.getPopulatedNum();
		if (count <= 1) {
			return new Empty();
		}
		if (count >= 4) {
			return new Empty();
		}
		// count == 2 or count == 3
		return this;
	}

	public boolean isPopulated() {
		return true;
	}

}
