package com.trojanus.northwind.model;

import javax.persistence.*;

/**
 * Created by John on 3/22/2017.
 */

@Entity
@Table(name = "privileges")
public class Privileges {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "privilage_name")
    private String privilageName;

    public Privileges() {}

    public Privileges(int id, String privilageName) {
        this.id = id;
        this.privilageName = privilageName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrivilageName() {
        return privilageName;
    }

    public void setPrivilageName(String privilageName) {
        this.privilageName = privilageName;
    }

    @Override
    public String toString() {
        return "Privileges{" +
                "id=" + id +
                ", privilageName='" + privilageName + '\'' +
                '}';
    }
}
