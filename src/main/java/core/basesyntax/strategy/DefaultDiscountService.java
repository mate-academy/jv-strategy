package core.basesyntax.strategy;

public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0.0;
    }

    public static class BirthdayDiscountService implements DiscountService {
        @Override
        public double getDiscount() {
            return 33.0;
        }
    }
}
