import core.basesyntax.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy ds = new DiscountStrategy();
        System.out.println(ds.getDiscountServiceBySpecialEvent("").getDiscount());
    }
}
