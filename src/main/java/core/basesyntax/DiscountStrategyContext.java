package core.basesyntax;

import core.basesyntax.strategy.DiscountStrategy;

public class DiscountStrategyContext {
    private final DiscountStrategy discountStrategy;

    public DiscountStrategyContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePriceWithDiscount(double originalPrice) {
        return discountStrategy.calculatePriceWithDiscount(originalPrice);
    }
}
