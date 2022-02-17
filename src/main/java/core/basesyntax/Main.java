package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        String specialEvent = "New Year";
        DiscountStrategy ds = new DiscountStrategy();
        System.out.println(ds.getDiscountServiceBySpecialEvent(specialEvent).getDiscount());
    }
}
