package jp.fullkawa.status;

import jp.fullkawa.Neighbors;

public class Empty implements CellStatus {

	public String toString() {
		return "□";
	}

	public CellStatus getNextStatus(Neighbors neighbors) {
		if (neighbors.getPopulatedNum() == 3) {
			return new Populated();
		}
		return this;
	}

}
