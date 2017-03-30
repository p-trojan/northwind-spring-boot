package com.trojanus.northwind.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by trojanus on 3/23/2017.
 */

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employees employeeId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "shipped_date")
    private Date shippedDate;

    @ManyToOne
    @JoinColumn(name = "shipper_id")
    private Shippers shipperId;

    @Column(name = "ship_name", length = 50)
    private String shipName;

    @Column(name = "ship_address", columnDefinition = "LONGTEXT")
    private String shipAddress;

    @Column(name = "ship_city", length = 50)
    private String shipCity;

    @Column(name = "ship_state_province", length = 50)
    private String shipStateProvince;

    @Column(name = "ship_zip_postal_code", length = 50)
    private String shipZipPostalCode;

    @Column(name = "ship_country_region", length = 50)
    private String shipCountryRegion;

    @Column(name = "shipping_fee", precision = 19, scale = 4)
    private BigDecimal shippingFee;

    @Column(name = "taxes", precision = 19, scale = 4)
    private BigDecimal taxes;

    @Column(name = "payment_type", length = 50)
    private String paymentType;

    @Column(name = "paid_date")
    private Date paidDate;

    @Column(name = "notes", columnDefinition = "LONGTEXT")
    private String notes;

    @Column(name = "tax_rate")
    private BigDecimal taxRate;

    @ManyToOne
    @JoinColumn(name = "tax_status_id")
    private OrderTaxStatus taxStatusId;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private OrderStatus statusId;

    public Orders() {}

    public Orders(int id, Employees employeeId, Customers customerId, Date orderDate, Date shippedDate, Shippers shipperId,
                  String shipName, String shipAddress, String shipCity, String shipStateProvince,
                  String shipZipPostalCode, String shipCountryRegion, BigDecimal shippingFee, BigDecimal taxes,
                  String paymentType, Date paidDate, String notes, BigDecimal taxRate, OrderTaxStatus taxStatusId, OrderStatus statusId) {
        this.id = id;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
        this.shipperId = shipperId;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipStateProvince = shipStateProvince;
        this.shipZipPostalCode = shipZipPostalCode;
        this.shipCountryRegion = shipCountryRegion;
        this.shippingFee = shippingFee;
        this.taxes = taxes;
        this.paymentType = paymentType;
        this.paidDate = paidDate;
        this.notes = notes;
        this.taxRate = taxRate;
        this.taxStatusId = taxStatusId;
        this.statusId = statusId;
    }

    public Orders(Employees employeeId, Customers customerId, Date orderDate, Date shippedDate, Shippers shipperId,
                  String shipName, String shipAddress, String shipCity, String shipStateProvince, String shipZipPostalCode,
                  String shipCountryRegion, BigDecimal shippingFee, BigDecimal taxes, String paymentType, Date paidDate,
                  String notes, BigDecimal taxRate, OrderTaxStatus taxStatusId, OrderStatus statusId) {
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
        this.shipperId = shipperId;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipStateProvince = shipStateProvince;
        this.shipZipPostalCode = shipZipPostalCode;
        this.shipCountryRegion = shipCountryRegion;
        this.shippingFee = shippingFee;
        this.taxes = taxes;
        this.paymentType = paymentType;
        this.paidDate = paidDate;
        this.notes = notes;
        this.taxRate = taxRate;
        this.taxStatusId = taxStatusId;
        this.statusId = statusId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employees getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employees employeeId) {
        this.employeeId = employeeId;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Shippers getShipperId() {
        return shipperId;
    }

    public void setShipperId(Shippers shipperId) {
        this.shipperId = shipperId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipStateProvince() {
        return shipStateProvince;
    }

    public void setShipStateProvince(String shipStateProvince) {
        this.shipStateProvince = shipStateProvince;
    }

    public String getShipZipPostalCode() {
        return shipZipPostalCode;
    }

    public void setShipZipPostalCode(String shipZipPostalCode) {
        this.shipZipPostalCode = shipZipPostalCode;
    }

    public String getShipCountryRegion() {
        return shipCountryRegion;
    }

    public void setShipCountryRegion(String shipCountryRegion) {
        this.shipCountryRegion = shipCountryRegion;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public OrderTaxStatus getTaxStatusId() {
        return taxStatusId;
    }

    public void setTaxStatusId(OrderTaxStatus taxStatusId) {
        this.taxStatusId = taxStatusId;
    }

    public OrderStatus getStatusId() {
        return statusId;
    }

    public void setStatusId(OrderStatus statusId) {
        this.statusId = statusId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", customerId=" + customerId +
                ", orderDate=" + orderDate +
                ", shippedDate=" + shippedDate +
                ", shipperId=" + shipperId +
                ", shipName='" + shipName + '\'' +
                ", shipAddress='" + shipAddress + '\'' +
                ", shipCity='" + shipCity + '\'' +
                ", shipStateProvince='" + shipStateProvince + '\'' +
                ", shipZipPostalCode='" + shipZipPostalCode + '\'' +
                ", shipCountryRegion='" + shipCountryRegion + '\'' +
                ", shippingFee=" + shippingFee +
                ", taxes=" + taxes +
                ", paymentType='" + paymentType + '\'' +
                ", paidDate=" + paidDate +
                ", notes='" + notes + '\'' +
                ", taxRate=" + taxRate +
                ", taxStatusId=" + taxStatusId +
                ", statusId=" + statusId +
                '}';
    }
}
