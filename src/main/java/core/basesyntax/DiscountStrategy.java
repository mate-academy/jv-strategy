package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent.toLowerCase()) {
            case "new year" -> new NewYearDiscountService();
            case "birthday" -> new BirthdayDiscountService();
            case "black friday" -> new BlackFridayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
