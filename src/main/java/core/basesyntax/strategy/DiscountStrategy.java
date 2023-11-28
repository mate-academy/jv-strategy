package core.basesyntax.strategy;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "Black Friday" -> new BlackFridayDiscountService();
            case "Birthday" -> new BirthdayDiscountService();
            case "New Year" -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
