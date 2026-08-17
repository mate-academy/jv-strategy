package core.basesyntax;


import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService happyBirthday =
                discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(happyBirthday.getDiscount());
    }
}
