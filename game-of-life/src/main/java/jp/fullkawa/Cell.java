package jp.fullkawa;

import jp.fullkawa.status.CellStatus;

public class Cell {

	private CellStatus status;

	public Cell(CellStatus status) {
		this.status = status;
	}

	public boolean isPopulated() {
		/*
		if (this.status instanceof Populated) {
			return true;
		}
		return false;
		 */
		return this.status.isPopulated();
	}

	@Override
	public String toString() {
		return this.status.toString();
	}

	public Cell getNextCell(Neighbors neighbors) {
		CellStatus nextStatus = this.status.getNextStatus(neighbors);
		Cell nextCell = new Cell(nextStatus);
		return nextCell;
	}
}
