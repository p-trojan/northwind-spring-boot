package com.trojanus.northwind.model;

import javax.persistence.*;

/**
 * Created by trojanus on 3/23/2017.
 */

@Entity
@Table(name = "order_tax_status")
public class OrderTaxStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tax_status_name", length = 50)
    private String taxStatusName;

    public OrderTaxStatus() {}

    public OrderTaxStatus(int id, String taxStatusName) {
        this.id = id;
        this.taxStatusName = taxStatusName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaxStatusName() {
        return taxStatusName;
    }

    public void setTaxStatusName(String taxStatusName) {
        this.taxStatusName = taxStatusName;
    }

    @Override
    public String toString() {
        return "OrderTaxStatus{" +
                "id=" + id +
                ", taxStatusName='" + taxStatusName + '\'' +
                '}';
    }
}
