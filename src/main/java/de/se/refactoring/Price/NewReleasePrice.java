package de.se.refactoring.Price;

import de.se.refactoring.Movie;

public class NewReleasePrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int getDaysRented) {
        return getDaysRented * 3;
    }
}
