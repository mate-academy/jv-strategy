package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent == null) {
            return new DefaultDiscountService();
        }
        switch (specialEvent.trim().toLowerCase()) {
            case "new year":
                return new NewYearDiscountService();
            case "birthday":
                return new BirthdayDiscountService();
            case "black friday":
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
