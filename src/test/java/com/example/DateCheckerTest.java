package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;
import com.example.DateChecker.Month;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class DateCheckerTest 
{
    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days() {
        assertTrue(dateChecker.has31Days(Month.January));
    }

    @Test
    public void testAprilDoesNotHave31Days() {
        assertFalse(dateChecker.has31Days(Month.April));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"January", "March", "May", "July", "August", "October", "December"})

    public void testHas31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month));
    }

    @Test
    public void testFebruaryExplicitly() {
        assertFalse(dateChecker.has31Days(Month.February));
    }

}
