package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        System.out.println(discountStrategy.getDiscountServiceBySpecialEvent("New Year"));
        System.out.println(discountStrategy.getDiscountServiceBySpecialEvent("New Yer"));
        System.out.println(discountStrategy.getDiscountServiceBySpecialEvent("Birthday"));
        System.out.println(discountStrategy.getDiscountServiceBySpecialEvent("Black Friday"));
    }
}
