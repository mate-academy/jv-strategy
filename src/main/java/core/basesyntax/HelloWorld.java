package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        double result = discountStrategy.getDiscountServiceBySpecialEvent("DefaultDiscountService").getDiscount();
        System.out.println(result);
    }
}
