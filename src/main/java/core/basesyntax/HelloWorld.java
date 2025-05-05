package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    private final DiscountStrategy strategy = new DiscountStrategy();
    private final DiscountService service = strategy.getDiscountServiceBySpecialEvent("");
}
