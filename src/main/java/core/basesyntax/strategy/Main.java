package core.basesyntax.strategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountService = strategy.getDiscountServiceBySpecialEvent("Birthday");
        double priceWithDiscount = discountService.getDiscount();
        System.out.println(priceWithDiscount);
    }
}
