package com.trojanus.northwind.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by trojanus on 3/22/2017.
 */

@Entity
@Table(name = "purchase_order_details")
public class PurchaseOrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "purchase_order_id")
    private PurchaseOrders purchaseOrderId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products productId;

    @Column(name = "quantity", precision = 18, scale = 4)
    private BigDecimal quantity;

    @Column(name = "unit_cost", precision = 19, scale = 4)
    private BigDecimal unitCost;

    @Column(name = "date_received")
    private Date dateReceived;

    @Column(name = "posted_to_inventory")
    private int postedToInventory;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private InventoryTransactions inventoryId;

    public PurchaseOrderDetails() {}

    public PurchaseOrderDetails(int id, PurchaseOrders purchaseOrderId, Products productId, BigDecimal quantity, BigDecimal unitCost,
                                Date dateReceived, int postedToInventory, InventoryTransactions inventoryId) {
        this.id = id;
        this.purchaseOrderId = purchaseOrderId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.dateReceived = dateReceived;
        this.postedToInventory = postedToInventory;
        this.inventoryId = inventoryId;
    }

    public PurchaseOrderDetails(PurchaseOrders purchaseOrderId, Products productId, BigDecimal quantity, BigDecimal unitCost,
                                Date dateReceived, int postedToInventory, InventoryTransactions inventoryId) {
        this.purchaseOrderId = purchaseOrderId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.dateReceived = dateReceived;
        this.postedToInventory = postedToInventory;
        this.inventoryId = inventoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PurchaseOrders getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(PurchaseOrders purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
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

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public int getPostedToInventory() {
        return postedToInventory;
    }

    public void setPostedToInventory(int postedToInventory) {
        this.postedToInventory = postedToInventory;
    }

    public InventoryTransactions getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(InventoryTransactions inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Override
    public String toString() {
        return "PurchaseOrderDetails{" +
                "id=" + id +
                ", purchaseOrderId=" + purchaseOrderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", unitCost=" + unitCost +
                ", dateReceived=" + dateReceived +
                ", postedToInventory=" + postedToInventory +
                ", inventoryId=" + inventoryId +
                '}';
    }
}
