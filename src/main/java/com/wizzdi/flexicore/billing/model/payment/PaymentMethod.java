package com.wizzdi.flexicore.billing.model.payment;

import com.flexicore.model.SecuredBasic;
import com.flexicore.organization.model.Customer;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PaymentMethod extends SecuredBasic {

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;
    @ManyToOne(targetEntity = PaymentMethodType.class)
    private PaymentMethodType paymentMethodType;

    private boolean active;

    public PaymentMethod() {
    }


    @ManyToOne(targetEntity = Customer.class)
    public Customer getCustomer() {
        return customer;
    }

    public <T extends PaymentMethod> T setCustomer(Customer customer) {
        this.customer = customer;
        return (T) this;
    }

    public boolean isActive() {
        return active;
    }

    public <T extends PaymentMethod> T setActive(boolean active) {
        this.active = active;
        return (T) this;
    }

    @ManyToOne(targetEntity = PaymentMethodType.class)
    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public <T extends PaymentMethod> T setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
        return (T) this;
    }
}
