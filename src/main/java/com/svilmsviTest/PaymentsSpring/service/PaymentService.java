package com.svilmsviTest.PaymentsSpring.service;

import com.svilmsviTest.PaymentsSpring.entity.Account;
import com.svilmsviTest.PaymentsSpring.entity.Bill;
import com.svilmsviTest.PaymentsSpring.utils.AccountUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {

    private final AccountService accountService;

    public PaymentService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Object pay(Long accountId, BigDecimal paymentAmount){
       Account account = accountService.getById(accountId);
        Bill defaultBill = AccountUtils.findDefaultBill(account);
        defaultBill.setAmount(defaultBill.getAmount().subtract(paymentAmount));
        accountService.update(account);
        return "Success";
    }
}
