package org.refactoring.after;

public abstract class Price {

	public abstract double getCharge(int rentalDays);

	public int getFrequentRenterPoints(int rentalDays) {
		return 1;
	}

}
