package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscount();
            case "Black Friday":
                return new BlackFridayDiscount();
            case "New Year":
                return new NewYearDiscount();
            default:
                return new DefaultDiscount();
        }
    }
}

