package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent == null) {
            return null;
        }
        switch (specialEvent) {
            case "New Year":
                return new NewYearDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "Birthday" :
                return new BirthdayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
