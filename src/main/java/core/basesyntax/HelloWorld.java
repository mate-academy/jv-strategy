package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        discountStrategy.getDiscountServiceBySpecialEvent("New");
    }

}
