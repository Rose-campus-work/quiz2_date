package com.example;

public class DateChecker 
{
    enum Month {
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    private DateChecker.Month[] monthThirtyOneDays = {Month.January, Month.March, Month.May, Month.July, Month.August, Month.October, Month.December};

    public boolean has31Days(Month month){
        return false;
    }

}
