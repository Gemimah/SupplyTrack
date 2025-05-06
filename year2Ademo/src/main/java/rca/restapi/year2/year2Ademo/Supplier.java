package rca.restapi.year2.year2Ademo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Supplier {
    @Id
    @GeneratedValue
    private Long id;
    private String supplierName;
    private String address;

    public Supplier() {
    }

    public Supplier(Long id) {
        this.id = id;
    }

    public Supplier(String supplierName, String address) {
        this.supplierName = supplierName;
        this.address = address;
    }

    public Supplier(Long id, String supplierName, String address) {
        this.id = id;
        this.supplierName = supplierName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}