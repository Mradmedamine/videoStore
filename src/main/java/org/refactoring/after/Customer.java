package org.refactoring.after;

import java.util.ArrayList;
import java.util.List;

class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	};

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	}

	public String printStatement() {
		String result = "Rental Record for " + getName() + "\n";
		for (Rental each : this.rentals) {
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + "frequent renter points";
		return result;
	}

	public double getTotalCharge() {
		return this.rentals.stream()
				.mapToDouble(Rental::getCharge)
				.reduce((x, y) -> x + y)
				.orElse(0);
	}

	public double getTotalFrequentRenterPoints() {
		return this.rentals.stream()
				.mapToDouble(Rental::getFrequentRenterPoints)
				.reduce((x, y) -> x + y)
				.orElse(0);
	}

}
