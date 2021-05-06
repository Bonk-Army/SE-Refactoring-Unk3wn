package de.se.refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    private final String CUSTOMERNAME = "CustomerName";
    private final String MOVIETITEL = "I am an Movie";
    private final int PRICECODE = 2;
    private final int RENTINGDAYS = 15;
    private final int RENTINGPOINTS = 1;

    private final String RESULTSTRING = "java.Rental Record for "+CUSTOMERNAME+"\n" +
                                "\tTitle\t\tDays\tAmount\n" +
                                "\t"+MOVIETITEL+"\t\t"+RENTINGDAYS+"\t19.5\n" +
                                "Amount owed is 19.5\n"+
                                "You earned 1 frequent renter points";

    private final String RESULTSTRINGHTML = "<H1>Rentals for <EM>"+CUSTOMERNAME+"</EM></H1><P>\n" +
                                ""+MOVIETITEL+": 19.5<BR>\n" +
                                "<P>You owe <EM>19.5</EM><P>\n"+
                                "On this rental you earned <EM>"+RENTINGPOINTS+"</EM> frequent renter points<P>";

    Movie movieForTesting;
    Rental rentalForTesting;
    Customer customerForTesting;

    @BeforeEach
    public void setUp() {
        customerForTesting = new Customer(CUSTOMERNAME);
        movieForTesting = new Movie(MOVIETITEL,PRICECODE);
        rentalForTesting = new Rental(movieForTesting,RENTINGDAYS);
    }

    @Test
    public void addRental() {
        try{
            customerForTesting.addRental(rentalForTesting);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void getName() {
        assertEquals(CUSTOMERNAME,customerForTesting.getName());
    }

    @Test
    public void statement() {
        customerForTesting.addRental(rentalForTesting);
        assertEquals(RESULTSTRING,customerForTesting.statement());
    }

    @Test
    public void htmlStatement() {
        customerForTesting.addRental(rentalForTesting);
        assertEquals(RESULTSTRINGHTML,customerForTesting.htmlStatement());
    }
}
