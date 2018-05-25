package org.refactoring.after;

public class NewReleasePrice extends Price {

	@Override
	public double getCharge(int rentalDays) {
		return rentalDays * 3;
	}

	@Override
	public int getFrequentRenterPoints(int rentalDays) {
		return rentalDays > 1 ? 2 : 1;
	}

}
