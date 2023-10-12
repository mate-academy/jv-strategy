# jv-strategy

---
Imagine you have a сhain of stores. You need to implement a discount system for people at some special events of the year like New Year.

In this task, we'll need help with the Strategy pattern.
First of all, you need to create a `DiscountService` interface with the method `getDiscount()` with the return type `double`. 
It must be located in the `core.basesyntax.strategy` package.

You must create its implementations (with the same names) with such discounts:

| Implementation name |Discount |
| :---: | :---: |
| DefaultDiscountService| 0 |
| NewYearDiscountService| 20 |
| BirthdayDiscountService| 33 |
| BlackFridayDiscountService| 45 |

In each of these implementations in result of the execution of the method `getDiscount()` must return a discount according to the table above.
Also, these implementations must be located in the `core.basesyntax.strategy.impl` package.

The last step will be the creation of a class called `DiscountStrategy` located in the `core.basesyntax` package. It must have method `getDiscountServiceBySpecialEvent(String specialEvent)` with return type `DiscountService` where `specialEvent` can have such values: `"Birthday"`, `"Black Friday"`, `"New Year"`.

Using `specialEvent`, you must write code that defines the `DiscountService` implementation.

In case the passed `specialEvent` doesn't have a specific implementation you must return `DefaultDiscountService` by default.

#### [Try to avoid these common mistakes, while solving task](./checklist.md)
