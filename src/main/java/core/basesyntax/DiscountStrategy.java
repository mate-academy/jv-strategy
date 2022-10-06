package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year":
                return new NewYearDiscountService();
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
/*jv-стратегія
Уявіть, що у вас є мережа магазинів. Вам потрібно впровадити систему знижок для людей на деякі особливі події року, наприклад Новий рік.

У цьому завданні нам знадобиться допомога шаблону Strategy. Перш за все, вам потрібно створити інтерфейс DiscountService з методом getDiscount()
з типом повернення double. Він має міститися в пакеті core.basesyntax.strategy.

Ви повинні створити його реалізації (з однаковими назвами) з такими знижками:

Назва реалізації Знижка
DefaultDiscountService 0
Новорічна знижка 20
BirthdayDiscountService 33
BlackFridayDiscountService 45
Кожна така реалізація в результаті виконання методу getDiscount() повинна повертати знижку відповідно до таблиці вище.
Крім того, ці реалізації мають бути розташовані в пакеті core.basesyntax.strategy.impl.

Останнім кроком буде створення класу під назвою DiscountStrategy, який знаходиться в пакеті core.basesyntax. Він повинен
мати метод getDiscountServiceBySpecialEvent(String specialEvent) з типом повернення DiscountService, де specialEvent може
мати такі значення: «Birthday», «Black Friday», «New Year».

Використовуючи specialEvent, ви повинні написати код, який визначає реалізацію DiscountService.

У випадку, якщо передана specialEvent не має конкретної реалізації, ви повинні повернути DefaultDiscountService за замовчуванням.*/