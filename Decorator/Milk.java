package com.company;

public class Milk extends CondimentDecorator{
    public Milk(Beverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 500;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ 우유";
    }
}
