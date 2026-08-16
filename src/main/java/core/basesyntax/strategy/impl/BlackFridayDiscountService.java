package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private double price;

    public BlackFridayDiscountService(){

    }

    public BlackFridayDiscountService(Double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.45;
    }
}
