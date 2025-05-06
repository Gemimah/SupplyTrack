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
    private int age;  // New field for age

    // Default constructor
    public Supplier() {
    }

    // Constructor with id
    public Supplier(Long id) {
        this.id = id;
    }

    // Constructor with supplierName and address
    public Supplier(String supplierName, String address) {
        this.supplierName = supplierName;
        this.address = address;
    }

    // Constructor with id, supplierName, and address
    public Supplier(Long id, String supplierName, String address) {
        this.id = id;
        this.supplierName = supplierName;
        this.address = address;
    }

    // Constructor with all fields
    public Supplier(Long id, String supplierName, String address, int age) {
        this.id = id;
        this.supplierName = supplierName;
        this.address = address;
        this.age = age;  // Initialize age
    }

    // Getter and setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and setter for supplierName
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    // Getter and setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
