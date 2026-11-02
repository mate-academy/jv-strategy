package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class NewYearDiscountService implements DiscountService  {
    @Override
    public double getDiscount() {
        return 20;
    }
}
