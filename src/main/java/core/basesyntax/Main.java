package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        double actualDiscount = discountStrategy.getDiscountServiceBySpecialEvent("Black Friday")
                .getDiscount();
        System.out.println(actualDiscount);
    }
}
