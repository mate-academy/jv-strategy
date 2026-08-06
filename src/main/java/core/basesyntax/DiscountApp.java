package core.basesyntax;

public class DiscountApp {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        strategy.getDiscountServiceBySpecialEvent("").getDiscount();
    }
}
