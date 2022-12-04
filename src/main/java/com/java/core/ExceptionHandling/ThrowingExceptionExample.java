package com.java.core.ExceptionHandling;

/**
 * If you want your consumer should handle the exception then throw Checked Exception
 * If your consumer can't do anything of the exception then throw Runtime Exception
 */

import lombok.extern.slf4j.Slf4j;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public String toString() {
        return amount + " " + currency;
    }

    public void add(Amount that) {
        if (!this.currency.equals(that.currency))
            throw new RuntimeException("Currencies don't match " + this.currency + " and " + that.currency);

        this.amount = this.amount + that.amount;
    }
}

@Slf4j
public class ThrowingExceptionExample {

    public static void main(String[] args) {
        try {
            Amount amount1 = new Amount("USD", 10);
            Amount amount2 = new Amount("EUR", 20);
            amount1.add(amount2);
            log.info(String.valueOf(amount1));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
