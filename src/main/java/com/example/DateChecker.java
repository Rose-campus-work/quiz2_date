package com.example;

public class DateChecker 
{
    enum Month {
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    public boolean has31Days(Month month){
        if (month == null) {
            throw new IllegalArgumentException("Month input cannot be null");
        }

        return switch (month) {
            case January, March, May, July, August, October, December -> true;
            case April, June, September, November, February -> false;
        };
    }

}
