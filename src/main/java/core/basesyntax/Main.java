package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();

        System.out.println("Birthday Discount: "
                + strategy.getDiscountServiceBySpecialEvent("Birthday").getDiscount()); // 33.0
        System.out.println("Black Friday Discount: "
                + strategy.getDiscountServiceBySpecialEvent("Black Friday").getDiscount()); // 45.0
        System.out.println("New Year Discount: "
                + strategy.getDiscountServiceBySpecialEvent("New Year").getDiscount()); // 20.0
        System.out.println("Default Discount: "
                + strategy.getDiscountServiceBySpecialEvent("Random Event").getDiscount()); // 0.0
    }
}
