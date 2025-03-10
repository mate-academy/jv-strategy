package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent == null) {
            return new DefoultDiscountService();
        }
        switch (specialEvent) {
            case "New Year":
                return new NewYearDiscount();
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BirthdayDiscountService();
            default:
                return new DefoultDiscountService();
        }
    }
}
