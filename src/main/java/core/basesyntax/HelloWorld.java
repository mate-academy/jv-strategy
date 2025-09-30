package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    double price = 200.00;
    DiscountStrategy strategy = new DiscountStrategy();

    DiscountService service = strategy.getDiscountServiceBySpecialEvent("Black Friday");
    double discountPercent = service.getDiscount();

    double finalPrice = price * (1 - discountPercent / 100);

}
