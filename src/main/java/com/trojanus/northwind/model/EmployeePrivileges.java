package com.trojanus.northwind.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by trojanus on 3/22/2017.
 */
@Entity
@Table(name = "employee_privileges")
public class EmployeePrivileges implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employees employeeId;

    @ManyToOne
    @JoinColumn(name = "privilege_id")
    private Privileges privilegeId;

    public EmployeePrivileges() {}

    public EmployeePrivileges(Employees employeeId, Privileges privilegeId) {
        this.employeeId = employeeId;
        this.privilegeId = privilegeId;
    }

    public Employees getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employees employeeId) {
        this.employeeId = employeeId;
    }

    public Privileges getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Privileges privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    public String toString() {
        return "EmployeePrivileges{" +
                "employeeId=" + employeeId +
                ", privilegeId=" + privilegeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeePrivileges that = (EmployeePrivileges) o;

        return employeeId != null ? employeeId.equals(that.employeeId) : that.employeeId == null;
    }

    @Override
    public int hashCode() {
        return employeeId != null ? employeeId.hashCode() : 0;
    }
}
