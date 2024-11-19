package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if ("New Year".equalsIgnoreCase(specialEvent)) {
            return new NewYearDiscountService();
        } else if ("Birthday".equalsIgnoreCase(specialEvent)) {
            return new BirthdayDiscountService();
        } else if ("Black Friday".equalsIgnoreCase(specialEvent)) {
            return new BlackFridayDiscountService();
        } else {
            return new DefaultDiscountService();
        }
    }
}
