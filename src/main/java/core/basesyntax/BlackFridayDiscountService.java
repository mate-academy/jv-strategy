// core.basesyntax.strategy.impl.BlackFridayDiscountService
package core.basesyntax;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
