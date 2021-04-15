package com.company;

abstract public class CondimentDecorator implements Beverage {
    private Beverage base;

    public CondimentDecorator(Beverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    @Override
    public String getDescription() {
        return base.getDescription();
    }

    protected Beverage getBase() {
        return base;
    }
}
