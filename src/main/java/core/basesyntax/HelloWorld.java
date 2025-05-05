package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountService = strategy.getDiscountServiceBySpecialEvent("BirthDay");

        double discount = discountService.calculateDiscount(0, 100);
        System.out.println(discount);
    }
}
