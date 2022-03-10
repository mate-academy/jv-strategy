package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

/**
 * @version 1.0
 * @autor Denys.Shl
 * @created by 09/03/2022 - 12:08
 * @project strategy
 */
public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
