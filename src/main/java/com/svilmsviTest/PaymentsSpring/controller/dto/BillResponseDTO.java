package com.svilmsviTest.PaymentsSpring.controller.dto;

import com.svilmsviTest.PaymentsSpring.entity.Bill;

import java.math.BigDecimal;

public class BillResponseDTO {

    private long billId;

    private BigDecimal amount;

    private Boolean isDefault;

    public BillResponseDTO(Bill bill){
        billId = bill.getBillId();
        amount = bill.getAmount();
        isDefault = bill.getDefault();
    }

    public BillResponseDTO(long billId, BigDecimal amount, Boolean idDefault) {
        this.billId = billId;
        this.amount = amount;
        this.isDefault = idDefault;
    }

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
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
}
