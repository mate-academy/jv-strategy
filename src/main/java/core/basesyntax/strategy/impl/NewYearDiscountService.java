package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private double price;

    public NewYearDiscountService(){

    }

    public NewYearDiscountService(Double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.2;
    }
}
