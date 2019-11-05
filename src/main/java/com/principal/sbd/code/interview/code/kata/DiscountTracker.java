package com.principal.sbd.code.interview.code.kata;

import static java.lang.System.out;

public class DiscountTracker {
    static void storeDiscounts(int appleCount, int appleAmount, int bananaCount, int bananaAmount, int coconutCount, int coconutAmount) {
        out.println("Apple Sale\n"
                + "Count: " + appleCount + "\n"
                + "Amount: $" + appleAmount + "\n"
                + "Banana Sale\n"
                + "Count: " + bananaCount + "\n"
                + "Amount: $" + bananaAmount + "\n"
                + "Coconut Sale\n"
                + "Count: " + coconutCount + "\n"
                + "Amount: $" + coconutAmount + "\n"
                + "Total Sale Discount Amount: $" + (appleAmount + bananaAmount + coconutAmount)
        );
    }
}
