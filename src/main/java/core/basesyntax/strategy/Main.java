package core.basesyntax.strategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountServiceStrategy = new DiscountStrategy();
        DiscountService discountService = discountServiceStrategy
                .getDiscountServiceBySpecialEvent("NewYear");
        System.out.println(discountService.getDiscount());
    }
}
