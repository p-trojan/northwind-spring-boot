package com.trojanus.northwind.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by trojanus on 3/23/2017.
 *
 * Products model class
 */
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "supplier_ids", columnDefinition = "LONGTEXT")
    private String supplierIds;

    @Column(name = "product_code", length = 25)
    private String productCode;

    @Column(name = "product_name", length = 50)
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "standart_cost", precision = 19, scale = 4)
    private BigDecimal standartCost;

    @Column(name = "list_price", precision = 19, scale = 4)
    private BigDecimal listPrice;

    @Column(name = "reorder_level")
    private int reorderLevel;

    @Column(name = "target_level")
    private int targetLevel;

    @Column(name = "quantity_per_unit", length = 50)
    private String quantityPerUnit;

    @Column(name = "discontinued")
    private int discontinued;

    @Column(name = "minimum_reorder_quantity")
    private int minimumReorderQuantity;

    @Column(name = "category", length = 50)
    private String category;

    @Column(name = "attachments", columnDefinition = "LONGBLOB")
    private byte[] attachments;

    public Products() {}

    public Products(int id, String supplierIds, String productCode, String productName, String description,
                    BigDecimal standartCost, BigDecimal listPrice, int reorderLevel, int targetLevel,
                    String quantityPerUnit, int discontinued, int minimumReorderQuantity, String category,
                    byte[] attachments) {
        this.id = id;
        this.supplierIds = supplierIds;
        this.productCode = productCode;
        this.productName = productName;
        this.description = description;
        this.standartCost = standartCost;
        this.listPrice = listPrice;
        this.reorderLevel = reorderLevel;
        this.targetLevel = targetLevel;
        this.quantityPerUnit = quantityPerUnit;
        this.discontinued = discontinued;
        this.minimumReorderQuantity = minimumReorderQuantity;
        this.category = category;
        this.attachments = attachments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplierIds() {
        return supplierIds;
    }

    public void setSupplierIds(String supplierIds) {
        this.supplierIds = supplierIds;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getStandartCost() {
        return standartCost;
    }

    public void setStandartCost(BigDecimal standartCost) {
        this.standartCost = standartCost;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public int getTargetLevel() {
        return targetLevel;
    }

    public void setTargetLevel(int targetLevel) {
        this.targetLevel = targetLevel;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public int getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(int discontinued) {
        this.discontinued = discontinued;
    }

    public int getMinimumReorderQuantity() {
        return minimumReorderQuantity;
    }

    public void setMinimumReorderQuantity(int minimumReorderQuantity) {
        this.minimumReorderQuantity = minimumReorderQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public byte[] getAttachments() {
        return attachments;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", supplierIds='" + supplierIds + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", standartCost=" + standartCost +
                ", listPrice=" + listPrice +
                ", reorderLevel=" + reorderLevel +
                ", targetLevel=" + targetLevel +
                ", quantityPerUnit='" + quantityPerUnit + '\'' +
                ", discontinued=" + discontinued +
                ", minimumReorderQuantity=" + minimumReorderQuantity +
                ", category='" + category + '\'' +
                ", attachments=" + Arrays.toString(attachments) +
                '}';
    }
}
