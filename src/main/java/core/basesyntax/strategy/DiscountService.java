package core.basesyntax.strategy;

public interface DiscountService {
    default double getDiscount() {
        return 0;
    }
}
