# jv-strategy

---
Уявіть, що у вас є мережа магазинів. Вам потрібно реалізувати систему знижок для людей на деякі особливі події року, такі як Новий рік.

У цьому завданні нам допоможе патерн Стратегія.

Перш за все, вам потрібно створити інтерфейс `DiscountService` з методом `getDiscount()` з типом повернення `double`. 
Він має розміщуватися в пакеті `core.basesyntax.strategy`.

Ви повинні створити його реалізації (з такими самими назвами) з наступними знижками:

| Назва реалізації |Знижка |
| :---: | :---: |
| DefaultDiscountService| 0 |
| NewYearDiscountService| 20 |
| BirthdayDiscountService| 33 |
| BlackFridayDiscountService| 45 |

У кожній з цих реалізацій в результаті виконання методу `getDiscount()` має повертатися знижка згідно з таблицею вище.
Також ці реалізації мають розміщуватися в пакеті `core.basesyntax.strategy.impl`.

Останнім кроком буде створення класу під назвою `DiscountStrategy`, розміщеного в пакеті `core.basesyntax`. Він повинен мати метод `getDiscountServiceBySpecialEvent(String specialEvent)` з типом повернення `DiscountService`, де `specialEvent` може мати такі значення: `"Birthday"`, `"Black Friday"`, `"New Year"`.

Використовуючи `specialEvent`, ви повинні написати код, який визначає реалізацію `DiscountService`.

У випадку, якщо переданий `specialEvent` не має конкретної реалізації, ви повинні повернути `DefaultDiscountService` за замовчуванням.

#### [Намагайтеся уникати цих поширених помилок під час виконання завдання](./checklist.md)