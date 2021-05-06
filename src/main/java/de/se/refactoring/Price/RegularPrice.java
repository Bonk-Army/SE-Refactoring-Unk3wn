package de.se.refactoring.Price;

import de.se.refactoring.Movie;

public class RegularPrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
