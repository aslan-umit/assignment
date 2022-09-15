package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import assignment.Assignment;

class TestAssignment {

	@Test
	public void testHelicalPrintArrayWithNull() {
		assertEquals("", Assignment.helicalPrintArray(null));
	}

	@Test
	public void testHelicalPrintArrayWithEmptyArray() {
		final int nums[][] = {};
		assertEquals("", Assignment.helicalPrintArray(nums));
	}

	@Test
	public void testHelicalPrintArrayWithOneElement() {
		final int nums[][] = { { 0 } };
		assertEquals("0", Assignment.helicalPrintArray(nums));
	}

	@Test
	public void testHelicalPrintArrayWithOneElementMaxInteger() {
		final int nums[][] = { { Integer.MAX_VALUE } };
		assertEquals("" + Integer.MAX_VALUE, Assignment.helicalPrintArray(nums));
	}

	@Test
	public void testHelicalPrintArrayWithOneElementMinInteger() {
		final int nums[][] = { { Integer.MIN_VALUE } };
		assertEquals("" + Integer.MIN_VALUE, Assignment.helicalPrintArray(nums));
	}

	@Test
	public void testHelicalPrintArrayWithOneRow() {
		final int nums[][] = { { 0, 1, 2, 3, 4, 5, 6 } };
		assertEquals("0,1,2,3,4,5,6", Assignment.helicalPrintArray(nums));
	}

	@Test
	public void testHelicalPrintArrayWithTwoRows() {
		final int nums[][] = { { 0, 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12, 13 } };
		assertEquals("0,1,2,3,4,5,6,13,12,11,10,9,8,7", Assignment.helicalPrintArray(nums));
	}

	@Test
	public void testHelicalPrintArrayWithOneColumn() {
		final int nums[][] = { { 0 }, { 1 }, { 2 }, { 3 }, { 4 }, { 5 }, { 6 } };
		assertEquals("0,1,2,3,4,5,6", Assignment.helicalPrintArray(nums));
	}

	@Test
	public void testHelicalPrintArrayWithTwoColumns() {
		final int nums[][] = { { 0, 1 }, { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 }, { 10, 11 }, { 12, 13 } };
		assertEquals("0,1,3,5,7,9,11,13,12,10,8,6,4,2", Assignment.helicalPrintArray(nums));
	}

	@Test
	public void testHelicalPrintArrayWithSampleCase() {
		final int nums[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		assertEquals("1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10", Assignment.helicalPrintArray(nums));
	}

}
