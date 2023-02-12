package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private double price;

    public BirthdayDiscountService(){

    }

    public BirthdayDiscountService(Double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.33;
    }
}
