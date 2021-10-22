package core.basesyntax;

public class GetDiscount {
    public static void main(String[] args) {
        DiscountStrategy getDiscount = new DiscountStrategy();
        System.out.println(getDiscount.getDiscountServiceBySpecialEvent("New Year").getDiscount());
    }
}
