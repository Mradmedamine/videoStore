package org.refactoring.after;

import org.junit.Test;

import junit.framework.Assert;

public class RentalTest {

	// Charge
	@Test
	public void aRegularPriceMovieRental2DaysChargeTest() {
		Assert.assertEquals(TestData.aRegularPriceMovieRental2Days.getCharge(), 2.0);
	}

	@Test
	public void aRegularPriceMovieRental3DaysChargeTest() {
		Assert.assertEquals(TestData.aRegularPriceMovieRental3Days.getCharge(), 3.5);
	}

	@Test
	public void aNewReleaseMovieRental1DayChargeTest() {
		Assert.assertEquals(TestData.aNewReleaseMovieRental1Day.getCharge(), 3.0);
	}

	@Test
	public void aNewReleaseMovieRental2DaysChargeTest() {
		Assert.assertEquals(TestData.aNewReleaseMovieRental2Days.getCharge(), 6.0);
	}

	@Test
	public void aChildrensMovieRental2DaysChargeTest() {
		Assert.assertEquals(TestData.aChildrensMovieRental2Days.getCharge(), 1.5);
	}

	@Test
	public void aChildrensMovieRental4DaysChargeTest() {
		Assert.assertEquals(TestData.aChildrensMovieRental4Days.getCharge(), 3.0);
	}

	// FrequentRenterPoints

	@Test
	public void aRegularPriceMovieRental2DaysFrequentRenterPointsTest() {
		Assert.assertEquals(TestData.aRegularPriceMovieRental2Days.getFrequentRenterPoints(), 1);
	}

	@Test
	public void aNewReleaseMovieRental2DaysFrequentRenterPointsTest() {
		Assert.assertEquals(TestData.aNewReleaseMovieRental2Days.getFrequentRenterPoints(), 2);
	}

	@Test
	public void aChildrensMovieRental2DaysFrequentRenterPointsTest() {
		Assert.assertEquals(TestData.aChildrensMovieRental2Days.getFrequentRenterPoints(), 1);
	}

}