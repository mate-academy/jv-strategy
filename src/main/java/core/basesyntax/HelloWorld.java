package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    public static void main(String[] args) {
        double price = 200.00;
        DiscountStrategy strategy = new DiscountStrategy();

        DiscountService service = strategy.getDiscountServiceBySpecialEvent("birthday");
        double discountPercent = service.getDiscount();

        double finalPrice = price * (1 - discountPercent / 100);

        System.out.println(finalPrice);
    }

}
