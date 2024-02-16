// core.basesyntax.strategy.impl.NewYearDiscountService
package core.basesyntax;


public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}
