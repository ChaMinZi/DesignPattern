package com.company;

public class Whip extends CondimentDecorator{
    public Whip(Beverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 1000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 휘핑 크림";
    }
}
