# jv-strategy

---
Imagine you have сhain of stores. You need to implement discount system for people 
in some special events of a year like New Year.

In this task we'll need help of Strategy pattern.
First of all, you need to create `DiscountStrategy` interface 
with method `calculatePriceWithDiscount()` with one parameter `originalPrice` and 
return type `double`. It must be located in `core.basesyntax.strategy` package.

You must create its implementations (with the same names) with such discounts:

| Implementation name |Discount |
| :---: | :---: |
| NewYearDiscountStrategy| 20 |
| BirthdayDiscountStrategy| 33 |
| BlackFridayDiscountStrategy| 45 |

Each of this implementation in result of execution of method 
`calculatePriceWithDiscount()` must return price taking into account its discount.
Also, these implementations bust be located in `core.basesyntax.strategy.impl` package.
And class context that must be called `DiscountStrategyContext` 
and located in `core.basesyntax` package. It must have 
method `calculatePriceWithDiscount()` too but in this case 
it must return the result of specific `DiscountStrategy` implementation
that will be passed in its constructor.
