package jp.fullkawa;

import static org.junit.Assert.*;
import jp.fullkawa.status.Empty;
import jp.fullkawa.status.Populated;

import org.junit.Test;

public class CellTest {

	@Test
	public void testIsPopulated() {
		Cell pcell = new Cell(new Populated());
		assertEquals(true, pcell.isPopulated());

		Cell ecell = new Cell(new Empty());
		assertEquals(false, ecell.isPopulated());
	}

	@Test
	public void testToString() {
		Cell pcell = new Cell(new Populated());
		assertEquals("■", pcell.toString());

		Cell ecell = new Cell(new Empty());
		assertEquals("□", ecell.toString());
	}

}
