package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        String specialEvent = "New Year";
        DiscountService newYearDiscountService
                = discountStrategy.getDiscountServiceBySpecialEvent(specialEvent);
        newYearDiscountService.getDiscount();
        specialEvent = "Black Friday";
        DiscountService blackFridayDiscountService
                = discountStrategy.getDiscountServiceBySpecialEvent(specialEvent);
        blackFridayDiscountService.getDiscount();
        specialEvent = "Birthday";
        DiscountService birthdayDiscountService
                = discountStrategy.getDiscountServiceBySpecialEvent(specialEvent);
        birthdayDiscountService.getDiscount();
        specialEvent = "";
        DiscountService defaultDiscountService
                = discountStrategy.getDiscountServiceBySpecialEvent(specialEvent);
        defaultDiscountService.getDiscount();
    }
}
