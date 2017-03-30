package com.trojanus.northwind.model;

import javax.persistence.*;

/**
 * Created by trojanus on 3/22/2017.
 *
 * PurchaseOrderStatus model class
 */

@Entity
@Table(name = "purchase_order_status")
public class PurchaseOrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "status")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PurchaseOrderStatus{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
