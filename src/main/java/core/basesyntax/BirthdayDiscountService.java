// core.basesyntax.strategy.impl.BirthdayDiscountService
package core.basesyntax;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
