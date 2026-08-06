package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class MainDiscountService {
    public static void main(String[] args) {

        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy
                .getDiscountServiceBySpecialEvent("Black Friday");
        double discountPrice = discountService.getDiscount();
        System.out.println(discountPrice);

    }
}
