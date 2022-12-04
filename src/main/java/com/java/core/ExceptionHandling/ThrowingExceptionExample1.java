package com.java.core.ExceptionHandling;

/**
 * If you want your consumer should handle the exception then throw Checked Exception
 * If your consumer can't do anything of the exception then throw Runtime Exception
 */

import lombok.extern.slf4j.Slf4j;

class Amount1 {
    private String currency;
    private int amount;

    public Amount1(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public String toString() {
        return amount + " " + currency;
    }

    public void add(Amount1 that) {
        if (!this.currency.equals(that.currency))
            throw new CurrenciesDoNotMatchException("Currencies don't match " + this.currency + " and " + that.currency);

        this.amount = this.amount + that.amount;
    }
}

class CurrenciesDoNotMatchException extends RuntimeException {
    public CurrenciesDoNotMatchException(String msg) {
        super(msg);
    }
}

@Slf4j
public class ThrowingExceptionExample1 {

    public static void main(String[] args) {
        try {
            Amount1 amount1 = new Amount1("USD", 10);
            Amount1 amount2 = new Amount1("EUR", 20);
            amount1.add(amount2);
            log.info(String.valueOf(amount1));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
