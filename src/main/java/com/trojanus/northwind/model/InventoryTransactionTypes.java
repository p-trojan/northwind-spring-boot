package com.trojanus.northwind.model;

import javax.persistence.*;

/**
 * Created by trojanus on 3/22/2017.
 */

@Entity
@Table(name = "inventory_transaction_types")
public class InventoryTransactionTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type_name")
    private String typeName;

    public InventoryTransactionTypes() {}

    public InventoryTransactionTypes(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "InventoryTransactionTypes{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
