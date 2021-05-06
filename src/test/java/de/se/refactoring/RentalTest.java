package de.se.refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {

    private final String MOVIETITEL = "I am an Movie";
    private final int PRICECODE = 2;
    private final int RENTINGDAYS = 15;

    private Movie movieForTesting;
    private Rental rentalForTesting;

    @BeforeEach
    public void setUp() {
        movieForTesting = new Movie(MOVIETITEL,PRICECODE);
        rentalForTesting = new Rental(movieForTesting,RENTINGDAYS);
    }

    @Test
    public void getDaysRented() {
        assertEquals(RENTINGDAYS,rentalForTesting.getDaysRented());
    }

    @Test
    public void getMovie() {
        assertEquals(rentalForTesting.getMovie(),movieForTesting);
    }
}
