package com.company;

public class DarkRoast implements Beverage {
    @Override
    public int getTotalPrice() {
        return 5000;
    }

    @Override
    public String getDescription() {
        return "다크로스트";
    }
}
