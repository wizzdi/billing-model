package com.wizzdi.flexicore.billing.model.billing;

import com.flexicore.model.SecuredBasic;
import com.wizzdi.flexicore.billing.model.payment.Invoice;
import com.wizzdi.flexicore.billing.model.payment.InvoiceItem;
import com.wizzdi.flexicore.pricing.model.price.Money;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;

@Entity
public class Charge extends SecuredBasic {

    @ManyToOne(targetEntity = ChargeReference.class)
    private ChargeReference chargeReference;
    @ManyToOne(targetEntity = Money.class)
    private Money money;
    @OneToOne(targetEntity = InvoiceItem.class)
    private InvoiceItem invoiceItem;
    @Column(columnDefinition = "timestamp with time zone")
    private OffsetDateTime chargeDate;



    @ManyToOne(targetEntity = Money.class)
    public Money getMoney() {
        return money;
    }

    public <T extends Charge> T setMoney(Money money) {
        this.money = money;
        return (T) this;
    }

    @OneToOne(targetEntity = Invoice.class)
    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public <T extends Charge> T setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
        return (T) this;
    }

    @ManyToOne(targetEntity = ChargeReference.class)
    public ChargeReference getChargeReference() {
        return chargeReference;
    }

    public <T extends Charge> T setChargeReference(ChargeReference chargeReference) {
        this.chargeReference = chargeReference;
        return (T) this;
    }

    @Column(columnDefinition = "timestamp with time zone")
    public OffsetDateTime getChargeDate() {
        return chargeDate;
    }

    public <T extends Charge> T setChargeDate(OffsetDateTime chargeDate) {
        this.chargeDate = chargeDate;
        return (T) this;
    }
}
