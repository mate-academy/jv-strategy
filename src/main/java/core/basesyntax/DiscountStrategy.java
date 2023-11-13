package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent == null) {
            return new core.basesyntax.DefaultDiscountService();
        }

        switch (specialEvent) {
            case "New Year":
                return new NewYearDiscountService();
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
