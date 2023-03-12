package com.svilmsviTest.PaymentsSpring.utils;


import com.svilmsviTest.PaymentsSpring.entity.Account;
import com.svilmsviTest.PaymentsSpring.entity.Bill;
import com.svilmsviTest.PaymentsSpring.exceptions.NotDefaultBillException;

public class AccountUtils {

    public static Bill findDefaultBill(Account accountFrom) {
        return accountFrom.getBills().stream()
                .filter(Bill::getDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("Unable to find default bill for account with id: "
                        + accountFrom.getAccountId()));
    }
}
