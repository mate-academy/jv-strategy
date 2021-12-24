package core.basesyntax.strategy;

public class Discounts {

    public class DefaultDiscountServise implements DiscountService {
        @Override
        public double getDiscount() {
            return 0;
        }
    }

    public class NewYearDiscountService implements DiscountService {

        @Override
        public double getDiscount() {
            return 20;
        }
    }

    public class BirthdayDiscountService implements DiscountService {
        @Override
        public double getDiscount() {
            return 33;
        }
    }

    public class BlackFridayDiscountService implements DiscountService {
        @Override
        public double getDiscount() {
            return 45;
        }
    }
}
