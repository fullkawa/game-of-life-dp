package jp.fullkawa.status;

import jp.fullkawa.Neighbors;

/**
 * with "State Pattern"
 * @see http://www.techscore.com/tech/DesignPattern/State.html/
 *
 * @author y.furukawa
 *
 */
public interface CellStatus {

	public String toString();
	public boolean isPopulated();
	public CellStatus getNextStatus(Neighbors neighbors);
}
