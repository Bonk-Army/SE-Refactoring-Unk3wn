package de.se.refactoring.Price;

import de.se.refactoring.Movie;

public abstract class Price {

    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
}
