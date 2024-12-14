package core.basesyntax;


public class main {

    public static void main(String[] args) {
        String specialEvent = "New Year";
        DiscountStrategy discountStrategy = new DiscountStrategy();
        double discountService = discountStrategy
                .getDiscountServiceBySpecialEvent(specialEvent).getDiscount();
        System.out.println(discountService);
    }
}
