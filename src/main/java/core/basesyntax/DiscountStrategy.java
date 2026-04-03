package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent.equals("Birthday")) {
            return new BirthdayDiscountService();
        } else if (specialEvent.equals("Black Friday")) {
            return new BlackFridayDiscountService();
        } else if (specialEvent.equals("New Year")) {
            return new NewYearDiscountService();
        } else {
            return new DefaultDiscountService();
        }
    }
}
