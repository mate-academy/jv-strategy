package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy implements DiscountService {
    public static final int DEFAULTDISCOUNT = 0;
    public static final int NEWYEARDISCOUNT = 20;
    public static final int BIRTHDAYDISCOUNT = 33;
    public static final int BLACKFRADAYDISCOUNT = 45;

    @Override
    public double getDiscount() {
        return DEFAULTDISCOUNT;
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }

    public static class DefaultDiscountService implements DiscountService {

        @Override
        public double getDiscount() {
            return DEFAULTDISCOUNT;
        }
    }

    public static class NewYearDiscountService implements DiscountService {

        @Override
        public double getDiscount() {
            return NEWYEARDISCOUNT;
        }
    }

    public static class BirthdayDiscountService implements DiscountService {

        @Override
        public double getDiscount() {
            return BIRTHDAYDISCOUNT;
        }
    }

    public static class BlackFridayDiscountService implements DiscountService {

        @Override
        public double getDiscount() {
            return BLACKFRADAYDISCOUNT;
        }
    }
}
