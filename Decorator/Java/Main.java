package com.company;

public class Main {
    public static void main(String[] args) {
        Beverage americano = new Water(new Espresso());
        System.out.println("가격 : " + americano.getTotalPrice());
        System.out.println("구성 : " + americano.getDescription());

        Beverage MochaLatte = new Whip(new Milk(new DarkRoast()));
        System.out.println("가격 : " + MochaLatte.getTotalPrice());
        System.out.println("구성 : " + MochaLatte.getDescription());
    }
}
