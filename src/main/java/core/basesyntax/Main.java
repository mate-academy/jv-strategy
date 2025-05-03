package core.basesyntax;
import core.basesyntax.servise.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountService birthdayService = DiscountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(birthdayService.getDiscount() + "%");
    }
}