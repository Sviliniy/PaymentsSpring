package com.svilmsviTest.PaymentsSpring.entity;

import com.svilmsviTest.PaymentsSpring.controller.dto.BillRequestDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long billId;

    private BigDecimal amount;

    private Boolean isDefault;

    public Bill(BigDecimal amount, Boolean idDefault) {
        this.amount = amount;
        this.isDefault = idDefault;
    }

    public Bill(BillRequestDTO billRequestDTO){
        amount = billRequestDTO.getAmount();
        isDefault = billRequestDTO.getDefault();
    }

    public Bill(){

    }

    public long getBillId() {
        return billId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean idDefault) {
        this.isDefault = idDefault;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", amount=" + amount +
                ", idDefault=" + isDefault +
                '}';
    }
}
