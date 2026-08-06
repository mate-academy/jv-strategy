package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public interface BirthdayDiscountService extends DiscountService {
    @Override
    double getDiscount();
}
