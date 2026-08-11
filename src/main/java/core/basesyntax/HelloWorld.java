package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();

        String specialEvent = "New Year";
        DiscountService discountService
                = discountStrategy.getDiscountServiceBySpecialEvent(specialEvent);

        double discount = discountService.getDiscount();
        System.out.println("Rabat dla wydarzenia specjalnego '"
                + specialEvent + "': " + discount + "%");
    }
}

