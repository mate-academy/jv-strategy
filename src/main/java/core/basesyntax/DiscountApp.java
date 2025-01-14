package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class DiscountApp {
    public static void main(String[] args) {
        DiscountStrategy ds = new DiscountStrategy();
        System.out.println(ds.getDiscountServiceBySpecialEvent("Birthday").getDiscount());
    }
}
