package jp.fullkawa;

import java.util.Map;

import jp.fullkawa.strategy.PatternStrategy;

public class Generation {

	private int width = 0;
	private int height = 0;
	private int age = 0;
	private Map<Position, Cell> cells;

	public Generation(int width, int height, PatternStrategy strategy) {
		this.width = width;
		this.height = height;
		this.cells = strategy.getInitialPattern(this.width, this.height);
		age = 1;
	}

	public void print() {
		System.out.println("Age: " + age);
		for (int row=0; row<height; row++) {
			for (int col=0; col<width; col++) {
				Cell cell = cells.get(new Position(col, row));
				System.out.print(cell.toString());
			}
			System.out.println();
		}
		System.out.println();
	}

	public void next() {
		// TODO:
		age++;
	}
}
