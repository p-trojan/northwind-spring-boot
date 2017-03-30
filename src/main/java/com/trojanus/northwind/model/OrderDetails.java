package com.trojanus.northwind.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by trojanus on 3/23/2017.
 *
 * OrderDetails model class
 */
@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orderId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products productId;

    @Column(name = "quantity", precision = 18, scale = 4)
    private BigDecimal quantity;

    @Column(name = "unit_price", precision = 19, scale = 4)
    private BigDecimal unitPrice;

    @Column(name = "discount")
    private BigDecimal discount;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private OrderDetailsStatus statusId;

    @Column(name = "date_allocated")
    private Date dateAllocated;

    @Column(name = "purchase_order_id")
    private int purchaseOrderId;

    @Column(name = "inventory_id")
    private int inventoryId;

    public OrderDetails() {}

    public OrderDetails(int id, Orders orderId, Products productId, BigDecimal quantity, BigDecimal unitPrice,
                        BigDecimal discount, OrderDetailsStatus statusId, Date dateAllocated, int purchaseOrderId, int inventoryId) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.statusId = statusId;
        this.dateAllocated = dateAllocated;
        this.purchaseOrderId = purchaseOrderId;
        this.inventoryId = inventoryId;
    }

    public OrderDetails(Orders orderId, Products productId, BigDecimal quantity, BigDecimal unitPrice, BigDecimal discount,
                        OrderDetailsStatus statusId, Date dateAllocated, int purchaseOrderId, int inventoryId) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.statusId = statusId;
        this.dateAllocated = dateAllocated;
        this.purchaseOrderId = purchaseOrderId;
        this.inventoryId = inventoryId;
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

    public Products getProductId() {
        return productId;
    }

    public void setProductId(Products productId) {
        this.productId = productId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public OrderDetailsStatus getStatusId() {
        return statusId;
    }

    public void setStatusId(OrderDetailsStatus statusId) {
        this.statusId = statusId;
    }

    public Date getDateAllocated() {
        return dateAllocated;
    }

    public void setDateAllocated(Date dateAllocated) {
        this.dateAllocated = dateAllocated;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", discount=" + discount +
                ", statusId=" + statusId +
                ", dateAllocated=" + dateAllocated +
                ", purchaseOrderId=" + purchaseOrderId +
                ", inventoryId=" + inventoryId +
                '}';
    }
}
