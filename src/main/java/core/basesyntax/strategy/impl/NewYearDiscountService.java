package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService{

    @Override
    public double getDiscount(int startPrice) {
        return (double) startPrice - startPrice / 100 * 20;
    }
    
}
