package org.refactoring.after;

import org.junit.Test;

import junit.framework.Assert;

public class CustomerTest {

	@Test
	public void allMoviesRentalTotalChargeTest() {
		Customer customer = aCustomer();
		Assert.assertEquals(customer.getTotalCharge(), 12.5);
	}

	@Test
	public void allMoviesRentalTotalFrequentRenterPointsTest() {
		Customer customer = aCustomer();
		Assert.assertEquals(customer.getTotalFrequentRenterPoints(), 4.0);
	}

	private Customer aCustomer() {
		Customer customer = new Customer("test");
		customer.addRental(TestData.aRegularPriceMovieRental3Days);
		customer.addRental(TestData.aNewReleaseMovieRental2Days);
		customer.addRental(TestData.aChildrensMovieRental4Days);
		return customer;
	}

}
