The following is a TDD Kata- an exercise in coding, refactoring and test-first.

Before you start: 
* Try not to read ahead.
* Do one task at a time. The trick is to learn to work incrementally.
* Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata
* Start with the simplest test case of an empty string and move to one and two products
* Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
* Remember to refactor after each passing test

Grocery Checkout

* Prices
   * Apples cost $1 each
   * Bananas cost $2 each
   * Coconuts cost $4 each

* Create a simple checkout method `int checkout(String products)` which totals the cost for all products passed in
    * An empty string will return 0
    * The method accepts the following values: `"A"` (Apples), `"B"` (Bananas), or `"C"` (Coconut)
    * The multiple values will be in an unsorted comma delimited format from the register: (ex. `"A,B,C"`)
    * It will return the sum of their totaled cost to purchase
    
* Allow the checkout method to handle an unknown amount of products

* Allow the checkout method to handle this week's sale prices
    * Apples - 3 for $2 (The sale only applies in increments of three, any remainder is normal price)
    * Bananas - "Buy one, get one free"
    * Coconuts - when 4 or more are purchased, you save 50% on the total price of all coconuts purchased
    
* We've made a huge mistake
    * Bananas are flying out the door. Limit the number of free bananas to 4. Any bananas beyond this limit are regular price
    * Coconuts were marked down too far. New sale: When 4 or more are purchased, only reduce the price of the first four by 50%. Any after that are only reduced by 25%

* Cashiers are getting sick of clearing out transactions
    * Because we're loading everything at once, if a cashier makes a mistake, they have to clear the whole transaction and start over
    * To fix this, if there is an `"X"` in the product string, the previous product should be removed from the total (ex `"A,A,X,B"` would total up to $3 (1 apple and 1 banana))
    
* We need to track sales and discounts
    * We have a database we're dumping sale metrics into. There is a class with a method to store the following values:
    * `DiscountTracker.storeDiscounts(int appleCount, int appleAmount, int bananaCount, int bananaAmount, int coconutCount, int coconutAmount)`