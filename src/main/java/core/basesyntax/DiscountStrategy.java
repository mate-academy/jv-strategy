package core.basesyntax;

public class DiscountStrategy {
    public core.basesyntax.strategy.DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "NewYear":
                return new NewYearDiscountService() {
                    @Override
                    public double getDiscount() {
                        return 0;
                    }
                };
            case "Birthday":
                return new BirthdayDiscountService() {
                    @Override
                    public double getDiscount() {
                        return 0;
                    }
                };
            case "BlackFriday":
                return new BlackFridayDiscountService() {
                    @Override
                    public double getDiscount() {
                        return 0;
                    }
                };
            default:
                return new DefaultDiscountService() {
                    @Override
                    public double getDiscount() {
                        return 0;
                    }
                };
        }
    }
}

