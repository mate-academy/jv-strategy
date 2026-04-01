package core.basesyntax;

public class DiscountStrategy {
    public String getDiscountServiceBySpecialEvent(String specialEvent) {
        /*
        getDiscountServiceBySpecialEvent(String specialEvent)
        с типом возвращаемого значения DiscountService,
        где specialEvent может принимать следующие значения:
        "Birthday", "Black Friday", "New Year".
        Используя specialEvent, вы должны написать код,
        который определяет реализацию DiscountService.
        В случае, если переданный specialEvent не имеет конкретной реализации,
        вы должны по умолчанию возвращать DefaultDiscountService.
         */
        return specialEvent;
    }
}
