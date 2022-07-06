package core.basesyntax.strategy;

public interface DiscountService {

    public default double getDiscount(){
        return 0;
    }
}
