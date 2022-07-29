package core.basesyntax;

public interface DiscountService {
    default double getDiscount() {
        return 0;
    }
}
