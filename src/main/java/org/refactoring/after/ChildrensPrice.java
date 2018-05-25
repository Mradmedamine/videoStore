package org.refactoring.after;

public class ChildrensPrice extends Price {

	@Override
	public double getCharge(int rentalDays) {
		double amount = 1.5;
		if (rentalDays > 3)
			amount += (rentalDays - 3) * 1.5;
		return amount;
	}

}
