package de.se.refactoring;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {

    final String MOVIETITEL = "I am an Movie";
    final int PRICECODE = 2;
    final int RENTINGDAYS = 15;

    Movie movieForTesting;
    Rental rentalForTesting;

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
