package jp.fullkawa;

import jp.fullkawa.strategy.PatternStrategy;

public class GameOfLife {

	private static final int WIDTH = 10;
	private static final int HEIGHT = 10;

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws Exception {
		//String strategy = "jp.fullkawa.strategy.CheckPattern";
		String strategy = "jp.fullkawa.strategy.RandomPattern";
		Generation gen = new Generation(WIDTH, HEIGHT
			, (PatternStrategy)Class.forName(strategy).newInstance());
		while (true) {
			gen.print();
			gen.next();
			//Thread.sleep(500);
			break;
		}
	}

}
