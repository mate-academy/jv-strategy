package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();

        DiscountService newYearService = strategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println("New Year Discount: " + newYearService.getDiscount() + "%");

        DiscountService birthdayService = strategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("Birthday Discount: " + birthdayService.getDiscount() + "%");

        DiscountService blackFridayService = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println("Black Friday Discount: " + blackFridayService.getDiscount() + "%");

        DiscountService defaultService = strategy.getDiscountServiceBySpecialEvent("Some Other Event");
        System.out.println("Default Discount: " + defaultService.getDiscount() + "%");
    }
}
