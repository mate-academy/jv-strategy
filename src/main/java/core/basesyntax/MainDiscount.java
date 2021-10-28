package core.basesyntax;

public class MainDiscount {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        System.out.println(discountStrategy.getDiscountServiceBySpecialEvent("New Year")
                        .getDiscount());
    }
}
