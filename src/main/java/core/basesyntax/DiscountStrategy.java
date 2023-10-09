package core.basesyntax;

public class DiscountStrategy {
    public static final String NEW_YEAR = "New Year";
    public static final String BIRTHDAY = "Birthday";
    public static final String BLACK_FRIDAY = "Black Friday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case NEW_YEAR:
                return new NewYearDiscountService();
            case BIRTHDAY:
                return new BirthdayDiscountService();
            case BLACK_FRIDAY:
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
