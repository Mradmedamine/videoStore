package org.refactoring.after;

public class RegularPrice extends Price {

	@Override
	public double getCharge(int rentalDays) {
		double amount = 2;
		if (rentalDays > 2)
			amount += (rentalDays - 2) * 1.5;
		return amount;
	}


}
