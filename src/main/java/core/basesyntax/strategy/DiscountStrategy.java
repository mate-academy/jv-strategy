package core.basesyntax.strategy;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String event) {
        switch (event) {
            case "Birthday":
                return new BirthdayDiscount();
            case "Black Friday":
                return new BlackFridayDiscount();
            case "New Year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
