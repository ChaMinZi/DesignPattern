package com.company;

public class HouseBlend implements Beverage {
    @Override
    public int getTotalPrice() {
        return 4800;
    }

    @Override
    public String getDescription() {
        return "하우스 블랜드";
    }
}
