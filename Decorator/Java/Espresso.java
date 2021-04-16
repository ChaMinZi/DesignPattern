package com.company;

public class Espresso implements Beverage {

    @Override
    public int getTotalPrice() {
        return 4000;
    }

    @Override
    public String getDescription() {
        return "에스프레소";
    }
}
