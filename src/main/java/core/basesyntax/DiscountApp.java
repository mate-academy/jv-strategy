package core.basesyntax;

public class DiscountApp {
    public static void main(String[] args) {
        DiscountStrategy ds = new DiscountStrategy();
        System.out.println(ds.getDiscountServiceBySpecialEvent("Birthday").getDiscount());
    }
}
