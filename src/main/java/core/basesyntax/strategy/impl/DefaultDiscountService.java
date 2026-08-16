package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private double price;

    public DefaultDiscountService(){

    }

    public DefaultDiscountService(Double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
