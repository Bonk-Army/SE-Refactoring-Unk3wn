package de.se.refactoring.Price;

import de.se.refactoring.Movie;

public class ChildrensPrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
