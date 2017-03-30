package com.trojanus.northwind.model;

import javax.persistence.*;

/**
 * Created by trojanus on 3/23/2017.
 */

@Entity
@Table(name = "order_details_status")
public class OrderDetailsStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "status_name", length = 50)
    private String statusName;

    public OrderDetailsStatus() {}

    public OrderDetailsStatus(int id, String statusName) {
        this.id = id;
        this.statusName = statusName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        return "OrderDetailsStatus{" +
                "id=" + id +
                ", statusName='" + statusName + '\'' +
                '}';
    }
}
