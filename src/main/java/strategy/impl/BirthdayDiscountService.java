package strategy.impl;

import strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
