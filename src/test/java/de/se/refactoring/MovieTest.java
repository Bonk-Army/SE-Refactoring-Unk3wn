package de.se.refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    final String MOVIETITEL = "Titel for Movie";
    final int PRICECODE = 2;

    Movie testMovie;

    @BeforeEach
    void setUp() {
        testMovie = new Movie(MOVIETITEL,PRICECODE);
    }

    @Test
    void getPriceCode() {
        assertEquals(PRICECODE,testMovie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        int newPriceCode = 5;
        testMovie.setPriceCode(newPriceCode);
        assertEquals(newPriceCode,testMovie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals(MOVIETITEL,testMovie.getTitle());
    }
}
