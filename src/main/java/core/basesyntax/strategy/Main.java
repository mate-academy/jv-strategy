package core.basesyntax.strategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();

        DiscountService newYearDiscount = strategy.getDiscountServiceBySpecialEvent("Новий рік");
        System.out.println("New Year Discount: " + newYearDiscount.getDiscount()); // 20.0

        DiscountService birthdayDiscount = strategy.getDiscountServiceBySpecialEvent(
                "День народження");
        System.out.println("Birthday Discount: " + birthdayDiscount.getDiscount()); // 33.0

        DiscountService unknownDiscount = strategy.getDiscountServiceBySpecialEvent("Великдень");
        System.out.println("Default Discount: " + unknownDiscount.getDiscount()); // 0.0
    }
}
