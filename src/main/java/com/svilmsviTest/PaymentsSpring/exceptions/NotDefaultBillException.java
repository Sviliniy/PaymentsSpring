package com.svilmsviTest.PaymentsSpring.exceptions;

public class NotDefaultBillException extends RuntimeException {
    public NotDefaultBillException(String message) {
        super(message);
    }
}
