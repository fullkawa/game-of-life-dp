package jp.fullkawa.strategy;

import java.util.HashMap;
import java.util.Map;

import jp.fullkawa.Cell;
import jp.fullkawa.Position;
import jp.fullkawa.status.Empty;
import jp.fullkawa.status.Populated;

public class CheckPattern implements PatternStrategy {

	public Map<Position, Cell> getInitialPattern(int width, int height) {
		Map<Position, Cell> cells = new HashMap<Position, Cell>();

		for (int col=0; col<width; col++) {
			for (int row=0; row<height; row++) {
				Position pos = new Position(col, row);
				if ((col + row) % 2 == 0) {
					cells.put(pos, new Cell(new Populated()));
				}
				else {
					cells.put(pos, new Cell(new Empty()));
				}
			}
		}

		return cells;
	}

}
