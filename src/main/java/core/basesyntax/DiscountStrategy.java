package core.basesyntax;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
                DiscountService discountService = new DiscountService(specialEvent);
                return discountService;
    }
}
