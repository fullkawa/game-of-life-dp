package jp.fullkawa;

import jp.fullkawa.status.CellStatus;
import jp.fullkawa.status.Populated;

public class Cell {

	private CellStatus status;

	public Cell(CellStatus status) {
		this.status = status;
	}

	public boolean isPopulated() {
		if (this.status instanceof Populated) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return status.toString();
	}
}
