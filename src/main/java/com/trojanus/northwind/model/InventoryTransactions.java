package com.trojanus.northwind.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by trojanus on 3/22/2017.
 */
@Entity
@Table(name = "inventory_transactions")
public class InventoryTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "transaction_type")
    private InventoryTransactionTypes transactionType;

    @Column(name = "transaction_create_date")
    private Date transactionCreatedDate;

    @Column(name = "transaction_modified_date")
    private Date transactionModifiedDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products productId;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "purchase_order_id")
    private PurchaseOrders purchaseOrderId;

    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private Orders customerOrderId;

    @Column(name = "comments")
    private String comments;

    public InventoryTransactions() {}

    public InventoryTransactions(int id, InventoryTransactionTypes transactionType, Date transactionCreatedDate, Date transactionModifiedDate,
                                 Products productId, int quantity, PurchaseOrders purchaseOrderId, Orders customerOrderId,
                                 String comments) {
        this.id = id;
        this.transactionType = transactionType;
        this.transactionCreatedDate = transactionCreatedDate;
        this.transactionModifiedDate = transactionModifiedDate;
        this.productId = productId;
        this.quantity = quantity;
        this.purchaseOrderId = purchaseOrderId;
        this.customerOrderId = customerOrderId;
        this.comments = comments;
    }

    public InventoryTransactions(InventoryTransactionTypes transactionType, Date transactionCreatedDate, Date transactionModifiedDate,
                                 Products productId, int quantity, PurchaseOrders purchaseOrderId, Orders customerOrderId, String comments) {
        this.transactionType = transactionType;
        this.transactionCreatedDate = transactionCreatedDate;
        this.transactionModifiedDate = transactionModifiedDate;
        this.productId = productId;
        this.quantity = quantity;
        this.purchaseOrderId = purchaseOrderId;
        this.customerOrderId = customerOrderId;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InventoryTransactionTypes getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(InventoryTransactionTypes transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionCreatedDate() {
        return transactionCreatedDate;
    }

    public void setTransactionCreatedDate(Date transactionCreatedDate) {
        this.transactionCreatedDate = transactionCreatedDate;
    }

    public Date getTransactionModifiedDate() {
        return transactionModifiedDate;
    }

    public void setTransactionModifiedDate(Date transactionModifiedDate) {
        this.transactionModifiedDate = transactionModifiedDate;
    }

    public Products getProductId() {
        return productId;
    }

    public void setProductId(Products productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PurchaseOrders getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(PurchaseOrders purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Orders getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(Orders customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "InventoryTransactions{" +
                "id=" + id +
                ", transactionType=" + transactionType +
                ", transactionCreatedDate=" + transactionCreatedDate +
                ", transactionModifiedDate=" + transactionModifiedDate +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", purchaseOrderId=" + purchaseOrderId +
                ", customerOrderId=" + customerOrderId +
                ", comments='" + comments + '\'' +
                '}';
    }
}
