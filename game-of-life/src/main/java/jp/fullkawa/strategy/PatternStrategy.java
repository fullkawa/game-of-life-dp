package jp.fullkawa.strategy;

import java.util.Map;

import jp.fullkawa.Cell;
import jp.fullkawa.Position;

/**
 * with "Strategy Pattern"
 * @see http://www.techscore.com/tech/DesignPattern/Strategy.html/
 *
 * @author y.furukawa
 *
 */
public interface PatternStrategy {

	public Map<Position, Cell> getInitialPattern(int width, int height);
}
