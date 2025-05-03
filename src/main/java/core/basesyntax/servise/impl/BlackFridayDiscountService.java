package core.basesyntax.servise.impl;
import core.basesyntax.servise.DiscountService;

public class BlackFridayDiscountService implements DiscountService{
    public double getDiscount() {
        return 45.0;
    }
}
