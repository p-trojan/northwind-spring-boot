package com.trojanus.northwind.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by trojanus on 3/23/2017.
 */

@Entity
@Table(name = "invoices")
public class Invoices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orderId;

    @Column(name = "invoice_date")
    private Date invoiceDate;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "tax", precision = 19, scale = 4)
    private BigDecimal tax;

    @Column(name = "shipping", precision = 19, scale = 4)
    private BigDecimal shipping;

    @Column(name = "amount_due", precision = 19, scale = 4)
    private BigDecimal amountDue;

    public Invoices() {}

    public Invoices(int id, Orders orderId, Date invoiceDate, Date dueDate, BigDecimal tax, BigDecimal shipping, BigDecimal amountDue) {
        this.id = id;
        this.orderId = orderId;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.tax = tax;
        this.shipping = shipping;
        this.amountDue = amountDue;
    }

    public Invoices(Orders orderId, Date invoiceDate, Date dueDate, BigDecimal tax, BigDecimal shipping, BigDecimal amountDue) {
        this.orderId = orderId;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.tax = tax;
        this.shipping = shipping;
        this.amountDue = amountDue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getShipping() {
        return shipping;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        return "Invoices{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", invoiceDate=" + invoiceDate +
                ", dueDate=" + dueDate +
                ", tax=" + tax +
                ", shipping=" + shipping +
                ", amountDue=" + amountDue +
                '}';
    }
}
