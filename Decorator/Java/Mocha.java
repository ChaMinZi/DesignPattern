package com.company;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 700;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 모카";
    }
}
