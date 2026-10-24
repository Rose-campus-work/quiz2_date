package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.example.DateChecker.Month;

public class DateCheckerTest 
{
    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days() {
        assertTrue(
            dateChecker.has31Days(Month.January)
        );
    }

}
