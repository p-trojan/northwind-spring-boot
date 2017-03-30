package com.trojanus.northwind.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by trojanus on 3/22/2017.
 *
 * PurchaseOrders model class.
 */

@Entity
@Table(name = "purchase_orders")
public class PurchaseOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Suppliers supplierId;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private Employees createdBy;

    @Column(name = "submitted_date")
    private Date submittedDate;

    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private PurchaseOrderStatus statusId;

    @Column(name = "expected_date")
    private Date expectedDate;

    @Column(name = "shipping_fee", precision = 19, scale = 4)
    private BigDecimal shippingFee;

    @Column(name = "taxes", precision = 19, scale = 4)
    private BigDecimal taxes;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "payment_amount", precision = 19, scale = 4)
    private BigDecimal paymentAmount;

    @Column(name = "payment_method", length = 50)
    private String paymentMethod;

    @Column(name = "notes", columnDefinition = "LONGTEXT")
    private String notes;

    @Column(name = "approved_by", length = 11)
    private int approvedBy;

    @Column(name = "approved_date")
    private Date approvedDate;

    @Column(name = "submitted_by", length = 11)
    private int submittedBy;

    public PurchaseOrders() {}

    public PurchaseOrders(int id, Suppliers supplierId, Employees createdBy, Date submittedDate, Date creationDate,
                          PurchaseOrderStatus statusId, Date expectedDate, BigDecimal shippingFee, BigDecimal taxes,
                          Date paymentDate, BigDecimal paymentAmount, String paymentMethod, String notes,
                          int approvedBy, Date approvedDate, int submittedBy) {
        this.id = id;
        this.supplierId = supplierId;
        this.createdBy = createdBy;
        this.submittedDate = submittedDate;
        this.creationDate = creationDate;
        this.statusId = statusId;
        this.expectedDate = expectedDate;
        this.shippingFee = shippingFee;
        this.taxes = taxes;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
        this.notes = notes;
        this.approvedBy = approvedBy;
        this.approvedDate = approvedDate;
        this.submittedBy = submittedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Suppliers getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Suppliers supplierId) {
        this.supplierId = supplierId;
    }

    public Employees getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Employees createdBy) {
        this.createdBy = createdBy;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public PurchaseOrderStatus getStatusId() {
        return statusId;
    }

    public void setStatusId(PurchaseOrderStatus statusId) {
        this.statusId = statusId;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(int approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public int getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(int submittedBy) {
        this.submittedBy = submittedBy;
    }

    @Override
    public String toString() {
        return "PurchaseOrders{" +
                "id=" + id +
                ", supplierId=" + supplierId +
                ", createdBy=" + createdBy +
                ", submittedDate=" + submittedDate +
                ", creationDate=" + creationDate +
                ", statusId=" + statusId +
                ", expectedDate=" + expectedDate +
                ", shippingFee=" + shippingFee +
                ", taxes=" + taxes +
                ", paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", notes='" + notes + '\'' +
                ", approvedBy=" + approvedBy +
                ", approvedDate=" + approvedDate +
                ", submittedBy=" + submittedBy +
                '}';
    }
}
