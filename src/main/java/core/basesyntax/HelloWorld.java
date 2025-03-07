package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountService = strategy.getDiscountServiceBySpecialEvent("NewYear");

        double Discount = discountService.calculateDiscount(0, 100);
        System.out.println(Discount);
    }
}