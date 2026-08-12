package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        System.out.println(discountStrategy.getDiscountServiceBySpecialEvent("Default")
                .getDiscount());
    }
}
