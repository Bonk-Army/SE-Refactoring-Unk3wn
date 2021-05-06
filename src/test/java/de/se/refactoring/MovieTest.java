package de.se.refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    private final String MOVIETITEL = "Titel for Movie";
    private final int PRICECODE = 2;

    private Movie testMovie;

    @BeforeEach
    public void setUp() {
        testMovie = new Movie(MOVIETITEL,PRICECODE);
    }

    @Test
    public void getPriceCode() {
        assertEquals(PRICECODE,testMovie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        int newPriceCode = 2;
        testMovie.setPriceCode(newPriceCode);
        assertEquals(newPriceCode,testMovie.getPriceCode());
    }

    @Test
    public void getTitle() {
        assertEquals(MOVIETITEL,testMovie.getTitle());
    }
}
