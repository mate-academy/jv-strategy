package core.basesyntax.strategy;

public interface DiscountService {
    double getDiscount();

    class NewYearDiscountService implements DiscountService {
        @Override
        public double getDiscount() {
            return (double) 20;
        }
    }

    class DefaultDiscountService implements DiscountService {
        @Override
        public double getDiscount() {
            return (double) 0;
        }
    }

    class BlackFridayDiscountService implements DiscountService {
        @Override
        public double getDiscount() {
            return (double) 45;
        }
    }

    class BirthdayDiscountService implements DiscountService {
        @Override
        public double getDiscount() {
            return (double) 33;
        }
    }
}
