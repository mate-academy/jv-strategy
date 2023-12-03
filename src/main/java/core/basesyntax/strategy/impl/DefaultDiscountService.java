package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private double discount = 0;

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
