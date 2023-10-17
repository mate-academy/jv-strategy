package core.basesyntax.strategy;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "New Year" -> new NewYearDiscountService();
            case "Birthday" -> new BirthdayDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
