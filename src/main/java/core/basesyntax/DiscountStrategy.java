package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "blackFriday":
                return new BlackFridayDiscountService();
            case "NewYear":
                return new NewYearDiscountService();
            case "BirthDay":
                return new BirthdayDiscountService();
            case "default":
            default:
                return new DefaultDiscountService();
        }
    }
}
