package core.basesyntax;

public abstract class DiscountService implements core.basesyntax.strategy.DiscountService {
    @Override
    public abstract double getDiscount();
}
