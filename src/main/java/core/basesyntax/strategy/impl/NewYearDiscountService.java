package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

/**
 * @version 1.0
 * @autor Denys.Shl
 * @created by 09/03/2022 - 12:07
 * @project strategy
 */
public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}