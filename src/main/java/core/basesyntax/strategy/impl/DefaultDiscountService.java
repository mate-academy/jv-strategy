package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

/**
 * @version 1.0
 * @autor Denys.Shl
 * @created by 09/03/2022 - 12:04
 * @project strategy
 */
public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}