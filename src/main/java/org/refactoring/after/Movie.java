package org.refactoring.after;

public class Movie {

	private String title;
	private Price price;

	public Movie(String title, Price price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int rentalDays) {
		return price.getCharge(rentalDays);
	}

	public int getFrequentRenterPoints(int rentalDays) {
		return price.getFrequentRenterPoints(rentalDays);
	}

}