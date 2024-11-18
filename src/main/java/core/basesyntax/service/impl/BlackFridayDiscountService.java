package core.basesyntax.service.impl;
import core.basesyntax.service.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    public double getDiscount() {
        return 45.0;
    }
}
