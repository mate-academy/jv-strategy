package core.basesyntax;

public class BlackFridayDiscount  implements DiscountService {
        @Override
        public double getDiscount() {
            return 45;
        }
}
