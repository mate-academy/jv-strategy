package core.basesyntax.strategy;

public class DiscountStrategy {
    private static final String BIRTHDAY = "Birthday";
    private static final String BLACK_FRIDAY = "Black Friday";
    private static final String NEW_YEAR = "New Year";
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case (NEW_YEAR): return new NewYearDiscountService();
            case (BIRTHDAY): return new BirthdayDiscountService();
            case (BLACK_FRIDAY): return new BlackFridayDiscountService();
            default: return new DefaultDiscountService();
        }
    }
}
