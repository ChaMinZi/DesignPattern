package com.company;

public class Water extends CondimentDecorator{
    public Water(Beverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 생수";
    }
}
