package org.refactoring.after;

public class TestData {

	public static Movie aRegularPriceMovie;
	public static Movie aNewReleaseMovie;
	public static Movie aChildrensMovie;

	public static Rental aRegularPriceMovieRental2Days;
	public static Rental aRegularPriceMovieRental3Days;
	public static Rental aNewReleaseMovieRental1Day;
	public static Rental aNewReleaseMovieRental2Days;
	public static Rental aChildrensMovieRental2Days;
	public static Rental aChildrensMovieRental4Days;

	static {
		aRegularPriceMovie = new Movie("regular Movie", new RegularPrice());
		aNewReleaseMovie = new Movie("new release Movie", new NewReleasePrice());
		aChildrensMovie = new Movie("childrens Movie", new ChildrensPrice());

		aRegularPriceMovieRental2Days = new Rental(aRegularPriceMovie, 2);
		aRegularPriceMovieRental3Days = new Rental(aRegularPriceMovie, 3);
		aNewReleaseMovieRental1Day = new Rental(aNewReleaseMovie, 1);
		aNewReleaseMovieRental2Days = new Rental(aNewReleaseMovie, 2);
		aChildrensMovieRental2Days = new Rental(aChildrensMovie, 2);
		aChildrensMovieRental4Days = new Rental(aChildrensMovie, 4);

	}
}
