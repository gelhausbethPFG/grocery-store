The following is a TDD Kata- an exercise in coding, refactoring and test-first.

Before you start: 
* Try not to read ahead.
* Do one task at a time. The trick is to learn to work incrementally.
* Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata


Grocery Checkout

* Create a simple checkout method int checkout(string products)
    * The method accepts the following values: "A" (Apples), "B" (Bananas), or "C" (Coconut)
    * The values will be in a comma delimited format from the register: (ex. "A,B,B,A,B,C")
    * It will return the sum of their totaled cost to purchase
    * An empty string will return 0
    * Start with the simplest test case of an empty string and move to one and two products
    * Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
    * Remember to refactor after each passing test
    
* Prices
   * Apples cost $1 each
   * Bananas cost $2 each
   * Coconuts cost $4 each
    
* Allow the checkout method to handle an unknown amount of products

* Allow the checkout method to handle this week's sale prices
    * Apples - 3 for the price of two (if you buy 4, the 4th apple is regular price. The sale only applies in increments of three)
    * Bananas - "Buy one, get one free"
    * Coconuts - when 4 or more are purchased, you save 50% on the total price of all coconuts purchased
    
* We've made a huge mistake
    * Bananas are flying out the door. Limit the number of free bananas to 4. Any bananas beyond this limit are regular price
    * Coconuts were marked down too far, but we can't rescind the sale completely. When 4 are purchased, reduce the price 50%. Any after that are only reduced by 25%
