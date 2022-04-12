# jv-strategy

---
Imagine you have сhain of stores. You need to implement discount system for people 
in some special events of a year like New Year.

In this task we'll need help of Strategy pattern.
First of all, you need to create `core.basesyntax.strategy.DiscountService` interface 
with method `getDiscount()` with return type `double`. 
It must be located in `core.basesyntax.strategy` package.

You must create its implementations (with the same names) with such discounts:

| Implementation name |Discount |
| :---: | :---: |
| core.basesyntax.strategy.impl.DefaultDiscountService| 0 |
| NewYearDiscountService| 20 |
| core.basesyntax.strategy.impl.BirthdayDiscountService| 33 |
| core.basesyntax.strategy.impl.BlackFridayDiscountService| 45 |

Each of this implementation in result of execution of method 
`getDiscount()` must return discount according to table above.
Also, these implementations must be located in `core.basesyntax.strategy.impl` package.

The last step will be creation of class called `core.basesyntax.DiscountStrategy` 
and located in `core.basesyntax` package. It must have 
method `getDiscountServiceBySpecialEvent(String specialEvent)` with return type `core.basesyntax.strategy.DiscountService`
where `specialEvent` can have such values: `"Birthday"`, `"Black Friday"`, `"New Year"`.

Using `specialEvent`, you must write code that defines `core.basesyntax.strategy.DiscountService` implementation.

In case if passed `specialEvent` doesn't have specific implementation
you must return `core.basesyntax.strategy.impl.DefaultDiscountService` by default.

#### [Try to avoid these common mistakes, while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/patterns/strategy)
