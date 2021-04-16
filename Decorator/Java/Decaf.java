package com.company;

public class Decaf implements Beverage {
    @Override
    public int getTotalPrice() {
        return 6000;
    }

    @Override
    public String getDescription() {
        return "디카페인";
    }
}
